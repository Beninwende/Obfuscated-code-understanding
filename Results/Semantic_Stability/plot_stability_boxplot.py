#!/usr/bin/env python3
"""
Box plot of per-problem semantic stability by model.
Reads stability_per_problem.csv and plots distribution of stability across problems for each model.
Uses a temperature-style colormap (cool to warm) compliant with ACM accessibility:
colorblind-safe, luminance variation for greyscale printing.
"""
import numpy as np
import pandas as pd
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
from pathlib import Path
import warnings
warnings.filterwarnings('ignore')

# Temperature-style colormap: cool (blue) = high stability, warm (red) = low stability.
# RdYlBu_r is colorblind-friendly and varies in luminance (ACM-compliant).
CMAP_TEMPERATURE = "RdYlBu_r"


def model_display_name(name: str) -> str:
    """Normalize model name for display (e.g. Dataset_X -> X, Llama70b_Generation -> Llama70B)."""
    s = name.replace('Dataset_', '', 1) if name.startswith('Dataset_') else name
    if s == 'Llama70b_Generation':
        return 'Llama70B'
    if s.endswith('_Generation'):
        return s[:-len('_Generation')]
    return s


def main():
    base = Path(__file__).resolve().parent
    csv_path = base / "stability_per_problem.csv"
    out_path = base / "stability_boxplot.pdf"

    df = pd.read_csv(csv_path)
    # Drop rows with missing stability
    df = df.dropna(subset=["stability"])
    df["stability"] = pd.to_numeric(df["stability"], errors="coerce")
    df = df.dropna(subset=["stability"])

    df["model_display"] = df["model"].map(model_display_name)
    # Order models by median stability (descending) for readability
    order = df.groupby("model_display")["stability"].median().sort_values(ascending=False).index.tolist()
    data_by_model = [df.loc[df["model_display"] == m, "stability"].values for m in order]

    n_models = len(order)
    # Temperature gradient: cool (blue) for best stability → warm (red) for worst.
    # Sample from colormap (avoid very light ends for contrast).
    cmap = plt.get_cmap(CMAP_TEMPERATURE)
    colors = cmap(np.linspace(0.15, 0.85, n_models))  # blue at 0.85, red at 0.15

    fig, ax = plt.subplots(figsize=(12, 6))
    bp = ax.boxplot(data_by_model, labels=order, patch_artist=True)
    for i, patch in enumerate(bp["boxes"]):
        patch.set_facecolor(colors[i])
        patch.set_alpha(0.85)
        patch.set_edgecolor("0.25")  # Dark edge for greyscale / ACM accessibility
        patch.set_linewidth(1.2)
    for el in ["medians", "whiskers", "caps", "fliers"]:
        if el in bp:
            plt.setp(bp[el], color="0.2", linewidth=1.1)
    ax.set_ylabel("Per-problem stability", fontsize=16, fontweight="bold", fontfamily="Times New Roman")
    ax.set_xlabel("Model", fontsize=16, fontweight="bold", fontfamily="Times New Roman")
    ax.set_title("", fontsize=16, fontweight="bold", fontfamily="Times New Roman")
    ax.set_ylim(0, 1.05)
    plt.xticks(rotation=30, ha="right")
    plt.setp(ax.get_xticklabels(), fontsize=16, fontfamily="Times New Roman")
    plt.setp(ax.get_yticklabels(), fontsize=16, fontfamily="Times New Roman")
    plt.tight_layout()
    plt.savefig(out_path, bbox_inches="tight")
    plt.close()
    print(f"Saved {out_path}")


if __name__ == "__main__":
    main()
