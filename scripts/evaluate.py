#!/usr/bin/env python3
"""Evaluate generated descriptions with the paper's three LLM judges + ST cosine.

Judges (labels only: judge_1, judge_2, judge_3):
  judge_1 — OpenAI API      → GPT-5
  judge_2 — Anthropic API   → Claude-Sonnet-4.5
  judge_3 — OpenRouter API  → MiniMax-2.7

Consensus: at least two scores strictly above τ = 0.5 (paper protocol).
"""

from __future__ import annotations

import argparse
import csv
import json
import os
import sys
import time
from concurrent.futures import ThreadPoolExecutor, as_completed
from pathlib import Path
from typing import Any

# Avoid Keras 3 / TF import crashes when loading sentence-transformers.
os.environ.setdefault("TRANSFORMERS_NO_TF", "1")
os.environ.setdefault("USE_TF", "0")

import numpy as np

SCRIPTS_DIR = Path(__file__).resolve().parent
sys.path.insert(0, str(SCRIPTS_DIR))

from common import (  # noqa: E402
    JUDGE_PASS_THRESHOLD,
    JUDGE_PROMPT_TEMPLATE,
    PAPER_JUDGES,
    consensus_from_three,
    extract_score,
    generation_model_keys,
    is_description_valid,
    judge_chat_completion,
    load_run_plan,
    model_results_dir,
    resolve_dataset_paths,
    resolve_generation_output_path,
    variant_specs,
)

DESC_TYPE = "Description_Simple"
ST_MODEL_NAME = "all-MiniLM-L12-v2"
ST_PASS_THRESHOLD = 0.5

CORPUS_N = {
    "java250": 250,
    "java656": 656,
    "java906": 906,
    "javascript250": 250,
    "javascript454": 454,
    "javascript704": 704,
    "combined": 242,
}


def expected_programs(dataset_key: str) -> int:
    return CORPUS_N.get(dataset_key, 0)


def load_ground_truth(dataset_key: str) -> dict[str, str]:
    ds = resolve_dataset_paths(dataset_key)
    field = ds["ground_truth_field"]
    rows = json.loads(ds["ground_truth"].read_text(encoding="utf-8"))
    out: dict[str, str] = {}
    for row in rows:
        sub = row["Sub Directory"]
        text = row.get(field) or row.get("Description") or ""
        out[sub] = text
    return out


def judge_once(judge: dict, reference: str, generated: str, retries: int = 5) -> float | None:
    prompt = JUDGE_PROMPT_TEMPLATE.format(reference_text=reference, comparison_text=generated)
    for attempt in range(retries):
        try:
            raw = judge_chat_completion(judge, prompt, max_tokens=16, temperature=0)
            score = extract_score(raw)
            if score is not None:
                return score
        except Exception as exc:  # noqa: BLE001
            msg = str(exc).lower()
            if any(k in msg for k in ("429", "rate", "quota", "resource", "timeout", "timed out")):
                wait = min(60, 5 * (2 ** attempt))
                print(
                    f"  [{judge['id']} retry {attempt+1}/{retries}] "
                    f"{type(exc).__name__}: {exc} -> sleep {wait}s"
                )
                time.sleep(wait)
                continue
            print(f"  [{judge['id']} error {attempt+1}/{retries}] {type(exc).__name__}: {exc}")
        time.sleep(min(30, 2 ** attempt))
    return None


