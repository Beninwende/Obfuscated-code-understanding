#!/usr/bin/env python3
"""
LLM Performance Analysis Script
Analyzes LLM performance across different metrics and prompting strategies
"""

import pandas as pd
import numpy as np
import matplotlib
matplotlib.use('Agg')  # Use non-interactive backend
import matplotlib.pyplot as plt
import seaborn as sns
from pathlib import Path

def load_and_analyze_data():
    """Load the detailed performance analysis data and create summary tables"""
    
    # Load the data
    df = pd.read_csv('/Users/lionel.nikiema/Desktop/combined_dataset/Results/detailed_performance_analysis.csv')
    
    print("Dataset Overview:")
    print(f"Total records: {len(df)}")
    print(f"Models: {df['model'].unique()}")
    print(f"Prompt types: {df['prompt_type'].unique()}")
    print(f"Datasets: {df['dataset'].unique()}")
    print("\n" + "="*80 + "\n")
    
    return df

def create_llm_metrics_summary(df):
    """Create summary table for LLM-as-judge metrics by model and prompt type"""
    
    print("LLM-AS-JUDGE METRICS SUMMARY")
    print("="*50)
    
    # Group by model and prompt type, calculate mean LLM scores
    llm_summary = df.groupby(['model', 'prompt_type'])['llm_mean'].agg(['mean', 'std', 'count']).round(4)
    llm_summary.columns = ['LLM_Mean', 'LLM_Std', 'Count']
    
    # Pivot to have models as rows and prompt types as columns
    llm_pivot = df.pivot_table(
        values='llm_mean', 
        index='model', 
        columns='prompt_type', 
        aggfunc='mean'
    ).round(4)
    
    print("\nLLM-as-Judge Performance by Model and Prompt Type:")
    print(llm_pivot)
    
    # Calculate overall model performance
    model_performance = df.groupby('model')['llm_mean'].agg(['mean', 'std', 'min', 'max']).round(4)
    model_performance.columns = ['Overall_Mean', 'Std', 'Min', 'Max']
    model_performance = model_performance.sort_values('Overall_Mean', ascending=False)
    
    print("\nOverall LLM Performance by Model (ranked by mean):")
    print(model_performance)
    
    # Calculate prompt type effectiveness
    prompt_performance = df.groupby('prompt_type')['llm_mean'].agg(['mean', 'std', 'min', 'max']).round(4)
    prompt_performance.columns = ['Overall_Mean', 'Std', 'Min', 'Max']
    prompt_performance = prompt_performance.sort_values('Overall_Mean', ascending=False)
    
    print("\nLLM Performance by Prompt Type (ranked by mean):")
    print(prompt_performance)
    
    return llm_pivot, model_performance, prompt_performance

def create_st_metrics_summary(df):
    """Create summary table for semantic similarity metrics by model and prompt type"""
    
    print("\n\nSEMANTIC SIMILARITY METRICS SUMMARY")
    print("="*50)
    
    # Pivot to have models as rows and prompt types as columns
    st_pivot = df.pivot_table(
        values='st_mean', 
        index='model', 
        columns='prompt_type', 
        aggfunc='mean'
    ).round(4)
    
    print("\nSemantic Similarity Performance by Model and Prompt Type:")
    print(st_pivot)
    
    # Calculate overall model performance
    model_performance_st = df.groupby('model')['st_mean'].agg(['mean', 'std', 'min', 'max']).round(4)
    model_performance_st.columns = ['Overall_Mean', 'Std', 'Min', 'Max']
    model_performance_st = model_performance_st.sort_values('Overall_Mean', ascending=False)
    
    print("\nOverall Semantic Similarity Performance by Model (ranked by mean):")
    print(model_performance_st)
    
    # Calculate prompt type effectiveness
    prompt_performance_st = df.groupby('prompt_type')['st_mean'].agg(['mean', 'std', 'min', 'max']).round(4)
    prompt_performance_st.columns = ['Overall_Mean', 'Std', 'Min', 'Max']
    prompt_performance_st = prompt_performance_st.sort_values('Overall_Mean', ascending=False)
    
    print("\nSemantic Similarity Performance by Prompt Type (ranked by mean):")
    print(prompt_performance_st)
    
    return st_pivot, model_performance_st, prompt_performance_st

