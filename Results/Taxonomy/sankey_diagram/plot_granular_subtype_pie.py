#!/usr/bin/env python3
"""
Generate the granular failure subtype pie chart (8 canonical subtypes) and save as PDF.
Reads from granular_subtype_frequencies.json and maps all subtypes to the 8 canonical
(subtype_to_8), then aggregates. Matches Sankey and final taxonomy.

Requires: matplotlib (pip install matplotlib)
Run: python3 plot_granular_subtype_pie.py
Output: granular_subtype_pie.pdf (in this directory)
"""
import json
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
from pathlib import Path
from collections import defaultdict

plt.rcParams["font.family"] = "Times New Roman"

# Map all granular subtypes to the 8 canonical (aligned with plot_granular_sankey / final_taxonomy_8subtypes)
SUBTYPE_TO_8 = {
    "Algorithm_confusion": "Algorithm_confusion",
    "Algorithm_misunderstanding": "Algorithm_misunderstanding",
    "Functional_inaccuracy": "Functional_inaccuracy",
    "Hallucination": "Hallucination",
    "Minimal_code_understanding": "Minimal_code_understanding",
    "Obfuscation_narrative": "Obfuscation_narrative",
    "Semantic_drift": "Semantic_drift",
    "Structural_description_only": "Structural_description_only",
    "Empty_or_template": "Minimal_code_understanding",
    "Refusal_or_meta": "Minimal_code_understanding",
    "Creative_or_offtask": "Hallucination",
    "Wrong_IO_interpretation": "Functional_inaccuracy",
    "Overgeneralization": "Minimal_code_understanding",
}


def normalized_subtype(st: str) -> str:
    return SUBTYPE_TO_8.get((st or "").strip(), "Minimal_code_understanding")


def subtype_to_label(name: str) -> str:
    """Convert subtype key to readable label (e.g. Hallucination -> Hallucination unrelated)."""
    return name.replace("_", " ").title()


def main():
    base = Path(__file__).resolve().parent
    data_path = base / ".." / "granular_subtypes" / "granular_subtype_frequencies.json"
    with open(data_path, encoding="utf-8") as f:
        data = json.load(f)

    # Aggregate counts by canonical subtype (8 only)
    by_subtype = defaultdict(int)
    for row in data["by_failure_type_and_subtype"]:
        canonical = normalized_subtype(row["subtype"])
        by_subtype[canonical] += row["count"]

    # Order by fixed 8 subtype order, then by count descending for consistency with Sankey
    order_8 = [
        "Obfuscation_narrative",
        "Hallucination",
        "Algorithm_misunderstanding",
        "Minimal_code_understanding",
        "Functional_inaccuracy",
        "Structural_description_only",
        "Semantic_drift",
        "Algorithm_confusion",
    ]
    sorted_items = [(s, by_subtype[s]) for s in order_8 if by_subtype[s] > 0]
    sorted_items.sort(key=lambda x: -x[1])

    values = [c for _, c in sorted_items]
    total = sum(values)
    labels = [f"{subtype_to_label(s)} ({100 * c / total:.1f}%)" for s, c in sorted_items]

    # Distinct colors (colorblind-friendly palette, as before)
    cmap = plt.get_cmap("tab20")
    n = len(values)
    colors = [cmap(i / max(n, 1)) for i in range(n)]

    fig, ax = plt.subplots(figsize=(8, 6))
    wedges, texts = ax.pie(
        values,
        labels=None,
        colors=colors,
        startangle=90,
    )
    ax.legend(
        wedges,
        labels,
        loc="center left",
        bbox_to_anchor=(1, 0.5),
        fontsize=14,
        frameon=True,
    )
    ax.set_title("", fontsize=16)
    plt.tight_layout(rect=[0, 0, 0.85, 1])

    pdf_path = base / "granular_subtype_pie.pdf"
    fig.savefig(pdf_path, format="pdf", bbox_inches="tight", facecolor="white")
    plt.close()
    print(f"Saved {pdf_path}")


if __name__ == "__main__":
    main()
