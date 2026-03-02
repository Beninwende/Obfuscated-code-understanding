#!/usr/bin/env python3
"""
Classify each taxonomy failure into a granular subtype using GPT-4o in batch.

- Loads all Results/Taxonomy/Dataset_*_taxonomy_failures.json
- For each failure, sends the two example descriptions + CODING_GUIDE to GPT-4o
- Runs requests in parallel (batch size configurable) with rate limiting
- Writes per-model results + aggregated subtype frequencies for Sankey
"""

import json
import os
import re
import time
from pathlib import Path
from concurrent.futures import ThreadPoolExecutor, as_completed
from collections import defaultdict
from typing import Optional

try:
    from openai import OpenAI
except ImportError:
    OpenAI = None  # Required only when actually calling API

# Paths
# Script lives in Results/Taxonomy/granular_subtypes/ -> go up 4 levels to project root
BASE_DIR = Path(__file__).resolve().parent.parent.parent.parent
TAXONOMY_DIR = BASE_DIR / "Results" / "Taxonomy"
GRANULAR_DIR = Path(__file__).resolve().parent
CODING_GUIDE_PATH = GRANULAR_DIR / "CODING_GUIDE.md"
TAXONOMY_SUBTYPES_PATH = GRANULAR_DIR / "taxonomy_subtypes.json"

FAILURE_EXAMPLE_PAIR = {
    "Comment_Dependency": ("with_comments", "without_comments"),
    "Variable_Renaming_Failure": ("without_comments", "variable_renaming"),
    "Dead_Code_Failure": ("without_comments", "dead_code"),
    "Encryption_Failure": ("without_comments", "encryption"),
}

VALID_SUBTYPES = [
    "Algorithm_misunderstanding",
    "Algorithm_confusion",
    "Functional_inaccuracy",
    "Minimal_code_understanding",
    "Structural_description_only",
    "Wrong_IO_interpretation",
    "Semantic_drift",
    "Hallucination_unrelated",
    "Obfuscation_narrative",
    "Empty_or_template",
    "Creative_or_offtask",
    "Refusal_or_meta",
]

MAX_TEXT_LEN = 3500  # chars per description to avoid token overflow
BATCH_SIZE = 20  # concurrent requests
MAX_RETRIES = 3
RETRY_DELAY = 2.0


def load_coding_guide() -> str:
    with open(CODING_GUIDE_PATH, "r", encoding="utf-8") as f:
        return f.read()


def get_example_texts(failure: dict, failure_type: str) -> tuple[str, str]:
    pair = FAILURE_EXAMPLE_PAIR.get(failure_type, (None, None))
    if not pair:
        return "", ""
    a = failure.get("example_" + pair[0], "") or ""
    b = failure.get("example_" + pair[1], "") or ""
    if len(a) > MAX_TEXT_LEN:
        a = a[:MAX_TEXT_LEN] + "..."
    if len(b) > MAX_TEXT_LEN:
        b = b[:MAX_TEXT_LEN] + "..."
    return a, b


def extract_subtype_from_response(text: str) -> Optional[str]:
    text = (text or "").strip()
    for st in VALID_SUBTYPES:
        if st in text:
            return st
    # Try first line / single word
    first = text.split("\n")[0].strip()
    if first in VALID_SUBTYPES:
        return first
    # Normalize underscores
    normalized = first.replace(" ", "_").replace("-", "_")
    for st in VALID_SUBTYPES:
        if st.lower() == normalized.lower():
            return st
    return None


def classify_one(
    client: OpenAI,
    coding_guide: str,
    failure_type: str,
    label_a: str,
    label_b: str,
    text_a: str,
    text_b: str,
    problem_id: str,
) -> tuple[str, Optional[str], str]:
    """Call GPT-4o once; return (problem_id, subtype, raw_response)."""
    prompt = f"""You are a coder classifying the type of error in code description pairs.

{coding_guide}

---

Failure type (high-level): {failure_type}

Description 1 (label: {label_a}):
---
{text_a}
---

Description 2 (label: {label_b}):
---
{text_b}
---

Choose exactly ONE granular subtype from the list in the guide. Reply with only the subtype label, nothing else (e.g. Algorithm_misunderstanding or Empty_or_template)."""

    for attempt in range(MAX_RETRIES):
        try:
            resp = client.chat.completions.create(
                model="gpt-4o",
                messages=[{"role": "user", "content": prompt}],
                max_tokens=50,
                temperature=0.0,
            )
            raw = (resp.choices[0].message.content or "").strip()
            subtype = extract_subtype_from_response(raw)
            return problem_id, subtype, raw
        except Exception as e:
            if attempt < MAX_RETRIES - 1:
                time.sleep(RETRY_DELAY * (attempt + 1))
            return problem_id, None, str(e)
    return problem_id, None, ""


