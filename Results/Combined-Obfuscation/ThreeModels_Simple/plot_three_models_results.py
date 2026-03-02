#!/usr/bin/env python3
"""
Generate two figures from the three models' evaluation results (DeepSeek, Gemini, O4):

1. Overall LLM_Average_Score and ST_Similarity_Score per model (one figure, both metrics).
2. Stacked histogram: percentage of samples where LLM_Consensus is True vs False per model.

Requires: matplotlib, numpy (pip install matplotlib numpy).
Output: figure_llm_st_scores.png, figure_llm_consensus_stacked.png in this directory.
"""

import csv
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
import numpy as np
from pathlib import Path

SCRIPT_DIR = Path(__file__).parent.resolve()
SIMILARITY_DIR = SCRIPT_DIR / "similarity"
MODELS = ["DeepSeek", "Gemini", "O4"]
DATASET_NAME = "Obfuscated_Without_comments"
CSV_NAME = f"combined_summary_{DATASET_NAME}.csv"


def load_model_csv(model: str):
    """Load CSV; return list of dicts with LLM_Average_Score, ST_Similarity_Score, LLM_Consensus."""
    path = SIMILARITY_DIR / model / CSV_NAME
    if not path.exists():
        raise FileNotFoundError(path)
    rows = []
    with open(path, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for row in reader:
            try:
                row["LLM_Average_Score"] = float(row.get("LLM_Average_Score", 0))
                row["ST_Similarity_Score"] = float(row.get("ST_Similarity_Score", 0))
                raw = row.get("LLM_Consensus", "False")
                row["LLM_Consensus"] = str(raw).strip().lower() == "true"
            except (ValueError, KeyError):
                continue
            rows.append(row)
    return rows


def compute_per_model_stats():
    """Load CSVs and compute mean LLM_Average_Score and mean ST_Similarity_Score per model."""
    stats = []
    for model in MODELS:
        try:
            rows = load_model_csv(model)
        except FileNotFoundError as e:
            print(f"Skip {model}: {e}")
            continue
        if not rows:
            continue
        n = len(rows)
        lm_mean = sum(r["LLM_Average_Score"] for r in rows) / n
        st_mean = sum(r["ST_Similarity_Score"] for r in rows) / n
        stats.append({
            "model": model,
            "LLM_Average_Score_mean": lm_mean,
            "ST_Similarity_Score_mean": st_mean,
            "n": n,
        })
    return stats


def compute_consensus_counts():
    """Per model: count True and False for LLM_Consensus, return counts and percentages."""
    rows = []
    for model in MODELS:
        try:
            data = load_model_csv(model)
        except FileNotFoundError:
            continue
        total = len(data)
        true_count = sum(1 for r in data if r["LLM_Consensus"])
        false_count = total - true_count
        rows.append({
            "model": model,
            "True": true_count,
            "False": false_count,
            "True_pct": 100 * true_count / total if total else 0,
            "False_pct": 100 * false_count / total if total else 0,
            "total": total,
        })
    return rows


def plot_llm_st_scores(stats: list, out_path: Path):
    """Figure 1: Bar chart with LLM_Average_Score and ST_Similarity_Score for each model."""
    if not stats:
        return
    fig, ax = plt.subplots(figsize=(8, 5))
    models = [s["model"] for s in stats]
    lm_means = [s["LLM_Average_Score_mean"] for s in stats]
    st_means = [s["ST_Similarity_Score_mean"] for s in stats]
    x = np.arange(len(models))
    width = 0.35

    bars1 = ax.bar(x - width / 2, lm_means, width, label="LLM Average Score", color="steelblue")
    bars2 = ax.bar(x + width / 2, st_means, width, label="ST Similarity Score", color="coral")

    ax.set_ylabel("Score (0–1)")
    ax.set_xlabel("Model")
    ax.set_title("Overall LLM Average Score and ST Similarity Score by Model")
    ax.set_xticks(x)
    ax.set_xticklabels(models)
    ax.legend()
    ax.set_ylim(0, 1.05)
    ax.grid(axis="y", alpha=0.3)

    for b in bars1:
        ax.annotate(f"{b.get_height():.3f}", xy=(b.get_x() + b.get_width() / 2, b.get_height()), ha="center", va="bottom", fontsize=8, rotation=0)
    for b in bars2:
        ax.annotate(f"{b.get_height():.3f}", xy=(b.get_x() + b.get_width() / 2, b.get_height()), ha="center", va="bottom", fontsize=8, rotation=0)

    plt.tight_layout()
    plt.savefig(out_path, dpi=150)
    plt.close()
    print(f"Saved: {out_path}")


def plot_consensus_stacked(consensus_rows: list, out_path: Path):
    """Figure 2: Stacked histogram – True at bottom, False on top. ACM color standards (colorblind-safe)."""
    if not consensus_rows:
        return
    fig, ax = plt.subplots(figsize=(7, 5))

    models = [r["model"] for r in consensus_rows]
    true_pct = [r["True_pct"] for r in consensus_rows]
    false_pct = [r["False_pct"] for r in consensus_rows]

    x = np.arange(len(models))
    width = 0.5

    # ACM-style: colorblind-safe, distinct in grayscale. True = bottom, False = top.
    # Blue (#0173B2) and orange (#DE8F05) – Paul Tol / ColourBrewer-style
    color_true = "#0173B2"   # blue – success (bottom)
    color_false = "#DE8F05"  # orange – fail (top)

    bars_true = ax.bar(x, true_pct, width, bottom=0, label="LLM Consensus True", color=color_true)
    bars_false = ax.bar(x, false_pct, width, bottom=true_pct, label="LLM Consensus False", color=color_false)

    ax.set_ylabel("Percentage of samples (%)")
    ax.set_xlabel("Model")
    ax.set_title("LLM Consensus: Percentage of Samples Succeeded (True) vs Failed (False)")
    ax.set_xticks(x)
    ax.set_xticklabels(models)
    ax.legend(loc="upper right")
    ax.set_ylim(0, 100)
    ax.grid(axis="y", alpha=0.3)

    for i, (t, f) in enumerate(zip(true_pct, false_pct)):
        if t > 5:
            ax.annotate(f"{t:.1f}%", xy=(i, t / 2), ha="center", va="center", fontsize=9, color="white", fontweight="bold")
        if f > 5:
            ax.annotate(f"{f:.1f}%", xy=(i, t + f / 2), ha="center", va="center", fontsize=9, color="white", fontweight="bold")

    plt.tight_layout()
    plt.savefig(out_path, dpi=150)
    plt.close()
    print(f"Saved: {out_path}")


def main():
    out_dir = SCRIPT_DIR
    out_dir.mkdir(parents=True, exist_ok=True)

    stats = compute_per_model_stats()
    if not stats:
        print("No model data found. Exiting.")
        return
    plot_llm_st_scores(stats, out_dir / "figure_llm_st_scores.png")

    consensus_rows = compute_consensus_counts()
    if not consensus_rows:
        print("No consensus data found. Exiting.")
        return
    plot_consensus_stacked(consensus_rows, out_dir / "figure_llm_consensus_stacked.png")

    print("Done.")


if __name__ == "__main__":
    main()
