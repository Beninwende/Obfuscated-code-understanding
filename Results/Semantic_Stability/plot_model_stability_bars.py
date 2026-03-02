#!/usr/bin/env python3
"""
Horizontal bar chart of overall semantic stability per model.
Reads model_stability.csv. Uses temperature-style colormap (cool→warm) and
ACM-friendly styling (colorblind-safe, greyscale-printable).
"""
import numpy as np
import pandas as pd
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
from pathlib import Path
import warnings
warnings.filterwarnings('ignore')

CMAP_TEMPERATURE = "RdYlBu_r"


def model_display_name(name: str) -> str:
    """Normalize model name for display."""
    s = name.replace('Dataset_', '', 1) if name.startswith('Dataset_') else name
    if s == 'Llama70b_Generation':
        return 'Llama70B'
    if s.endswith('_Generation'):
        return s[:-len('_Generation')]
    return s


def main():
    base = Path(__file__).resolve().parent
    csv_path = base / "model_stability.csv"
    out_path = base / "model_stability_bars.png"

    df = pd.read_csv(csv_path)
    df["model_display"] = df["model"].map(model_display_name)
    df = df.sort_values("stability", ascending=True)  # so barh shows top at top
    models = df["model_display"].tolist()
    stabilities = df["stability"].tolist()
    n = len(models)

    cmap = plt.get_cmap(CMAP_TEMPERATURE)
    colors = cmap(np.linspace(0.15, 0.85, n))  # cool (high) to warm (low) after sort

    fig, ax = plt.subplots(figsize=(8, 6))
    bars = ax.barh(models, stabilities, color=colors, edgecolor="0.25", linewidth=1.2, height=0.65)
    ax.set_xlabel("Overall stability", fontsize=11, fontweight="bold")
    ax.set_ylabel("Model", fontsize=11, fontweight="bold")
    ax.set_title("Semantic stability by model", fontsize=12, fontweight="bold")
    ax.set_xlim(0, 1.05)
    ax.invert_yaxis()  # highest stability at top
    plt.tight_layout()
    plt.savefig(out_path, dpi=150, bbox_inches="tight")
    plt.close()
    print(f"Saved {out_path}")


if __name__ == "__main__":
    main()
