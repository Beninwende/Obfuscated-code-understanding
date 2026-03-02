#!/usr/bin/env python3
"""
Export failure-shift data (single vs comprehensive obfuscation, per model, per subtype)
as CSV and Markdown table. No matplotlib required.

Run from error-analysis dir: python export_failure_shift_table.py
Outputs: failure_shift_data.csv, failure_shift_table.md
"""
import csv
import json
from pathlib import Path
from collections import Counter, defaultdict

ERROR_ANALYSIS_DIR = Path(__file__).resolve().parent
TAXONOMY_ROOT = ERROR_ANALYSIS_DIR.parents[3] / "Taxonomy"
GRANULAR_FREQ_PATH = TAXONOMY_ROOT / "granular_subtypes" / "granular_subtype_frequencies.json"
CATEGORIZED_CSV = ERROR_ANALYSIS_DIR / "categorized_failures.csv"

MODELS_GRANULAR = ["Dataset_deepseek-r1", "Dataset_Gemini", "Dataset_O4-mini"]
MODELS_DISPLAY = ["DeepSeek-R1", "Gemini", "O4-mini"]


def load_single_obfuscation_subtype_counts():
    per_model = defaultdict(Counter)
    all_subtypes = set()
    if not GRANULAR_FREQ_PATH.exists():
        return {}, set()
    with open(GRANULAR_FREQ_PATH, "r", encoding="utf-8") as f:
        data = json.load(f)
    for e in data.get("by_model_failure_type_and_subtype") or []:
        model = e.get("model") or ""
        if model not in MODELS_GRANULAR:
            continue
        st = (e.get("subtype") or "").strip()
        if not st:
            continue
        per_model[model][st] += int(e.get("count") or 0)
        all_subtypes.add(st)
    display_to_key = dict(zip(MODELS_DISPLAY, MODELS_GRANULAR))
    out = {disp: per_model[key] for disp, key in display_to_key.items() if key in per_model}
    return out, all_subtypes


def load_comprehensive_subtype_counts():
    per_model = defaultdict(Counter)
    all_subtypes = set()
    if not CATEGORIZED_CSV.exists():
        return {}, set()
    with open(CATEGORIZED_CSV, "r", encoding="utf-8") as f:
        for row in csv.DictReader(f):
            model = (row.get("model") or "").strip()
            st = (row.get("subtype") or "").strip()
            if not model or not st:
                continue
            disp = "DeepSeek-R1" if model == "DeepSeek" else ("O4-mini" if model == "O4" else model)
            per_model[disp][st] += 1
            all_subtypes.add(st)
    return dict(per_model), all_subtypes


def main():
    single_per_model, single_subtypes = load_single_obfuscation_subtype_counts()
    comp_per_model, comp_subtypes = load_comprehensive_subtype_counts()
    all_subtypes = single_subtypes | comp_subtypes
    if not all_subtypes:
        print("No data found.")
        return

    total_per_sub = Counter()
    for c in single_per_model.values():
        total_per_sub.update(c)
    for c in comp_per_model.values():
        total_per_sub.update(c)
    subtype_order = [s for s, _ in total_per_sub.most_common() if s in all_subtypes]
    for s in all_subtypes:
        if s not in subtype_order:
            subtype_order.append(s)

    def pcts_from_counter(counter):
        total = sum(counter.values())
        if total == 0:
            return {s: 0.0 for s in subtype_order}
        return {s: 100.0 * counter.get(s, 0) / total for s in subtype_order}

    single_pcts = {m: pcts_from_counter(single_per_model.get(m, Counter())) for m in MODELS_DISPLAY}
    comp_pcts = {m: pcts_from_counter(comp_per_model.get(m, Counter())) for m in MODELS_DISPLAY}

    # CSV
    csv_path = ERROR_ANALYSIS_DIR / "failure_shift_data.csv"
    rows = []
    for model in MODELS_DISPLAY:
        single_counts = single_per_model.get(model, Counter())
        comp_counts = comp_per_model.get(model, Counter())
        single_total = sum(single_counts.values())
        comp_total = sum(comp_counts.values())
        for st in subtype_order:
            sc = single_counts.get(st, 0)
            cc = comp_counts.get(st, 0)
            sp = 100.0 * sc / single_total if single_total else 0.0
            cp = 100.0 * cc / comp_total if comp_total else 0.0
            rows.append({"model": model, "condition": "Single obfuscation", "subtype": st, "count": sc, "percentage": round(sp, 2)})
            rows.append({"model": model, "condition": "Comprehensive", "subtype": st, "count": cc, "percentage": round(cp, 2)})
    with open(csv_path, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, fieldnames=["model", "condition", "subtype", "count", "percentage"])
        w.writeheader()
        w.writerows(rows)
    print(f"Saved: {csv_path}")

    # Markdown
    md_path = ERROR_ANALYSIS_DIR / "failure_shift_table.md"
    lines = [
        "# Failure subtype shift: Single obfuscation → Comprehensive obfuscation",
        "",
        "Percentages are within each model and condition (sum to 100% per model per condition). Δ% = Comprehensive % − Single %.",
        "",
    ]
    for model in MODELS_DISPLAY:
        lines.append(f"## {model}")
        lines.append("")
        lines.append("| Subtype | Single (%) | Comprehensive (%) | Δ% |")
        lines.append("|---------|------------|-------------------|-----|")
        for st in subtype_order:
            sp = single_pcts[model][st]
            cp = comp_pcts[model][st]
            delta = cp - sp
            lines.append(f"| {st} | {sp:.1f} | {cp:.1f} | {delta:+.1f} |")
        lines.append("")
    md_path.write_text("\n".join(lines), encoding="utf-8")
    print(f"Saved: {md_path}")


if __name__ == "__main__":
    main()
