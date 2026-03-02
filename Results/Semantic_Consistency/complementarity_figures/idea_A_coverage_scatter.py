#!/usr/bin/env python3
"""
Idea A: Coverage Gain Scatter Plot (unified across all 5 obfuscation types)

For each model pair:
  - X-axis: Jaccard overlap (similarity of success sets; 0=complementary, 1=redundant)
  - Y-axis: Union coverage (% of problems solved by either model)
  - Point size: complementarity score
  - Color: tier category of the pair
  - One panel per obfuscation type (faceted)

Sweet spot = upper-left: high coverage + low overlap = truly complementary pairs.
"""

import matplotlib
matplotlib.use('Agg')
import matplotlib.pyplot as plt
plt.rcParams['font.family'] = 'serif'
plt.rcParams['font.serif'] = ['Times New Roman']
plt.rcParams['font.size'] = 14

import pandas as pd
import numpy as np
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


def load_matrix(csv_path: Path) -> pd.DataFrame:
    df = pd.read_csv(csv_path, index_col=0)
    df.index = df.index.map(model_display_name)
    df.columns = df.columns.map(model_display_name)
    return df


def get_tier(model: str) -> str:
    """Classify model into performance tier based on known rankings."""
    top = {'Gemini', 'deepseek-r1', 'O4-mini', 'DeepseekV3.1', 'GPT4o', 'qwencoder32B'}
    mid = {'GPT3.5', 'mistral', 'Llama70B'}
    if model in top:
        return 'top'
    elif model in mid:
        return 'mid'
    else:
        return 'low'


def pair_tier(m1: str, m2: str) -> str:
    t1, t2 = get_tier(m1), get_tier(m2)
    tiers = sorted([t1, t2])
    if tiers == ['top', 'top']:
        return 'Top × Top'
    elif tiers == ['mid', 'top']:
        return 'Top × Mid'
    elif tiers == ['low', 'top']:
        return 'Top × Low'
    elif tiers == ['mid', 'mid']:
        return 'Mid × Mid'
    elif tiers == ['low', 'mid']:
        return 'Mid × Low'
    else:
        return 'Low × Low'


def main():
    script_dir = Path(__file__).parent
    data_dir = script_dir.parent

    obfuscation_types = ['encryption', 'dead_code', 'with_comments', 'without_comments', 'variable_renaming']
    obf_labels = {
        'encryption': 'Encryption', 'dead_code': 'Dead Code',
        'with_comments': 'With Comments', 'without_comments': 'Without Comments',
        'variable_renaming': 'Variable Renaming',
    }

    tier_colors = {
        'Top × Top': '#1a5276',
        'Top × Mid': '#5dade2',
        'Top × Low': '#f0b27a',
        'Mid × Mid': '#27ae60',
        'Mid × Low': '#e74c3c',
        'Low × Low': '#8b0000',
    }

    # ── Create faceted figure: 1 row × 5 columns ──
    fig, axes = plt.subplots(1, 5, figsize=(28, 6), sharey=True)

    for idx, obf in enumerate(obfuscation_types):
        ax = axes[idx]

        union_path = data_dir / f"union_coverage_{obf}.csv"
        overlap_path = data_dir / f"coverage_overlap_{obf}.csv"
        compl_path = data_dir / f"complementarity_{obf}.csv"

        if not all(p.exists() for p in [union_path, overlap_path, compl_path]):
            ax.set_title(obf_labels[obf])
            ax.text(0.5, 0.5, 'Data missing', ha='center', va='center', transform=ax.transAxes)
            continue

        union_df = load_matrix(union_path)
        overlap_df = load_matrix(overlap_path)
        compl_df = load_matrix(compl_path)

        models = union_df.index.tolist()

        # Extract upper triangle pairs
        pairs_data = []
        for i in range(len(models)):
            for j in range(i + 1, len(models)):
                m1, m2 = models[i], models[j]
                union_val = union_df.iloc[i, j]
                overlap_val = overlap_df.iloc[i, j]
                compl_val = compl_df.iloc[i, j]
                tier = pair_tier(m1, m2)
                pairs_data.append({
                    'model1': m1, 'model2': m2,
                    'union': union_val, 'overlap': overlap_val,
                    'complementarity': compl_val, 'tier': tier,
                    'label': f'{m1}–{m2}'
                })

        pdf = pd.DataFrame(pairs_data)

        # Plot each tier separately for legend
        for tier_name in ['Top × Top', 'Top × Mid', 'Mid × Mid', 'Top × Low', 'Mid × Low', 'Low × Low']:
            subset = pdf[pdf['tier'] == tier_name]
            if len(subset) == 0:
                continue
            sizes = subset['complementarity'].values * 3 + 10  # Scale for visibility
            ax.scatter(
                subset['overlap'], subset['union'],
                s=sizes, c=tier_colors[tier_name],
                alpha=0.7, edgecolors='white', linewidth=0.5,
                label=tier_name, zorder=3
            )

        # Annotate top 3 pairs by union coverage
        top3 = pdf.nlargest(3, 'union')
        for _, row in top3.iterrows():
            ax.annotate(
                f"{row['model1'][:4]}–{row['model2'][:4]}",
                (row['overlap'], row['union']),
                fontsize=7, ha='center', va='bottom',
                xytext=(0, 5), textcoords='offset points',
                bbox=dict(boxstyle='round,pad=0.2', facecolor='white', alpha=0.7, edgecolor='none')
            )

        ax.set_title(obf_labels[obf], fontsize=13, fontweight='bold')
        ax.set_xlabel('Jaccard Overlap', fontsize=11)
        if idx == 0:
            ax.set_ylabel('Union Coverage (%)', fontsize=11)
        ax.set_xlim(-0.05, 1.05)
        ax.grid(True, alpha=0.3, linestyle='--')

        # Add quadrant shading for sweet spot (upper-left)
        ax.axvspan(-0.05, 0.4, ymin=0.6, ymax=1.0, alpha=0.05, color='green', zorder=0)

    # Shared legend
    handles, labels = axes[0].get_legend_handles_labels()
    fig.legend(handles, labels, loc='lower center', ncol=6, fontsize=10,
               bbox_to_anchor=(0.5, -0.02), frameon=True, fancybox=True)

    fig.tight_layout()
    fig.subplots_adjust(bottom=0.12)

    # Save
    output_png = script_dir / 'coverage_gain_scatter.png'
    output_pdf = script_dir / 'coverage_gain_scatter.pdf'
    plt.savefig(output_png, dpi=200, bbox_inches='tight', facecolor='white')
    plt.savefig(output_pdf, dpi=300, bbox_inches='tight', facecolor='white')
    plt.close(fig)
    print(f"Saved: {output_png}")
    print(f"Saved: {output_pdf}")


if __name__ == "__main__":
    main()
