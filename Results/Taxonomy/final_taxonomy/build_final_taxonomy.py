#!/usr/bin/env python3
"""
Build the final taxonomy CSV: one row per (category, subtype) with:
- brief_description (subtype definition)
- description_original: summarized problem statement (from problem_description_2_0.json)
- description_1, description_2: summarized pair involved in the failure (core idea only)
- code_1, code_2: the two code variants for that failure (same problem_id; both columns complete)

Output: final_taxonomy/final_taxonomy.csv
"""

import csv
import json
import re
from pathlib import Path

# Script is in Results/Taxonomy/final_taxonomy/ -> project root = 4 levels up
WORKSPACE_ROOT = Path(__file__).resolve().parent.parent.parent.parent
GRANULAR_DIR = Path(__file__).resolve().parent.parent / "granular_subtypes"
JAVA_SNIPPETS_DIR = WORKSPACE_ROOT / "Results" / "Java_code_snippets"
OUT_DIR = Path(__file__).resolve().parent
PROBLEM_DESCRIPTION_PATH = WORKSPACE_ROOT / "problem_description_2_0.json"

# Brief descriptions from CODING_GUIDE (subtype -> definition)
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

# Per category: (description_1 key, description_2 key) — the two descriptions involved in the failure
# Variable/Dead/Encryption compare without_comments vs transformed; Comment compares with vs without.
CATEGORY_DESC_PAIR = {
    "Comment_Dependency": ("example_with_comments", "example_without_comments"),
    "Variable_Renaming_Failure": ("example_without_comments", "example_variable_renaming"),
    "Dead_Code_Failure": ("example_without_comments", "example_dead_code"),
    "Encryption_Failure": ("example_without_comments", "example_encryption"),
}

# Per category: (code_1 key, code_2 key). Both must refer to same problem_id.
# Comment_Dependency: both on item. Others: code_1 = baseline (without_comments) from lookup, code_2 = from item.
CATEGORY_CODE_KEYS = {
    "Comment_Dependency": ("code_with_comments", "code_without_comments"),
    "Variable_Renaming_Failure": ("code_without_comments", "code_variable_renaming"),  # code_1 from lookup
    "Dead_Code_Failure": ("code_without_comments", "code_dead_code"),
    "Encryption_Failure": ("code_without_comments", "code_encryption"),
}

MAX_SUMMARY_CHARS = 380


def summarize(text: str) -> str:
    """Keep core idea only: strip, truncate at word boundary, add ... if truncated."""
    if not text or not isinstance(text, str):
        return ""
    t = re.sub(r"\s+", " ", text).strip()
    if len(t) <= MAX_SUMMARY_CHARS:
        return t
    cut = t[: MAX_SUMMARY_CHARS + 1].rsplit(" ", 1)[0]
    return cut.rstrip(".,;:") + "…"


def load_original_descriptions():
    """problem_id -> original Description (problem statement)."""
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
    """problem_id -> Java code (without comments) for code_1 when category is not Comment_Dependency."""
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
    """Load all classification items from Dataset_*_granular_subtypes.json."""
    items = []
    for path in sorted(GRANULAR_DIR.glob("Dataset_*_granular_subtypes.json")):
        with open(path, "r", encoding="utf-8") as f:
            data = json.load(f)
        for c in data.get("classifications", []):
            items.append(c)
    return items


def group_by_category_subtype(items):
    """Group items by (failure_type, granular_subtype)."""
    groups = {}
    for c in items:
        cat = c.get("failure_type", "").strip()
        sub = c.get("granular_subtype", "").strip()
        if not cat or not sub:
            continue
        key = (cat, sub)
        if key not in groups:
            groups[key] = []
        groups[key].append(c)
    return groups


def pick_best_example(candidates, category, baseline_code_by_pid):
    """
    Pick the most relevant example: must have both descriptions and both code variants
    for the same problem_id. Prefer longer description content.
    """
    code_1_key, code_2_key = CATEGORY_CODE_KEYS.get(category, (None, None))
    desc_1_key, desc_2_key = CATEGORY_DESC_PAIR.get(category, (None, None))
    best = None
    best_score = -1
    for c in candidates:
        pid = (c.get("problem_id") or "").strip()
        if not pid:
            continue
        d1 = (c.get(desc_1_key) or "").strip()
        d2 = (c.get(desc_2_key) or "").strip()
        if not d1 or not d2:
            continue
        if category == "Comment_Dependency":
            c1 = (c.get(code_1_key) or "").strip()
            c2 = (c.get(code_2_key) or "").strip()
            if not c1 or not c2:
                continue
        else:
            c1 = baseline_code_by_pid.get(pid, "").strip()
            c2 = (c.get(code_2_key) or "").strip()
            if not c1 or not c2:
                continue
        score = len(d1) + len(d2)
        if score > best_score:
            best_score = score
            best = c
    if best is not None:
        return best
    return None


def main():
    original_by_pid = load_original_descriptions()
    baseline_code_by_pid = load_baseline_code()
    items = load_all_classifications()
    groups = group_by_category_subtype(items)
    rows = []
    for (category, subtype) in sorted(groups.keys()):
        candidates = groups[(category, subtype)]
        chosen = pick_best_example(candidates, category, baseline_code_by_pid)
        if not chosen:
            continue
        pid = (chosen.get("problem_id") or "").strip()
        brief = SUBTYPE_BRIEF_DESCRIPTIONS.get(subtype, "")
        desc_1_key, desc_2_key = CATEGORY_DESC_PAIR.get(category, (None, None))
        code_1_key, code_2_key = CATEGORY_CODE_KEYS.get(category, (None, None))
        # Original (problem statement)
        description_original = summarize(original_by_pid.get(pid, ""))
        description_1 = summarize((chosen.get(desc_1_key) or "").strip())
        description_2 = summarize((chosen.get(desc_2_key) or "").strip())
        # Code: both for same problem_id
        if category == "Comment_Dependency":
            code_1 = (chosen.get(code_1_key) or "").strip()
            code_2 = (chosen.get(code_2_key) or "").strip()
        else:
            code_1 = baseline_code_by_pid.get(pid, "").strip()
            code_2 = (chosen.get(code_2_key) or "").strip()
        model = (chosen.get("model") or "").strip()
        problem_index = chosen.get("index")
        if problem_index is None:
            problem_index = ""
        rows.append({
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
        })
    fieldnames = [
        "category", "subtype", "brief_description",
        "description_original", "description_1", "description_2",
        "code_1", "code_2",
        "model", "problem_id", "problem_index",
    ]
    buf = __import__("io").StringIO()
    writer = csv.DictWriter(buf, fieldnames=fieldnames, quoting=csv.QUOTE_NONNUMERIC)
    writer.writeheader()
    for r in rows:
        writer.writerow({k: (r.get(k) or "") for k in fieldnames})
    csv_content = buf.getvalue()
    out_path = OUT_DIR / "final_taxonomy.csv"
    try:
        with open(out_path, "w", encoding="utf-8", newline="") as f:
            f.write(csv_content)
        print(f"Wrote {len(rows)} rows to {out_path}", file=__import__("sys").stderr)
    except OSError:
        import sys
        sys.stdout.write(csv_content)


if __name__ == "__main__":
    main()