def load_all_failures() -> list[dict]:
    """Load all failure entries from all model JSONs with model and index info."""
    entries = []
    for json_path in sorted(TAXONOMY_DIR.glob("Dataset_*_taxonomy_failures.json")):
        with open(json_path, "r", encoding="utf-8") as f:
            data = json.load(f)
        model = data["model"]
        for i, failure in enumerate(data.get("failures", [])):
            failure_type = failure.get("failure_type", "")
            pair = FAILURE_EXAMPLE_PAIR.get(failure_type)
            if not pair:
                continue
            text_a, text_b = get_example_texts(failure, failure_type)
            if not text_a and not text_b:
                continue
            entries.append({
                "model": model,
                "index": i,
                "problem_id": failure.get("problem_id", ""),
                "failure_type": failure_type,
                "label_a": pair[0],
                "label_b": pair[1],
                "text_a": text_a,
                "text_b": text_b,
                "failure_snapshot": {k: v for k, v in failure.items() if not k.startswith("example_")},
            })
    return entries


def run_batch_classification(
    api_key: Optional[str] = None,
    batch_size: int = BATCH_SIZE,
    limit: Optional[int] = None,
) -> list[dict]:
    if OpenAI is None:
        raise SystemExit("Install openai for classification: pip install openai")
    api_key = api_key or os.getenv("OPENAI_API_KEY")
    if not api_key:
        raise ValueError("Set OPENAI_API_KEY or pass api_key")
    client = OpenAI(api_key=api_key)
    coding_guide = load_coding_guide()
    entries = load_all_failures()
    if limit is not None:
        entries = entries[:limit]
    results = []

    def task(ent):
        return classify_one(
            client,
            coding_guide,
            ent["failure_type"],
            ent["label_a"],
            ent["label_b"],
            ent["text_a"],
            ent["text_b"],
            ent["problem_id"],
        )

    with ThreadPoolExecutor(max_workers=batch_size) as executor:
        futures = {executor.submit(task, ent): ent for ent in entries}
        done = 0
        for fut in as_completed(futures):
            ent = futures[fut]
            try:
                problem_id, subtype, raw = fut.result()
                results.append({
                    "model": ent["model"],
                    "index": ent["index"],
                    "problem_id": problem_id,
                    "failure_type": ent["failure_type"],
                    "granular_subtype": subtype,
                    "raw_response": raw,
                })
            except Exception as e:
                results.append({
                    "model": ent["model"],
                    "index": ent["index"],
                    "problem_id": ent["problem_id"],
                    "failure_type": ent["failure_type"],
                    "granular_subtype": None,
                    "raw_response": str(e),
                })
            done += 1
            if done % 50 == 0:
                print(f"  Classified {done}/{len(entries)}")

    return results


def aggregate_frequencies(results: list[dict]) -> dict:
    by_failure_subtype = defaultdict(int)
    by_model_failure_subtype = defaultdict(int)
    for r in results:
        st = r.get("granular_subtype") or "Unclassified"
        ft = r.get("failure_type", "")
        model = r.get("model", "")
        by_failure_subtype[(ft, st)] += 1
        by_model_failure_subtype[(model, ft, st)] += 1
    return {
        "by_failure_type_and_subtype": [{"failure_type": k[0], "subtype": k[1], "count": v} for k, v in sorted(by_failure_subtype.items())],
        "by_model_failure_type_and_subtype": [{"model": k[0], "failure_type": k[1], "subtype": k[2], "count": v} for k, v in sorted(by_model_failure_subtype.items())],
    }


def occurrence_counts(results: list[dict]) -> dict:
    """
    Compute occurrence counts for a list of classifications (e.g. per model).
    Mirrors structure of Dataset_*_taxonomy_failures.json for Sankey: total_failures,
    failures_by_type, failures_by_subtype, failures_by_type_and_subtype.
    """
    total = len(results)
    by_type = defaultdict(int)
    by_subtype = defaultdict(int)
    by_type_and_subtype = defaultdict(int)
    for r in results:
        ft = r.get("failure_type", "")
        st = r.get("granular_subtype") or "Unclassified"
        by_type[ft] += 1
        by_subtype[st] += 1
        by_type_and_subtype[(ft, st)] += 1
    return {
        "total_failures": total,
        "failures_by_type": dict(sorted(by_type.items())),
        "failures_by_subtype": dict(sorted(by_subtype.items())),
        "failures_by_type_and_subtype": [
            {"failure_type": k[0], "subtype": k[1], "count": v}
            for k, v in sorted(by_type_and_subtype.items())
        ],
    }