def judge_three(
    reference: str,
    generated: str,
    *,
    agreement_threshold: float = 0.15,
    pass_threshold: float = JUDGE_PASS_THRESHOLD,
) -> dict[str, Any]:
    """Score with judge_1 (OpenAI), judge_2 (Claude), judge_3 (OpenRouter)."""
    scores: list[float | None] = []
    for judge in PAPER_JUDGES:
        scores.append(judge_once(judge, reference, generated))

    j1, j2, j3 = scores[0], scores[1], scores[2]
    consensus = consensus_from_three(
        [j1, j2, j3],
        agreement_threshold=agreement_threshold,
        pass_threshold=pass_threshold,
    )
    present = [s for s in (j1, j2, j3) if s is not None]
    average = sum(present) / len(present) if present else None
    return {
        "judge_1": j1,
        "judge_2": j2,
        "judge_3": j3,
        "average_score": average if average is not None else consensus.get("consensus_score"),
        "consensus": bool(consensus.get("consensus_pass")),
        "consensus_score": consensus.get("consensus_score"),
        "consensus_pass": bool(consensus.get("consensus_pass")),
        "consensus_rule": consensus.get("consensus_rule"),
        "method": "intent_capture",
        "judge_protocol": "paper_three_judges",
        "judges": {
            j["id"]: {"paper_name": j["paper_name"], "provider": j["provider"], "api_model": j["api_model"]}
            for j in PAPER_JUDGES
        },
    }


class SentenceTransformerScorer:
    def __init__(self, model_name: str = ST_MODEL_NAME) -> None:
        try:
            from sentence_transformers import SentenceTransformer
            import torch
        except ImportError as exc:  # noqa: BLE001
            raise RuntimeError(
                "sentence-transformers is required for embedding evaluation. "
                "Install with: pip install sentence-transformers"
            ) from exc
        self.device = "cuda" if torch.cuda.is_available() else "cpu"
        self.model = SentenceTransformer(model_name, device=self.device)
        self._torch = torch

    def similarity(self, text1: str, text2: str) -> float:
        if not text1 or not text2:
            return 0.0
        emb = self.model.encode([text1, text2], convert_to_tensor=True, show_progress_bar=False)
        sim = self._torch.cosine_similarity(emb[0:1], emb[1:2], dim=1)
        return float(sim.cpu().numpy()[0])

    def similarity_batch(self, refs: list[str], gens: list[str]) -> list[float]:
        if not refs:
            return []
        valid_idx = [i for i, (a, b) in enumerate(zip(refs, gens)) if a and b]
        out = [0.0] * len(refs)
        if not valid_idx:
            return out
        texts_a = [refs[i] for i in valid_idx]
        texts_b = [gens[i] for i in valid_idx]
        emb_a = self.model.encode(texts_a, convert_to_tensor=True, show_progress_bar=False)
        emb_b = self.model.encode(texts_b, convert_to_tensor=True, show_progress_bar=False)
        sims = self._torch.cosine_similarity(emb_a, emb_b, dim=1).cpu().numpy().tolist()
        for i, s in zip(valid_idx, sims):
            out[i] = float(s)
        return out


def build_item_evaluation(
    reference: str,
    generated: str,
    llm_eval: dict[str, Any],
    st_score: float,
) -> dict[str, Any]:
    llm_success = bool(llm_eval.get("consensus"))
    st_success = st_score >= ST_PASS_THRESHOLD
    avg = llm_eval.get("average_score")
    score_diff = abs(avg - st_score) if avg is not None else None
    return {
        "reference_text": reference,
        "comparison_text": generated,
        "llm_evaluation": llm_eval,
        "st_evaluation": {
            "similarity_score": st_score,
            "method": "semantic_similarity",
            "model": ST_MODEL_NAME,
        },
        "combined_analysis": {
            "score_difference": score_diff,
            "agreement": llm_success == st_success,
            "llm_success": llm_success,
            "st_success": st_success,
            "both_success": llm_success and st_success,
            "neither_success": (not llm_success) and (not st_success),
        },
    }


def item_is_complete(item: dict[str, Any] | None) -> bool:
    if not item:
        return False
    ev = (item.get("evaluations") or {}).get(DESC_TYPE) or {}
    llm = ev.get("llm_evaluation") or {}
    st = ev.get("st_evaluation") or {}
    return llm.get("average_score") is not None and "similarity_score" in st


