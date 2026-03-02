# Taxonomy verification and correction

All taxonomy content is **factual**: it comes only from source data. Nothing is invented.

## Source of truth

- **Granular classifications**: `granular_subtypes/Dataset_*_granular_subtypes.json`
- Each row in `final_taxonomy.csv` and `balanced_taxonomy.csv` refers to one classification (`model`, `problem_id`, `problem_index`). Code and descriptions are taken only from that classification (and from `Data_Without_Comments.json` / `problem_description_2_0.json` where defined).

## Script: `verify_and_correct_taxonomy.py`

Run from **`Results/Taxonomy`**:

```bash
cd Results/Taxonomy
```

### Strict verification

- Check that the source classification exists.
- Check that `category` = source `failure_type` and `subtype` = source `granular_subtype`.
- Check that `code_1`, `code_2`, `description_1`, `description_2` match the source (and baseline code when applicable).

```bash
python3 verify_and_correct_taxonomy.py --verify final_taxonomy/final_taxonomy.csv --report report.txt
python3 verify_and_correct_taxonomy.py --verify balanced_taxonomy/balanced_taxonomy.csv --report report.txt
```

### Correction (rebuild from source only)

- Rebuild CSVs from source only. Rows with missing source or missing required fields are dropped.
- **Final**: one example per (category, subtype), chosen by longest descriptions.
- **Balanced**: one example per (category, subtype), chosen to balance model usage.

```bash
python3 verify_and_correct_taxonomy.py --correct-final
python3 verify_and_correct_taxonomy.py --correct-balanced
```

After correction, the script runs verification on the written CSV.

## Existing checker

From `balanced_taxonomy/` you can also run:

```bash
python3 verify_taxonomy.py balanced_taxonomy.csv
python3 verify_taxonomy.py ../final_taxonomy/final_taxonomy.csv
```

This checks that code and descriptions match the source for each row.
