#!/usr/bin/env python3
"""
Pairwise Semantic Similarity Calculator

Computes pairwise semantic similarity across code transformations:
1. Loads descriptions from 6 sources per model (original + 5 transformations)
2. Compares all 15 unique pairs per problem
3. Two LLM scores per pair: score1_llm (GPT-4o) and score2_llm (GPT-3.5-turbo)
4. Average of the two LLM scores (avg_llm_score)
5. One transformer score per pair (Sentence Transformers, computed once per unique text pair)
6. Reports results as JSON and CSV
"""

import json
import os
import openai
from pathlib import Path
from typing import Dict, List, Tuple, Optional
from tqdm import tqdm
import time
import logging
from collections import defaultdict
import pandas as pd
import numpy as np
from concurrent.futures import ThreadPoolExecutor, as_completed
from threading import Lock
import torch
from sentence_transformers import SentenceTransformer

# Set up logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger(__name__)

class PairwiseSimilarityCalculator:
    """Calculate pairwise semantic similarity across code transformations."""
    
    # Transformation file name mappings
    TRANSFORMATION_FILES = {
        'original_description': None,  # Special: loaded from problem_descriptions_2.0/*.txt
        'with_comments': ['Dataset_With_Comments_Description.json', 'Data_With_Comments_Description.json'],
        'without_comments': ['Dataset_Without_Comments_Description.json', 'Data_Without_Comments_Description.json'],
        'variable_renaming': ['Variable_Renaming_Description.json'],
        'dead_code': ['Dataset_DeadCode_Description.json', 'DeadCode_injection_Description.json'],
        'encryption': ['Dataset_Encryption_Description.json']
    }
    
    # All 15 unique pairs (C(6,2) = 15)
    PAIRS = [
        ('original_description', 'with_comments'),
        ('original_description', 'without_comments'),
        ('original_description', 'variable_renaming'),
        ('original_description', 'dead_code'),
        ('original_description', 'encryption'),
        ('with_comments', 'without_comments'),
        ('with_comments', 'variable_renaming'),
        ('with_comments', 'dead_code'),
        ('with_comments', 'encryption'),
        ('without_comments', 'variable_renaming'),
        ('without_comments', 'dead_code'),
        ('without_comments', 'encryption'),
        ('variable_renaming', 'dead_code'),
        ('variable_renaming', 'encryption'),
        ('dead_code', 'encryption')
    ]
    
    def __init__(self, openai_api_key: Optional[str] = None, max_retries: int = 3, retry_delay: float = 1.0,
                 max_workers: int = 10, st_model_name: str = "all-MiniLM-L12-v2"):
        """Initialize the calculator.
        
        Args:
            openai_api_key: OpenAI API key
            max_retries: Maximum retries for API calls
            retry_delay: Delay between retries
            max_workers: Maximum number of worker threads
            st_model_name: Sentence Transformers model name
        """
        self.max_retries = max_retries
        self.retry_delay = retry_delay
        self.max_workers = max_workers
        self.lock = Lock()
        
        # Initialize OpenAI client
        api_key = openai_api_key or os.getenv('OPENAI_API_KEY')
        if not api_key:
            raise ValueError("OpenAI API key is required. Set OPENAI_API_KEY environment variable.")
        
        self.client = openai.OpenAI(api_key=api_key)
        logger.info("OpenAI client initialized")
        
        # Initialize Sentence Transformers model
        self.device = 'cuda' if torch.cuda.is_available() else 'cpu'
        try:
            self.st_model = SentenceTransformer(st_model_name, device=self.device)
            logger.info(f"Sentence Transformers model '{st_model_name}' loaded on {self.device}")
        except Exception as e:
            logger.warning(f"Failed to load Sentence Transformers model: {e}")
            self.st_model = None
        
        # Cache for transformer scores: each (desc1, desc2) pair gets ST score computed only once
        self._st_score_cache: Dict[Tuple[str, str], float] = {}
    
    def find_transformation_file(self, model_dir: Path, transformation: str) -> Optional[Path]:
        """Find the transformation file in the model directory."""
        for filename in self.TRANSFORMATION_FILES[transformation]:
            filepath = model_dir / filename
            if filepath.exists():
                return filepath
        return None
    
    def load_model_data(self, model_dir: Path, base_dir: Path) -> Dict[str, Dict[str, str]]:
        """Load all transformation data for a model.
        
        Args:
            model_dir: Model directory path
            base_dir: Base directory (for finding problem_descriptions_2.0)
        
        Returns:
            {problem_id: {transformation: description}}
        """
        data = defaultdict(dict)
        
        # First, load original descriptions from problem_descriptions_2.0/
        original_desc_dir = base_dir / 'problem_descriptions_2.0'
        if original_desc_dir.exists():
            logger.info(f"Loading original descriptions from {original_desc_dir}...")
            for txt_file in original_desc_dir.glob('*.txt'):
                problem_id = txt_file.stem  # e.g., 'p03000' from 'p03000.txt'
                try:
                    with open(txt_file, 'r', encoding='utf-8') as f:
                        original_desc = f.read().strip()
                    if original_desc:
                        data[problem_id]['original_description'] = original_desc
                except Exception as e:
                    logger.warning(f"Error loading {txt_file}: {e}")
        
        # Then load transformation descriptions from JSON files
        for transformation in self.TRANSFORMATION_FILES.keys():
            if transformation == 'original_description':
                continue  # Already loaded above
            
            filepath = self.find_transformation_file(model_dir, transformation)
            if not filepath:
                logger.warning(f"Could not find {transformation} file in {model_dir}")
                continue
            
            logger.info(f"Loading {filepath.name}...")
            with open(filepath, 'r', encoding='utf-8') as f:
                entries = json.load(f)
            
            for entry in entries:
                problem_id = entry.get('Sub Directory', '')
                description = entry.get('Description_Simple', '')
                
                if problem_id and description:
                    data[problem_id][transformation] = description
        
        logger.info(f"Loaded {len(data)} problems for model {model_dir.name}")
        return dict(data)
    
    def extract_score(self, text: str) -> Optional[float]:
        """Extract a float score from text."""
        import re
        patterns = [
            r'\b(0\.\d+|1\.0|1)\b',
            r'\b(\d+\.\d+)\b',
            r'(\d+)'
        ]
        
        for pattern in patterns:
            matches = re.findall(pattern, text)
            if matches:
                try:
                    score = float(matches[0])
                    if 0.0 <= score <= 1.0:
                        return score
                    elif score > 1.0 and score <= 10.0:
                        return score / 10.0
                except ValueError:
                    continue
        
        return None
    
    def score_similarity_gpt4o(self, desc1: str, desc2: str) -> Optional[float]:
        """Get similarity score from GPT-4o (score1_llm)."""
        prompt = f"""Rate the semantic similarity between these two code descriptions on a scale of 0.0 to 1.0, where:
- 1.0 = Descriptions are semantically identical (same meaning)
- 0.5 = Descriptions are moderately similar (related but different details)
- 0.0 = Descriptions are completely different (unrelated meanings)

Description 1: {desc1}

Description 2: {desc2}

Provide only a number between 0.0 and 1.0:"""
        
        for attempt in range(self.max_retries):
            try:
                response = self.client.chat.completions.create(
                    model="gpt-3.5-turbo",
                    messages=[{"role": "user", "content": prompt}],
                    max_tokens=10,
                    temperature=0.3
                )
                
                score_text = response.choices[0].message.content.strip()
                score = self.extract_score(score_text)
                
                if score is not None:
                    return score
                else:
                    logger.warning(f"GPT-4o returned invalid score: {score_text}")
                    
            except Exception as e:
                logger.warning(f"GPT-4o API call failed (attempt {attempt + 1}): {e}")
                if attempt < self.max_retries - 1:
                    time.sleep(self.retry_delay * (attempt + 1))
        
        return None
    
    def score_similarity_gpt35(self, desc1: str, desc2: str) -> Optional[float]:
        """Get similarity score from GPT-3.5-turbo (score2_llm)."""
        prompt = f"""Rate the semantic similarity between these two code descriptions on a scale of 0.0 to 1.0, where:
- 1.0 = Descriptions are semantically identical (same meaning)
- 0.5 = Descriptions are moderately similar (related but different details)
- 0.0 = Descriptions are completely different (unrelated meanings)

Description 1: {desc1}

Description 2: {desc2}

Provide only a number between 0.0 and 1.0:"""
        
        for attempt in range(self.max_retries):
            try:
                response = self.client.chat.completions.create(
                    model="gpt-3.5-turbo",
                    messages=[{"role": "user", "content": prompt}],
                    max_tokens=10,
                    temperature=0.3
                )
                
                score_text = response.choices[0].message.content.strip()
                score = self.extract_score(score_text)
                
                if score is not None:
                    return score
                else:
                    logger.warning(f"GPT-3.5-turbo returned invalid score: {score_text}")
                    
            except Exception as e:
                logger.warning(f"GPT-3.5-turbo API call failed (attempt {attempt + 1}): {e}")
                if attempt < self.max_retries - 1:
                    time.sleep(self.retry_delay * (attempt + 1))
        
        return None
    
    def score_similarity_st(self, desc1: str, desc2: str) -> float:
        """Get similarity score from Sentence Transformers. Computed once per unique (desc1, desc2)."""
        if not self.st_model or not desc1 or not desc2:
            return 0.0
        
        # Cache key: same pair in either order gives same similarity
        key = (desc1, desc2) if desc1 <= desc2 else (desc2, desc1)
        with self.lock:
            if key in self._st_score_cache:
                return self._st_score_cache[key]
        
        try:
            embeddings = self.st_model.encode([desc1, desc2], convert_to_tensor=True, show_progress_bar=False)
            similarity = torch.cosine_similarity(embeddings[0:1], embeddings[1:2], dim=1)
            score = float(similarity.cpu().numpy()[0])
            with self.lock:
                self._st_score_cache[key] = score
            return score
        except Exception as e:
            logger.warning(f"Error computing ST similarity: {e}")
            return 0.0
    
    def score_pair_similarity(self, desc1: str, desc2: str) -> Dict:
        """Get two LLM scores and one transformer score for a pair.
        
        Returns:
            Dictionary with score1_llm (GPT-4o), score2_llm (GPT-3.5-turbo), avg_llm_score, and st_score
        """
        # Get both LLM scores in parallel
        with ThreadPoolExecutor(max_workers=2) as executor:
            future_gpt4o = executor.submit(self.score_similarity_gpt4o, desc1, desc2)
            future_gpt35 = executor.submit(self.score_similarity_gpt35, desc1, desc2)
            
            score1_llm = future_gpt4o.result()  # GPT-4o
            score2_llm = future_gpt35.result()  # GPT-3.5-turbo
        
        # Calculate average of the two LLM scores
        avg_llm_score = None
        if score1_llm is not None and score2_llm is not None:
            avg_llm_score = (score1_llm + score2_llm) / 2.0
        
        # One transformer score (cached per unique text pair)
        st_score = self.score_similarity_st(desc1, desc2)
        
        return {
            'score1_llm': score1_llm,      # GPT-4o
            'score2_llm': score2_llm,      # GPT-3.5-turbo
            'avg_llm_score': avg_llm_score,  # Average of score1_llm and score2_llm
            'st_score': st_score          # Sentence Transformers (computed once per unique pair)
        }
    
    def score_similarity_batch(self, pairs: List[Tuple[str, str, int]]) -> List[Dict]:
        """Score multiple pairs in parallel.
        
        Args:
            pairs: List of (desc1, desc2, index) tuples
        
        Returns:
            List of similarity dictionaries in same order as input
        """
        results = [None] * len(pairs)
        
        def process_pair(pair_data):
            desc1, desc2, idx = pair_data
            try:
                return (idx, self.score_pair_similarity(desc1, desc2))
            except Exception as e:
                logger.warning(f"Error processing pair {idx}: {e}")
                return (idx, {'score1_llm': None, 'score2_llm': None, 'avg_llm_score': None, 'st_score': 0.0})
        
        # Process in parallel (pairs are (desc1, desc2, idx))
        with ThreadPoolExecutor(max_workers=self.max_workers) as executor:
            futures = {executor.submit(process_pair, (desc1, desc2, idx)): idx
                      for desc1, desc2, idx in pairs}
            
            for future in as_completed(futures):
                try:
                    idx, result = future.result()
                    results[idx] = result
                except Exception as e:
                    idx = futures[future]
                    logger.warning(f"Failed to get result for pair {idx}: {e}")
                    results[idx] = {'score1_llm': None, 'score2_llm': None, 'avg_llm_score': None, 'st_score': 0.0}
        
        return results
    
    def calculate_problem_similarity(self, problem_id: str, problem_data: Dict[str, str]) -> Dict:
        """Calculate pairwise similarity for a single problem.
        
        Returns:
            Dictionary with pairwise similarity results
        """
        # Check if we have all 5 transformations
        required_transforms = set(self.TRANSFORMATION_FILES.keys())
        available_transforms = set(problem_data.keys())
        
        if required_transforms != available_transforms:
            missing = required_transforms - available_transforms
            logger.warning(f"Problem {problem_id}: Missing transformations: {missing}")
            return None
        
        # Prepare all pairs for batch processing
        pairs_to_score = []
        pair_metadata = []
        
        for idx, (transform1, transform2) in enumerate(self.PAIRS):
            desc1 = problem_data.get(transform1, '')
            desc2 = problem_data.get(transform2, '')
            
            if not desc1 or not desc2:
                logger.warning(f"Problem {problem_id}: Missing description for pair ({transform1}, {transform2})")
                continue
            
            pairs_to_score.append((desc1, desc2, idx))
            pair_metadata.append((transform1, transform2))
        
        if len(pairs_to_score) != 15:
            logger.warning(f"Problem {problem_id}: Expected 15 pairs, got {len(pairs_to_score)}")
            return None
        
        # Score all pairs in batch
        pair_scores = self.score_similarity_batch(pairs_to_score)
        
        # Process results
        pair_results = []
        for idx, ((transform1, transform2), scores) in enumerate(zip(pair_metadata, pair_scores)):
            pair_results.append({
                'transform1': transform1,
                'transform2': transform2,
                'score1_llm': scores['score1_llm'],      # GPT-4o
                'score2_llm': scores['score2_llm'],      # GPT-3.5-turbo
                'avg_llm_score': scores['avg_llm_score'],  # Average of score1_llm and score2_llm
                'st_score': scores['st_score']          # Sentence Transformers (computed once per unique pair)
            })
        
        return {
            'problem_id': problem_id,
            'pair_results': pair_results
        }
    
    def process_model(self, model_dir: Path) -> Dict:
        """Process a single model and calculate pairwise similarities.
        
        Returns:
            Dictionary with all results for the model
        """
        logger.info(f"\n{'='*60}")
        logger.info(f"Processing model: {model_dir.name}")
        logger.info(f"{'='*60}")
        
        # Load data (need base_dir for original descriptions)
        base_dir = model_dir.parent.parent  # Go up from GENERATION_Datasets/Dataset_X to combined_dataset
        model_data = self.load_model_data(model_dir, base_dir)
        
        if not model_data:
            logger.error(f"No data loaded for {model_dir.name}")
            return None
        
        # Process problems in parallel batches
        problem_results = []
        problem_items = list(model_data.items())
        
        def process_single_problem(problem_item):
            problem_id, problem_data = problem_item
            try:
                return self.calculate_problem_similarity(problem_id, problem_data)
            except Exception as e:
                logger.warning(f"Error processing problem {problem_id}: {e}")
                return None
        
        # Process in batches with parallel workers
        total_problems = len(problem_items)
        logger.info(f"Processing {total_problems} problems with {self.max_workers} workers...")
        
        with ThreadPoolExecutor(max_workers=self.max_workers) as executor:
            future_to_problem = {
                executor.submit(process_single_problem, item): item[0] 
                for item in problem_items
            }
            
            with tqdm(total=total_problems, desc=f"Processing {model_dir.name}") as pbar:
                for future in as_completed(future_to_problem):
                    problem_id = future_to_problem[future]
                    try:
                        result = future.result()
                        if result:
                            problem_results.append(result)
                    except Exception as e:
                        logger.warning(f"Failed to get result for problem {problem_id}: {e}")
                    finally:
                        pbar.update(1)
        
        if not problem_results:
            logger.error(f"No valid results for {model_dir.name}")
            return None
        
        return {
            'model_name': model_dir.name,
            'total_problems': len(problem_results),
            'problem_results': problem_results
        }
    
    def process_model_test(self, model_dir: Path, max_problems: int = 2) -> Dict:
        """Process a single model in test mode (limited problems).
        
        Args:
            model_dir: Model directory path
            max_problems: Maximum number of problems to process
        
        Returns:
            Dictionary with all results for the model
        """
        logger.info(f"\n{'='*60}")
        logger.info(f"🧪 TEST MODE: Processing model: {model_dir.name} (max {max_problems} problems)")
        logger.info(f"{'='*60}")
        
        # Load data (need base_dir for original descriptions)
        base_dir = model_dir.parent.parent  # Go up from GENERATION_Datasets/Dataset_X to combined_dataset
        model_data = self.load_model_data(model_dir, base_dir)
        
        if not model_data:
            logger.error(f"No data loaded for {model_dir.name}")
            return None
        
        # Limit to max_problems for testing
        problem_items = list(model_data.items())[:max_problems]
        logger.info(f"🧪 TEST MODE: Processing {len(problem_items)} problems (limited from {len(model_data)})")
        
        # Process problems in parallel batches
        problem_results = []
        
        def process_single_problem(problem_item):
            problem_id, problem_data = problem_item
            try:
                return self.calculate_problem_similarity(problem_id, problem_data)
            except Exception as e:
                logger.warning(f"Error processing problem {problem_id}: {e}")
                return None
        
        # Process in batches with parallel workers
        total_problems = len(problem_items)
        logger.info(f"Processing {total_problems} problems with {self.max_workers} workers...")
        
        with ThreadPoolExecutor(max_workers=self.max_workers) as executor:
            future_to_problem = {
                executor.submit(process_single_problem, item): item[0] 
                for item in problem_items
            }
            
            with tqdm(total=total_problems, desc=f"🧪 TEST {model_dir.name}") as pbar:
                for future in as_completed(future_to_problem):
                    problem_id = future_to_problem[future]
                    try:
                        result = future.result()
                        if result:
                            problem_results.append(result)
                    except Exception as e:
                        logger.warning(f"Failed to get result for problem {problem_id}: {e}")
                    finally:
                        pbar.update(1)
        
        if not problem_results:
            logger.error(f"No valid results for {model_dir.name}")
            return None
        
        logger.info(f"🧪 TEST MODE: Successfully processed {len(problem_results)} problems")
        return {
            'model_name': model_dir.name,
            'total_problems': len(problem_results),
            'problem_results': problem_results
        }
    
    def save_results(self, all_results: List[Dict], output_dir: Path):
        """Save pairwise similarity results as JSON and CSV."""
        output_dir.mkdir(parents=True, exist_ok=True)
        
        # Build JSON structure
        pairwise_json = []
        pairwise_rows = []
        
        for result in all_results:
            if not result:
                continue
            model_name = result['model_name']
            problems_list = []
            
            for prob_result in result.get('problem_results', []):
                problem_id = prob_result['problem_id']
                pairs_list = []
                
                for pair_result in prob_result.get('pair_results', []):
                    pairs_list.append({
                        'transform1': pair_result['transform1'],
                        'transform2': pair_result['transform2'],
                        'score1_llm': pair_result['score1_llm'],      # GPT-4o
                        'score2_llm': pair_result['score2_llm'],      # GPT-3.5-turbo
                        'avg_llm_score': pair_result['avg_llm_score'],  # Average of score1_llm and score2_llm
                        'st_score': pair_result['st_score']          # Sentence Transformers (once per unique pair)
                    })
                    pairwise_rows.append({
                        'model': model_name,
                        'problem_id': problem_id,
                        'transform1': pair_result['transform1'],
                        'transform2': pair_result['transform2'],
                        'score1_llm': pair_result['score1_llm'],
                        'score2_llm': pair_result['score2_llm'],
                        'avg_llm_score': pair_result['avg_llm_score'],
                        'st_score': pair_result['st_score']
                    })
                problems_list.append({'problem_id': problem_id, 'pairs': pairs_list})
            pairwise_json.append({'model': model_name, 'problems': problems_list})
        
        # Save JSON
        json_path = output_dir / 'pairwise_similarity.json'
        with open(json_path, 'w', encoding='utf-8') as f:
            json.dump(pairwise_json, f, indent=2)
        logger.info(f"Saved pairwise similarity to {json_path}")
        
        # Save CSV
        df_pairwise = pd.DataFrame(pairwise_rows)
        csv_path = output_dir / 'pairwise_similarity.csv'
        df_pairwise.to_csv(csv_path, index=False)
        logger.info(f"Saved pairwise similarity to {csv_path}")
        
        logger.info(f"\n{'='*60}")
        logger.info(f"All results saved to: {output_dir}")
        logger.info(f"{'='*60}")

    def merge_single_model_into_results(self, single_result: Dict, output_dir: Path) -> None:
        """Merge one model's results into existing pairwise_similarity.json and .csv.
        If the model already exists, replace it; otherwise append.
        """
        output_dir = Path(output_dir)
        json_path = output_dir / 'pairwise_similarity.json'
        csv_path = output_dir / 'pairwise_similarity.csv'
        model_name = single_result['model_name']

        # Build the one-model JSON entry and CSV rows (same format as save_results)
        problems_list = []
        pairwise_rows = []
        for prob_result in single_result.get('problem_results', []):
            problem_id = prob_result['problem_id']
            pairs_list = []
            for pair_result in prob_result.get('pair_results', []):
                pairs_list.append({
                    'transform1': pair_result['transform1'],
                    'transform2': pair_result['transform2'],
                    'score1_llm': pair_result['score1_llm'],
                    'score2_llm': pair_result['score2_llm'],
                    'avg_llm_score': pair_result['avg_llm_score'],
                    'st_score': pair_result['st_score']
                })
                pairwise_rows.append({
                    'model': model_name,
                    'problem_id': problem_id,
                    'transform1': pair_result['transform1'],
                    'transform2': pair_result['transform2'],
                    'score1_llm': pair_result['score1_llm'],
                    'score2_llm': pair_result['score2_llm'],
                    'avg_llm_score': pair_result['avg_llm_score'],
                    'st_score': pair_result['st_score']
                })
            problems_list.append({'problem_id': problem_id, 'pairs': pairs_list})
        new_entry = {'model': model_name, 'problems': problems_list}

        # Merge JSON
        if json_path.exists():
            with open(json_path, 'r', encoding='utf-8') as f:
                pairwise_json = json.load(f)
            # Replace existing entry for this model or append
            existing_indices = [i for i, e in enumerate(pairwise_json) if e.get('model') == model_name]
            for i in reversed(existing_indices):
                pairwise_json.pop(i)
            pairwise_json.append(new_entry)
            # Keep sort order by model name (optional but tidy)
            pairwise_json.sort(key=lambda e: e.get('model', ''))
        else:
            pairwise_json = [new_entry]

        with open(json_path, 'w', encoding='utf-8') as f:
            json.dump(pairwise_json, f, indent=2)
        logger.info(f"Merged and saved pairwise similarity to {json_path}")

        # Merge CSV
        if csv_path.exists():
            df_existing = pd.read_csv(csv_path)
            df_existing = df_existing[df_existing['model'] != model_name]
            df_new = pd.DataFrame(pairwise_rows)
            df_merged = pd.concat([df_existing, df_new], ignore_index=True)
        else:
            df_merged = pd.DataFrame(pairwise_rows)
        df_merged.to_csv(csv_path, index=False)
        logger.info(f"Merged and saved pairwise similarity to {csv_path}")
        logger.info(f"Single-model merge complete for: {model_name}")


