#!/usr/bin/env python3
"""
Build a balanced taxonomy CSV: one row per (category, subtype) with examples
spread across models (not dominated by any single model). Same columns as
final_taxonomy.csv; output: balanced_taxonomy/balanced_taxonomy.csv
"""

import csv
import json
import re
from collections import defaultdict
from pathlib import Path

# Script is in Results/Taxonomy/balanced_taxonomy/ -> project root = 4 levels up
WORKSPACE_ROOT = Path(__file__).resolve().parent.parent.parent.parent
GRANULAR_DIR = Path(__file__).resolve().parent.parent / "granular_subtypes"
JAVA_SNIPPETS_DIR = WORKSPACE_ROOT / "Results" / "Java_code_snippets"
OUT_DIR = Path(__file__).resolve().parent
PROBLEM_DESCRIPTION_PATH = WORKSPACE_ROOT / "problem_description_2_0.json"

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
    items = []
    for path in sorted(GRANULAR_DIR.glob("Dataset_*_granular_subtypes.json")):
        with open(path, "r", encoding="utf-8") as f:
            data = json.load(f)
        for c in data.get("classifications", []):
            items.append(c)
    return items


def group_by_category_subtype(items):
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


def get_valid_candidates_with_scores(candidates, category, baseline_code_by_pid):
    """Return list of (candidate, content_score) for candidates that have both descriptions and both code variants."""
    code_1_key, code_2_key = CATEGORY_CODE_KEYS.get(category, (None, None))
    desc_1_key, desc_2_key = CATEGORY_DESC_PAIR.get(category, (None, None))
    valid = []
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
        valid.append((c, score))
    return valid


def pick_balanced_example(candidates, category, baseline_code_by_pid, model_usage):
    """
    Among valid candidates, pick one from the model with the fewest uses so far (balance).
    Tie-break by content score (prefer longer descriptions).
    """
    valid = get_valid_candidates_with_scores(candidates, category, baseline_code_by_pid)
    if not valid:
        return None
    # Sort by (current usage of model, then -content_score so higher score first)
    def key(item):
        c, score = item
        model = (c.get("model") or "").strip() or "unknown"
        return (model_usage[model], -score)
    valid.sort(key=key)
    return valid[0][0]


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


def main():
    original_by_pid = load_original_descriptions()
    baseline_code_by_pid = load_baseline_code()
    items = load_all_classifications()
    groups = group_by_category_subtype(items)
    model_usage = defaultdict(int)
    rows = []
    for (category, subtype) in sorted(groups.keys()):
        candidates = groups[(category, subtype)]
        key = (category, subtype)
        if key in EXCLUDED_EXAMPLES:
            excluded = {tuple(x) for x in EXCLUDED_EXAMPLES[key]}
            candidates = [
                c for c in candidates
                if ((c.get("model") or "").strip(), (c.get("problem_id") or "").strip().lower(), c.get("index")) not in excluded
            ]
        chosen = pick_balanced_example(candidates, category, baseline_code_by_pid, model_usage)
        if not chosen:
            continue
        model = (chosen.get("model") or "").strip()
        if model:
            model_usage[model] += 1
        pid = (chosen.get("problem_id") or "").strip()
        brief = SUBTYPE_BRIEF_DESCRIPTIONS.get(subtype, "")
        desc_1_key, desc_2_key = CATEGORY_DESC_PAIR.get(category, (None, None))
        code_1_key, code_2_key = CATEGORY_CODE_KEYS.get(category, (None, None))
        description_original = summarize(original_by_pid.get(pid, ""))
        description_1 = summarize((chosen.get(desc_1_key) or "").strip())
        description_2 = summarize((chosen.get(desc_2_key) or "").strip())
        if category == "Comment_Dependency":
            code_1 = (chosen.get(code_1_key) or "").strip()
            code_2 = (chosen.get(code_2_key) or "").strip()
        else:
            code_1 = baseline_code_by_pid.get(pid, "").strip()
            code_2 = (chosen.get(code_2_key) or "").strip()
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
    out_path = OUT_DIR / "balanced_taxonomy.csv"
    with open(out_path, "w", encoding="utf-8", newline="") as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames, quoting=csv.QUOTE_NONNUMERIC)
        writer.writeheader()
        for r in rows:
            writer.writerow({k: (r.get(k) or "") for k in fieldnames})
    import sys
    print(f"Wrote {len(rows)} rows to {out_path}", file=sys.stderr)
    print("Model usage (balanced):", dict(sorted(model_usage.items())), file=sys.stderr)


if __name__ == "__main__":
    main()
