# Obfuscation & Code Comprehension

Experiments on **how code obfuscation affects LLM code comprehension**: we generate natural-language descriptions of Java snippets under several obfuscation variants, evaluate them (LLM-as-judge, semantic similarity), and analyze failure types.

## What’s in the repo

| Part | Role |
|------|------|
| **`Data/`** | Input datasets: code variants (with/without comments, variable renaming, dead code, encryption) and reference descriptions. |
| **`generation_code/`** | Scripts to call LLM APIs (OpenAI, DeepSeek, Gemini, etc.) to generate descriptions from code. |
| **`Results/`** | Analysis scripts, tables, and figures. |

## Main experiments

- **Taxonomy** (`Results/Taxonomy/`) — Failure categories (comment dependency, variable renaming, dead code, encryption) and granular subtypes; Sankey and final taxonomy CSVs.
- **Semantic consistency** (`Results/Semantic_Consistency/`) — Pairwise similarity, model complementarity, heatmaps and stacked figures (e.g. by obfuscation type).
- **Semantic stability** (`Results/Semantic_Stability/`) — Comprehension levels (semantic / structural / lexical), sensitivity to threshold τ.
- **Encryption vs other variants** (`Results/code_charasteristics_analysis/Encryption_vs_DeadCode/`) — Why literals encryption hurts consensus more than dead code/variable renaming; LOC/CC and regression.
- **Combined obfuscation** (`Results/Combined-Obfuscation/`) — Three models (DeepSeek, Gemini, O4) on comprehensively obfuscated code; error analysis and failure-subtype shift (single → comprehensive).
- **Prompt complementarity** (`Results/prompt_complementarity/`) — Prompt–problem score matrices and top-prompt union coverage.

## Quick start

1. **Environment**  
   Python 3.9+. Install deps from `Results/*/requirements.txt` or use: `matplotlib`, `seaborn`, `pandas`, `numpy`, `scipy`, `openai` (and provider-specific clients if you run generation).

2. **Data**  
   Expects `Data/` with JSON datasets (e.g. `Dataset_Without_Comments.json`, `Dataset_Encryption.json`, …). Paths in scripts are relative to repo root.

3. **Run analyses**  
   Each subfolder under `Results/` has its own README and entry scripts (e.g. `compute_*.py`, `run_*.py`, `plot_*.py`). Run from repo root so `Data/` and `Results/` paths resolve.

4. **Generation (optional)**  
   Use scripts in `generation_code/` with the right API keys (e.g. `OPENAI_API_KEY`, `DEEPSEEK_API_KEY`). Configure input/output paths to match your `Data/` layout.

## Outputs

- **Tables**: CSVs for taxonomy, comprehension levels, sensitivity, prompt–problem scores, failure categorizations.
- **Figures**: PDFs/PNGs/HTML for heatmaps, boxplots, Sankey, stacked bars, failure-shift flows (see per-experiment READMEs).

## Citation & license

See your paper or project docs. No license file is included in this snapshot.
