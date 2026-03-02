#!/usr/bin/env python3
"""
Extract average LLM scores per model, per problem, per obfuscation type.

For each of the 5 obfuscation types, creates a CSV with:
- 13 rows (models)
- 250 columns (problems)
- Values: average avg_llm_score from all pairs involving that obfuscation type
"""

import json
import csv
from pathlib import Path
from collections import defaultdict
from typing import Dict, List, Set
import logging

logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger(__name__)

# The 5 obfuscation types
OBFUSCATION_TYPES = [
    "with_comments",
    "without_comments",
    "variable_renaming",
    "dead_code",
    "encryption"
]

def load_pairwise_data(json_path: Path) -> List[Dict]:
    """Load the pairwise similarity JSON file."""
    logger.info(f"Loading data from {json_path}")
    with open(json_path, 'r', encoding='utf-8') as f:
        data = json.load(f)
    logger.info(f"Loaded {len(data)} models")
    return data

def extract_scores_by_obfuscation(data: List[Dict]) -> Dict[str, Dict[str, Dict[str, List[float]]]]:
    """
    Extract scores organized by obfuscation type, model, and problem.
    
    Returns:
        {
            obfuscation_type: {
                model: {
                    problem_id: [scores...]
                }
            }
        }
    """
    # Structure: obfuscation_type -> model -> problem_id -> list of scores
    scores_by_obfuscation = {obf: defaultdict(lambda: defaultdict(list)) for obf in OBFUSCATION_TYPES}
    
    for model_data in data:
        model_name = model_data["model"]
        logger.info(f"Processing {model_name}")
        
        for problem_data in model_data["problems"]:
            problem_id = problem_data["problem_id"]
            
            for pair in problem_data["pairs"]:
                transform1 = pair["transform1"]
                transform2 = pair["transform2"]
                avg_score = pair.get("avg_llm_score")
                
                # Skip if score is None
                if avg_score is None:
                    continue
                
                # Check if each obfuscation type appears in this pair
                for obf_type in OBFUSCATION_TYPES:
                    if transform1 == obf_type or transform2 == obf_type:
                        scores_by_obfuscation[obf_type][model_name][problem_id].append(avg_score)
    
    return scores_by_obfuscation

def get_all_models_and_problems(data: List[Dict]) -> tuple[List[str], List[str]]:
    """Extract all unique models and problems, maintaining order."""
    models = []
    problems_set = set()
    
    for model_data in data:
        model_name = model_data["model"]
        if model_name not in models:
            models.append(model_name)
        
        for problem_data in model_data["problems"]:
            problems_set.add(problem_data["problem_id"])
    
    # Sort problems for consistent ordering
    problems = sorted(list(problems_set))
    
    return models, problems

def create_csv_for_obfuscation(
    obfuscation_type: str,
    scores_dict: Dict[str, Dict[str, List[float]]],
    models: List[str],
    problems: List[str],
    output_path: Path
):
    """Create a CSV file for one obfuscation type."""
    logger.info(f"Creating CSV for {obfuscation_type}")
    
    # Create matrix: rows = models, columns = problems
    rows = []
    
    for model in models:
        row = [model]  # First column is model name
        
        for problem_id in problems:
            scores = scores_dict.get(model, {}).get(problem_id, [])
            
            # Filter out None values
            valid_scores = [s for s in scores if s is not None]
            
            if valid_scores:
                # Average the scores
                avg_score = sum(valid_scores) / len(valid_scores)
                row.append(avg_score)
            else:
                # No data for this model-problem combination
                row.append(None)
        
        rows.append(row)
    
    # Write to CSV
    with open(output_path, 'w', newline='', encoding='utf-8') as f:
        writer = csv.writer(f)
        
        # Header row: model, then all problem IDs
        header = ['model'] + problems
        writer.writerow(header)
        
        # Data rows
        for row in rows:
            writer.writerow(row)
    
    logger.info(f"Created {output_path} with {len(rows)} rows and {len(problems)} columns")

def main():
    """Main execution function."""
    script_dir = Path(__file__).parent
    json_path = script_dir / "pairwise_similarity.json"
    output_dir = script_dir
    
    if not json_path.exists():
        logger.error(f"File not found: {json_path}")
        return
    
    # Load data
    data = load_pairwise_data(json_path)
    
    # Get all models and problems
    models, problems = get_all_models_and_problems(data)
    logger.info(f"Found {len(models)} models and {len(problems)} problems")
    
    # Extract scores by obfuscation type
    scores_by_obfuscation = extract_scores_by_obfuscation(data)
    
    # Create CSV for each obfuscation type
    for obf_type in OBFUSCATION_TYPES:
        output_filename = f"model_problem_scores_{obf_type}.csv"
        output_path = output_dir / output_filename
        
        create_csv_for_obfuscation(
            obf_type,
            scores_by_obfuscation[obf_type],
            models,
            problems,
            output_path
        )
    
    logger.info("All CSV files created successfully!")
    
    # Print summary statistics
    print("\n" + "="*80)
    print("Summary Statistics")
    print("="*80)
    for obf_type in OBFUSCATION_TYPES:
        total_scores = 0
        total_combinations = 0
        for model in models:
            for problem in problems:
                scores = scores_by_obfuscation[obf_type][model][problem]
                if scores:
                    total_scores += len(scores)
                    total_combinations += 1
        
        print(f"{obf_type}:")
        print(f"  Total score entries: {total_scores}")
        print(f"  Model-problem combinations with data: {total_combinations}/{len(models) * len(problems)}")
        print()

if __name__ == "__main__":
    main()
