#!/usr/bin/env python3
"""
Verify that code_1, code_2 and description_1, description_2 in the taxonomy CSV
correctly correspond to the source classification (model, problem_id, problem_index).
Run from balanced_taxonomy/ or final_taxonomy/; can verify balanced_taxonomy.csv and/or final_taxonomy.csv.
"""

import csv
import json
import re
import sys
from pathlib import Path

SCRIPT_DIR = Path(__file__).resolve().parent
TAXONOMY_DIR = SCRIPT_DIR.parent  # Results/Taxonomy
GRANULAR_DIR = TAXONOMY_DIR / "granular_subtypes"
WORKSPACE_ROOT = SCRIPT_DIR.parent.parent.parent  # combined_dataset
JAVA_SNIPPETS_DIR = WORKSPACE_ROOT / "Results" / "Java_code_snippets"

CATEGORY_DESC_PAIR = {
    "Comment_Dependency": ("example_with_comments", "example_without_comments"),
    "Variable_Renaming_Failure": ("example_without_comments", "example_variable_renaming"),
    "Dead_Code_Failure": ("example_without_comments", "example_dead_code"),
    "Encryption_Failure": ("example_without_comments", "example_encryption"),
}

CATEGORY_CODE_KEYS = {
    "Comment_Dependency": ("code_with_comments", "code_without_comments"),
    "Variable_Renaming_Failure": ("code_without_comments", "code_variable_renaming"),
    "Dead_Code_Failure": ("code_without_comments", "code_dead_code"),
    "Encryption_Failure": ("code_without_comments", "code_encryption"),
}

MAX_SUMMARY_CHARS = 380


def summarize(text: str) -> str:
    if not text or not isinstance(text, str):
        return ""
    t = re.sub(r"\s+", " ", text).strip()
    if len(t) <= MAX_SUMMARY_CHARS:
        return t
    cut = t[: MAX_SUMMARY_CHARS + 1].rsplit(" ", 1)[0]
    return cut.rstrip(".,;:") + "…"


def normalize_code(s: str) -> str:
    """Normalize for comparison: strip, unified newlines."""
    if not s:
        return ""
    return s.strip().replace("\r\n", "\n").replace("\r", "\n")


def load_classifications_by_key():
    """(model, problem_id, index) -> classification item."""
    index = {}
    for path in sorted(GRANULAR_DIR.glob("Dataset_*_granular_subtypes.json")):
        with open(path, "r", encoding="utf-8") as f:
            data = json.load(f)
        for c in data.get("classifications", []):
            model = (c.get("model") or "").strip()
            pid = (c.get("problem_id") or "").strip()
            idx = c.get("index")
            if model and pid and idx is not None:
                index[(model, pid, int(idx))] = c
    return index


def load_baseline_code():
    out = {}
    path = JAVA_SNIPPETS_DIR / "Data_Without_Comments.json"
    if not path.exists():
        return out
    with open(path, "r", encoding="utf-8") as f:
        data = json.load(f)
    for entry in data:
        pid = entry.get("Sub Directory", "").strip()
        code = entry.get("Java Code", "")
        if pid and code:
            out[pid] = code
    return out


