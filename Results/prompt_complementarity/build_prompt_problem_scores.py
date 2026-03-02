#!/usr/bin/env python3
"""
Build prompt–problem score matrices from model combined_summary CSVs.

For each dataset, loads all model combined_summary_*.csv files and aggregates
by (prompt_type, problem_id): cell = mean over models of LLM_Average_Score.
Output: prompt_problem_scores_{dataset_suffix}.csv (rows = prompt_type, columns = problem_id).
"""

import csv
from pathlib import Path
from collections import defaultdict

RESULTS_DIR = Path(__file__).resolve().parent.parent  # Results/
OUT_DIR = Path(__file__).resolve().parent  # Results/prompt_complementarity/


def get_out_dir():
    """Use PROMPT_COMPLEMENTARITY_OUT env var if set (e.g. /tmp) for sandbox-friendly writes."""
    import os
    p = os.environ.get("PROMPT_COMPLEMENTARITY_OUT")
    return Path(p) if p else OUT_DIR

ALL_MODELS = [
    "codellama_Results", "deepseek-r1_Results", "deepseek-v3.1_Results",
    "Gemini_Results", "GPT3.5_Results", "GPT4o_Results", "llama70B_Results",
    "mistral_Results", "O4-mini_Results", "qwencoder32B_Results",
    "starchat_Results", "starcoder_Results", "Qwen3VL_Results", "LlamaVL_Results",
]

# dataset folder name -> short suffix for filenames (match Semantic_Consistency)
DATASET_SUFFIX = {
    "Dataset_DeadCode_Description": "dead_code",
    "Dataset_Encryption_Description": "encryption",
    "Variable_Renaming_Description": "variable_renaming",
    "Dataset_With_Comments_Description": "with_comments",
    "Dataset_Without_Comments_Description": "without_comments",
    "Data_With_Comments_Description": "with_comments",
    "Data_Without_Comments_Description": "without_comments",
}

ALL_DATASETS = [
    "Dataset_DeadCode_Description",
    "Dataset_Encryption_Description",
    "Dataset_With_Comments_Description",
    "Dataset_Without_Comments_Description",
    "Variable_Renaming_Description",
]


def load_summary_csv(path: Path) -> list[dict]:
    """Load combined_summary CSV; return list of dicts with Sub_Directory, Description_Type, LLM_Average_Score."""
    if not path.exists():
        return []
    rows = []
    with open(path, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for row in reader:
            sid = row.get("Sub_Directory", "").strip()
            dtype = row.get("Description_Type", "").strip()
            score_s = row.get("LLM_Average_Score", "").strip()
            if not sid or not dtype:
                continue
            try:
                score = float(score_s) if score_s and score_s.lower() != "nan" else None
            except ValueError:
                score = None
            rows.append({"problem_id": sid, "prompt_type": dtype, "score": score})
    return rows


def build_prompt_problem_matrix_for_dataset(dataset_name: str) -> tuple[list[str], list[str], list[list[float]]]:
    """
    Aggregate (prompt_type, problem_id) -> mean score over models.
    Returns (prompt_types, problem_ids, matrix as list of rows).
    """
    # (prompt_type, problem_id) -> list of scores (one per model)
    scores_by_key = defaultdict(list)
    problem_ids_set = set()
    prompt_types_set = set()

    for model_dir in ALL_MODELS:
        model_path = RESULTS_DIR / model_dir
        summary_file = model_path / f"combined_summary_{dataset_name}.csv"
        if not summary_file.exists():
            alt = dataset_name.replace("Dataset_", "Data_")
            summary_file = model_path / f"combined_summary_{alt}.csv"
        if not summary_file.exists():
            continue
        for row in load_summary_csv(summary_file):
            key = (row["prompt_type"], row["problem_id"])
            if row["score"] is not None:
                scores_by_key[key].append(row["score"])
            problem_ids_set.add(row["problem_id"])
            prompt_types_set.add(row["prompt_type"])

    problem_ids = sorted(problem_ids_set)
    prompt_types = sorted(prompt_types_set)
    matrix = []
    for pt in prompt_types:
        row_vals = []
        for pid in problem_ids:
            key = (pt, pid)
            vals = scores_by_key.get(key, [])
            cell = sum(vals) / len(vals) if vals else float("nan")
            row_vals.append(cell)
        matrix.append(row_vals)

    return prompt_types, problem_ids, matrix


def main():
    out_dir = get_out_dir()
    out_dir.mkdir(parents=True, exist_ok=True)
    print("Building prompt–problem score matrices from combined_summary CSVs")
    print("=" * 60)

    for dataset in ALL_DATASETS:
        suffix = DATASET_SUFFIX.get(dataset, dataset.replace("Dataset_", "").replace("_Description", "").lower())
        prompt_types, problem_ids, matrix = build_prompt_problem_matrix_for_dataset(dataset)
        if not prompt_types or not problem_ids:
            print(f"  Skip {dataset}: no data")
            continue

        out_csv = out_dir / f"prompt_problem_scores_{suffix}.csv"
        with open(out_csv, "w", encoding="utf-8", newline="") as f:
            writer = csv.writer(f)
            writer.writerow(["prompt_type"] + problem_ids)
            for i, pt in enumerate(prompt_types):
                writer.writerow([pt] + [f"{v:.4f}" if v == v else "" for v in matrix[i]])
        print(f"  {dataset} -> {out_csv.name} ({len(prompt_types)} prompts x {len(problem_ids)} problems)")

    print("Done.")


if __name__ == "__main__":
    main()
