#!/usr/bin/env python3
"""
Compute and visualize model complementarity.

Complementarity measures how well models cover different problems:
- High complementarity = models succeed on different problems
- Low complementarity = models succeed/fail on the same problems

Metrics computed:
1. Pairwise Complementarity: Count of problems where one model succeeds and the other fails
2. Coverage Overlap: Jaccard similarity of success sets
3. Union Coverage: How many problems are covered by combining models
4. Unique Coverage: Problems solved by only one model in a pair
"""

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
from pathlib import Path
from itertools import combinations
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

def load_and_prepare_data(csv_path: Path, threshold: float = 0.5):
    """
    Load CSV and convert to binary success/failure matrix.
    
    Returns:
        df: DataFrame with model names (without Dataset_ prefix) as index
        success_matrix: Binary matrix (1 = success >= threshold, 0 = failure < threshold, NaN = missing)
    """
    df = pd.read_csv(csv_path, index_col=0)

    # Normalize model names for display
    df.index = df.index.map(model_display_name)
    
    # Convert to binary: 1 = success (>= threshold), 0 = failure (< threshold)
    success_matrix = df.copy()
    valid_mask = ~np.isnan(df.values)
    success_matrix.values[valid_mask] = (df.values[valid_mask] >= threshold).astype(float)
    success_matrix.values[~valid_mask] = np.nan
    
    return df, success_matrix

def compute_pairwise_complementarity(success_matrix: pd.DataFrame):
    """
    Compute pairwise complementarity scores.
    
    Complementarity = number of problems where one model succeeds and the other fails
    (ignoring cases where both succeed or both fail)
    
    Returns:
        complementarity_df: DataFrame with complementarity scores
    """
    models = success_matrix.index.tolist()
    n_models = len(models)
    complementarity_matrix = np.zeros((n_models, n_models))
    
    for i, model1 in enumerate(models):
        for j, model2 in enumerate(models):
            if i == j:
                # Self-complementarity is 0 (or could be total problems solved)
                complementarity_matrix[i, j] = 0
            else:
                # Get success vectors for both models
                vec1 = success_matrix.loc[model1].values
                vec2 = success_matrix.loc[model2].values
                
                # Find valid comparisons (both have data)
                valid_mask = ~(np.isnan(vec1) | np.isnan(vec2))
                
                if valid_mask.sum() == 0:
                    complementarity_matrix[i, j] = np.nan
                else:
                    vec1_valid = vec1[valid_mask]
                    vec2_valid = vec2[valid_mask]
                    
                    # Count complementary cases: (1,0) or (0,1)
                    complementary = ((vec1_valid == 1) & (vec2_valid == 0)).sum() + \
                                   ((vec1_valid == 0) & (vec2_valid == 1)).sum()
                    
                    # Normalize by number of valid comparisons
                    complementarity_matrix[i, j] = complementary / valid_mask.sum()
    
    complementarity_df = pd.DataFrame(
        complementarity_matrix,
        index=models,
        columns=models
    )
    
    return complementarity_df

def compute_coverage_overlap(success_matrix: pd.DataFrame):
    """
    Compute Jaccard similarity of success sets (coverage overlap).
    
    Lower overlap = higher complementarity
    
    Returns:
        overlap_df: DataFrame with Jaccard similarity scores
    """
    models = success_matrix.index.tolist()
    n_models = len(models)
    overlap_matrix = np.zeros((n_models, n_models))
    
    for i, model1 in enumerate(models):
        for j, model2 in enumerate(models):
            if i == j:
                overlap_matrix[i, j] = 1.0
            else:
                vec1 = success_matrix.loc[model1].values
                vec2 = success_matrix.loc[model2].values
                
                # Get success sets (indices where value == 1)
                valid_mask = ~(np.isnan(vec1) | np.isnan(vec2))
                
                if valid_mask.sum() == 0:
                    overlap_matrix[i, j] = np.nan
                else:
                    vec1_valid = vec1[valid_mask]
                    vec2_valid = vec2[valid_mask]
                    
                    # Success sets
                    set1 = set(np.where(vec1_valid == 1)[0])
                    set2 = set(np.where(vec2_valid == 1)[0])
                    
                    # Jaccard similarity
                    intersection = len(set1 & set2)
                    union = len(set1 | set2)
                    
                    if union == 0:
                        overlap_matrix[i, j] = 0.0
                    else:
                        overlap_matrix[i, j] = intersection / union
    
    overlap_df = pd.DataFrame(
        overlap_matrix,
        index=models,
        columns=models
    )
    
    return overlap_df

