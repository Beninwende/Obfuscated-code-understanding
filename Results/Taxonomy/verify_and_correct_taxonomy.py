#!/usr/bin/env python3
"""
Verify and correct taxonomy CSVs against source data only. Factual: no creation.

1. Strict verification: for each row, source must exist; source.failure_type == category;
   source.granular_subtype == subtype; code_1/2 and description_1/2 must match source.
2. Correction: (re)build rows from source only. Drop rows with missing source or
   missing required fields. category/subtype/descriptions/code come only from source.
"""

import csv
import json
import re
import sys
from pathlib import Path

TAXONOMY_DIR = Path(__file__).resolve().parent
GRANULAR_DIR = TAXONOMY_DIR / "granular_subtypes"
WORKSPACE_ROOT = TAXONOMY_DIR.parent.parent  # combined_dataset
JAVA_SNIPPETS_DIR = WORKSPACE_ROOT / "Results" / "Java_code_snippets"
PROBLEM_DESCRIPTION_PATH = WORKSPACE_ROOT / "problem_description_2_0.json"

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

SUBTYPE_BRIEF_DESCRIPTIONS = {
    "Algorithm_misunderstanding": "The model describes a different algorithm than the code (different logic or goal).",
    "Algorithm_confusion": "Mix of correct and wrong ideas about the algorithm; same domain but details reversed or confused (min vs max, inverted condition, etc.).",
    "Functional_inaccuracy": "Right general domain (same task type) but wrong functional details: wrong I/O, formulas, or edge cases.",
    "Minimal_code_understanding": "Very vague or generic description; little or no information on actual behavior (boilerplate phrases).",
    "Structural_description_only": "Text focuses on classes, methods, variables, I/O utilities (FastScanner, BufferedReader, etc.) and not on what the program does semantically.",
    "Wrong_IO_interpretation": "Wrong understanding of inputs/outputs or constraints (what is read, written, format).",
    "Semantic_drift": "Same high-level domain (e.g. counting, threshold) but different task or entities (different problem or interpretation).",
    "Hallucination_unrelated": "Content unrelated to the code: different problem, algorithm, or questions/exercises.",
    "Obfuscation_narrative": "Model describes encryption/decryption, DES/Blowfish/XOR, hidden messages, instead of the program's actual logic.",
    "Empty_or_template": "Empty or template-only text: section headers (#### Title:, #### Description:), generic questions, placeholders. Little or no real description.",
    "Creative_or_offtask": "Poem, story, personal reflection, or response to a different instruction than 'describe this code'.",
    "Refusal_or_meta": "Refusal to answer, or discussion about the task/instructions instead of describing the code.",
    "Overgeneralization": "Overly generic repeated phrase; could apply to any program. Mapped to Minimal_code_understanding or Empty_or_template.",
}

MAX_SUMMARY_CHARS = 380

# Exclude invalid examples that do not satisfy taxonomy principles (manual review).
# Dead_Code_Failure + Algorithm_confusion: GPT-4o p02612 index 80 is not a valid
# Algorithm_confusion (model described the code accurately; example excluded).
# Dead_Code_Failure + Obfuscation_narrative: Deepseek-V3.1 p00005 index 75 excluded (manual review).
# Variable_Renaming_Failure + Creative_or_offtask: starchat p02887 index 243 excluded (manual review).
# Dead_Code_Failure + Refusal_or_meta: Qwen3-VL p02923 index 267 excluded (manual review).
EXCLUDED_EXAMPLES = {
    ("Dead_Code_Failure", "Algorithm_confusion"): [("Dataset_GPT4o", "p02612", 80)],
    ("Dead_Code_Failure", "Obfuscation_narrative"): [("Dataset_DeepseekV3.1", "p00005", 75)],
    ("Dead_Code_Failure", "Refusal_or_meta"): [("Dataset_Qwen3VL", "p02923", 267)],
    ("Variable_Renaming_Failure", "Creative_or_offtask"): [("Dataset_starchat", "p02887", 243)],
}


def summarize(text: str) -> str:
    if not text or not isinstance(text, str):
        return ""
    t = re.sub(r"\s+", " ", text).strip()
    if len(t) <= MAX_SUMMARY_CHARS:
        return t
    cut = t[: MAX_SUMMARY_CHARS + 1].rsplit(" ", 1)[0]
    return cut.rstrip(".,;:") + "…"


def normalize_code(s: str) -> str:
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


def load_original_descriptions():
    out = {}
    if not PROBLEM_DESCRIPTION_PATH.exists():
        return out
    with open(PROBLEM_DESCRIPTION_PATH, "r", encoding="utf-8") as f:
        data = json.load(f)
    for entry in data:
        pid = entry.get("Sub Directory", "").strip()
        desc = entry.get("Description", "")
        if pid and desc:
            out[pid] = desc
    return out


