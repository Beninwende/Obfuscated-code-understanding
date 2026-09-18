#!/usr/bin/env python3
"""Generate zero-shot descriptions (resume-safe)."""

from __future__ import annotations

import argparse
import json
import sys
import time
from concurrent.futures import ThreadPoolExecutor, as_completed
from pathlib import Path

SCRIPTS_DIR = Path(__file__).resolve().parent
sys.path.insert(0, str(SCRIPTS_DIR))

from common import (  # noqa: E402
    build_simple_prompt,
    chat_completion,
    chat_completion_chunked_full_context,
    code_field_for_dataset,
    context_window_for_model,
    estimate_tokens,
    extract_description,
    generation_model_keys,
    is_description_valid,
    resolve_generation_output_path,
    variant_specs,
)
from coverage_report import input_path, expected_programs  # noqa: E402

RESULTS_DIR = SCRIPTS_DIR.parent / "results"
SKIPPED_MODELS_FILE = RESULTS_DIR / "skipped_models.json"
TIMEOUT_MARKERS = ("timed out", "timeout", "API call failed")


def atomic_write_json(path: Path, data: list[dict]) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    tmp = path.with_suffix(path.suffix + ".tmp")
    tmp.write_text(json.dumps(data, indent=2, ensure_ascii=False) + "\n", encoding="utf-8")
    tmp.replace(path)


def load_or_init_output(path: Path, entries: list[dict]) -> dict[str, dict]:
    if path.exists():
        rows = json.loads(path.read_text(encoding="utf-8"))
        return {r["Sub Directory"]: r for r in rows}
    return {e["Sub Directory"]: {"Sub Directory": e["Sub Directory"], "Description_Simple": ""} for e in entries}


def generate_one(model_key: str, prompt: str, retries: int = 5) -> str:
    last_err = ""
    # Reasoning / OR-routed models need more output budget; others keep 512.
    max_tok = (
        16384
        if any(x in model_key for x in ("gpt5", "o4mini", "deepseek_r1", "glm5", "kimi_k25"))
        else 2048
        if model_key == "deepseek_v4_pro"
        else 512
    )
    window = context_window_for_model(model_key)
    prompt_tok = estimate_tokens(prompt)
    # Preemptively chunk when the single-shot prompt cannot fit.
    use_chunked = prompt_tok + max_tok + 256 > window

    for attempt in range(retries):
        try:
            if use_chunked:
                raw = chat_completion_chunked_full_context(
                    model_key, prompt, max_tokens=max_tok, temperature=0
                )
            else:
                raw = chat_completion(model_key, prompt, max_tokens=max_tok, temperature=0)
            desc = extract_description(raw)
            if is_description_valid(desc):
                return desc
            last_err = "invalid/empty description"
        except Exception as exc:  # noqa: BLE001
            last_err = str(exc)
            # If single-shot hit context length, switch to chunked for remaining attempts.
            err_l = str(exc).lower()
            if (not use_chunked) and (
                "context_length" in err_l
                or "maximum context length" in err_l
                or "maximum context" in err_l
                or "too many tokens" in err_l
                or "context window" in err_l
            ):
                use_chunked = True
        time.sleep(min(2 ** attempt, 30))
    return f"API call failed: {last_err}"


def is_fail_desc(desc: str) -> bool:
    low = (desc or "").lower()
    return any(m.lower() in low for m in TIMEOUT_MARKERS) or not is_description_valid(desc)


def record_skipped_model(model_key: str, reason: str) -> None:
    RESULTS_DIR.mkdir(parents=True, exist_ok=True)
    data: dict = {"skipped": {}}
    if SKIPPED_MODELS_FILE.exists():
        try:
            data = json.loads(SKIPPED_MODELS_FILE.read_text(encoding="utf-8"))
        except Exception:  # noqa: BLE001
            data = {"skipped": {}}
    skipped = data.setdefault("skipped", {})
    skipped[model_key] = {
        "reason": reason,
        "at": time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime()),
    }
    SKIPPED_MODELS_FILE.write_text(json.dumps(data, indent=2) + "\n", encoding="utf-8")


