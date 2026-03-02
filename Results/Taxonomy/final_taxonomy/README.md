# Final taxonomy

One row per **(category, subtype)** combination observed in the granular subtype classifications.

## `final_taxonomy.csv`

| Column | Description |
|--------|-------------|
| **category** | Failure type: `Comment_Dependency`, `Variable_Renaming_Failure`, `Dead_Code_Failure`, `Encryption_Failure` |
| **subtype** | Granular subtype (e.g. `Hallucination_unrelated`, `Empty_or_template`) |
| **brief_description** | Short definition of the subtype from the coding guide |
| **description_original** | Summarized problem statement (from `problem_description_2_0.json`); core idea only |
| **description_1** | Summarized first description involved in the failure (e.g. with comments for Comment_Dependency, without comments for others) |
| **description_2** | Summarized second description involved in the failure (e.g. without comments, variable_renaming, dead_code, or encryption) |
| **code_1** | First code variant for that failure (same problem_id as code_2) |
| **code_2** | Second code variant for that failure (same problem_id as code_1) |
| **model** | Model/dataset the example came from (e.g. `Dataset_GPT4o`, `Dataset_Qwen3VL`) |
| **problem_id** | Problem identifier (e.g. `p03072`) |
| **problem_index** | Index of this failure in that model's classification list |

- **Descriptions** are summarized to the core idea (~380 characters) so the CSV stays readable.
- **Code_1 and code_2** always refer to the same problem (same `problem_id`): they are the two variants compared in the failure (e.g. with comments vs without comments for Comment_Dependency; without comments vs variable_renaming for Variable_Renaming_Failure, etc.).

## `final_taxonomy_8subtypes.csv` (1720 rows)

Same columns as `final_taxonomy.csv`, but **one row per classification** (all 1720 pairs). Every row uses one of **8 canonical subtypes**:

- Algorithm_confusion, Algorithm_misunderstanding, Functional_inaccuracy, Hallucination_unrelated, Minimal_code_understanding, Obfuscation_narrative, Semantic_drift, Structural_description_only

Granular subtypes not in this set are remapped: `Empty_or_template`, `Refusal_or_meta`, `Overgeneralization` → `Minimal_code_understanding`; `Creative_or_offtask` → `Hallucination_unrelated`; `Wrong_IO_interpretation` → `Functional_inaccuracy`.

Build with:

```bash
python3 build_final_taxonomy_8subtypes.py
```

## Regenerating

From this directory:

```bash
python3 build_final_taxonomy.py
```

Output is written to `final_taxonomy.csv`. If file write fails (e.g. in a restricted environment), the script prints the CSV to stdout so you can redirect it.
