#!/usr/bin/env python3
"""
Visualize model-problem score matrix as a heatmap.

Creates a matrix visualization where:
- Rows = 13 models (sorted from best to worst)
- Columns = 250 problems
- Blue = score >= 0.5 (success)
- Red = score < 0.5 (failure)
- Missing values are ignored (white/transparent)
- Model names have "Dataset_" prefix removed
"""

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
from pathlib import Path
import warnings
warnings.filterwarnings('ignore')

def model_display_name(name: str) -> str:
    """Normalize model name for display (e.g. Dataset_X -> X, Llama70b_Generation -> Llama70B)."""
    s = name.replace('Dataset_', '', 1) if name.startswith('Dataset_') else name
    if s == 'Llama70b_Generation':
        return 'Llama70B'
    if s.endswith('_Generation'):
        return s[:-len('_Generation')]
    return s

def create_matrix_visualization(csv_path: Path, output_path: Path, threshold: float = 0.5):
    """
    Create a heatmap visualization of model-problem scores.
    """
    print(f"Loading data from {csv_path}")
    df = pd.read_csv(csv_path, index_col=0)
    print(f"Data loaded: {df.shape}")
    
    # Normalize model names for display
    df.index = df.index.map(model_display_name)
    
    # Calculate average score per model (ignoring NaN) and sort descending
    model_avg_scores = df.mean(axis=1, skipna=True).sort_values(ascending=False)
    print(f"Model averages (best to worst):")
    for model, score in model_avg_scores.items():
        print(f"  {model}: {score:.3f}")
    
    # Reorder dataframe by model performance (best to worst)
    df_sorted = df.reindex(model_avg_scores.index)
    
    # Convert to numpy array
    data = df_sorted.values.astype(float)
    
    # Create binary classification: 1 (success >= threshold), 0 (failure < threshold)
    # Missing values will be set to -1 and masked out
    mask = np.full(data.shape, -1.0, dtype=float)
    valid_mask = ~np.isnan(data)
    mask[valid_mask] = (data[valid_mask] >= threshold).astype(float)
    
    # Create figure
    fig, ax = plt.subplots(figsize=(25, 8))
    
    # Custom colormap: White (missing), Red (<0.5), Blue (>=0.5)
    from matplotlib.colors import ListedColormap, BoundaryNorm
    from matplotlib import cm
    # Order: [missing (-1), failure (0), success (1)]
    colors = ['#ffffff', '#d62728', '#1f77b4']  # White, Red, Blue
    cmap = ListedColormap(colors)
    boundaries = [-1.5, -0.5, 0.5, 1.5]
    norm = BoundaryNorm(boundaries, cmap.N)
    
    # Create heatmap (missing values (-1) will appear as white)
    im = ax.imshow(mask, aspect='auto', cmap=cmap, norm=norm, interpolation='nearest')
    
    # Labels
    ax.set_yticks(range(len(df_sorted.index)))
    ax.set_yticklabels(df_sorted.index, fontsize=9)
    ax.set_ylabel('Models', fontsize=12, fontweight='bold')
    
    # X-axis labels (show subset)
    step = max(1, len(df_sorted.columns) // 40)
    x_ticks = list(range(0, len(df_sorted.columns), step))
    x_labels = [df_sorted.columns[i] for i in x_ticks]
    ax.set_xticks(x_ticks)
    ax.set_xticklabels(x_labels, rotation=90, fontsize=7, ha='right')
    ax.set_xlabel('Problems', fontsize=12, fontweight='bold')
    
    # Grid
    ax.set_xticks(np.arange(-0.5, len(df_sorted.columns), 1), minor=True)
    ax.set_yticks(np.arange(-0.5, len(df_sorted.index), 1), minor=True)
    ax.grid(which='minor', color='white', linestyle='-', linewidth=0.3)
    
    # Title
    obfuscation_type = csv_path.stem.replace('model_problem_scores_', '').replace('_', ' ').title()
    ax.set_title(f'Model-Problem Score Matrix: {obfuscation_type}\n'
                 f'Blue (≥{threshold}) = Success, Red (<{threshold}) = Failure',
                 fontsize=14, fontweight='bold', pad=20)
    
    # Colorbar (only show 0 and 1, not -1 for missing)
    cbar = plt.colorbar(im, ax=ax, ticks=[0, 1], shrink=0.8)
    cbar.set_ticklabels([f'< {threshold}', f'≥ {threshold}'])
    cbar.set_label('Score Category', rotation=270, labelpad=20, fontsize=10)
    
    # Statistics (ignoring missing values)
    valid_mask = ~np.isnan(data)
    valid_cells = valid_mask.sum()
    success_cells = ((data >= threshold) & valid_mask).sum()
    failure_cells = ((data < threshold) & valid_mask).sum()
    
    if valid_cells > 0:
        success_pct = 100 * success_cells / valid_cells
        failure_pct = 100 * failure_cells / valid_cells
    else:
        success_pct = failure_pct = 0
    
    stats_text = (f'Valid cells: {valid_cells} | '
                  f'Success (≥{threshold}): {success_cells} ({success_pct:.1f}%) | '
                  f'Failure (<{threshold}): {failure_cells} ({failure_pct:.1f}%)')
    
    ax.text(0.5, -0.1, stats_text, transform=ax.transAxes,
            fontsize=9, ha='center', va='top',
            bbox=dict(boxstyle='round', facecolor='wheat', alpha=0.5))
    
    plt.tight_layout()
    print(f"Saving figure to {output_path}")
    plt.savefig(output_path, dpi=200, bbox_inches='tight', facecolor='white')
    plt.close(fig)
    print("Figure saved successfully!")

def main():
    """Generate visualizations for all obfuscation types."""
    script_dir = Path(__file__).parent
    
    # List of all obfuscation types
    obfuscation_types = [
        'dead_code',
        'encryption',
        'variable_renaming',
        'with_comments',
        'without_comments'
    ]
    
    print("="*80)
    print("Generating visualizations for all obfuscation types")
    print("="*80)
    
    for obf_type in obfuscation_types:
        print(f"\nProcessing: {obf_type}")
        print("-" * 80)
        
        csv_file = script_dir / f"model_problem_scores_{obf_type}.csv"
        
        if not csv_file.exists():
            print(f"  ⚠ Warning: File not found: {csv_file}")
            continue
        
        output_file = script_dir / f"model_problem_matrix_{obf_type}.png"
        
        try:
            create_matrix_visualization(csv_file, output_file, threshold=0.5)
            print(f"  ✓ Successfully created: {output_file.name}")
        except Exception as e:
            print(f"  ✗ Error processing {obf_type}: {e}")
            import traceback
            traceback.print_exc()
    
    print("\n" + "="*80)
    print("All visualizations complete!")
    print("="*80)

if __name__ == "__main__":
    main()
