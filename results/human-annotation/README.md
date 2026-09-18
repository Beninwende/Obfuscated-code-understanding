# Human annotation

Gold annotation files used for the statistics reported in the paper.

| File | Role | Paper stats (recomputed) |
|------|------|--------------------------|
| `human_rated_96_pairs.csv` | Human validation of the LLM judge (n=96, 6 annotators) | Fleiss κ≈0.81; Cohen κ≈0.98; Spearman judge ρ≈0.85, embeddings ρ≈0.43 |
| `taxonomy_annotations_pairs.csv` | Taxonomy gold sample (n=165) with expert consensus + LLM labels | LLM↔expert Cohen κ≈0.85; 8 failure types (+ Correct) |

Join / identifiers: pair `ID` (judge validation) and `pair_id` (taxonomy).

## Judge columns (`human_rated_96_pairs.csv`)

Same labels as `evaluation/` and `scripts/evaluate.py`:

| Column | API | Model (paper) |
|--------|-----|----------------|
| `Judge_1_Score` | OpenAI | GPT-5 |
| `Judge_2_Score` | Anthropic (Claude) | Claude-Sonnet-4.5 |
| `Judge_3_Score` | OpenRouter | MiniMax-2.7 |

Also present: `Judge_Average_Score`, `Judge_Consensus` (majority / agreement with the automated judge protocol), plus six human annotator scores and `Mean_Annotator_Score`.
