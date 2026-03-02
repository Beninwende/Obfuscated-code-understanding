#!/usr/bin/env python3
"""
Visualize prompt–problem score matrix as a heatmap (same style as Semantic_Consistency/model_problem_matrix_*.png).

Rows = prompt types, columns = problems. Blue = success (≥0.5), Red = failure (<0.5), White = missing.
"""

import pandas as pd
import numpy as np
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
from pathlib import Path
from matplotlib.colors import ListedColormap, BoundaryNorm
import warnings
warnings.filterwarnings("ignore")

SCRIPT_DIR = Path(__file__).resolve().parent
THRESHOLD = 0.5

DATASET_SUFFIXES = ["dead_code", "encryption", "variable_renaming", "with_comments", "without_comments"]


def create_matrix_visualization(csv_path: Path, output_path: Path, threshold: float = 0.5):
    df = pd.read_csv(csv_path, index_col=0)
    df.index = df.index.astype(str)
    # Sort by mean score descending (best prompts first)
    model_avg_scores = df.mean(axis=1, skipna=True).sort_values(ascending=False)
    df_sorted = df.reindex(model_avg_scores.index)
    data = df_sorted.values.astype(float)

    mask = np.full(data.shape, -1.0, dtype=float)
    valid_mask = ~np.isnan(data)
    mask[valid_mask] = (data[valid_mask] >= threshold).astype(float)

    fig, ax = plt.subplots(figsize=(25, 6))
    colors = ["#ffffff", "#d62728", "#1f77b4"]
    cmap = ListedColormap(colors)
    boundaries = [-1.5, -0.5, 0.5, 1.5]
    norm = BoundaryNorm(boundaries, cmap.N)
    im = ax.imshow(mask, aspect="auto", cmap=cmap, norm=norm, interpolation="nearest")

    ax.set_yticks(range(len(df_sorted.index)))
    ax.set_yticklabels(df_sorted.index, fontsize=10)
    ax.set_ylabel("Prompts", fontsize=12, fontweight="bold")
    step = max(1, len(df_sorted.columns) // 40)
    x_ticks = list(range(0, len(df_sorted.columns), step))
    x_labels = [df_sorted.columns[i] for i in x_ticks]
    ax.set_xticks(x_ticks)
    ax.set_xticklabels(x_labels, rotation=90, fontsize=7, ha="right")
    ax.set_xlabel("Problems", fontsize=12, fontweight="bold")
    ax.set_xticks(np.arange(-0.5, len(df_sorted.columns), 1), minor=True)
    ax.set_yticks(np.arange(-0.5, len(df_sorted.index), 1), minor=True)
    ax.grid(which="minor", color="white", linestyle="-", linewidth=0.3)

    suffix_name = csv_path.stem.replace("prompt_problem_scores_", "").replace("_", " ").title()
    ax.set_title(
        f"Prompt–Problem Score Matrix: {suffix_name}\n"
        f"Blue (≥{threshold}) = Success, Red (<{threshold}) = Failure",
        fontsize=14, fontweight="bold", pad=20,
    )
    cbar = plt.colorbar(im, ax=ax, ticks=[0, 1], shrink=0.8)
    cbar.set_ticklabels([f"< {threshold}", f"≥ {threshold}"])
    cbar.set_label("Score Category", rotation=270, labelpad=20, fontsize=10)

    valid_cells = valid_mask.sum()
    success_cells = ((data >= threshold) & valid_mask).sum()
    failure_cells = ((data < threshold) & valid_mask).sum()
    success_pct = 100 * success_cells / valid_cells if valid_cells else 0
    failure_pct = 100 * failure_cells / valid_cells if valid_cells else 0
    stats_text = (
        f"Valid cells: {valid_cells} | "
        f"Success (≥{threshold}): {success_cells} ({success_pct:.1f}%) | "
        f"Failure (<{threshold}): {failure_cells} ({failure_pct:.1f}%)"
    )
    ax.text(0.5, -0.1, stats_text, transform=ax.transAxes, fontsize=9, ha="center", va="top",
            bbox=dict(boxstyle="round", facecolor="wheat", alpha=0.5))
    plt.tight_layout()
    plt.savefig(output_path, dpi=200, bbox_inches="tight", facecolor="white")
    plt.close(fig)


def main():
    for suffix in DATASET_SUFFIXES:
        csv_file = SCRIPT_DIR / f"prompt_problem_scores_{suffix}.csv"
        if not csv_file.exists():
            print(f"  Skip {suffix}: {csv_file.name} not found")
            continue
        output_file = SCRIPT_DIR / f"prompt_problem_matrix_{suffix}.png"
        try:
            create_matrix_visualization(csv_file, output_file, threshold=THRESHOLD)
            print(f"  Saved {output_file.name}")
        except Exception as e:
            print(f"  Error {suffix}: {e}")
    print("Done.")


if __name__ == "__main__":
    main()
