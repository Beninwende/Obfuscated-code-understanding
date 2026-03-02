#!/usr/bin/env python3
"""
Option A: Unified Composite Heatmap

Single heatmap where:
- Y-axis: 14 models sorted by total successes (best → worst)
- X-axis: 250 problems sorted by total successes across all models & obfuscation types (easy → hard)
- Cell color encodes how many of the 3 obfuscation types (encryption, dead_code, with_comments)
  the model succeeded on (score ≥ 0.5):
    3/3 = dark blue (consistent success)
    2/3 = medium blue  
    1/3 = light orange/amber
    0/3 = red (consistent failure)
    Missing = white
- Marginal bars on top (# models succeeding per problem) and right (# problems solved per model)
"""

import matplotlib
matplotlib.use('Agg')
import matplotlib.pyplot as plt
plt.rcParams['font.family'] = 'serif'
plt.rcParams['font.serif'] = ['Times New Roman']
plt.rcParams['font.size'] = 14
import pandas as pd
import numpy as np
import matplotlib.gridspec as gridspec
from matplotlib.colors import ListedColormap, BoundaryNorm
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
    data_dir = script_dir.parent  # Semantic_Consistency directory

    # ── Load all 5 obfuscation types ──
    obfuscation_types = ['encryption', 'dead_code', 'with_comments', 'without_comments', 'variable_renaming']
    obf_labels = {
        'encryption': 'Encryption',
        'dead_code': 'Dead Code',
        'with_comments': 'With Comments',
        'without_comments': 'Without Comments',
        'variable_renaming': 'Variable Renaming',
    }

    dfs = {}
    for obf in obfuscation_types:
        csv_path = data_dir / f"model_problem_scores_{obf}.csv"
        if not csv_path.exists():
            print(f"WARNING: {csv_path} not found, skipping.")
            continue
        dfs[obf] = load_and_binarize(csv_path)
        print(f"Loaded {obf}: {dfs[obf].shape}")

    if len(dfs) < 5:
        print(f"ERROR: Need all 5 obfuscation CSVs, found {len(dfs)}.")
        return

    # ── Align models and problems across all 3 dataframes ──
    common_models = sorted(set.intersection(*[set(df.index) for df in dfs.values()]))
    common_problems = sorted(set.intersection(*[set(df.columns) for df in dfs.values()]))
    print(f"\nCommon models: {len(common_models)}")
    print(f"Common problems: {len(common_problems)}")

    # ── Compute composite score: how many obfuscation types each model succeeds on per problem ──
    # Stack: shape (n_obf, n_models, n_problems)
    aligned = {obf: dfs[obf].loc[common_models, common_problems] for obf in obfuscation_types}
    stack = np.stack([aligned[obf].values for obf in obfuscation_types], axis=0)

    # Count successes (ignoring NaN): result shape (n_models, n_problems)
    success_count = np.nansum(stack, axis=0)  # How many obf types succeeded
    valid_count = np.sum(~np.isnan(stack), axis=0)  # How many obf types had valid data

    # Composite: fraction of valid obfuscation types that succeeded, scaled to [0, 3]
    # But we want integer counts 0-3. Where all 3 are valid, this is straightforward.
    # Where some are NaN, we scale proportionally (e.g., 2/2 valid succeeded → treat as 3/3)
    # Actually, let's keep it simple: count raw successes out of 3
    composite = success_count.copy()
    # Mark cells where ALL 3 obfuscation types are NaN as fully missing
    all_nan_mask = (valid_count == 0)
    composite[all_nan_mask] = -1  # Will be rendered as white

    composite_df = pd.DataFrame(composite, index=common_models, columns=common_problems)

    # ── Sort problems by total success (easy→hard, left→right) ──
    # Total successes across all models for each problem
    problem_total = composite_df.replace(-1, 0).sum(axis=0)
    problem_order = problem_total.sort_values(ascending=False).index
    composite_df = composite_df[problem_order]

    # ── Sort models by total success (best→worst, top→bottom) ──
    model_total = composite_df.replace(-1, 0).sum(axis=1)
    model_order = model_total.sort_values(ascending=False).index
    composite_df = composite_df.loc[model_order]

    print(f"\nModel ranking (total composite successes across {len(common_problems)} problems × 3 types):")
    for m in model_order:
        print(f"  {m}: {model_total[m]:.0f}")

    # ── Prepare data for plotting ──
    data = composite_df.values.astype(float)

    # ── Compute marginal statistics ──
    # Top bar: for each problem, how many models succeed on ≥1 type
    # More useful: average composite score per problem
    problem_avg = composite_df.replace(-1, np.nan).mean(axis=0).values

    # Right bar: for each model, average composite score
    model_avg = composite_df.replace(-1, np.nan).mean(axis=1).values

    # ── Create figure with marginal bars ──
    fig = plt.figure(figsize=(28, 10))
    gs = gridspec.GridSpec(2, 2, 
                           width_ratios=[25, 1.2],
                           height_ratios=[1.5, 8],
                           hspace=0.03, wspace=0.03)

    ax_top = fig.add_subplot(gs[0, 0])    # Top marginal bar
    ax_main = fig.add_subplot(gs[1, 0])   # Main heatmap
    ax_right = fig.add_subplot(gs[1, 1])  # Right marginal bar
    ax_corner = fig.add_subplot(gs[0, 1]) # Empty corner

    # ── Color scheme: -1=white, 0=dark red, 1-2=red shades, 3=neutral, 4-5=blue shades ──
    n_types = len(obfuscation_types)
    colors = ['#ffffff',    # -1: missing (white)
              '#8b0000',    # 0/5: consistent failure (darkest red)
              '#c0392b',    # 1/5: strong failure (dark red)
              '#e74c3c',    # 2/5: mostly failure (red)
              '#f0b27a',    # 3/5: mixed (amber/neutral)
              '#5dade2',    # 4/5: mostly success (light blue)
              '#1a5276']    # 5/5: consistent success (dark blue)
    cmap = ListedColormap(colors)
    boundaries = [-1.5, -0.5, 0.5, 1.5, 2.5, 3.5, 4.5, 5.5]
    norm = BoundaryNorm(boundaries, cmap.N)

    # ── Main heatmap ──
    im = ax_main.imshow(data, aspect='auto', cmap=cmap, norm=norm, interpolation='nearest')

    # Y-axis: model names
    ax_main.set_yticks(range(len(composite_df.index)))
    ax_main.set_yticklabels(composite_df.index, fontsize=10, fontweight='bold')
    ax_main.set_ylabel('Models (sorted by performance)', fontsize=12, fontweight='bold')

    # X-axis: problem IDs (show subset)
    n_problems = len(composite_df.columns)
    step = max(1, n_problems // 35)
    x_ticks = list(range(0, n_problems, step))
    x_labels = [composite_df.columns[i] for i in x_ticks]
    ax_main.set_xticks(x_ticks)
    ax_main.set_xticklabels(x_labels, rotation=90, fontsize=7, ha='center')
    ax_main.set_xlabel('Problems (sorted: easy → hard)', fontsize=12, fontweight='bold')

    # Minor grid
    ax_main.set_yticks(np.arange(-0.5, len(composite_df.index), 1), minor=True)
    ax_main.grid(which='minor', color='white', linestyle='-', linewidth=0.5, axis='y')

    # ── Top marginal bar: average composite score per problem ──
    x_positions = np.arange(n_problems)
    # Color the bars based on value
    bar_colors_top = []
    for v in problem_avg:
        if v >= 4.0:
            bar_colors_top.append('#1a5276')
        elif v >= 3.0:
            bar_colors_top.append('#5dade2')
        elif v >= 2.0:
            bar_colors_top.append('#f0b27a')
        else:
            bar_colors_top.append('#e74c3c')

    ax_top.bar(x_positions, problem_avg, width=1.0, color=bar_colors_top, edgecolor='none', alpha=0.8)
    ax_top.set_xlim(-0.5, n_problems - 0.5)
    ax_top.set_ylim(0, n_types + 0.15)
    ax_top.set_ylabel('Avg\nscore', fontsize=9, fontweight='bold')
    ax_top.set_xticks([])
    ax_top.spines['bottom'].set_visible(False)
    ax_top.spines['right'].set_visible(False)
    ax_top.spines['top'].set_visible(False)
    # Add horizontal reference lines
    for ref in range(1, n_types):
        ax_top.axhline(y=ref, color='gray', linestyle=':', linewidth=0.5, alpha=0.3)

    # ── Right marginal bar: average composite score per model ──
    y_positions = np.arange(len(composite_df.index))
    bar_colors_right = []
    for v in model_avg:
        if v >= 4.0:
            bar_colors_right.append('#1a5276')
        elif v >= 3.0:
            bar_colors_right.append('#5dade2')
        elif v >= 2.0:
            bar_colors_right.append('#f0b27a')
        else:
            bar_colors_right.append('#e74c3c')

    ax_right.barh(y_positions, model_avg, height=0.8, color=bar_colors_right, edgecolor='none', alpha=0.8)
    ax_right.set_ylim(-0.5, len(composite_df.index) - 0.5)
    ax_right.set_xlim(0, n_types + 0.15)
    ax_right.set_xlabel('Avg\nscore', fontsize=9, fontweight='bold')
    ax_right.set_yticks([])
    ax_right.invert_yaxis()
    ax_right.spines['left'].set_visible(False)
    ax_right.spines['right'].set_visible(False)
    ax_right.spines['top'].set_visible(False)
    # Add vertical reference lines
    for ref in range(1, n_types):
        ax_right.axvline(x=ref, color='gray', linestyle=':', linewidth=0.5, alpha=0.3)

    # Values on bars
    for i, v in enumerate(model_avg):
        ax_right.text(v + 0.05, i, f'{v:.1f}', va='center', ha='left', fontsize=8, fontweight='bold')

    # ── Hide corner ──
    ax_corner.axis('off')

    # ── Colorbar (legend) ──
    # Create a separate legend instead of a traditional colorbar
    from matplotlib.patches import Patch
    legend_elements = [
        Patch(facecolor='#1a5276', label='5/5 variants: full success'),
        Patch(facecolor='#5dade2', label='4/5 variants'),
        Patch(facecolor='#f0b27a', label='3/5 variants'),
        Patch(facecolor='#e74c3c', label='2/5 variants'),
        Patch(facecolor='#c0392b', label='1/5 variants'),
        Patch(facecolor='#8b0000', label='0/5 variants: full failure'),
        Patch(facecolor='#ffffff', edgecolor='gray', label='Missing data'),
    ]
    ax_main.legend(handles=legend_elements, loc='upper center',
                   bbox_to_anchor=(0.5, -0.18), ncol=7, fontsize=8,
                   frameon=True, fancybox=True, shadow=True)

    obf_names = ', '.join([obf_labels[o] for o in obfuscation_types])

    # ── Summary statistics ──
    total_cells = data.size
    valid_cells = np.sum(data >= 0)
    full_success = np.sum(data == n_types)
    full_failure = np.sum(data == 0)
    partial = valid_cells - full_success - full_failure

    stats_text = (
        f'Models: {len(composite_df.index)} | Problems: {n_problems} | '
        f'Full success ({n_types}/{n_types}): {full_success} ({100*full_success/valid_cells:.1f}%) | '
        f'Partial (1-{n_types-1}/{n_types}): {partial} ({100*partial/valid_cells:.1f}%) | '
        f'Full failure (0/{n_types}): {full_failure} ({100*full_failure/valid_cells:.1f}%)'
    )
    fig.text(0.45, 0.01, stats_text, ha='center', fontsize=9,
             bbox=dict(boxstyle='round', facecolor='wheat', alpha=0.5))

    # ── Save ──
    output_path = script_dir / 'unified_composite_heatmap.png'
    plt.savefig(output_path, dpi=200, bbox_inches='tight', facecolor='white')
    plt.close(fig)
    print(f"\nFigure saved to: {output_path}")

    # Also save as PDF for publication quality
    output_pdf = script_dir / 'unified_composite_heatmap.pdf'
    fig_pdf = plt.figure(figsize=(28, 10))
    gs_pdf = gridspec.GridSpec(2, 2,
                               width_ratios=[25, 1.2],
                               height_ratios=[1.5, 8],
                               hspace=0.03, wspace=0.03)
    ax_top2 = fig_pdf.add_subplot(gs_pdf[0, 0])
    ax_main2 = fig_pdf.add_subplot(gs_pdf[1, 0])
    ax_right2 = fig_pdf.add_subplot(gs_pdf[1, 1])
    ax_corner2 = fig_pdf.add_subplot(gs_pdf[0, 1])

    ax_main2.imshow(data, aspect='auto', cmap=cmap, norm=norm, interpolation='nearest')
    ax_main2.set_yticks(range(len(composite_df.index)))
    ax_main2.set_yticklabels(composite_df.index, fontsize=10, fontweight='bold')
    ax_main2.set_ylabel('Models (sorted by performance)', fontsize=12, fontweight='bold')
    ax_main2.set_xticks(x_ticks)
    ax_main2.set_xticklabels(x_labels, rotation=90, fontsize=7, ha='center')
    ax_main2.set_xlabel('Problems (sorted: easy → hard)', fontsize=12, fontweight='bold')
    ax_main2.set_yticks(np.arange(-0.5, len(composite_df.index), 1), minor=True)
    ax_main2.grid(which='minor', color='white', linestyle='-', linewidth=0.5, axis='y')

    ax_top2.bar(x_positions, problem_avg, width=1.0, color=bar_colors_top, edgecolor='none', alpha=0.8)
    ax_top2.set_xlim(-0.5, n_problems - 0.5)
    ax_top2.set_ylim(0, n_types + 0.15)
    ax_top2.set_ylabel('Avg\nscore', fontsize=9, fontweight='bold')
    ax_top2.set_xticks([])
    ax_top2.spines['bottom'].set_visible(False)
    ax_top2.spines['right'].set_visible(False)
    ax_top2.spines['top'].set_visible(False)
    for ref in range(1, n_types):
        ax_top2.axhline(y=ref, color='gray', linestyle=':', linewidth=0.5, alpha=0.3)

    ax_right2.barh(y_positions, model_avg, height=0.8, color=bar_colors_right, edgecolor='none', alpha=0.8)
    ax_right2.set_ylim(-0.5, len(composite_df.index) - 0.5)
    ax_right2.set_xlim(0, n_types + 0.15)
    ax_right2.set_xlabel('Avg\nscore', fontsize=9, fontweight='bold')
    ax_right2.set_yticks([])
    ax_right2.invert_yaxis()
    ax_right2.spines['left'].set_visible(False)
    ax_right2.spines['right'].set_visible(False)
    ax_right2.spines['top'].set_visible(False)
    for ref in range(1, n_types):
        ax_right2.axvline(x=ref, color='gray', linestyle=':', linewidth=0.5, alpha=0.3)
    for i, v in enumerate(model_avg):
        ax_right2.text(v + 0.05, i, f'{v:.1f}', va='center', ha='left', fontsize=8, fontweight='bold')

    ax_corner2.axis('off')

    ax_main2.legend(handles=legend_elements, loc='upper center',
                    bbox_to_anchor=(0.5, -0.18), ncol=7, fontsize=8,
                    frameon=True, fancybox=True, shadow=True)

    fig_pdf.text(0.45, 0.01, stats_text, ha='center', fontsize=9,
                 bbox=dict(boxstyle='round', facecolor='wheat', alpha=0.5))

    plt.savefig(output_pdf, dpi=300, bbox_inches='tight', facecolor='white')
    plt.close(fig_pdf)
    print(f"PDF saved to: {output_pdf}")


if __name__ == "__main__":
    main()