def main(test_mode: bool = False, test_models: int = 1, test_problems: int = 2, only_model: Optional[str] = None):
    """Main execution function.

    Args:
        test_mode: If True, process only a small subset for testing
        test_models: Number of models to process in test mode (default: 1)
        test_problems: Number of problems per model in test mode (default: 2)
        only_model: If set, process only this model directory (e.g. Llama70b_Generation) and merge into existing JSON/CSV
    """
    # Paths
    base_dir = Path(__file__).parent.parent.parent  # Go up to combined_dataset
    generation_dir = base_dir / 'GENERATION_Datasets'
    output_dir = Path(__file__).parent  # Semantic_Consistency directory

    # Get all model directories
    model_dirs = [d for d in generation_dir.iterdir() if d.is_dir()]
    model_dirs.sort()

    if only_model:
        model_dirs = [d for d in model_dirs if d.name == only_model]
        if not model_dirs:
            logger.error(f"Model directory not found: {only_model}. Available: {[d.name for d in generation_dir.iterdir() if d.is_dir()]}")
            return
        logger.info(f"Single-model mode: processing only {only_model}")
    elif test_mode:
        logger.info(f"🧪 TEST MODE: Processing {test_models} model(s) with {test_problems} problem(s) each")
        model_dirs = model_dirs[:test_models]
        output_dir = output_dir / 'test_output'  # Save to separate test directory
    else:
        logger.info(f"Found {len(model_dirs)} models to process (FULL RUN)")

    # Initialize calculator
    calculator = PairwiseSimilarityCalculator(max_workers=10)

    # Process models
    all_results = []

    for model_dir in model_dirs:
        try:
            if test_mode:
                # Process only test_problems problems
                result = calculator.process_model_test(model_dir, test_problems)
            else:
                result = calculator.process_model(model_dir)

            if result:
                all_results.append(result)
        except Exception as e:
            logger.error(f"Error processing {model_dir.name}: {e}", exc_info=True)
            if not only_model:
                all_results.append(None)

    if only_model:
        # Merge single model into existing results
        if all_results:
            calculator.merge_single_model_into_results(all_results[0], output_dir)
        else:
            logger.error("No results to merge for single-model run.")
        logger.info("\n" + "="*60)
        logger.info("Single-model run and merge complete!")
        logger.info("="*60)
        return

    # Save results (full run or test run)
    calculator.save_results(all_results, output_dir)

    logger.info("\n" + "="*60)
    if test_mode:
        logger.info("🧪 TEST MODE: Pairwise Similarity Calculation Complete!")
        logger.info(f"Results saved to: {output_dir}")
    else:
        logger.info("Pairwise Similarity Calculation Complete!")
    logger.info("="*60)


if __name__ == '__main__':
    import sys

    # Check for test mode flag
    test_mode = '--test' in sys.argv or '-t' in sys.argv

    # Parse --model / --only-model (single-model run and merge)
    only_model = None
    for flag in ('--model', '--only-model'):
        if flag in sys.argv:
            idx = sys.argv.index(flag)
            if idx + 1 < len(sys.argv):
                only_model = sys.argv[idx + 1].strip()
            break

    # Parse test parameters
    test_models = 1
    test_problems = 2

    if '--test-models' in sys.argv:
        idx = sys.argv.index('--test-models')
        if idx + 1 < len(sys.argv):
            test_models = int(sys.argv[idx + 1])

    if '--test-problems' in sys.argv:
        idx = sys.argv.index('--test-problems')
        if idx + 1 < len(sys.argv):
            test_problems = int(sys.argv[idx + 1])

    main(test_mode=test_mode, test_models=test_models, test_problems=test_problems, only_model=only_model)
