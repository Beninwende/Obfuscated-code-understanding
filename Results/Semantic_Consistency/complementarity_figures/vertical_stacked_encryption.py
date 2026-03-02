#!/usr/bin/env python3
"""
Vertical stacked bar chart for Model Pairs Union Coverage: Encryption only.
Each bar = one model pair (top 13 by union coverage).
Segments: Solved by Both (green), Only First (blue), Only Second (orange).
Sorted descending left to right.
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
    if s.startswith('qwencoder'):
        return 'qwencoder'
    if s.endswith('_Generation'):
        return s[:-len('_Generation')]
    return s


def main():
    script_dir = Path(__file__).parent
    data_dir = script_dir.parent

    # ── Load encryption scores and binarize ──
    csv_path = data_dir / "model_problem_scores_encryption.csv"
    df = pd.read_csv(csv_path, index_col=0)
    df.index = df.index.map(model_display_name)
    data = df.values.astype(float)
    binary = np.full_like(data, np.nan)
    valid = ~np.isnan(data)
    binary[valid] = (data[valid] >= 0.5).astype(float)
    success_df = pd.DataFrame(binary, index=df.index, columns=df.columns)

    # ── Load union coverage matrix ──
    union_path = data_dir / "union_coverage_encryption.csv"
    union_df = pd.read_csv(union_path, index_col=0)
    union_df.index = union_df.index.map(model_display_name)
    union_df.columns = union_df.columns.map(model_display_name)

    # ── Get top 13 pairs by union coverage (excl. last two: Gemini+LlamaVL, Gemini+codellama) ──
    models = union_df.index.tolist()
    pairs = []
    for i in range(len(models)):
        for j in range(i + 1, len(models)):
            m1, m2 = models[i], models[j]
            pairs.append((m1, m2, union_df.iloc[i, j]))

    pairs.sort(key=lambda x: x[2], reverse=True)
    top_pairs = pairs[:13]

    # ── Compute breakdown for each pair ──
    pair_labels = []
    both_pct = []
    only_m1_pct = []
    only_m2_pct = []
    union_pct = []

    for m1, m2, union_val in top_pairs:
        vec1 = success_df.loc[m1].values
        vec2 = success_df.loc[m2].values
        valid_mask = ~(np.isnan(vec1) | np.isnan(vec2))
        n_valid = valid_mask.sum()

        if n_valid > 0:
            v1, v2 = vec1[valid_mask], vec2[valid_mask]
            both = ((v1 == 1) & (v2 == 1)).sum() / n_valid * 100
            o1 = ((v1 == 1) & (v2 == 0)).sum() / n_valid * 100
            o2 = ((v1 == 0) & (v2 == 1)).sum() / n_valid * 100
        else:
            both, o1, o2 = 0, 0, 0

        # Short label: abbreviate model names
        pair_labels.append(f"{m1}\n+\n{m2}")
        both_pct.append(both)
        only_m1_pct.append(o1)
        only_m2_pct.append(o2)
        union_pct.append(both + o1 + o2)

    both_pct = np.array(both_pct)
    only_m1_pct = np.array(only_m1_pct)
    only_m2_pct = np.array(only_m2_pct)
    union_pct = np.array(union_pct)

    # ── Plot vertical stacked bars ──
    fig, ax = plt.subplots(figsize=(18, 5))
    x = np.arange(len(pair_labels))
    width = 0.42  # Narrower bars (ACM-style, less dense)

    # ACM color standards: colorblind-safe, high-contrast (Paul Tol Bright–style)
    # Distinguishable in grayscale and for common color vision deficiencies
    color_both = '#4477AA'   # Blue
    color_m1   = '#EE6677'   # Red/orange
    color_m2   = '#228833'   # Green
    edge_color = 'white'
    edge_lw = 0.6

    # Stack: both (bottom), only_m1 (middle), only_m2 (top)
    # Hatching for grayscale / print (ACM: don't rely on color alone)
    bars_both = ax.bar(x, both_pct, width, label='Solved by Both',
                       color=color_both, edgecolor=edge_color, linewidth=edge_lw)
    bars_m1 = ax.bar(x, only_m1_pct, width, bottom=both_pct,
                     label='Gain from First Model',
                     color=color_m1, edgecolor=edge_color, linewidth=edge_lw, hatch='///')
    bars_m2 = ax.bar(x, only_m2_pct, width, bottom=both_pct + only_m1_pct,
                     label='Gain from Second Model',
                     color=color_m2, edgecolor=edge_color, linewidth=edge_lw, hatch='...')

    # Total union % on top of each bar
    for i in range(len(x)):
        ax.text(x[i], union_pct[i] + 0.5, f'{union_pct[i]:.1f}%',
                ha='center', va='bottom', fontsize=14, fontweight='bold')

    # Segment annotations inside bars (percentages)
    for i in range(len(x)):
        # Both segment
        if both_pct[i] > 5:
            ax.text(x[i], both_pct[i] / 2, f'{both_pct[i]:.0f}%',
                    ha='center', va='center', fontsize=14, color='white', fontweight='bold')
        # Only m1 segment
        if only_m1_pct[i] > 5:
            ax.text(x[i], both_pct[i] + only_m1_pct[i] / 2, f'{only_m1_pct[i]:.0f}%',
                    ha='center', va='center', fontsize=14, color='white', fontweight='bold')
        # Only m2 segment
        if only_m2_pct[i] > 5:
            ax.text(x[i], both_pct[i] + only_m1_pct[i] + only_m2_pct[i] / 2,
                    f'{only_m2_pct[i]:.0f}%',
                    ha='center', va='center', fontsize=14, color='white', fontweight='bold')

    ax.set_xticks(x)
    ax.set_xticklabels(pair_labels, fontsize=16, ha='center')
    ax.set_ylabel('Coverage (%)', fontsize=16, fontweight='bold')
    ax.set_ylim(0, 100)
    ax.grid(axis='y', alpha=0.3, linestyle='--')
    ax.spines['top'].set_visible(False)
    ax.spines['right'].set_visible(False)
    ax.tick_params(axis='both', labelsize=15)

    # Legend: one horizontal row at top
    ax.legend(loc='lower center', bbox_to_anchor=(0.5, 1.02), ncol=3, fontsize=16, frameon=True)
    fig.tight_layout()
    plt.subplots_adjust(top=0.88)

    output_png = script_dir / 'vertical_stacked_encryption.png'
    output_pdf = script_dir / 'vertical_stacked_encryption.pdf'
    plt.savefig(output_png, dpi=200, bbox_inches='tight', facecolor='white')
    plt.savefig(output_pdf, dpi=300, bbox_inches='tight', facecolor='white')
    plt.close(fig)
    print(f"Saved: {output_png}")
    print(f"Saved: {output_pdf}")


if __name__ == "__main__":
    main()
