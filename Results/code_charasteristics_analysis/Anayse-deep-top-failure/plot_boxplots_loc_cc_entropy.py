#!/usr/bin/env python3
"""
Standalone script: one boxplot figure per criterion.
Criteria: LOC, CC total, Shannon entropy only.
Reads full_code_metrics_consensus_50.csv from same directory.
"""

import csv
from pathlib import Path
import numpy as np

import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt

SCRIPT_DIR = Path(__file__).resolve().parent
CSV_PATH = SCRIPT_DIR / "full_code_metrics_consensus_50.csv"

COLOR_SUCCESS = "#2ecc71"
COLOR_FAILURE = "#e74c3c"
FONT_SIZE = 11

# Only these three criteria: key, short label, y-axis label
CRITERIA = [
    ("lines_of_code", "LOC", "Lines of code"),
    ("cyclomatic_complexity_total", "CC total", "Cyclomatic complexity (total)"),
    ("shannon_entropy", "Shannon entropy", "Shannon entropy"),
]


def load_data():
    rows = []
    with open(CSV_PATH, "r", encoding="utf-8") as f:
        r = csv.DictReader(f)
        for row in r:
            row["success_rate"] = float(row["success_rate"])
            row["lines_of_code"] = int(row["lines_of_code"])
            row["cyclomatic_complexity_total"] = int(row["cyclomatic_complexity_total"])
            row["shannon_entropy"] = float(row["shannon_entropy"])
            rows.append(row)
    return rows


def plot_one_boxplot(data, key, short_label, ylabel, out_path):
    success_rows = [r for r in data if r["group"] == "success"]
    failure_rows = [r for r in data if r["group"] == "failure"]
    success_vals = [r[key] for r in success_rows]
    failure_vals = [r[key] for r in failure_rows]
    # Taux de succès LLM (consensus) par groupe : min – max en %
    rate_success = [r["success_rate"] * 100 for r in success_rows]
    rate_failure = [r["success_rate"] * 100 for r in failure_rows]
    min_s, max_s = (min(rate_success), max(rate_success)) if rate_success else (0, 0)
    min_f, max_f = (min(rate_failure), max(rate_failure)) if rate_failure else (0, 0)
    label_success = f"Top succeed — taux LLM : {min_s:.1f} % – {max_s:.1f} %"
    label_failure = f"Top failed — taux LLM : {min_f:.1f} % – {max_f:.1f} %"
    fig, ax = plt.subplots(figsize=(5, 4.5))
    bp = ax.boxplot(
        [success_vals, failure_vals],
        labels=[label_success, label_failure],
        patch_artist=True,
        notch=False,
        showmeans=True,
    )
    for i, patch in enumerate(bp["boxes"]):
        patch.set_facecolor(COLOR_SUCCESS if i == 0 else COLOR_FAILURE)
        patch.set_alpha(0.7)
    for whisker in bp["whiskers"]:
        whisker.set_color("#333")
    for cap in bp["caps"]:
        cap.set_color("#333")
    for median in bp["medians"]:
        median.set_color("#333")
        median.set_linewidth(1.5)
    # Add median value labels above each box
    med_success = np.median(success_vals) if success_vals else 0
    med_failure = np.median(failure_vals) if failure_vals else 0
    fmt = "{:.2f}" if key == "shannon_entropy" else "{:.0f}"
    all_vals = success_vals + failure_vals
    y_min, y_max = min(all_vals), max(all_vals)
    y_range = (y_max - y_min) or 1
    y_text = y_max + 0.05 * y_range
    ax.text(1, y_text, f" {fmt.format(med_success)}", ha="center", va="bottom", fontsize=FONT_SIZE - 1)
    ax.text(2, y_text, f"{fmt.format(med_failure)}", ha="center", va="bottom", fontsize=FONT_SIZE - 1)
    ax.set_ylim(ax.get_ylim()[0], y_text + 0.08 * y_range)
    ax.set_ylabel(ylabel, fontsize=FONT_SIZE)
    ax.set_title(short_label, fontsize=FONT_SIZE + 1)
    ax.grid(axis="y", alpha=0.3)
    fig.tight_layout()
    fig.savefig(out_path, dpi=150, bbox_inches="tight")
    plt.close(fig)


def main():
    if not CSV_PATH.exists():
        print(f"CSV not found: {CSV_PATH}")
        return
    data = load_data()
    if not data:
        print("No data loaded.")
        return
    for key, short_label, ylabel in CRITERIA:
        out_path = SCRIPT_DIR / f"boxplot_{key}.png"
        plot_one_boxplot(data, key, short_label, ylabel, out_path)
        print(f"  - {out_path.name}")
    print("Done. Figures in:", SCRIPT_DIR)


if __name__ == "__main__":
    main()
