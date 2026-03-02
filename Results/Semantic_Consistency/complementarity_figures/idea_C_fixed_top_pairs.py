#!/usr/bin/env python3
"""
Idea C: Fixed Top-N Pairs Bar Chart (unified across all 5 obfuscation types)

Improvements over original:
  1. Sort by COMPLEMENTARITY (not union coverage) to highlight genuinely interesting pairs
  2. Filter: only show pairs where BOTH models individually cover > 20%
  3. Use model-specific colors instead of positional "first/second"
  4. Add individual model coverage annotations
  5. Unified across all 5 obfuscation types (averaged)
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
from matplotlib.patches import Patch
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


def compute_pair_stats(success_df: pd.DataFrame):
    """Compute coverage stats for all model pairs."""
    models = success_df.index.tolist()
    n_problems = success_df.shape[1]
    pairs = []

    for i in range(len(models)):
        for j in range(i + 1, len(models)):
            m1, m2 = models[i], models[j]
            s1 = success_df.iloc[i].values
            s2 = success_df.iloc[j].values

            both_valid = (~np.isnan(s1)) & (~np.isnan(s2))
            n_valid = both_valid.sum()
            if n_valid == 0:
                continue

            s1v, s2v = s1[both_valid], s2[both_valid]
            both_solve = ((s1v == 1) & (s2v == 1)).sum()
            only_m1 = ((s1v == 1) & (s2v == 0)).sum()
            only_m2 = ((s1v == 0) & (s2v == 1)).sum()
            neither = ((s1v == 0) & (s2v == 0)).sum()

            individual_m1 = (s1v == 1).sum() / n_valid * 100
            individual_m2 = (s2v == 1).sum() / n_valid * 100
            union_cov = (both_solve + only_m1 + only_m2) / n_valid * 100
            complementarity = (only_m1 + only_m2) / n_valid * 100

            pairs.append({
                'model1': m1, 'model2': m2,
                'both': both_solve / n_valid * 100,
                'only_m1': only_m1 / n_valid * 100,
                'only_m2': only_m2 / n_valid * 100,
                'union': union_cov,
                'complementarity': complementarity,
                'individual_m1': individual_m1,
                'individual_m2': individual_m2,
                'n_valid': n_valid,
            })

    return pd.DataFrame(pairs)


def main():
    script_dir = Path(__file__).parent
    data_dir = script_dir.parent

    obfuscation_types = ['encryption', 'dead_code', 'with_comments', 'without_comments', 'variable_renaming']
    obf_labels = {
        'encryption': 'Encryption', 'dead_code': 'Dead Code',
        'with_comments': 'With Comments', 'without_comments': 'Without Comments',
        'variable_renaming': 'Variable Renaming',
    }

    # ── Compute pair stats for each obfuscation type ──
    all_stats = []
    for obf in obfuscation_types:
        csv_path = data_dir / f"model_problem_scores_{obf}.csv"
        if not csv_path.exists():
            print(f"WARNING: {csv_path} not found.")
            continue
        success_df = load_and_binarize(csv_path)
        stats = compute_pair_stats(success_df)
        stats['obf_type'] = obf
        all_stats.append(stats)
        print(f"Computed {len(stats)} pairs for {obf}")

    all_df = pd.concat(all_stats, ignore_index=True)

    # ── Average across obfuscation types per pair ──
    avg_df = all_df.groupby(['model1', 'model2']).agg({
        'both': 'mean',
        'only_m1': 'mean',
        'only_m2': 'mean',
        'union': 'mean',
        'complementarity': 'mean',
        'individual_m1': 'mean',
        'individual_m2': 'mean',
    }).reset_index()

    # ── Filter: both models must individually cover > 20% ──
    filtered = avg_df[(avg_df['individual_m1'] > 20) & (avg_df['individual_m2'] > 20)].copy()
    print(f"\nAfter filtering (both > 20% coverage): {len(filtered)} pairs")

    # ── Sort by complementarity (descending) → top 15 ──
    filtered = filtered.sort_values('complementarity', ascending=False).head(15)

    # ── Ensure model1 is the stronger model (higher individual coverage) ──
    for idx, row in filtered.iterrows():
        if row['individual_m1'] < row['individual_m2']:
            filtered.at[idx, 'model1'], filtered.at[idx, 'model2'] = row['model2'], row['model1']
            filtered.at[idx, 'only_m1'], filtered.at[idx, 'only_m2'] = row['only_m2'], row['only_m1']
            filtered.at[idx, 'individual_m1'], filtered.at[idx, 'individual_m2'] = row['individual_m2'], row['individual_m1']

    filtered = filtered.reset_index(drop=True)

    # ── Plot ──
    fig, ax = plt.subplots(figsize=(14, 9))

    n_pairs = len(filtered)
    y_pos = np.arange(n_pairs)

    # Stacked bars: both (green), only stronger (blue), only weaker (orange)
    bars_both = ax.barh(y_pos, filtered['both'], height=0.7,
                        color='#27ae60', label='Solved by Both', edgecolor='white', linewidth=0.5)
    bars_m1 = ax.barh(y_pos, filtered['only_m1'], left=filtered['both'], height=0.7,
                      color='#2980b9', label='Only Stronger Model', edgecolor='white', linewidth=0.5)
    bars_m2 = ax.barh(y_pos, filtered['only_m2'],
                      left=filtered['both'] + filtered['only_m1'], height=0.7,
                      color='#e67e22', label='Only Weaker Model', edgecolor='white', linewidth=0.5)

    # Labels
    pair_labels = []
    for _, row in filtered.iterrows():
        pair_labels.append(f"{row['model1']}  +  {row['model2']}")

    ax.set_yticks(y_pos)
    ax.set_yticklabels(pair_labels, fontsize=11)
    ax.invert_yaxis()

    # Union coverage annotation on right
    for i, (_, row) in enumerate(filtered.iterrows()):
        ax.text(row['union'] + 0.5, i, f"{row['union']:.1f}%",
                va='center', ha='left', fontsize=10, fontweight='bold')

    # Individual coverage annotation (smaller, gray)
    for i, (_, row) in enumerate(filtered.iterrows()):
        ax.text(-1, i - 0.2, f"({row['individual_m1']:.0f}%)",
                va='center', ha='right', fontsize=7, color='#2980b9', fontstyle='italic')
        ax.text(-1, i + 0.2, f"({row['individual_m2']:.0f}%)",
                va='center', ha='right', fontsize=7, color='#e67e22', fontstyle='italic')

    ax.set_xlabel('Coverage (%)', fontsize=13, fontweight='bold')
    ax.set_ylabel('Model Pairs (sorted by complementarity)', fontsize=13, fontweight='bold')
    ax.set_xlim(0, 100)
    ax.grid(axis='x', alpha=0.3, linestyle='--')
    ax.spines['top'].set_visible(False)
    ax.spines['right'].set_visible(False)

    # Legend
    legend_elements = [
        Patch(facecolor='#27ae60', label='Solved by Both'),
        Patch(facecolor='#2980b9', label='Only Stronger Model'),
        Patch(facecolor='#e67e22', label='Only Weaker Model (complementary gain)'),
    ]
    ax.legend(handles=legend_elements, loc='lower right', fontsize=10,
              frameon=True, fancybox=True)

    # Stats
    fig.text(0.5, -0.02,
             f'Averaged across 5 obfuscation types | '
             f'Filtered: both models > 20% individual coverage | '
             f'Sorted by complementarity (unique contributions)',
             ha='center', fontsize=9,
             bbox=dict(boxstyle='round', facecolor='wheat', alpha=0.5))

    fig.tight_layout()

    output_png = script_dir / 'top_pairs_by_complementarity.png'
    output_pdf = script_dir / 'top_pairs_by_complementarity.pdf'
    plt.savefig(output_png, dpi=200, bbox_inches='tight', facecolor='white')
    plt.savefig(output_pdf, dpi=300, bbox_inches='tight', facecolor='white')
    plt.close(fig)
    print(f"\nSaved: {output_png}")
    print(f"Saved: {output_pdf}")


if __name__ == "__main__":
    main()
