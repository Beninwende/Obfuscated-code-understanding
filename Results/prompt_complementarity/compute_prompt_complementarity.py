#!/usr/bin/env python3
"""
Compute and visualize prompt complementarity (same metrics as model complementarity).

Uses prompt_problem_scores_{suffix}.csv: rows = prompt_type, columns = problem_id.
Produces: complementarity/union CSVs, heatmaps, and top_pairs_coverage_{suffix}.png (stacked bar).
"""

import pandas as pd
import numpy as np
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
import seaborn as sns
from pathlib import Path
from itertools import combinations
import warnings
warnings.filterwarnings("ignore")

SCRIPT_DIR = Path(__file__).resolve().parent
THRESHOLD = 0.5
DATASET_SUFFIXES = ["dead_code", "encryption", "variable_renaming", "with_comments", "without_comments"]


def load_and_prepare_data(csv_path: Path, threshold: float = 0.5):
    """Load CSV and return (raw_df, success_matrix) with 1=success, 0=fail, NaN=missing."""
    df = pd.read_csv(csv_path, index_col=0)
    df.index = df.index.astype(str)
    success_matrix = df.copy()
    valid_mask = ~np.isnan(df.values)
    success_matrix.values[valid_mask] = (df.values[valid_mask] >= threshold).astype(float)
    success_matrix.values[~valid_mask] = np.nan
    return df, success_matrix


def compute_union_coverage(success_matrix: pd.DataFrame):
    """Union coverage: fraction of problems solved by at least one prompt in each pair."""
    prompts = success_matrix.index.tolist()
    n = len(prompts)
    union_matrix = np.zeros((n, n))
    for i, p1 in enumerate(prompts):
        for j, p2 in enumerate(prompts):
            if i == j:
                vec = success_matrix.loc[p1].values
                valid = ~np.isnan(vec)
                union_matrix[i, j] = (vec[valid] == 1).sum() / valid.sum() if valid.sum() > 0 else np.nan
            else:
                v1 = success_matrix.loc[p1].values
                v2 = success_matrix.loc[p2].values
                union_vec = np.maximum(v1, v2)
                valid = ~np.isnan(union_vec)
                union_matrix[i, j] = (union_vec[valid] == 1).sum() / valid.sum() if valid.sum() > 0 else np.nan
    return pd.DataFrame(union_matrix, index=prompts, columns=prompts)


def create_top_pairs_visualization(union_df: pd.DataFrame, success_matrix: pd.DataFrame,
                                   output_path: Path, title_suffix: str = "", top_n: int = 15):
    """Stacked bar: top prompt pairs by union coverage (both / only first / only second)."""
    union_triu = union_df.where(np.triu(np.ones(union_df.shape), k=1).astype(bool))
    top_pairs = union_triu.stack().nlargest(top_n)

    pair_names = []
    both_solve = []
    only_first = []
    only_second = []
    total_valid = []

    for (prompt1, prompt2), _ in top_pairs.items():
        pair_names.append(f"{prompt1} ↔ {prompt2}")
        vec1 = success_matrix.loc[prompt1].values
        vec2 = success_matrix.loc[prompt2].values
        valid_mask = ~(np.isnan(vec1) | np.isnan(vec2))
        total_valid.append(valid_mask.sum())
        if valid_mask.sum() > 0:
            v1 = vec1[valid_mask]
            v2 = vec2[valid_mask]
            n_valid = valid_mask.sum()
            both_solve.append(((v1 == 1) & (v2 == 1)).sum() / n_valid * 100)
            only_first.append(((v1 == 1) & (v2 == 0)).sum() / n_valid * 100)
            only_second.append(((v1 == 0) & (v2 == 1)).sum() / n_valid * 100)
        else:
            both_solve.append(0)
            only_first.append(0)
            only_second.append(0)

    fig, ax = plt.subplots(figsize=(14, 8))
    y_pos = np.arange(len(pair_names))
    ax.barh(y_pos, both_solve, label="Solved by Both Prompts", color="#2ecc71", alpha=0.8)
    ax.barh(y_pos, only_first, left=both_solve, label="Solved Only by First Prompt", color="#3498db", alpha=0.8)
    ax.barh(y_pos, only_second, left=np.array(both_solve) + np.array(only_first),
            label="Solved Only by Second Prompt", color="#e74c3c", alpha=0.8)

    total_values = np.array(both_solve) + np.array(only_first) + np.array(only_second)
    for i, total_val in enumerate(total_values):
        if total_val > 0:
            ax.text(total_val + 1, i, f"{total_val:.1f}%", va="center", fontsize=9, fontweight="bold")

    ax.set_yticks(y_pos)
    ax.set_yticklabels(pair_names, fontsize=10)
    ax.set_xlabel("Total Coverage (%)", fontsize=12, fontweight="bold")
    ax.set_title(f"Prompt Pairs Union Coverage Analysis{title_suffix}", fontsize=14, fontweight="bold", pad=20)
    max_val = max(total_values) if len(total_values) > 0 else 100
    ax.set_xlim(0, min(105, max_val * 1.15))
    ax.grid(axis="x", alpha=0.3, linestyle="--")
    ax.set_axisbelow(True)
    ax.legend(loc="upper center", bbox_to_anchor=(0.5, -0.15), ncol=3, fontsize=10, framealpha=0.9, fancybox=True, shadow=True)
    ax.invert_yaxis()
    plt.tight_layout()
    plt.savefig(output_path, dpi=200, bbox_inches="tight")
    plt.close()
    print(f"  Saved {output_path.name}")


def main():
    print("Computing prompt complementarity")
    print("=" * 60)
    for suffix in DATASET_SUFFIXES:
        csv_file = SCRIPT_DIR / f"prompt_problem_scores_{suffix}.csv"
        if not csv_file.exists():
            print(f"  Skip {suffix}: {csv_file.name} not found")
            continue
        print(f"\n{suffix}")
        df, success_matrix = load_and_prepare_data(csv_file, threshold=THRESHOLD)
        union_df = compute_union_coverage(success_matrix)
        union_df.to_csv(SCRIPT_DIR / f"union_coverage_{suffix}.csv")
        title_suffix = f": {suffix.replace('_', ' ').title()}"
        create_top_pairs_visualization(
            union_df, success_matrix,
            SCRIPT_DIR / f"top_pairs_coverage_{suffix}.png",
            title_suffix=title_suffix,
            top_n=15,
        )
    print("\nDone.")


if __name__ == "__main__":
    main()
