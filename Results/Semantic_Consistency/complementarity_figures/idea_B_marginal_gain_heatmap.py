#!/usr/bin/env python3
"""
Idea B: Marginal Coverage Gain Heatmap (unified across all 5 obfuscation types)

A 14×14 heatmap where cell [i, j] = "% of problems that model j solves but model i doesn't"
(the marginal gain of adding model j to model i).

This is asymmetric: gain(i→j) ≠ gain(j→i).
Answers: "If I already have model X, which model should I add?"

Shows averaged values across all 5 obfuscation types for a unified view.
"""

import matplotlib
matplotlib.use('Agg')
import matplotlib.pyplot as plt
plt.rcParams['font.family'] = 'serif'
plt.rcParams['font.serif'] = ['Times New Roman']
plt.rcParams['font.size'] = 14

import pandas as pd
import numpy as np
import seaborn as sns
from pathlib import Path
import warnings
warnings.filterwarnings('ignore')


def model_display_name(name: str) -> str:
    s = name.replace('Dataset_', '', 1) if name.startswith('Dataset_') else name
    if s == 'Llama70b_Generation':
        return 'Llama70B'
    if s.endswith('_Generation'):
        return s[:-len('_Generation')]
    return s


def load_and_binarize(csv_path: Path, threshold: float = 0.5) -> pd.DataFrame:
    df = pd.read_csv(csv_path, index_col=0)
    df.index = df.index.map(model_display_name)
    data = df.values.astype(float)
    binary = np.full_like(data, np.nan)
    valid = ~np.isnan(data)
    binary[valid] = (data[valid] >= threshold).astype(float)
    return pd.DataFrame(binary, index=df.index, columns=df.columns)


def compute_marginal_gain(success_df: pd.DataFrame) -> pd.DataFrame:
    """
    Compute marginal gain matrix.
    gain[i, j] = fraction of problems that j solves but i doesn't,
                 out of all valid problems for both i and j.
    """
    models = success_df.index.tolist()
    n = len(models)
    gain = np.zeros((n, n))

    for i in range(n):
        for j in range(n):
            if i == j:
                gain[i, j] = 0
                continue
            row_i = success_df.iloc[i].values
            row_j = success_df.iloc[j].values
            # Valid where both have data
            both_valid = (~np.isnan(row_i)) & (~np.isnan(row_j))
            if both_valid.sum() == 0:
                gain[i, j] = 0
                continue
            # j solves but i doesn't
            j_only = ((row_j[both_valid] == 1) & (row_i[both_valid] == 0)).sum()
            gain[i, j] = 100.0 * j_only / both_valid.sum()

    return pd.DataFrame(gain, index=models, columns=models)


