# Error analysis (comprehensive obfuscation failures)

## Purpose

Analyze why some models (e.g. Gemini) perform well on single obfuscation types but rank last under comprehensive obfuscation. We select failed samples (LLM consensus = False) and categorize the failure types using the taxonomy from `Results/Taxonomy/final_taxonomy/final_taxonomy.csv`.

## Steps

### 1. Select failed samples (already done)

```bash
python select_failed_samples.py
```

- Reads `../{DeepSeek,Gemini,O4}/combined_results_Obfuscated_Without_comments.json`.
- Selects 86 samples (balanced across models) where `consensus == False`.
- Outputs: `selected_sample_ids.json`, `selected_samples_manifest.csv`.

### 2. Categorize failures with GPT-4o

```bash
pip install openai
export OPENAI_API_KEY="your-key"
python categorize_failures_gpt4o.py
```

- Loads taxonomy subtypes from `Results/Taxonomy/final_taxonomy/final_taxonomy.csv`.
- For each selected sample, loads reference description and the model’s failed description from the same JSON.
- Calls GPT-4o to assign one **subtype** (e.g. `Algorithm_misunderstanding`, `Hallucination_unrelated`) and a short **brief_reason**.
- Category is fixed as `Comprehensive_Obfuscation_Failure`; subtypes match the taxonomy.
- Outputs: `categorized_failures.csv`, `categorized_failures.json`.

**Dry run (first 2 samples, to test loading without spending API calls):**

```bash
python categorize_failures_gpt4o.py --dry-run
```

## Output schema (categorized_failures.csv)

| Column | Description |
|--------|-------------|
| model | DeepSeek, Gemini, or O4 |
| problem_id | e.g. p02753 |
| category | Comprehensive_Obfuscation_Failure |
| subtype | Taxonomy subtype (e.g. Algorithm_misunderstanding) |
| brief_reason | GPT-4o’s short explanation |
| reference_excerpt | First 500 chars of ground-truth description |
| failed_description_excerpt | First 500 chars of model’s failed description |
