#!/usr/bin/env python3
"""
Build the final taxonomy with exactly 8 subtypes for all 1720 failure pairs.

Each of the 1720 classifications from granular_subtypes is assigned to one of the
8 canonical subtypes. Current granular subtypes not in the 8 are remapped as below.

Canonical 8 subtypes (aligned with balanced_taxonomy-final verified set):
  Algorithm_confusion, Algorithm_misunderstanding, Functional_inaccuracy,
  Hallucination_unrelated, Minimal_code_understanding, Obfuscation_narrative,
  Semantic_drift, Structural_description_only

Output: final_taxonomy/final_taxonomy_8subtypes.csv (1720 rows, one per pair).
"""

import csv
import json
import re
import sys
from pathlib import Path

TAXONOMY_DIR = Path(__file__).resolve().parent.parent
GRANULAR_DIR = TAXONOMY_DIR / "granular_subtypes"
OUT_DIR = Path(__file__).resolve().parent
WORKSPACE_ROOT = TAXONOMY_DIR.parent.parent
JAVA_SNIPPETS_DIR = WORKSPACE_ROOT / "Results" / "Java_code_snippets"
PROBLEM_DESCRIPTION_PATH = WORKSPACE_ROOT / "problem_description_2_0.json"

CANONICAL_8_SUBTYPES = {
    "Algorithm_confusion",
    "Algorithm_misunderstanding",
    "Functional_inaccuracy",
    "Hallucination_unrelated",
    "Minimal_code_understanding",
    "Obfuscation_narrative",
    "Semantic_drift",
    "Structural_description_only",
}

# Map every granular subtype to one of the 8. Subtypes already in the 8 map to themselves.
SUBTYPE_TO_8 = {
    "Algorithm_confusion": "Algorithm_confusion",
    "Algorithm_misunderstanding": "Algorithm_misunderstanding",
    "Functional_inaccuracy": "Functional_inaccuracy",
    "Hallucination_unrelated": "Hallucination_unrelated",
    "Minimal_code_understanding": "Minimal_code_understanding",
    "Obfuscation_narrative": "Obfuscation_narrative",
    "Semantic_drift": "Semantic_drift",
    "Structural_description_only": "Structural_description_only",
    "Empty_or_template": "Minimal_code_understanding",
    "Refusal_or_meta": "Minimal_code_understanding",
    "Creative_or_offtask": "Hallucination_unrelated",
    "Wrong_IO_interpretation": "Functional_inaccuracy",
    "Overgeneralization": "Minimal_code_understanding",
}

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
    "Semantic_drift": "Same high-level domain (e.g. counting, threshold) but different task or entities (different problem or interpretation).",
    "Hallucination_unrelated": "Content unrelated to the code: different problem, algorithm, or questions/exercises.",
    "Obfuscation_narrative": "Model describes encryption/decryption, DES/Blowfish/XOR, hidden messages, instead of the program's actual logic.",
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


def load_all_classifications():
    """Yield (model, problem_id, index), item for every classification."""
    for path in sorted(GRANULAR_DIR.glob("Dataset_*_granular_subtypes.json")):
        with open(path, "r", encoding="utf-8") as f:
            data = json.load(f)
        for c in data.get("classifications", []):
            model = (c.get("model") or "").strip()
            pid = (c.get("problem_id") or "").strip()
            idx = c.get("index")
            if model and pid and idx is not None:
                yield (model, pid, int(idx)), c


def row_from_item(item: dict, baseline_code: dict, original_by_pid: dict) -> dict | None:
    """Build one taxonomy row; subtype is remapped to canonical 8."""
    category = (item.get("failure_type") or "").strip()
    raw_subtype = (item.get("granular_subtype") or "").strip()
    subtype = SUBTYPE_TO_8.get(raw_subtype, "Minimal_code_understanding")  # fallback
    pid = (item.get("problem_id") or "").strip()
    model = (item.get("model") or "").strip()
    problem_index = item.get("index")
    if not category or not pid or not model or problem_index is None:
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
        "problem_index": problem_index,
    }


def main():
    original_by_pid = load_original_descriptions()
    baseline_code = load_baseline_code()
    fieldnames = [
        "category", "subtype", "brief_description",
        "description_original", "description_1", "description_2",
        "code_1", "code_2",
        "model", "problem_id", "problem_index",
    ]
    rows = []
    skipped = 0
    for key, item in load_all_classifications():
        row = row_from_item(item, baseline_code, original_by_pid)
        if row is None:
            skipped += 1
            continue
        rows.append(row)

    out_path = OUT_DIR / "final_taxonomy_8subtypes.csv"
    with open(out_path, "w", encoding="utf-8", newline="") as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames, quoting=csv.QUOTE_NONNUMERIC)
        writer.writeheader()
        for r in rows:
            out_row = {}
            for k in fieldnames:
                v = r.get(k)
                if k == "problem_index" and v is not None and v != "":
                    out_row[k] = int(v)
                else:
                    out_row[k] = v if (v is not None and v != "") else ""
            writer.writerow(out_row)

    print(f"Wrote {len(rows)} rows to {out_path}", file=sys.stderr)
    if skipped:
        print(f"Skipped {skipped} classifications (missing fields).", file=sys.stderr)
    # Count by canonical subtype
    from collections import Counter
    by_sub = Counter(r["subtype"] for r in rows)
    print("Counts by subtype (canonical 8):", dict(sorted(by_sub.items())), file=sys.stderr)


if __name__ == "__main__":
    main()
