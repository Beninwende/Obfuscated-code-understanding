# Prompt Complementarity Analysis

This subdirectory contains prompt–problem score matrices and complementarity analyses (union coverage, top prompt pairs) analogous to the model-level analysis in `Results/Semantic_Consistency/`.

- **Prompt–problem score matrix**: Rows = prompt types, columns = problems; cell = mean over models of LLM average score for that (prompt, problem).
- **Top prompt pairs union coverage**: Stacked bar chart of union coverage for the top prompt pairs (problems solved by either prompt, split into both / only first / only second).

Data source: `combined_summary_*.csv` from each model's Results folder; aggregated by dataset to produce prompt–problem scores, then visualized and analyzed for complementarity.

## Files

- `prompt_problem_scores_{dead_code|encryption|variable_renaming|with_comments|without_comments}.csv` – prompt × problem score matrices (mean LLM score over models).
- `prompt_problem_matrix_{suffix}.png` – heatmap: blue = success (≥0.5), red = failure (<0.5).
- `top_pairs_coverage_{suffix}.png` – stacked bar chart of top prompt pairs by union coverage (both / only first / only second).
- `union_coverage_{suffix}.csv` – pairwise union coverage percentages.

## How to run

Requires Python with `pandas`, `matplotlib`, and `seaborn` (same as `Results/Semantic_Consistency/`).

1. **Build prompt–problem score CSVs** (from project root):
   ```bash
   python Results/prompt_complementarity/build_prompt_problem_scores.py
   ```
   If writing to this directory fails (e.g. sandbox), use a temp output and copy:
   ```bash
   PROMPT_COMPLEMENTARITY_OUT=/tmp python Results/prompt_complementarity/build_prompt_problem_scores.py
   cp /tmp/prompt_problem_scores_*.csv Results/prompt_complementarity/
   ```

2. **Generate matrix heatmaps** (prompt–problem matrix, like `model_problem_matrix_encryption.png`):
   ```bash
   python Results/prompt_complementarity/visualize_prompt_problem_matrix.py
   ```

3. **Generate top-pairs coverage figures** (like `top_pairs_coverage_encryption.png`):
   ```bash
   python Results/prompt_complementarity/compute_prompt_complementarity.py
   ```