def row_from_source(item: dict, baseline_code: dict, original_by_pid: dict) -> dict | None:
    """
    Build one taxonomy row from a source classification only. Returns None if required
    fields are missing (factual: do not create).
    """
    category = (item.get("failure_type") or "").strip()
    subtype = (item.get("granular_subtype") or "").strip()
    pid = (item.get("problem_id") or "").strip()
    model = (item.get("model") or "").strip()
    problem_index = item.get("index")
    if not category or not subtype or not pid or not model or problem_index is None:
        return None

    desc_1_key, desc_2_key = CATEGORY_DESC_PAIR.get(category, (None, None))
    code_1_key, code_2_key = CATEGORY_CODE_KEYS.get(category, (None, None))
    if not desc_1_key or not code_1_key:
        return None

    raw_d1 = (item.get(desc_1_key) or "").strip()
    raw_d2 = (item.get(desc_2_key) or "").strip()
    if not raw_d1 or not raw_d2:
        return None

    if category == "Comment_Dependency":
        code_1 = (item.get(code_1_key) or "").strip()
        code_2 = (item.get(code_2_key) or "").strip()
    else:
        code_1 = (baseline_code.get(pid) or "").strip()
        code_2 = (item.get(code_2_key) or "").strip()
    if not code_1 or not code_2:
        return None

    brief = SUBTYPE_BRIEF_DESCRIPTIONS.get(subtype, "")
    description_original = summarize(original_by_pid.get(pid, ""))
    description_1 = summarize(raw_d1)
    description_2 = summarize(raw_d2)
    problem_index_out = problem_index if problem_index is not None else ""

    return {
        "category": category,
        "subtype": subtype,
        "brief_description": brief,
        "description_original": description_original,
        "description_1": description_1,
        "description_2": description_2,
        "code_1": code_1,
        "code_2": code_2,
        "model": model,
        "problem_id": pid,
        "problem_index": problem_index_out,
    }


def verify_csv(csv_path: Path, classifications: dict, baseline_code: dict) -> tuple[int, int, list]:
    """
    Strict verification. Returns (ok_count, error_count, list of error messages).
    Checks: source exists; source.failure_type == category; source.granular_subtype == subtype;
    code_1/2 and description_1/2 match source.
    """
    errors = []
    ok_count = 0
    with open(csv_path, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for row_num, row in enumerate(reader, start=2):
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
            src_cat = (item.get("failure_type") or "").strip()
            src_sub = (item.get("granular_subtype") or "").strip()
            if src_cat != category:
                errors.append(f"Row {row_num}: category mismatch CSV={category!r} source={src_cat!r} (model={model}, problem_id={problem_id}, index={problem_index})")
                continue
            if src_sub != subtype:
                errors.append(f"Row {row_num}: subtype mismatch CSV={subtype!r} source={src_sub!r} (model={model}, problem_id={problem_id}, index={problem_index})")
                continue

            desc_1_key, desc_2_key = CATEGORY_DESC_PAIR.get(category, (None, None))
            code_1_key, code_2_key = CATEGORY_CODE_KEYS.get(category, (None, None))
            if not desc_1_key or not code_1_key:
                errors.append(f"Row {row_num}: unknown category {category!r}")
                continue

            raw_d1 = (item.get(desc_1_key) or "").strip()
            raw_d2 = (item.get(desc_2_key) or "").strip()
            expected_desc_1 = summarize(raw_d1)
            expected_desc_2 = summarize(raw_d2)
            if category == "Comment_Dependency":
                expected_code_1 = (item.get(code_1_key) or "").strip()
                expected_code_2 = (item.get(code_2_key) or "").strip()
            else:
                expected_code_1 = (baseline_code.get(problem_id) or "").strip()
                expected_code_2 = (item.get(code_2_key) or "").strip()

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

    return ok_count, len(errors), errors


def build_corrected_rows_from_source(
    classifications: dict,
    baseline_code: dict,
    original_by_pid: dict,
    one_per_key: bool,
    balance_models: bool,
) -> list[dict]:
    """
    Build taxonomy rows from source only. one_per_key=True => one row per (category, subtype).
    balance_models: when picking one per (category, subtype), prefer models with fewer uses (for balanced_taxonomy).
    Drops any (category, subtype) that has no source with all required fields.
    """
    from collections import defaultdict, OrderedDict
    groups = defaultdict(list)
    for key, item in classifications.items():
        row = row_from_source(item, baseline_code, original_by_pid)
        if row is None:
            continue
        cat = row["category"]
        sub = row["subtype"]
        groups[(cat, sub)].append((key, row))

    result = []
    model_usage = defaultdict(int)
    for (category, subtype) in sorted(groups.keys()):
        candidates = groups[(category, subtype)]
        key = (category, subtype)
        if key in EXCLUDED_EXAMPLES:
            excluded = {tuple(x) for x in EXCLUDED_EXAMPLES[key]}
            candidates = [
                (k, r) for k, r in candidates
                if (k[0], k[1].lower() if k[1] else "", k[2]) not in excluded
            ]
        if not candidates:
            continue
        if balance_models:
            def sort_key(x):
                (model, _, _), r = x
                return (model_usage[model], -(len((r.get("description_1") or "")) + len((r.get("description_2") or ""))))
            candidates = sorted(candidates, key=sort_key)
        else:
            candidates = sorted(candidates, key=lambda x: -(len((x[1].get("description_1") or "")) + len((x[1].get("description_2") or ""))))
        key, chosen = candidates[0]
        if balance_models:
            model_usage[chosen["model"]] += 1
        result.append(chosen)
    return result


def write_taxonomy_csv(path: Path, rows: list[dict]):
    fieldnames = [
        "category", "subtype", "brief_description",
        "description_original", "description_1", "description_2",
        "code_1", "code_2",
        "model", "problem_id", "problem_index",
    ]
    with open(path, "w", encoding="utf-8", newline="") as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames, quoting=csv.QUOTE_NONNUMERIC)
        writer.writeheader()
        for r in rows:
            row = {}
            for k in fieldnames:
                v = r.get(k)
                if k == "problem_index" and v is not None and v != "":
                    row[k] = int(v)  # keep as number so 0 is written as 0
                else:
                    row[k] = v if (v is not None and v != "") else ""
            writer.writerow(row)


