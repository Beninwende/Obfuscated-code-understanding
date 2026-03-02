# Balanced taxonomy

One row per **(category, subtype)** — same structure as `final_taxonomy.csv`, but examples are **balanced across models**. No single model (e.g. Qwen3VL) dominates the representative examples.

## How it works

- For each (category, subtype), we choose one representative example from all model runs.
- Selection prefers **models that have been used fewer times so far**, so usage is spread across models. Tie-break: longer description content.
- Result: similar column layout and one example per (category, subtype), with more even model distribution.

## `balanced_taxonomy.csv`

Same columns as final taxonomy:

| Column | Description |
|--------|-------------|
| **category** | Failure type |
| **subtype** | Granular subtype |
| **brief_description** | Short definition of the subtype |
| **description_original** | Summarized problem statement |
| **description_1**, **description_2** | Summarized pair involved in the failure |
| **code_1**, **code_2** | The two code variants for that failure |
| **model** | Model/dataset for this example |
| **problem_id** | Problem identifier |
| **problem_index** | Index in that model's classification list |

## Regenerating

From this directory:

```bash
python3 build_balanced_taxonomy.py
```

Output: `balanced_taxonomy.csv`. The script also prints per-model usage counts to stderr.

## Verification

To verify that `code_1`, `code_2` and `description_1`, `description_2` in the CSV match the source classification (model, problem_id, problem_index):

```bash
python3 verify_taxonomy.py balanced_taxonomy.csv
python3 verify_taxonomy.py ../final_taxonomy/final_taxonomy.csv   # optional: verify final taxonomy too
```

## Relation to final taxonomy

- **final_taxonomy** (in `../final_taxonomy/`): one example per (category, subtype), chosen by **content quality** (longest descriptions). Can be dominated by one model if it has many long descriptions.
- **balanced_taxonomy**: one example per (category, subtype), chosen to **balance model usage** (then content as tie-break). Use this when you want representative examples from many models.