def generate_summary(detailed: dict[str, Any], dataset_name: str, comparison_file: str) -> dict[str, Any]:
    llm_scores: list[float] = []
    st_scores: list[float] = []
    llm_consensus_count = 0
    st_success_count = 0
    agreement_count = 0
    both_success_count = 0
    neither_success_count = 0
    total = 0

    for item in detailed.values():
        ev = (item.get("evaluations") or {}).get(DESC_TYPE)
        if not ev:
            continue
        total += 1
        llm = ev.get("llm_evaluation") or {}
        st = ev.get("st_evaluation") or {}
        comb = ev.get("combined_analysis") or {}
        avg = llm.get("average_score")
        if avg is not None:
            llm_scores.append(float(avg))
        if llm.get("consensus"):
            llm_consensus_count += 1
        st_s = st.get("similarity_score")
        if st_s is not None:
            st_scores.append(float(st_s))
            if float(st_s) >= ST_PASS_THRESHOLD:
                st_success_count += 1
        if comb.get("agreement"):
            agreement_count += 1
        if comb.get("both_success"):
            both_success_count += 1
        if comb.get("neither_success"):
            neither_success_count += 1

    def stats(vals: list[float], extra: dict[str, Any] | None = None) -> dict[str, Any]:
        if not vals:
            return {}
        out = {
            "mean": float(np.mean(vals)),
            "median": float(np.median(vals)),
            "std": float(np.std(vals)),
            "min": float(np.min(vals)),
            "max": float(np.max(vals)),
            "count": len(vals),
        }
        if extra:
            out.update(extra)
        return out

    return {
        "total_items_evaluated": total,
        "description_types": [DESC_TYPE],
        "llm_statistics": {
            DESC_TYPE: stats(
                llm_scores,
                {
                    "consensus_count": llm_consensus_count,
                    "consensus_rate": llm_consensus_count / total if total else 0.0,
                },
            )
        },
        "st_statistics": {
            DESC_TYPE: stats(
                st_scores,
                {
                    "success_count": st_success_count,
                    "success_rate": st_success_count / total if total else 0.0,
                },
            )
        },
        "combined_statistics": {
            DESC_TYPE: {
                "total_items": total,
                "agreement_count": agreement_count,
                "agreement_rate": agreement_count / total if total else 0.0,
                "both_success_count": both_success_count,
                "both_success_rate": both_success_count / total if total else 0.0,
                "neither_success_count": neither_success_count,
                "neither_success_rate": neither_success_count / total if total else 0.0,
            }
        },
        "dataset_name": dataset_name,
        "comparison_file": comparison_file,
        "judge_protocol": "paper_three_judges",
        "embedding_model": ST_MODEL_NAME,
        "judges": {
            j["id"]: {"paper_name": j["paper_name"], "provider": j["provider"], "api_model": j["api_model"]}
            for j in PAPER_JUDGES
        },
    }


def save_csv(detailed: dict[str, Any], csv_path: Path) -> None:
    fieldnames = [
        "Sub_Directory",
        "Description_Type",
        "Judge_1_Score",
        "Judge_2_Score",
        "Judge_3_Score",
        "LLM_Average_Score",
        "LLM_Consensus",
        "ST_Similarity_Score",
        "Score_Difference",
        "Agreement",
        "LLM_Success",
        "ST_Success",
        "Both_Success",
        "Neither_Success",
    ]
    rows = []
    for sub, item in detailed.items():
        ev = (item.get("evaluations") or {}).get(DESC_TYPE) or {}
        llm = ev.get("llm_evaluation") or {}
        st = ev.get("st_evaluation") or {}
        comb = ev.get("combined_analysis") or {}
        rows.append(
            {
                "Sub_Directory": sub,
                "Description_Type": DESC_TYPE,
                "Judge_1_Score": llm.get("judge_1"),
                "Judge_2_Score": llm.get("judge_2"),
                "Judge_3_Score": llm.get("judge_3"),
                "LLM_Average_Score": llm.get("average_score"),
                "LLM_Consensus": llm.get("consensus"),
                "ST_Similarity_Score": st.get("similarity_score"),
                "Score_Difference": comb.get("score_difference"),
                "Agreement": comb.get("agreement"),
                "LLM_Success": comb.get("llm_success"),
                "ST_Success": comb.get("st_success"),
                "Both_Success": comb.get("both_success"),
                "Neither_Success": comb.get("neither_success"),
            }
        )
    csv_path.parent.mkdir(parents=True, exist_ok=True)
    with csv_path.open("w", encoding="utf-8", newline="") as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames)
        writer.writeheader()
        writer.writerows(rows)


