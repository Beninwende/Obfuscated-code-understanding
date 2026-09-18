# Obfuscated Code Understanding

Replication package for the paper on LLM code comprehension under obfuscation.

**Pipeline:** `data/` → `generation/` → `evaluation/` → `results/`

## Layout

```
data/<corpus>/              code variants + references
generation/outputs/<corpus>/  model descriptions
evaluation/<corpus>/        item-level scores
results/scores/             paper tables (means)
results/human-annotation/   human validation (n=96) + taxonomy gold (n=165)
results/taxonomy/           failure classifications
results/combined/           stacked-obfuscation results
scripts/                    regenerate scores
```

Join key: `Sub Directory`.

## Corpora

| Name | Size | Language |
|------|------|----------|
| `java250` | 250 | Java (CodeNet) |
| `java656` | 656 | Java (MBPP) |
| `javascript250` | 250 | JavaScript |
| `javascript454` | 454 | JavaScript (MBPP) |
| `combined` | — | stacked transforms (eval + results only) |

Pooled labels in tables: `java906` = java250+java656, `javascript704` = javascript250+javascript454.

## Judges

Scores use three judges (majority, score > 0.5):

| Label | API | Model |
|-------|-----|-------|
| `judge_1` | OpenAI | GPT-5 |
| `judge_2` | Anthropic | Claude-Sonnet-4.5 |
| `judge_3` | OpenRouter | MiniMax-2.7 |

## Setup

```bash
python3 -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
cp .env.example .env   # add API keys locally; do not commit .env
```
