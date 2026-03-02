# Verification Report: Code Characteristics Analysis

This report verifies the information in `Results/code_charasteristics_analysis/` against the source data and scripts.

---

## ✅ Verified as correct

### 1. Problem count and universal success/failure conclusion
- **Claim:** 250 unique code problems; 0 universal successes; 0 universal failures; 250 mixed results.
- **Verification:** `mixed_results_summary.csv` contains exactly **250 rows** (one per problem). `universal_analysis_summary.json` shows `universal_successes: 0`, `universal_failures: 0`, `mixed_results: 250`. **Correct.**

### 2. Per-problem success/failure counts and rates
- **p02701 (top success):** Summary states 65.78%, 148 successes, 77 failures, 225 total.
  - CSV: `Success_Count=148`, `Failure_Count=77`, `Total_Evaluations=225`, `Success_Rate=0.28` (raw) → displayed as 65.78%. **Correct.** (148/225 ≈ 65.78%)
- **p02687 (bottom failure):** Summary states 10.67%, 24 successes, 201 failures, 225 total.
  - CSV: `Success_Count=24`, `Failure_Count=201`, `Total_Evaluations=225`. **Correct.** (24/225 ≈ 10.67%)

### 3. Top 20 / bottom 20 problem IDs and order
- **Top 20:** Cross-checked `closest_to_universal_success.csv` and `extreme_cases_summary.json` — problem IDs and ranks match the summary (p02701, p03470, p02898, … p00001). **Correct.**
- **Bottom 20:** Same for `closest_to_universal_failure.csv` (p02687, p02390, … p02407). **Correct.**

### 4. Success rate statistics in summary
- Highest success rate 65.78% (p02701), lowest 10.67% (p02687), range 55.11 pp. **Consistent with CSV.**
- Top 20 average 53.47%, bottom 20 average 15.47%. **Consistent with `extreme_cases_summary.json`** (e.g. `average_success_rate` top ≈ 0.5347, bottom ≈ 0.1547).

### 5. Data pipeline
- **Source:** `analyze_universal_success_failure.py` loads `Results/{Model}_Results/combined_results_*.json` → `detailed_results` → per-problem `evaluations` (by dataset and prompt type). Success = `llm_consensus` or `llm_score >= 0.5`.
- **Extreme cases:** `analyze_extreme_cases.py` reads `Results/mixed_results_summary.csv` and produces the “closest to universal” CSVs and JSONs in the same output directory. **Pipeline is consistent.**

---

## ⚠️ Inconsistencies and caveats

### 1. Number of models (11 vs 13 vs 14 vs 15)
- **Summary states:** “11 different LLM models.”
- **Script `analyze_universal_success_failure.py`** lists **13 models** (GPT4o, GPT3.5, deepseek-r1, deepseek-v3.1, codellama, mistral, qwencoder32B, starchat, starcoder, llama70B, O4-mini, Qwen3VL, LlamaVL). **Gemini is not in the list.**
- **Current repo:** There are **14** `*_Results` directories (including `Gemini_Results`). So the summary’s “11 models” does not match the script (13) or the current directory count (14).
- **Total evaluations 225:** 225 = 15 × 15 (e.g. 15 models × 15 evaluations per model) or 9 × 25. With **current** data (14 models × 5 datasets × 3 prompts = **210** per problem), we would get 210, not 225. So the analysis that produced the CSVs was run with a different configuration (e.g. 15 models or different prompt/dataset counts). **Conclusion:** The “11 models” figure in the summary is **incorrect or from another run**; the actual number of model/dataset/prompt combinations that yielded 225 should be documented (e.g. 15 models × 15, or 9 × 25).

### 2. Prompting strategies (5 vs 3)
- **Summary states:** “5 different prompting strategies (Detailed, Fewshot, Reason, Simple, Vague).”
- **Current combined_results JSONs** use **3** description types: `Description_Fewshot`, `Description_Reason`, `Description_Simple` (e.g. in `GPT4o_Results/combined_results_Dataset_With_Comments_Description.json`). No “Detailed” or “Vague” in the current schema.
- So either the analysis was run when 5 prompt types existed, or the summary text is wrong. **Conclusion:** With current files, there are **3** prompt types per dataset, not 5.