def compute_union_coverage(success_matrix: pd.DataFrame):
    """
    Compute how many problems are covered by combining models.
    
    Returns:
        union_df: DataFrame with union coverage scores (fraction of problems solved by at least one model)
    """
    models = success_matrix.index.tolist()
    n_models = len(models)
    union_matrix = np.zeros((n_models, n_models))
    
    for i, model1 in enumerate(models):
        for j, model2 in enumerate(models):
            if i == j:
                # Single model coverage
                vec = success_matrix.loc[model1].values
                valid_mask = ~np.isnan(vec)
                if valid_mask.sum() > 0:
                    union_matrix[i, j] = (vec[valid_mask] == 1).sum() / valid_mask.sum()
                else:
                    union_matrix[i, j] = np.nan
            else:
                vec1 = success_matrix.loc[model1].values
                vec2 = success_matrix.loc[model2].values
                
                # Union: at least one succeeds
                union_vec = np.maximum(vec1, vec2)
                valid_mask = ~np.isnan(union_vec)
                
                if valid_mask.sum() == 0:
                    union_matrix[i, j] = np.nan
                else:
                    union_matrix[i, j] = (union_vec[valid_mask] == 1).sum() / valid_mask.sum()
    
    union_df = pd.DataFrame(
        union_matrix,
        index=models,
        columns=models
    )
    
    return union_df

def create_complementarity_heatmap(complementarity_df: pd.DataFrame, output_path: Path, title_suffix: str = ""):
    """Create heatmap visualization of complementarity matrix."""
    fig, ax = plt.subplots(figsize=(12, 10))
    
    # Create mask for diagonal (self-complementarity)
    mask = np.eye(len(complementarity_df), dtype=bool)
    
    # Convert to percentages for display
    complementarity_pct = complementarity_df * 100
    
    # Plot heatmap
    sns.heatmap(
        complementarity_pct,
        annot=True,
        fmt='.1f',
        cmap='YlOrRd',
        mask=mask,
        square=True,
        linewidths=0.5,
        cbar_kws={'label': 'Complementarity Score (%)'},
        ax=ax
    )
    
    ax.set_title(f'Model Complementarity Matrix{title_suffix}\n'
                 f'Score = Percentage of problems where one succeeds and the other fails',
                 fontsize=14, fontweight='bold', pad=20)
    ax.set_xlabel('Model', fontsize=12, fontweight='bold')
    ax.set_ylabel('Model', fontsize=12, fontweight='bold')
    
    plt.xticks(rotation=45, ha='right')
    plt.yticks(rotation=0)
    plt.tight_layout()
    plt.savefig(output_path, dpi=200, bbox_inches='tight')
    plt.close()
    print(f"  ✓ Saved: {output_path.name}")

def create_coverage_overlap_heatmap(overlap_df: pd.DataFrame, output_path: Path, title_suffix: str = ""):
    """Create heatmap visualization of coverage overlap (Jaccard similarity)."""
    fig, ax = plt.subplots(figsize=(12, 10))
    
    # Plot heatmap
    sns.heatmap(
        overlap_df,
        annot=True,
        fmt='.2f',
        cmap='Blues',
        square=True,
        linewidths=0.5,
        cbar_kws={'label': 'Jaccard Similarity'},
        ax=ax
    )
    
    ax.set_title(f'Model Coverage Overlap (Jaccard Similarity){title_suffix}\n'
                 f'Lower values = Higher complementarity',
                 fontsize=14, fontweight='bold', pad=20)
    ax.set_xlabel('Model', fontsize=12, fontweight='bold')
    ax.set_ylabel('Model', fontsize=12, fontweight='bold')
    
    plt.xticks(rotation=45, ha='right')
    plt.yticks(rotation=0)
    plt.tight_layout()
    plt.savefig(output_path, dpi=200, bbox_inches='tight')
    plt.close()
    print(f"  ✓ Saved: {output_path.name}")

