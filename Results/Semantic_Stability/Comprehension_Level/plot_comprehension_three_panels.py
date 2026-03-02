#!/usr/bin/env python3
"""
Three-panel box plots for comprehension_per_problem.csv.
Panel order: Lexical, Structural, Semantic. In each panel, one box per model
(distribution over problems). ACM-friendly styling.
"""
import numpy as np
import pandas as pd
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
from pathlib import Path
import warnings
warnings.filterwarnings("ignore")

CMAP_TEMPERATURE = "RdYlBu_r"


def model_display_name(name: str) -> str:
    s = name.replace("Dataset_", "", 1) if name.startswith("Dataset_") else name
    if s == "Llama70b_Generation":
        return "Llama70B"
    if s.endswith("_Generation"):
        return s[: -len("_Generation")]
    return s


def main():
    base = Path(__file__).resolve().parent
    csv_path = base / "comprehension_per_problem.csv"
    out_path = base / "comprehension_three_panels.pdf"

    df = pd.read_csv(csv_path)
    for col in ["s_enc", "s_dead", "s_lex"]:
        df[col] = pd.to_numeric(df[col], errors="coerce")
    df["model_display"] = df["model"].map(model_display_name)

    # Order models by median s_enc (descending) for consistent order across panels
    order = df.groupby("model_display")["s_enc"].median().sort_values(ascending=False).index.tolist()
    n = len(order)
    cmap = plt.get_cmap(CMAP_TEMPERATURE)

    panels = [
        ("s_lex", "Lexical"),
        ("s_dead", "Structural"),
        ("s_enc", "Semantic"),
    ]

    fig, axes = plt.subplots(1, 3, figsize=(14, 6), sharey=True)
    for ax, (col, title) in zip(axes, panels):
        # Per-panel: color by this panel's median score (cool = high, warm = low)
        medians = df.groupby("model_display")[col].median().reindex(order)
        rank = medians.rank(ascending=False, method="first").astype(int) - 1  # 0 = best
        color_values = np.linspace(0, 1, n)  # Full range: really blue (0) to really red (1)
        colors_this_panel = [cmap(color_values[r]) for r in rank]
        data_by_model = [df.loc[df["model_display"] == m, col].dropna().values for m in order]
        bp = ax.boxplot(data_by_model, labels=order, patch_artist=True)
        for i, patch in enumerate(bp["boxes"]):
            patch.set_facecolor(colors_this_panel[i])
            patch.set_alpha(0.85)
            patch.set_edgecolor("0.25")
            patch.set_linewidth(1.2)
        for el in ["medians", "whiskers", "caps", "fliers"]:
            if el in bp:
                plt.setp(bp[el], color="0.2", linewidth=1.1)
        ax.axhline(y=0.5, color="red", linestyle="--", linewidth=1.2, zorder=0)
        ax.set_ylabel("Score", fontsize=14, fontweight="bold", fontfamily="Times New Roman")
        ax.set_title(title, fontsize=14, fontweight="bold", fontfamily="Times New Roman")
        ax.set_ylim(0, 1.05)
        ax.tick_params(axis="x", rotation=45)
        plt.setp(ax.get_xticklabels(), ha="right", rotation=45, fontfamily="Times New Roman", fontsize=14)
        plt.setp(ax.get_yticklabels(), fontfamily="Times New Roman", fontsize=14)
    fig.suptitle("", fontsize=12, fontweight="bold", y=1.02)
    plt.tight_layout()
    plt.savefig(out_path, bbox_inches="tight")
    plt.close()
    print(f"Saved {out_path}")


if __name__ == "__main__":
    main()