def main():
    script_dir = Path(__file__).parent
    data_dir = script_dir.parent

    obfuscation_types = ['encryption', 'dead_code', 'with_comments', 'without_comments', 'variable_renaming']
    obf_labels = {
        'encryption': 'Encryption', 'dead_code': 'Dead Code',
        'with_comments': 'With Comments', 'without_comments': 'Without Comments',
        'variable_renaming': 'Variable Renaming',
    }

    # ── Compute marginal gain for each obfuscation type, then average ──
    all_gains = []
    per_obf_gains = {}

    for obf in obfuscation_types:
        csv_path = data_dir / f"model_problem_scores_{obf}.csv"
        if not csv_path.exists():
            print(f"WARNING: {csv_path} not found.")
            continue
        success_df = load_and_binarize(csv_path)
        gain_df = compute_marginal_gain(success_df)
        all_gains.append(gain_df)
        per_obf_gains[obf] = gain_df
        print(f"Computed marginal gain for {obf}: {gain_df.shape}")

    if len(all_gains) < 5:
        print("ERROR: Need all 5 obfuscation CSVs.")
        return

    # Average across all obfuscation types
    avg_gain = sum(all_gains) / len(all_gains)

    # Sort models by individual coverage (= diagonal of union matrix ~ mean success rate)
    model_coverage = avg_gain.sum(axis=0)  # Higher = more others gain from adding this model
    model_order = model_coverage.sort_values(ascending=False).index.tolist()
    avg_gain = avg_gain.loc[model_order, model_order]

    print(f"\nModel order (by value as addition):")
    for m in model_order:
        print(f"  {m}: avg gain when added = {model_coverage[m]:.1f}%")

    # ── Plot 1: Unified averaged heatmap ──
    fig, ax = plt.subplots(figsize=(12, 10))

    mask_diag = np.eye(len(model_order), dtype=bool)

    sns.heatmap(
        avg_gain, ax=ax, annot=True, fmt='.1f', cmap='YlOrRd',
        mask=mask_diag, linewidths=0.5, linecolor='white',
        cbar_kws={'label': 'Marginal Coverage Gain (%)', 'shrink': 0.8},
        vmin=0, vmax=avg_gain.values[~mask_diag].max(),
        annot_kws={'size': 9}
    )

    ax.set_xlabel('Model to Add (column)', fontsize=13, fontweight='bold')
    ax.set_ylabel('Already Have (row)', fontsize=13, fontweight='bold')
    ax.set_xticklabels(ax.get_xticklabels(), rotation=45, ha='right', fontsize=11)
    ax.set_yticklabels(ax.get_yticklabels(), rotation=0, fontsize=11)

    # Stats annotation
    max_val = avg_gain.values[~mask_diag].max()
    max_idx = np.unravel_index(np.argmax(avg_gain.values * (~mask_diag)), avg_gain.shape)
    best_row = model_order[max_idx[0]]
    best_col = model_order[max_idx[1]]

    fig.tight_layout()

    output_png = script_dir / 'marginal_gain_heatmap_unified.png'
    output_pdf = script_dir / 'marginal_gain_heatmap_unified.pdf'
    plt.savefig(output_png, dpi=200, bbox_inches='tight', facecolor='white')
    plt.savefig(output_pdf, dpi=300, bbox_inches='tight', facecolor='white')
    plt.close(fig)
    print(f"\nSaved: {output_png}")
    print(f"Saved: {output_pdf}")

    # ── Plot 2: Faceted per-obfuscation heatmaps (smaller) ──
    fig2, axes = plt.subplots(1, 5, figsize=(35, 7))

    for idx, obf in enumerate(obfuscation_types):
        ax2 = axes[idx]
        gain = per_obf_gains[obf].loc[model_order, model_order]

        sns.heatmap(
            gain, ax=ax2, annot=True, fmt='.0f', cmap='YlOrRd',
            mask=mask_diag, linewidths=0.3, linecolor='white',
            cbar=False, vmin=0, vmax=60,
            annot_kws={'size': 6}
        )
        ax2.set_title(obf_labels[obf], fontsize=12, fontweight='bold')
        ax2.set_xticklabels(ax2.get_xticklabels(), rotation=45, ha='right', fontsize=7)
        ax2.set_yticklabels(ax2.get_yticklabels(), rotation=0, fontsize=7)

        if idx > 0:
            ax2.set_ylabel('')
        else:
            ax2.set_ylabel('Already Have (row)', fontsize=10, fontweight='bold')

        ax2.set_xlabel('')

    fig2.text(0.5, -0.01, 'Model to Add (column)', ha='center', fontsize=12, fontweight='bold')
    fig2.tight_layout()

    output2_png = script_dir / 'marginal_gain_heatmap_per_obf.png'
    output2_pdf = script_dir / 'marginal_gain_heatmap_per_obf.pdf'
    plt.savefig(output2_png, dpi=200, bbox_inches='tight', facecolor='white')
    plt.savefig(output2_pdf, dpi=300, bbox_inches='tight', facecolor='white')
    plt.close(fig2)
    print(f"Saved: {output2_png}")
    print(f"Saved: {output2_pdf}")


if __name__ == "__main__":
    main()