def run_test(
    api_key: Optional[str] = None,
    test_size: int = 5,
    verbose: bool = True,
) -> list[dict]:
    """
    Test mode: classify a small sample (sequential, batch_size=1), save to test_output/,
    optionally print first prompt/response for inspection.
    """
    if OpenAI is None:
        raise SystemExit("Install openai for classification: pip install openai")
    api_key = api_key or os.getenv("OPENAI_API_KEY")
    if not api_key:
        raise ValueError("Set OPENAI_API_KEY or pass api_key for test")
    client = OpenAI(api_key=api_key)
    coding_guide = load_coding_guide()
    entries = load_all_failures()
    entries = entries[: test_size]
    print(f"[TEST] Classifying {len(entries)} entries (sequential)...")
    results = []
    for i, ent in enumerate(entries):
        problem_id, subtype, raw = classify_one(
            client,
            coding_guide,
            ent["failure_type"],
            ent["label_a"],
            ent["label_b"],
            ent["text_a"],
            ent["text_b"],
            ent["problem_id"],
        )
        results.append({
            "model": ent["model"],
            "index": ent["index"],
            "problem_id": problem_id,
            "failure_type": ent["failure_type"],
            "granular_subtype": subtype,
            "raw_response": raw,
        })
        if verbose:
            print(f"  [{i+1}/{len(entries)}] {ent['model']} {ent['problem_id']} {ent['failure_type']} -> {subtype or 'Unclassified'}")
    test_out = GRANULAR_DIR / "test_output"
    test_out.mkdir(parents=True, exist_ok=True)
    counts = occurrence_counts(results)
    out_path = test_out / "test_classifications.json"
    with open(out_path, "w", encoding="utf-8") as f:
        json.dump({
            "test_size": len(results),
            "total_failures": counts["total_failures"],
            "failures_by_type": counts["failures_by_type"],
            "failures_by_subtype": counts["failures_by_subtype"],
            "failures_by_type_and_subtype": counts["failures_by_type_and_subtype"],
            "classifications": results,
        }, f, indent=2, ensure_ascii=False)
    print(f"[TEST] Results saved to {out_path}")
    freqs = aggregate_frequencies(results)
    freq_path = test_out / "test_frequencies.json"
    with open(freq_path, "w", encoding="utf-8") as f:
        json.dump(freqs, f, indent=2, ensure_ascii=False)
    print(f"[TEST] Frequencies saved to {freq_path}")
    unclassified = sum(1 for r in results if not r.get("granular_subtype"))
    print(f"[TEST] Unclassified: {unclassified}/{len(results)}")
    return results


def main():
    import argparse
    parser = argparse.ArgumentParser(description="Classify taxonomy failures into granular subtypes with GPT-4o (batch)")
    parser.add_argument("--limit", type=int, default=None, help="Limit number of failures to classify (for testing)")
    parser.add_argument("--batch-size", type=int, default=BATCH_SIZE, help="Concurrent API requests")
    parser.add_argument("--dry-run", action="store_true", help="Only load and count, do not call API")
    parser.add_argument("--test", action="store_true", help="Test mode: classify a small sample (default 5), sequential, save to test_output/")
    parser.add_argument("--test-size", type=int, default=5, help="Number of entries in test mode (default 5)")
    parser.add_argument("--test-quiet", action="store_true", help="Test mode: do not print per-entry lines")
    args = parser.parse_args()

    GRANULAR_DIR.mkdir(parents=True, exist_ok=True)
    entries = load_all_failures()
    if args.limit:
        entries = entries[: args.limit]
    print(f"Loaded {len(entries)} failure entries to classify")

    if args.dry_run:
        print("Dry run: exiting without API calls.")
        return

    if args.test:
        run_test(
            test_size=args.test_size,
            verbose=not args.test_quiet,
        )
        return

    print("Running GPT-4o classification (batch size={})...".format(args.batch_size))
    results = run_batch_classification(batch_size=args.batch_size, limit=args.limit)
    print(f"Done. Classified {len(results)} entries.")

    # Per-model results (with occurrence counts for Sankey)
    by_model = defaultdict(list)
    for r in results:
        by_model[r["model"]].append(r)
    for model, rows in by_model.items():
        safe = model.replace("/", "_").replace(" ", "_")
        counts = occurrence_counts(rows)
        out_path = GRANULAR_DIR / f"{safe}_granular_subtypes.json"
        with open(out_path, "w", encoding="utf-8") as f:
            json.dump({
                "model": model,
                "total_failures": counts["total_failures"],
                "failures_by_type": counts["failures_by_type"],
                "failures_by_subtype": counts["failures_by_subtype"],
                "failures_by_type_and_subtype": counts["failures_by_type_and_subtype"],
                "classifications": rows,
            }, f, indent=2, ensure_ascii=False)
        print(f"  Wrote {out_path}")

    # Aggregated frequencies (for Sankey)
    freqs = aggregate_frequencies(results)
    freq_path = GRANULAR_DIR / "granular_subtype_frequencies.json"
    with open(freq_path, "w", encoding="utf-8") as f:
        json.dump(freqs, f, indent=2, ensure_ascii=False)
    print(f"  Wrote {freq_path}")

    # Summary
    unclassified = sum(1 for r in results if not r.get("granular_subtype"))
    print(f"Unclassified: {unclassified}")


if __name__ == "__main__":
    main()
