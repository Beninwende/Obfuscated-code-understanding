# Canonical score tables

All paper-facing aggregates for single-transformation corpora live here.

| File | Contents |
|------|----------|
| `model_performance.csv` | Per model × variant LLM-judge / embedding means + consensus |
| `model_performance_by_prompt.csv` | Same, split by prompt type |
| `model_performance_by_prompt_summary.csv` | Prompt macro means |
| `stability_scores.csv` | Mean semantic stability per model |
| `stability_per_problem.csv` | Per-problem stability |
| `pairwise_breakdown.csv` | Per pair-type stability components |
| `pairwise_scores.csv` | Item-level pairwise similarity scores |
| `pairwise_similarity_summary.json` | Pairwise summary stats |
| `model_comprehension.csv` | Comprehension tiers (s_enc / s_dead / s_lex) |
| `comprehension_per_problem.csv` | Per-problem comprehension components |
| `llm_performance_by_transformation_complexity.csv` | Complexity × performance |

Column `eval_file` (when present) points into `evaluation/<corpus>/…`.

Pooled corpora `java906` and `javascript704` appear as `dataset` values in some tables.
