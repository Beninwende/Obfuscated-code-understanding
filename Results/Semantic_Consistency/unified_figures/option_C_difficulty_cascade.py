#!/usr/bin/env python3
"""
Option C: Difficulty Cascade + Model Tier Chart

Two-panel figure:
  Panel 1 (top): Bar chart where each bar = 1 problem, height = number of models succeeding
         (summed across 3 obfuscation types), sorted descending.
         Creates a clear "staircase" from universally easy to universally hard problems.
  Panel 2 (bottom): Dot matrix showing exactly which models succeed on each problem,
         with dot color indicating how many obfuscation types they succeeded on (1, 2, or 3).
         Aligned with the bar chart above.
"""

import matplotlib
matplotlib.use('Agg')
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import matplotlib.gridspec as gridspec
from matplotlib.colors import ListedColormap, BoundaryNorm
from matplotlib.patches import Patch
from pathlib import Path
import warnings
warnings.filterwarnings('ignore')


def model_display_name(name: str) -> str:
    """Normalize model name for display."""
    s = name.replace('Dataset_', '', 1) if name.startswith('Dataset_') else name
    if s == 'Llama70b_Generation':
        return 'Llama70B'
    if s.endswith('_Generation'):
        return s[:-len('_Generation')]
    return s


def load_and_binarize(csv_path: Path, threshold: float = 0.5) -> pd.DataFrame:
    """Load CSV, normalize model names, binarize scores: 1=success, 0=failure, NaN=missing."""
    df = pd.read_csv(csv_path, index_col=0)
    df.index = df.index.map(model_display_name)
    data = df.values.astype(float)
    binary = np.full_like(data, np.nan)
    valid = ~np.isnan(data)
    binary[valid] = (data[valid] >= threshold).astype(float)
    return pd.DataFrame(binary, index=df.index, columns=df.columns)