def create_union_coverage_heatmap(union_df: pd.DataFrame, output_path: Path, title_suffix: str = ""):
    """Create heatmap visualization of union coverage."""
    fig, ax = plt.subplots(figsize=(12, 10))
    
    # Create mask for diagonal (single model coverage)
    mask = np.eye(len(union_df), dtype=bool)
    
    # Convert to percentages for display
    union_pct = union_df * 100
    
    # Plot heatmap
    sns.heatmap(
        union_pct,
        annot=True,
        fmt='.1f',
        cmap='Greens',
        mask=mask,
        square=True,
        linewidths=0.5,
        cbar_kws={'label': 'Union Coverage (%)'},
        ax=ax
    )
    
    ax.set_title(f'Model Pair Union Coverage Matrix{title_suffix}\n'
                 f'Percentage of Problems Solved by At Least One Model in Each Pair',
                 fontsize=14, fontweight='bold', pad=20)
    ax.set_xlabel('Model', fontsize=12, fontweight='bold')
    ax.set_ylabel('Model', fontsize=12, fontweight='bold')
    
    plt.xticks(rotation=45, ha='right')
    plt.yticks(rotation=0)
    plt.tight_layout()
    plt.savefig(output_path, dpi=200, bbox_inches='tight')
    plt.close()
    print(f"  ✓ Saved: {output_path.name}")

def create_top_pairs_visualization(union_df: pd.DataFrame, success_matrix: pd.DataFrame, 
                                   output_path: Path, title_suffix: str = "", top_n: int = 10):
    """Create stacked bar chart visualization of top model pairs by union coverage."""
    # Get upper triangle (avoid duplicates)
    union_triu = union_df.where(
        np.triu(np.ones(union_df.shape), k=1).astype(bool)
    )
    
    # Get top pairs
    top_pairs = union_triu.stack().nlargest(top_n)
    
    # Prepare data for stacked bars
    pair_names = []
    both_solve = []  # Problems solved by both
    only_model1 = []  # Problems solved only by model 1
    only_model2 = []  # Problems solved only by model 2
    total_valid = []  # Total valid problems for normalization
    
    for (model1, model2), union_score in top_pairs.items():
        pair_names.append(f"{model1} ↔ {model2}")
        
        # Get success vectors
        vec1 = success_matrix.loc[model1].values
        vec2 = success_matrix.loc[model2].values
        
        # Find valid comparisons
        valid_mask = ~(np.isnan(vec1) | np.isnan(vec2))
        total_valid.append(valid_mask.sum())
        
        if valid_mask.sum() > 0:
            vec1_valid = vec1[valid_mask]
            vec2_valid = vec2[valid_mask]
            
            # Count breakdown
            both_count = ((vec1_valid == 1) & (vec2_valid == 1)).sum()
            only1_count = ((vec1_valid == 1) & (vec2_valid == 0)).sum()
            only2_count = ((vec1_valid == 0) & (vec2_valid == 1)).sum()
            
            # Convert to percentages
            n_valid = valid_mask.sum()
            both_solve.append(both_count / n_valid * 100)
            only_model1.append(only1_count / n_valid * 100)
            only_model2.append(only2_count / n_valid * 100)
        else:
            both_solve.append(0)
            only_model1.append(0)
            only_model2.append(0)
    
    # Create figure
    fig, ax = plt.subplots(figsize=(14, 8))
    
    # Create stacked horizontal bars
    y_pos = np.arange(len(pair_names))
    
    # Stack: both (bottom), only_model1 (middle), only_model2 (top)
    bars1 = ax.barh(y_pos, both_solve, label='Solved by Both Models', color='#2ecc71', alpha=0.8)
    bars2 = ax.barh(y_pos, only_model1, left=both_solve, label='Solved Only by First Model', color='#3498db', alpha=0.8)
    bars3 = ax.barh(y_pos, only_model2, left=np.array(both_solve) + np.array(only_model1), 
                     label='Solved Only by Second Model', color='#e74c3c', alpha=0.8)
    
    # Add total value labels on bars
    total_values = np.array(both_solve) + np.array(only_model1) + np.array(only_model2)
    for i, (total_val, n_valid) in enumerate(zip(total_values, total_valid)):
        if total_val > 0:
            ax.text(total_val + 1, i, f'{total_val:.1f}%', 
                    va='center', fontsize=9, fontweight='bold')
    
    # Customize axes
    ax.set_yticks(y_pos)
    ax.set_yticklabels(pair_names, fontsize=10)
    ax.set_xlabel('Total Coverage (%)', fontsize=12, fontweight='bold')
    ax.set_title(f' Model Pairs Union Coverage Analysis{title_suffix}\n'
                 f'',
                 fontsize=14, fontweight='bold', pad=20)
    
    # Set x-axis limits
    max_val = max(total_values) if len(total_values) > 0 else 100
    ax.set_xlim(0, min(105, max_val * 1.15))
    
    # Add grid
    ax.grid(axis='x', alpha=0.3, linestyle='--')
    ax.set_axisbelow(True)
    
    # Add legend at bottom, horizontally
    ax.legend(loc='upper center', bbox_to_anchor=(0.5, -0.15), ncol=3, 
              fontsize=10, framealpha=0.9, fancybox=True, shadow=True)
    
    # Invert y-axis to show best at top
    ax.invert_yaxis()
    
    plt.tight_layout()
    plt.savefig(output_path, dpi=200, bbox_inches='tight')
    plt.close()
    print(f"  ✓ Saved: {output_path.name}")