def verify_csv(csv_path: Path, classifications: dict, baseline_code: dict) -> tuple[int, list]:
    """Returns (ok_count, list of error messages)."""
    errors = []
    ok_count = 0
    with open(csv_path, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for row_num, row in enumerate(reader, start=2):  # 2 = header is row 1
            category = (row.get("category") or "").strip()
            subtype = (row.get("subtype") or "").strip()
            model = (row.get("model") or "").strip()
            problem_id = (row.get("problem_id") or "").strip()
            raw_index = row.get("problem_index", "")
            try:
                problem_index = int(raw_index) if raw_index != "" else None
            except (TypeError, ValueError):
                problem_index = None
            csv_code_1 = (row.get("code_1") or "").strip()
            csv_code_2 = (row.get("code_2") or "").strip()
            csv_desc_1 = (row.get("description_1") or "").strip()
            csv_desc_2 = (row.get("description_2") or "").strip()

            if not model or not problem_id:
                errors.append(f"Row {row_num}: missing model or problem_id")
                continue
            if problem_index is None:
                errors.append(f"Row {row_num} ({category}/{subtype}): missing or invalid problem_index")
                continue

            key = (model, problem_id, problem_index)
            if key not in classifications:
                errors.append(f"Row {row_num} ({category}/{subtype}): source not found model={model!r} problem_id={problem_id!r} index={problem_index}")
                continue

            item = classifications[key]
            desc_1_key, desc_2_key = CATEGORY_DESC_PAIR.get(category, (None, None))
            code_1_key, code_2_key = CATEGORY_CODE_KEYS.get(category, (None, None))
            if not desc_1_key or not code_1_key:
                errors.append(f"Row {row_num}: unknown category {category!r}")
                continue

            # Expected descriptions (summarized, as in CSV)
            raw_d1 = (item.get(desc_1_key) or "").strip()
            raw_d2 = (item.get(desc_2_key) or "").strip()
            expected_desc_1 = summarize(raw_d1)
            expected_desc_2 = summarize(raw_d2)

            # Expected code
            if category == "Comment_Dependency":
                expected_code_1 = (item.get(code_1_key) or "").strip()
                expected_code_2 = (item.get(code_2_key) or "").strip()
            else:
                expected_code_1 = (baseline_code.get(problem_id) or "").strip()
                expected_code_2 = (item.get(code_2_key) or "").strip()

            # Compare
            code_1_ok = normalize_code(csv_code_1) == normalize_code(expected_code_1)
            code_2_ok = normalize_code(csv_code_2) == normalize_code(expected_code_2)
            desc_1_ok = csv_desc_1 == expected_desc_1
            desc_2_ok = csv_desc_2 == expected_desc_2

            if not (code_1_ok and code_2_ok and desc_1_ok and desc_2_ok):
                if not code_1_ok:
                    errors.append(f"Row {row_num} ({category}/{subtype}): code_1 mismatch (model={model}, problem_id={problem_id}, index={problem_index})")
                if not code_2_ok:
                    errors.append(f"Row {row_num} ({category}/{subtype}): code_2 mismatch (model={model}, problem_id={problem_id}, index={problem_index})")
                if not desc_1_ok:
                    errors.append(f"Row {row_num} ({category}/{subtype}): description_1 mismatch (model={model}, problem_id={problem_id}, index={problem_index})")
                if not desc_2_ok:
                    errors.append(f"Row {row_num} ({category}/{subtype}): description_2 mismatch (model={model}, problem_id={problem_id}, index={problem_index})")
            else:
                ok_count += 1

    return ok_count, errors


def main():
    csv_name = "balanced_taxonomy.csv"
    if len(sys.argv) > 1:
        csv_name = sys.argv[1]
    csv_path = SCRIPT_DIR / csv_name
    if not csv_path.exists():
        csv_path = TAXONOMY_DIR / "final_taxonomy" / "final_taxonomy.csv"
        if not csv_path.exists():
            print(f"CSV not found: {SCRIPT_DIR / csv_name} or final_taxonomy.csv", file=sys.stderr)
            sys.exit(2)

    print(f"Loading source data...", file=sys.stderr)
    classifications = load_classifications_by_key()
    baseline_code = load_baseline_code()
    print(f"Verifying {csv_path}...", file=sys.stderr)

    ok_count, errors = verify_csv(csv_path, classifications, baseline_code)

    if errors:
        print("\n--- Verification FAILED ---\n", file=sys.stderr)
        for e in errors:
            print(e, file=sys.stderr)
        print(f"\nTotal: {ok_count} rows OK, {len(errors)} error(s).", file=sys.stderr)
        sys.exit(1)
    else:
        print(f"Verification PASSED: all {ok_count} rows have code_1, code_2 and description_1, description_2 consistent with model, problem_id, and problem_index.", file=sys.stderr)
        sys.exit(0)


if __name__ == "__main__":
    main()
