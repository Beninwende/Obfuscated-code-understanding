# Sensitivity analysis (Section 3.6)

Re-runs the comprehension level assignment at **three thresholds** τ = 0.45, 0.50, 0.55 to assess sensitivity to the choice of τ.

## Input

- `../Comprehension_Level/model_comprehension.csv` — per-model aggregates s_enc, s_dead (from pairwise_similarity.json). Generate it by running `../Comprehension_Level/compute_comprehension_level.py` if needed.

## Rule (at each τ)

- **Semantic** if s_enc ≥ τ  
- **Structural** if s_enc < τ and s_dead ≥ τ  
- **Lexical** if s_dead < τ  

**Stable?** = ✓ when the level is the same for all three τ; ✗ otherwise.

## Output

- `sensitivity_table.csv` — machine-readable table  
- `sensitivity_table.md` — Table X for the paper (Markdown)

## Run

```bash
python3 run_sensitivity_analysis.py
```