def atomic_write_json(path: Path, payload: dict[str, Any]) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    tmp = path.with_suffix(path.suffix + ".tmp")
    tmp.write_text(json.dumps(payload, indent=2, ensure_ascii=False) + "\n", encoding="utf-8")
    tmp.replace(path)


def evaluate_dataset(
    dataset_key: str,
    model_keys: list[str],
    variant_keys: list[str] | None,
    workers: int,
    batch_per_worker: int,
    dry_run: bool,
    skip_embedding: bool,
) -> None:
    plan = load_run_plan()
    judge_cfg = plan.get("judge") or {}
    agreement_threshold = float(judge_cfg.get("agreement_threshold", 0.15))
    pass_threshold = float(judge_cfg.get("pass_threshold", JUDGE_PASS_THRESHOLD))
    gt = load_ground_truth(dataset_key)
    ds = resolve_dataset_paths(dataset_key)
    variants = [v for v in variant_specs() if not variant_keys or v["key"] in variant_keys]
    concurrency = max(1, workers * batch_per_worker)

    st_scorer: SentenceTransformerScorer | None = None
    if not dry_run and not skip_embedding:
        print(f"Loading SentenceTransformer {ST_MODEL_NAME}...")
        st_scorer = SentenceTransformerScorer(ST_MODEL_NAME)

    for model_key in model_keys:
        results_name = model_results_dir(model_key)
        eval_dir = ds["eval_root"] / results_name
        eval_dir.mkdir(parents=True, exist_ok=True)

        for variant in variants:
            gen_path = resolve_generation_output_path(dataset_key, model_key, variant)
            stem = Path(variant["output"]).stem  # e.g. Data_Without_Comments_Description
            json_path = eval_dir / f"combined_results_{stem}.json"
            csv_path = eval_dir / f"combined_summary_{stem}.csv"

            if not gen_path.exists():
                print(f"SKIP (no generation): {gen_path}")
                continue

            generated = json.loads(gen_path.read_text(encoding="utf-8"))
            existing_payload: dict[str, Any] = {}
            detailed: dict[str, Any] = {}
            if json_path.exists():
                try:
                    existing_payload = json.loads(json_path.read_text(encoding="utf-8"))
                    detailed = dict(existing_payload.get("detailed_results") or {})
                except Exception:  # noqa: BLE001
                    detailed = {}

            pending = [
                row
                for row in generated
                if is_description_valid(row.get("Description_Simple"))
                and not item_is_complete(detailed.get(row["Sub Directory"]))
            ]
            n_done = expected_programs(dataset_key) - len(pending)
            print(
                f"[eval {dataset_key}] {model_key}/{variant['key']}: "
                f"{n_done}/{expected_programs(dataset_key)} done, {len(pending)} pending "
                f"-> {results_name}/{json_path.name} "
                f"(workers={workers}, batch/worker={batch_per_worker}, concurrency={concurrency})"
            )
            if dry_run or not pending:
                if detailed and not dry_run:
                    summary = generate_summary(detailed, stem, str(gen_path))
                    atomic_write_json(json_path, {"summary": summary, "detailed_results": detailed})
                    save_csv(detailed, csv_path)
                continue

            def task(row: dict) -> tuple[str, dict[str, Any], str, str]:
                sub = row["Sub Directory"]
                ref = gt.get(sub, "")
                gen = row["Description_Simple"]
                llm_eval = judge_three(
                    ref,
                    gen,
                    agreement_threshold=agreement_threshold,
                    pass_threshold=pass_threshold,
                )
                return sub, llm_eval, ref, gen

            done = 0
            for wave_start in range(0, len(pending), concurrency):
                wave = pending[wave_start : wave_start + concurrency]
                with ThreadPoolExecutor(max_workers=concurrency) as pool:
                    futures = {pool.submit(task, row): row["Sub Directory"] for row in wave}
                    wave_results: list[tuple[str, dict[str, Any], str, str]] = []
                    for future in as_completed(futures):
                        wave_results.append(future.result())

                refs = [r[2] for r in wave_results]
                gens = [r[3] for r in wave_results]
                st_scores = (
                    [0.0] * len(wave_results)
                    if st_scorer is None
                    else st_scorer.similarity_batch(refs, gens)
                )

                for (sub, llm_eval, ref, gen), st_score in zip(wave_results, st_scores):
                    detailed[sub] = {
                        "reference_description": ref,
                        "evaluations": {
                            DESC_TYPE: build_item_evaluation(ref, gen, llm_eval, st_score)
                        },
                    }
                    done += 1

                summary = generate_summary(detailed, stem, str(gen_path))
                atomic_write_json(json_path, {"summary": summary, "detailed_results": detailed})
                save_csv(detailed, csv_path)
                print(f"  checkpoint {done}/{len(pending)}")

            summary = generate_summary(detailed, stem, str(gen_path))
            atomic_write_json(json_path, {"summary": summary, "detailed_results": detailed})
            save_csv(detailed, csv_path)


