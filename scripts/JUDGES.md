# LLM-as-a-Judge (score generation)

Public labels are only **judge_1**, **judge_2**, and **judge_3** (paper consensus: ≥2 scores strictly above τ = 0.5).

| Label | API | Model (paper) |
|-------|-----|----------------|
| `judge_1` | OpenAI (`OPENAI_API_KEY`) | GPT-5 |
| `judge_2` | Anthropic / Claude (`ANTHROPIC_API_KEY`) | Claude-Sonnet-4.5 |
| `judge_3` | OpenRouter (`OPENROUTER_API_KEY`) | MiniMax-2.7 |

Defined in `scripts/common.py` (`PAPER_JUDGES`). Scoring entrypoint: `scripts/evaluate.py`.

Evaluation CSV columns: `Judge_1_Score`, `Judge_2_Score`, `Judge_3_Score`.  
Optional raw judge trees under `evaluation/<corpus>/judge_1|judge_2|judge_3/`.