def run_dataset(
    dataset_key: str,
    model_keys: list[str],
    variant_keys: list[str] | None,
    workers: int,
    batch_per_worker: int,
    dry_run: bool,
    skip_fail_ratio: float,
    skip_min_samples: int,
) -> None:
    variants = [v for v in variant_specs() if not variant_keys or v["key"] in variant_keys]
    n_expected = expected_programs(dataset_key)
    concurrency = max(1, workers * batch_per_worker)

    for model_key in model_keys:
        model_attempted = 0
        model_failed = 0
        skip_model = False

        for variant in variants:
            if skip_model:
                print(f"[{dataset_key}] {model_key} / {variant['key']}: SKIPPED (model deferred)")
                continue

            inp = input_path(dataset_key, variant["input"])
            if not inp.exists():
                print(f"SKIP missing input: {inp}")
                continue
            out = resolve_generation_output_path(dataset_key, model_key, variant, prefer_existing=True)
            entries = json.loads(inp.read_text(encoding="utf-8"))
            results = load_or_init_output(out, entries)

            pending = [
                e for e in entries
                if not is_description_valid(results.get(e["Sub Directory"], {}).get("Description_Simple"))
            ]

            print(
                f"[{dataset_key}] {model_key} / {variant['key']}: "
                f"{n_expected - len(pending)}/{n_expected} done, {len(pending)} pending -> {out.name} "
                f"(workers={workers}, batch/worker={batch_per_worker}, concurrency={concurrency})"
            )
            if dry_run or not pending:
                continue

            code_field = code_field_for_dataset(dataset_key)

            def task(entry: dict) -> tuple[str, str]:
                sub = entry["Sub Directory"]
                prompt = build_simple_prompt(dataset_key, entry[code_field])
                desc = generate_one(model_key, prompt)
                return sub, desc

            done_count = 0
            abort_variant = False
            for wave_start in range(0, len(pending), concurrency):
                if abort_variant:
                    break
                wave = pending[wave_start : wave_start + concurrency]
                with ThreadPoolExecutor(max_workers=concurrency) as pool:
                    futures = {pool.submit(task, e): e["Sub Directory"] for e in wave}
                    for future in as_completed(futures):
                        sub, desc = future.result()
                        results[sub]["Description_Simple"] = desc
                        done_count += 1
                        model_attempted += 1
                        if is_fail_desc(desc):
                            model_failed += 1
                        if done_count % 10 == 0 or done_count == len(pending):
                            ordered = [results[e["Sub Directory"]] for e in entries]
                            atomic_write_json(out, ordered)
                            print(f"  checkpoint {done_count}/{len(pending)}")

                        if (
                            model_attempted >= skip_min_samples
                            and (model_failed / model_attempted) >= skip_fail_ratio
                        ):
                            ratio = model_failed / model_attempted
                            reason = (
                                f"high_fail_ratio={ratio:.2f} "
                                f"({model_failed}/{model_attempted}) on {dataset_key}/{variant['key']}"
                            )
                            print(f"  SKIP MODEL {model_key}: {reason} — defer remaining variants")
                            record_skipped_model(model_key, reason)
                            ordered = [results[e["Sub Directory"]] for e in entries]
                            atomic_write_json(out, ordered)
                            skip_model = True
                            abort_variant = True
                            break

            if not abort_variant:
                ordered = [results[e["Sub Directory"]] for e in entries]
                atomic_write_json(out, ordered)


def main() -> None:
    parser = argparse.ArgumentParser(description="Revision zero-shot generation.")
    parser.add_argument(
        "--dataset",
        choices=["java250", "java906", "javascript454", "javascript250", "all"],
        default="all",
    )
    parser.add_argument("--models", type=str, default="", help="Comma-separated model keys (default: 15 text models)")
    parser.add_argument("--variants", type=str, default="", help="Comma-separated variant keys")
    parser.add_argument("--workers", type=int, default=8)
    parser.add_argument(
        "--batch-per-worker",
        type=int,
        default=4,
        help="Requests per worker (concurrency = workers × batch-per-worker)",
    )
    parser.add_argument(
        "--skip-fail-ratio",
        type=float,
        default=0.40,
        help="Skip remaining variants of a model if fail/timeout ratio exceeds this (after min samples)",
    )
    parser.add_argument(
        "--skip-min-samples",
        type=int,
        default=64,
        help="Min attempts before applying --skip-fail-ratio",
    )
    parser.add_argument("--dry-run", action="store_true")
    args = parser.parse_args()

    model_keys = [m.strip() for m in args.models.split(",") if m.strip()] or generation_model_keys()
    explicit_models = bool(args.models.strip())
    # Only auto-defer previously skipped models when using the default full list.
    # Explicit --models means the user wants those models run now (retry phase).
    if not explicit_models and SKIPPED_MODELS_FILE.exists():
        try:
            skipped = set(json.loads(SKIPPED_MODELS_FILE.read_text(encoding="utf-8")).get("skipped", {}))
            if skipped:
                kept = [m for m in model_keys if m not in skipped]
                dropped = [m for m in model_keys if m in skipped]
                if dropped:
                    print(f"Deferring previously skipped models: {','.join(dropped)}")
                    model_keys = kept
        except Exception:  # noqa: BLE001
            pass
    elif explicit_models and SKIPPED_MODELS_FILE.exists():
        # Clear these models from the skip list so a mid-run skip can re-trigger cleanly
        try:
            data = json.loads(SKIPPED_MODELS_FILE.read_text(encoding="utf-8"))
            skipped = data.get("skipped", {})
            removed = [m for m in model_keys if m in skipped]
            for m in removed:
                del skipped[m]
            if removed:
                SKIPPED_MODELS_FILE.write_text(json.dumps(data, indent=2) + "\n", encoding="utf-8")
                print(f"Retry mode: cleared skip for {','.join(removed)}")
        except Exception:  # noqa: BLE001
            pass
    variant_keys = [v.strip() for v in args.variants.split(",") if v.strip()] or None

    datasets = (
        ["java250", "java906", "javascript454"]
        if args.dataset == "all"
        else [args.dataset]
    )
    for ds in datasets:
        run_dataset(
            ds,
            model_keys,
            variant_keys,
            args.workers,
            args.batch_per_worker,
            args.dry_run,
            args.skip_fail_ratio,
            args.skip_min_samples,
        )


if __name__ == "__main__":
    main()