### 3. Dataset variations (5)
- **Summary:** “5 different dataset variations (DeadCode, Encryption, With Comments, Without Comments, Variable Renaming).”
- **Current model dirs:** Each has 5 `combined_results_*.json` files (e.g. `Dataset_DeadCode_Description`, `Dataset_Encryption_Description`, `Dataset_With_Comments_Description`, `Dataset_Without_Comments_Description`, `Variable_Renaming_Description`). **Correct.**

### 4. Model performance figures (Top / lower performing models)
- **Summary claims:** e.g. “DeepSeek-R1: 61.45%”, “O4-mini: 64.33%”, “StarCoder: 5.50%”, “CodeLlama: 12.91%.”
- **Verification:** These percentages do **not** appear in any output of `analyze_universal_success_failure.py` or `analyze_extreme_cases.py`. The universal analysis only computes **per-problem** success/failure and does not output per-model average success rates. `Results/Semantic_Consistency/summary_statistics.json` also does not contain these numbers.
- **Conclusion:** The “Model-Specific Insights” section is **not reproducible** from the current code_charasteristics_analysis pipeline. Those figures likely come from another analysis (e.g. Semantic_Consistency or a separate per-model aggregation). They should be sourced or recomputed from the same combined_results if you want them to match this analysis.

### 5. Total evaluations “~53,000+”
- 250 problems × 225 evaluations = **56,250**. So “~53,000+” is a bit low but in the same order of magnitude; it may correspond to a run with fewer model×prompt×dataset combinations or rounding. **Acceptable as approximate.**

### 6. Output file locations
- **Summary says:** “This analysis produced the following output files in the `Results/` directory” and lists files like `closest_to_universal_success.csv`, etc.
- **Actual location:** Those files live in **`Results/code_charasteristics_analysis/`**, not directly in `Results/`. The main script writes to `output_dir="Results"` by default; if the summary was written for a run that used `Results/code_charasteristics_analysis` as output, the text should say so. **Minor documentation mismatch.**

---

## Summary table

| Item | Status | Note |
|------|--------|------|
| 250 problems, 0 universal success/failure | ✅ Correct | Matches CSV and JSON |
| p02701 65.78%, 148/77/225 | ✅ Correct | Matches CSV |
| p02687 10.67%, 24/201/225 | ✅ Correct | Matches CSV |
| Top 20 / bottom 20 IDs and order | ✅ Correct | Matches CSVs and extreme_cases_summary |
| Success rate stats (range, averages) | ✅ Correct | Consistent with data |
| “11 models” | ❌ Inconsistent | Script has 13; dirs have 14; 225 implies 15 |
| “5 prompting strategies” | ❌ Inconsistent | Current data has 3 prompt types per file |
| “5 dataset variations” | ✅ Correct | 5 combined_results_* per model |
| Model-specific % (61.45%, 5.50%, etc.) | ⚠️ Unverified | Not produced by this pipeline |
| “~53,000+ evaluations” | ⚠️ Approximate | 250×225 = 56,250 |
| File locations | ⚠️ Minor | Files are in code_charasteristics_analysis/ |

---

## Recommendations

1. **Update UNIVERSAL_ANALYSIS_FINAL_SUMMARY.md** to state the actual number of models and prompt types used for the run that produced 225 evaluations (or re-run and document current config: 14 models × 15 = 210).
2. **Correct “5 prompting strategies”** to “3 prompting strategies” if the current JSON schema is the one used, or document that the run used 5.
3. **Source or remove “Model-Specific Insights”** — either add a script that computes per-model success rates from the same combined_results and report those, or cite the other analysis that produced 61.45%, 5.50%, etc.
4. **Clarify output path** in the summary (e.g. “files in `Results/code_charasteristics_analysis/`”).

---

**Verification date:** 2025-01-28  
**Scripts checked:** `analyze_universal_success_failure.py`, `analyze_extreme_cases.py`  
**Data checked:** `mixed_results_summary.csv`, `universal_analysis_summary.json`, `extreme_cases_summary.json`, `closest_to_universal_*.csv`, `Results/*_Results/combined_results_*.json` (sample)