def main():
    script_dir = Path(__file__).parent
    data_dir = script_dir.parent

    # ── Load all 3 obfuscation types ──
    obfuscation_types = ['encryption', 'dead_code', 'with_comments', 'without_comments', 'variable_renaming']
    obf_labels = {
        'encryption': 'Encryption',
        'dead_code': 'Dead Code',
        'with_comments': 'With Comments',
        'without_comments': 'Without Comments',
        'variable_renaming': 'Variable Renaming',
    }
    obf_colors_map = {
        'encryption': '#e74c3c',
        'dead_code': '#3498db',
        'with_comments': '#2ecc71',
        'without_comments': '#9b59b6',
        'variable_renaming': '#f39c12',
    }

    dfs = {}
    for obf in obfuscation_types:
        csv_path = data_dir / f"model_problem_scores_{obf}.csv"
        if not csv_path.exists():
            print(f"WARNING: {csv_path} not found.")
            continue
        dfs[obf] = load_and_binarize(csv_path)
        print(f"Loaded {obf}: {dfs[obf].shape}")

    if len(dfs) < 5:
        print(f"ERROR: Need all 5 obfuscation CSVs, found {len(dfs)}.")
        return

    # ── Align ──
    common_models = sorted(set.intersection(*[set(df.index) for df in dfs.values()]))
    common_problems = sorted(set.intersection(*[set(df.columns) for df in dfs.values()]))
    print(f"\nCommon models: {len(common_models)}")
    print(f"Common problems: {len(common_problems)}")

    aligned = {obf: dfs[obf].loc[common_models, common_problems] for obf in obfuscation_types}
    stack = np.stack([aligned[obf].values for obf in obfuscation_types], axis=0)

    # ── Composite per (model, problem): how many obf types succeeded ──
    success_count = np.nansum(stack, axis=0)  # shape (n_models, n_problems)
    valid_count = np.sum(~np.isnan(stack), axis=0)
    all_nan_mask = (valid_count == 0)
    success_count[all_nan_mask] = 0

    composite_df = pd.DataFrame(success_count, index=common_models, columns=common_problems)

    # ── For each problem: total model-successes (sum of composite scores) ──
    # Maximum possible = 14 models × 3 types = 42
    problem_total = composite_df.sum(axis=0)
    problem_order = problem_total.sort_values(ascending=False).index
    composite_df = composite_df[problem_order]
    problem_total = problem_total[problem_order]

    # ── Sort models by overall performance ──
    model_total = composite_df.sum(axis=1)
    model_order = model_total.sort_values(ascending=False).index
    composite_df = composite_df.loc[model_order]

    n_models = len(model_order)
    n_problems = len(problem_order)

    # ── Also compute: for each problem, how many distinct models succeed (on at least 1 type) ──
    models_succeeding = (composite_df > 0).sum(axis=0).values

    # ── Panel 1: Bar chart ── # of distinct models that succeed (at least 1/3 types)
    # ── Panel 2: Dot matrix ──

    # ── Create figure ──
    fig = plt.figure(figsize=(30, 14))
    gs = gridspec.GridSpec(2, 1, height_ratios=[1, 2.5], hspace=0.05)

    ax_bar = fig.add_subplot(gs[0])
    ax_dots = fig.add_subplot(gs[1], sharex=ax_bar)

    x = np.arange(n_problems)

    # ── Panel 1: Stacked bar showing how many models succeed at each obfuscation type ──
    # For each problem, count models succeeding per obfuscation type
    obf_model_counts = {}
    for obf in obfuscation_types:
        obf_success = aligned[obf].loc[model_order, problem_order]
        obf_model_counts[obf] = obf_success.sum(axis=0).values  # # models that succeeded

    # Stacked bar
    bottom = np.zeros(n_problems)
    for obf in obfuscation_types:
        ax_bar.bar(x, obf_model_counts[obf], bottom=bottom, width=1.0,
                   color=obf_colors_map[obf], alpha=0.85, label=obf_labels[obf],
                   edgecolor='none')
        bottom += obf_model_counts[obf]

    # Total line on top
    total_height = sum(obf_model_counts[obf] for obf in obfuscation_types)
    ax_bar.plot(x, total_height, color='black', linewidth=0.5, alpha=0.3)

    ax_bar.set_ylabel(f'# Model Successes\n(across {len(obfuscation_types)} obf. types)', fontsize=11, fontweight='bold')
    ax_bar.set_xlim(-0.5, n_problems - 0.5)
    n_types = len(obfuscation_types)
    ax_bar.set_ylim(0, n_models * n_types + 1)
    ax_bar.legend(loc='upper right', fontsize=10, frameon=True, fancybox=True)
    ax_bar.spines['bottom'].set_visible(False)
    ax_bar.spines['right'].set_visible(False)
    ax_bar.spines['top'].set_visible(False)
    plt.setp(ax_bar.get_xticklabels(), visible=False)

    # Reference lines
    for t in range(1, n_types):
        ax_bar.axhline(y=n_models * t, color='gray', linestyle='--', linewidth=0.5, alpha=0.4)
        ax_bar.text(n_problems + 1, n_models * t, f'{n_models*t} ({t} type{"s" if t>1 else ""})',
                    fontsize=7, va='center', color='gray')

    # ── Panel 2: Dot matrix ──
    # For each (model_idx, problem_idx), plot a colored dot if composite > 0
    data_vals = composite_df.values

    # Background: light gray for all cells
    ax_dots.set_facecolor('#f8f8f8')

    # Color mapping for dots
    dot_colors = {0: 'none', 1: '#c0392b', 2: '#e74c3c', 3: '#f39c12', 4: '#5dade2', 5: '#1a5276'}

    for mi in range(n_models):
        for pi in range(n_problems):
            val = data_vals[mi, pi]
            if val > 0:
                color = dot_colors.get(int(val), '#1a5276')
                ax_dots.plot(pi, mi, marker='s', markersize=2.0, color=color,
                             markeredgewidth=0)

    ax_dots.set_yticks(range(n_models))
    ax_dots.set_yticklabels(composite_df.index, fontsize=10, fontweight='bold')
    ax_dots.set_ylabel('Models (sorted by performance)', fontsize=12, fontweight='bold')
    ax_dots.invert_yaxis()

    # X-axis labels (subset)
    step = max(1, n_problems // 35)
    x_ticks = list(range(0, n_problems, step))
    x_labels_list = [composite_df.columns[i] for i in x_ticks]
    ax_dots.set_xticks(x_ticks)
    ax_dots.set_xticklabels(x_labels_list, rotation=90, fontsize=7, ha='center')
    ax_dots.set_xlabel('Problems (sorted: easy → hard)', fontsize=12, fontweight='bold')

    # Horizontal grid for model separation
    for mi in range(n_models + 1):
        ax_dots.axhline(y=mi - 0.5, color='white', linewidth=0.8)

    # Dot legend
    legend_elements = [
        Patch(facecolor='#1a5276', label='Success on 5/5 types'),
        Patch(facecolor='#5dade2', label='Success on 4/5 types'),
        Patch(facecolor='#f39c12', label='Success on 3/5 types'),
        Patch(facecolor='#e74c3c', label='Success on 2/5 types'),
        Patch(facecolor='#c0392b', label='Success on 1/5 types'),
        Patch(facecolor='#f8f8f8', edgecolor='gray', label='Failure on all types'),
    ]
    ax_dots.legend(handles=legend_elements, loc='upper center',
                   bbox_to_anchor=(0.5, -0.12), ncol=6, fontsize=9,
                   frameon=True, fancybox=True, shadow=True)

    # ── Title ──
    obf_names = ', '.join([obf_labels[o] for o in obfuscation_types])
    fig.suptitle(
        f'Problem Difficulty Cascade & Model Success Map\n'
        f'Obfuscation types: {obf_names} | Threshold: ≥ 0.5 = Success | '
        f'Problems sorted from universally easy (left) to universally hard (right)',
        fontsize=14, fontweight='bold', y=0.99
    )

    # ── Summary stats ──
    n_easy = np.sum(models_succeeding >= 10)
    n_medium = np.sum((models_succeeding >= 5) & (models_succeeding < 10))
    n_hard = np.sum((models_succeeding >= 1) & (models_succeeding < 5))
    n_unsolved = np.sum(models_succeeding == 0)

    stats_text = (
        f'Total problems: {n_problems} | '
        f'Easy (≥10 models): {n_easy} ({100*n_easy/n_problems:.1f}%) | '
        f'Medium (5-9 models): {n_medium} ({100*n_medium/n_problems:.1f}%) | '
        f'Hard (1-4 models): {n_hard} ({100*n_hard/n_problems:.1f}%) | '
        f'Unsolved (0 models): {n_unsolved} ({100*n_unsolved/n_problems:.1f}%)'
    )
    fig.text(0.5, 0.005, stats_text, ha='center', fontsize=9,
             bbox=dict(boxstyle='round', facecolor='wheat', alpha=0.5))

    # ── Save ──
    output_path = script_dir / 'difficulty_cascade_model_map.png'
    plt.savefig(output_path, dpi=200, bbox_inches='tight', facecolor='white')
    plt.close(fig)
    print(f"\nFigure saved to: {output_path}")

    # PDF version
    output_pdf = script_dir / 'difficulty_cascade_model_map.pdf'
    # Recreate for PDF
    fig2 = plt.figure(figsize=(30, 14))
    gs2 = gridspec.GridSpec(2, 1, height_ratios=[1, 2.5], hspace=0.05)
    ax_bar2 = fig2.add_subplot(gs2[0])
    ax_dots2 = fig2.add_subplot(gs2[1], sharex=ax_bar2)

    bottom2 = np.zeros(n_problems)
    for obf in obfuscation_types:
        ax_bar2.bar(x, obf_model_counts[obf], bottom=bottom2, width=1.0,
                    color=obf_colors_map[obf], alpha=0.85, label=obf_labels[obf],
                    edgecolor='none')
        bottom2 += obf_model_counts[obf]

    ax_bar2.plot(x, total_height, color='black', linewidth=0.5, alpha=0.3)
    ax_bar2.set_ylabel(f'# Model Successes\n(across {n_types} obf. types)', fontsize=11, fontweight='bold')
    ax_bar2.set_xlim(-0.5, n_problems - 0.5)
    ax_bar2.set_ylim(0, n_models * n_types + 1)
    ax_bar2.legend(loc='upper right', fontsize=10, frameon=True, fancybox=True)
    ax_bar2.spines['bottom'].set_visible(False)
    ax_bar2.spines['right'].set_visible(False)
    ax_bar2.spines['top'].set_visible(False)
    plt.setp(ax_bar2.get_xticklabels(), visible=False)
    for t in range(1, n_types):
        ax_bar2.axhline(y=n_models * t, color='gray', linestyle='--', linewidth=0.5, alpha=0.4)

    ax_dots2.set_facecolor('#f8f8f8')
    for mi in range(n_models):
        for pi in range(n_problems):
            val = data_vals[mi, pi]
            if val > 0:
                color = dot_colors.get(int(val), '#1a5276')
                ax_dots2.plot(pi, mi, marker='s', markersize=2.0, color=color,
                              markeredgewidth=0)

    ax_dots2.set_yticks(range(n_models))
    ax_dots2.set_yticklabels(composite_df.index, fontsize=10, fontweight='bold')
    ax_dots2.set_ylabel('Models (sorted by performance)', fontsize=12, fontweight='bold')
    ax_dots2.invert_yaxis()
    ax_dots2.set_xticks(x_ticks)
    ax_dots2.set_xticklabels(x_labels_list, rotation=90, fontsize=7, ha='center')
    ax_dots2.set_xlabel('Problems (sorted: easy → hard)', fontsize=12, fontweight='bold')
    for mi in range(n_models + 1):
        ax_dots2.axhline(y=mi - 0.5, color='white', linewidth=0.8)

    ax_dots2.legend(handles=legend_elements, loc='upper center',
                    bbox_to_anchor=(0.5, -0.12), ncol=6, fontsize=9,
                    frameon=True, fancybox=True, shadow=True)

    fig2.suptitle(
        f'Problem Difficulty Cascade & Model Success Map\n'
        f'Obfuscation types: {obf_names} | Threshold: ≥ 0.5 = Success | '
        f'Problems sorted from universally easy (left) to universally hard (right)',
        fontsize=14, fontweight='bold', y=0.99
    )
    fig2.text(0.5, 0.005, stats_text, ha='center', fontsize=9,
              bbox=dict(boxstyle='round', facecolor='wheat', alpha=0.5))

    plt.savefig(output_pdf, dpi=300, bbox_inches='tight', facecolor='white')
    plt.close(fig2)
    print(f"PDF saved to: {output_pdf}")


if __name__ == "__main__":
    main()