def create_combined_analysis(df):
    """Create combined analysis showing both metrics together"""
    
    print("\n\nCOMBINED METRICS ANALYSIS")
    print("="*50)
    
    # Create combined performance table
    combined_performance = df.groupby('model').agg({
        'llm_mean': ['mean', 'std'],
        'st_mean': ['mean', 'std'],
        'combined_score': ['mean', 'std']
    }).round(4)
    
    # Flatten column names
    combined_performance.columns = ['_'.join(col).strip() for col in combined_performance.columns]
    combined_performance = combined_performance.sort_values('llm_mean_mean', ascending=False)
    
    print("\nCombined Performance Analysis by Model:")
    print(combined_performance)
    
    # Correlation analysis
    correlation_matrix = df[['llm_mean', 'st_mean', 'combined_score']].corr()
    print("\nCorrelation Matrix between Metrics:")
    print(correlation_matrix.round(4))
    
    return combined_performance, correlation_matrix

def create_dataset_specific_analysis(df):
    """Analyze performance by dataset type"""
    
    print("\n\nDATASET-SPECIFIC ANALYSIS")
    print("="*50)
    
    # Performance by dataset and model
    dataset_performance = df.groupby(['dataset', 'model']).agg({
        'llm_mean': 'mean',
        'st_mean': 'mean',
        'combined_score': 'mean'
    }).round(4)
    
    print("\nPerformance by Dataset and Model:")
    print(dataset_performance)
    
    # Performance by dataset and prompt type
    prompt_dataset_performance = df.groupby(['dataset', 'prompt_type']).agg({
        'llm_mean': 'mean',
        'st_mean': 'mean',
        'combined_score': 'mean'
    }).round(4)
    
    print("\nPerformance by Dataset and Prompt Type:")
    print(prompt_dataset_performance)
    
    return dataset_performance, prompt_dataset_performance

def save_summary_tables(df, llm_pivot, st_pivot, model_performance, prompt_performance, 
                       model_performance_st, prompt_performance_st, combined_performance):
    """Save all summary tables to CSV files"""
    
    output_dir = Path('/Users/lionel.nikiema/Desktop/combined_dataset/Results')
    
    # Save individual tables
    llm_pivot.to_csv(output_dir / 'llm_performance_by_model_prompt.csv')
    st_pivot.to_csv(output_dir / 'st_performance_by_model_prompt.csv')
    model_performance.to_csv(output_dir / 'llm_model_rankings.csv')
    model_performance_st.to_csv(output_dir / 'st_model_rankings.csv')
    prompt_performance.to_csv(output_dir / 'llm_prompt_rankings.csv')
    prompt_performance_st.to_csv(output_dir / 'st_prompt_rankings.csv')
    combined_performance.to_csv(output_dir / 'combined_model_performance.csv')
    
    print(f"\nSummary tables saved to: {output_dir}")
    print("Files created:")
    print("- llm_performance_by_model_prompt.csv")
    print("- st_performance_by_model_prompt.csv") 
    print("- llm_model_rankings.csv")
    print("- st_model_rankings.csv")
    print("- llm_prompt_rankings.csv")
    print("- st_prompt_rankings.csv")
    print("- combined_model_performance.csv")

def main():
    """Main analysis function"""
    
    # Load data
    df = load_and_analyze_data()
    
    # Create LLM metrics summary
    llm_pivot, model_performance, prompt_performance = create_llm_metrics_summary(df)
    
    # Create ST metrics summary  
    st_pivot, model_performance_st, prompt_performance_st = create_st_metrics_summary(df)
    
    # Create combined analysis
    combined_performance, correlation_matrix = create_combined_analysis(df)
    
    # Create dataset-specific analysis
    dataset_performance, prompt_dataset_performance = create_dataset_specific_analysis(df)
    
    # Save all tables
    save_summary_tables(df, llm_pivot, st_pivot, model_performance, prompt_performance,
                       model_performance_st, prompt_performance_st, combined_performance)
    
    print("\n" + "="*80)
    print("ANALYSIS COMPLETE")
    print("="*80)

if __name__ == "__main__":
    main()