def main():
    import argparse
    parser = argparse.ArgumentParser(description="Verify and/or correct taxonomy CSVs from source only (factual).")
    parser.add_argument("--verify", metavar="CSV", help="Run strict verification on this CSV; report and exit")
    parser.add_argument("--correct-final", action="store_true", help="Rebuild final_taxonomy.csv from source only")
    parser.add_argument("--correct-balanced", action="store_true", help="Rebuild balanced_taxonomy.csv from source only (balance models)")
    parser.add_argument("--report", metavar="FILE", help="Write verification report to FILE")
    args = parser.parse_args()

    print("Loading source data...", file=sys.stderr)
    classifications = load_classifications_by_key()
    baseline_code = load_baseline_code()
    original_by_pid = load_original_descriptions()
    print(f"  Classifications: {len(classifications)}", file=sys.stderr)

    if args.verify:
        csv_path = Path(args.verify)
        if not csv_path.is_absolute():
            csv_path = TAXONOMY_DIR / args.verify
        if not csv_path.exists():
            csv_path = TAXONOMY_DIR / "final_taxonomy" / "final_taxonomy.csv"
            if not csv_path.exists():
                csv_path = TAXONOMY_DIR / "balanced_taxonomy" / "balanced_taxonomy.csv"
        if not csv_path.exists():
            print(f"CSV not found: {args.verify}", file=sys.stderr)
            sys.exit(2)
        ok, err_count, errors = verify_csv(csv_path, classifications, baseline_code)
        report_lines = [
            f"Verification: {csv_path.name}",
            f"  OK: {ok}",
            f"  Errors: {err_count}",
            "",
        ] + (errors if errors else ["No errors."])
        report_text = "\n".join(report_lines)
        if args.report:
            Path(args.report).write_text(report_text, encoding="utf-8")
            print(f"Report written to {args.report}", file=sys.stderr)
        print(report_text, file=sys.stderr)
        sys.exit(0 if err_count == 0 else 1)

    if args.correct_final:
        rows = build_corrected_rows_from_source(
            classifications, baseline_code, original_by_pid,
            one_per_key=True, balance_models=False,
        )
        out_path = TAXONOMY_DIR / "final_taxonomy" / "final_taxonomy.csv"
        out_path.parent.mkdir(parents=True, exist_ok=True)
        write_taxonomy_csv(out_path, rows)
        print(f"Corrected {len(rows)} rows -> {out_path}", file=sys.stderr)
        ok, err_count, errors = verify_csv(out_path, classifications, baseline_code)
        if errors:
            print("Verification after correction:", file=sys.stderr)
            for e in errors[:20]:
                print("  ", e, file=sys.stderr)
            if len(errors) > 20:
                print(f"  ... and {len(errors) - 20} more", file=sys.stderr)
        else:
            print(f"Verification passed: all {ok} rows match source.", file=sys.stderr)

    if args.correct_balanced:
        rows = build_corrected_rows_from_source(
            classifications, baseline_code, original_by_pid,
            one_per_key=True, balance_models=True,
        )
        out_path = TAXONOMY_DIR / "balanced_taxonomy" / "balanced_taxonomy.csv"
        out_path.parent.mkdir(parents=True, exist_ok=True)
        write_taxonomy_csv(out_path, rows)
        print(f"Corrected {len(rows)} rows -> {out_path}", file=sys.stderr)
        ok, err_count, errors = verify_csv(out_path, classifications, baseline_code)
        if errors:
            print("Verification after correction:", file=sys.stderr)
            for e in errors[:20]:
                print("  ", e, file=sys.stderr)
            if len(errors) > 20:
                print(f"  ... and {len(errors) - 20} more", file=sys.stderr)
        else:
            print(f"Verification passed: all {ok} rows match source.", file=sys.stderr)

    if not args.verify and not args.correct_final and not args.correct_balanced:
        parser.print_help(sys.stderr)
        print("\nExample: --verify final_taxonomy/final_taxonomy.csv", file=sys.stderr)
        print("         --correct-final  # rebuild final_taxonomy.csv from source only", file=sys.stderr)
        print("         --correct-balanced  # rebuild balanced_taxonomy.csv from source only", file=sys.stderr)
        sys.exit(0)


if __name__ == "__main__":
    main()