def main():
    """Main execution function."""
    script_dir = Path(__file__).parent
    
    # List of obfuscation types
    obfuscation_types = [
        'dead_code',
        'encryption',
        'variable_renaming',
        'with_comments',
        'without_comments'
    ]
    
    print("="*80)
    print("Computing Model Complementarity")
    print("="*80)
    
    for obf_type in obfuscation_types:
        print(f"\nProcessing: {obf_type}")
        print("-" * 80)
        
        csv_file = script_dir / f"model_problem_scores_{obf_type}.csv"
        
        if not csv_file.exists():
            print(f"  ⚠ Warning: File not found: {csv_file}")
            continue
        
        # Load data
        print("  Loading data...")
        df, success_matrix = load_and_prepare_data(csv_file, threshold=0.5)
        
        # Compute metrics
        print("  Computing complementarity metrics...")
        complementarity_df = compute_pairwise_complementarity(success_matrix)
        overlap_df = compute_coverage_overlap(success_matrix)
        union_df = compute_union_coverage(success_matrix)
        
        # Save CSV files (complementarity and union coverage as percentage)
        print("  Saving CSV files...")
        # Save complementarity as percentage
        (complementarity_df * 100).to_csv(script_dir / f"complementarity_{obf_type}.csv")
        overlap_df.to_csv(script_dir / f"coverage_overlap_{obf_type}.csv")
        # Save union coverage as percentage
        (union_df * 100).to_csv(script_dir / f"union_coverage_{obf_type}.csv")
        print(f"  ✓ Saved CSV files")
        
        # Create visualizations
        print("  Creating visualizations...")
        title_suffix = f": {obf_type.replace('_', ' ').title()}"
        
        create_complementarity_heatmap(
            complementarity_df,
            script_dir / f"complementarity_heatmap_{obf_type}.png",
            title_suffix
        )
        
        create_coverage_overlap_heatmap(
            overlap_df,
            script_dir / f"coverage_overlap_heatmap_{obf_type}.png",
            title_suffix
        )
        
        create_union_coverage_heatmap(
            union_df,
            script_dir / f"union_coverage_heatmap_{obf_type}.png",
            title_suffix
        )
        
        # Create top pairs visualization (stacked bars)
        create_top_pairs_visualization(
            union_df,
            success_matrix,
            script_dir / f"top_pairs_coverage_{obf_type}.png",
            title_suffix,
            top_n=15
        )
        
        # Print top pairs by union coverage
        print("\n  Top 10 Paires avec Couverture Maximale:")
        union_triu = union_df.where(
            np.triu(np.ones(union_df.shape), k=1).astype(bool)
        )
        top_pairs = union_triu.stack().nlargest(10)
        for rank, ((model1, model2), score) in enumerate(top_pairs.items(), 1):
            print(f"    {rank}. {model1} ↔ {model2}: {score*100:.1f}%")
        
        # Print top complementary pairs
        print("\n  Top 5 Paires les Plus Complémentaires:")
        comp_triu = complementarity_df.where(
            np.triu(np.ones(complementarity_df.shape), k=1).astype(bool)
        )
        top_comp = comp_triu.stack().nlargest(5)
        for (model1, model2), score in top_comp.items():
            print(f"    {model1} ↔ {model2}: {score*100:.1f}%")
    
    print("\n" + "="*80)
    print("All complementarity analyses complete!")
    print("="*80)

if __name__ == "__main__":
    main()
