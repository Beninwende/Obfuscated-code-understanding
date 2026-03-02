#!/usr/bin/env python3
"""
Quantify bias: High-Level Algorithmic (HL) vs Low-Level Logic (LL) tasks.

Taxonomy (reproducible, from task_type in full_code_metrics_consensus_50.csv):
- HL (High-Level Algorithmic/Standard Library): sort, count, unique, tree.
- LL (Low-Level Logic/State Manipulation): digit, string, replace, compare.
- Other: other, math, max, min, sum (excluded from HL vs LL test).

Metrics: Δ Success = μ_HL - μ_LL; Mann-Whitney U (one-sided, HL > LL); Cohen's d.
Output: hl_vs_ll_results.json, bar chart category_vs_success_rate.png.
"""

import csv
import json
from pathlib import Path

SCRIPT_DIR = Path(__file__).resolve().parent
CSV_PATH = SCRIPT_DIR / "full_code_metrics_consensus_50.csv"

# Taxonomic categories (reproducible mapping from task_type)
HL_TASK_TYPES = {"sort", "count", "unique", "tree"}
LL_TASK_TYPES = {"digit", "string", "replace", "compare"}


def load_data():
    rows = []
    with open(CSV_PATH, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for row in reader:
            row["success_rate"] = float(row["success_rate"])
            row["task_type"] = (row.get("task_type") or "other").strip().lower()
            rows.append(row)
    return rows


def assign_category(task_type):
    if task_type in HL_TASK_TYPES:
        return "HL"
    if task_type in LL_TASK_TYPES:
        return "LL"
    return "Other"


def cohens_d(group1_vals, group2_vals):
    """Cohen's d = (mean1 - mean2) / pooled_std."""
    import statistics
    n1, n2 = len(group1_vals), len(group2_vals)
    if n1 < 2 or n2 < 2:
        return None
    m1 = statistics.mean(group1_vals)
    m2 = statistics.mean(group2_vals)
    s1 = statistics.stdev(group1_vals)
    s2 = statistics.stdev(group2_vals)
    pooled_var = ((n1 - 1) * s1 * s1 + (n2 - 1) * s2 * s2) / (n1 + n2 - 2)
    if pooled_var <= 0:
        return 0.0
    pooled_std = pooled_var ** 0.5
    return (m1 - m2) / pooled_std


def main():
    rows = load_data()
    for row in rows:
        row["category"] = assign_category(row["task_type"])

    hl_rows = [r for r in rows if r["category"] == "HL"]
    ll_rows = [r for r in rows if r["category"] == "LL"]
    other_rows = [r for r in rows if r["category"] == "Other"]

    hl_rates = [r["success_rate"] for r in hl_rows]
    ll_rates = [r["success_rate"] for r in ll_rows]

    import statistics
    mu_hl = statistics.mean(hl_rates) if hl_rates else 0
    mu_ll = statistics.mean(ll_rates) if ll_rates else 0
    delta_success = mu_hl - mu_ll

    # Mann-Whitney U, one-sided: H1: HL has higher success rate than LL
    try:
        from scipy.stats import mannwhitneyu
        u, p_one_sided = mannwhitneyu(hl_rates, ll_rates, alternative="greater")
        p_two_sided = mannwhitneyu(hl_rates, ll_rates, alternative="two-sided")[1]
    except Exception:
        u, p_one_sided, p_two_sided = None, None, None

    d = cohens_d(hl_rates, ll_rates) if hl_rates and ll_rates else None

    # Summary table data
    mu_other = statistics.mean([r["success_rate"] for r in other_rows]) if other_rows else None
    results = {
        "methodology": "HL = task_type in {sort, count, unique, tree}. LL = task_type in {digit, string, replace, compare}. Other excluded from HL vs LL test.",
        "n_HL": len(hl_rows),
        "n_LL": len(ll_rows),
        "n_Other": len(other_rows),
        "mu_HL": round(mu_hl, 4),
        "mu_LL": round(mu_ll, 4),
        "mu_Other": round(mu_other, 4) if mu_other is not None else None,
        "delta_success": round(delta_success, 4),
        "U": float(u) if u is not None else None,
        "p_value_one_sided": float(p_one_sided) if p_one_sided is not None else None,
        "p_value_two_sided": float(p_two_sided) if p_two_sided is not None else None,
        "cohens_d": round(d, 4) if d is not None else None,
        "HL_task_types": list(HL_TASK_TYPES),
        "LL_task_types": list(LL_TASK_TYPES),
    }

    out_json = SCRIPT_DIR / "hl_vs_ll_results.json"
    with open(out_json, "w", encoding="utf-8") as f:
        json.dump(results, f, indent=2)
    print("Wrote", out_json)

    # Bar chart: category vs mean success rate
    try:
        import matplotlib
        matplotlib.use("Agg")
        import matplotlib.pyplot as plt
        categories = ["HL", "LL", "Other"]
        means = [mu_hl, mu_ll, mu_other if mu_other is not None else 0]
        counts = [len(hl_rows), len(ll_rows), len(other_rows)]
        colors = ["#2ecc71", "#e74c3c", "#95a5a6"]
        fig, ax = plt.subplots(figsize=(5, 4))
        bars = ax.bar(categories, means, color=colors, edgecolor="black", linewidth=0.8)
        ax.set_ylabel("Mean success rate (consensus)", fontsize=11)
        ax.set_xlabel("Category", fontsize=11)
        ax.set_title("Mean success rate by taxonomic category\n(HL = high-level algorithmic, LL = low-level logic)")
        ax.set_ylim(0, 1)
        for bar, c in zip(bars, counts):
            ax.text(bar.get_x() + bar.get_width() / 2, bar.get_height() + 0.02, f"n={c}", ha="center", fontsize=10)
        fig.tight_layout()
        fig.savefig(SCRIPT_DIR / "category_vs_success_rate.png", dpi=150, bbox_inches="tight")
        plt.close(fig)
        print("Wrote", SCRIPT_DIR / "category_vs_success_rate.png")
    except Exception as e:
        print("Bar chart skipped:", e)

    # Print summary table
    print("\n--- HL vs LL: Summary ---\n")
    print(f"  n_HL = {results['n_HL']},  n_LL = {results['n_LL']},  n_Other = {results['n_Other']}")
    print(f"  μ_HL = {results['mu_HL']:.4f},  μ_LL = {results['mu_LL']:.4f}")
    print(f"  Δ Success (μ_HL - μ_LL) = {results['delta_success']:.4f}")
    print(f"  Mann-Whitney U (one-sided, HL > LL): p = {results['p_value_one_sided']}")
    print(f"  Cohen's d = {results['cohens_d']}")


if __name__ == "__main__":
    main()