def main() -> None:
    parser = argparse.ArgumentParser(
        description=(
            "Paper evaluation: judge_1 (OpenAI/GPT-5) + judge_2 (Claude-Sonnet-4.5) "
            "+ judge_3 (OpenRouter/MiniMax-2.7) + SentenceTransformer cosine."
        )
    )
    parser.add_argument(
        "--dataset",
        choices=["java250", "java656", "java906", "javascript454", "javascript250", "combined", "all"],
        default="all",
    )
    parser.add_argument("--models", type=str, default="")
    parser.add_argument("--variants", type=str, default="")
    parser.add_argument("--workers", type=int, default=4)
    parser.add_argument(
        "--batch-per-worker",
        type=int,
        default=4,
        help="Items per worker wave (concurrency = workers × batch-per-worker)",
    )
    parser.add_argument("--skip-embedding", action="store_true")
    parser.add_argument("--dry-run", action="store_true")
    args = parser.parse_args()

    model_keys = [m.strip() for m in args.models.split(",") if m.strip()] or generation_model_keys()
    variant_keys = [v.strip() for v in args.variants.split(",") if v.strip()] or None
    datasets = (
        ["java250", "java656", "javascript454", "javascript250"]
        if args.dataset == "all"
        else [args.dataset]
    )

    judge_line = ", ".join(f"{j['id']}={j['paper_name']}({j['provider']})" for j in PAPER_JUDGES)
    print(
        f"Judges: {judge_line} | protocol=paper_three_judges | "
        f"embedding={'off' if args.skip_embedding else ST_MODEL_NAME} | "
        f"workers={args.workers} batch/worker={args.batch_per_worker} "
        f"concurrency={args.workers * args.batch_per_worker} | "
        f"datasets={datasets} models={len(model_keys)}"
    )
    for ds in datasets:
        evaluate_dataset(
            ds,
            model_keys,
            variant_keys,
            args.workers,
            args.batch_per_worker,
            args.dry_run,
            args.skip_embedding,
        )


if __name__ == "__main__":
    main()
