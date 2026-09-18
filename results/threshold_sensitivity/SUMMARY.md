# Threshold sensitivity

> **Inclusion:** measured models only  
> **Band:** near-threshold if |s−τ| < 0.05 at τ=0.5  
> **Source:** `../scores/model_comprehension.csv`

## Rule

- **Semantic** if s_enc ≥ τ
- **Structural** if s_enc < τ and s_dead ≥ τ
- **Lexical** otherwise

Tiers are **descriptive summaries** under a working threshold, not multiplicity-corrected hypothesis tests.

## Count of models per tier (sweep)

| Dataset | τ | n | Semantic | Structural | Lexical | % Semantic |
|---------|--:|--:|---------:|-----------:|--------:|-----------:|
| java250 | 0.45 | 15 | 11 | 4 | 0 | 73.3% |
| java250 | 0.50 | 15 | 11 | 3 | 1 | 73.3% |
| java250 | 0.55 | 15 | 11 | 3 | 1 | 73.3% |
| java906 | 0.45 | 15 | 15 | 0 | 0 | 100.0% |
| java906 | 0.50 | 15 | 15 | 0 | 0 | 100.0% |
| java906 | 0.55 | 15 | 15 | 0 | 0 | 100.0% |
| javascript250 | 0.45 | 15 | 12 | 2 | 1 | 80.0% |
| javascript250 | 0.50 | 15 | 12 | 0 | 3 | 80.0% |
| javascript250 | 0.55 | 15 | 10 | 2 | 3 | 66.7% |
| javascript454 | 0.45 | 15 | 10 | 4 | 1 | 66.7% |
| javascript454 | 0.50 | 15 | 10 | 4 | 1 | 66.7% |
| javascript454 | 0.55 | 15 | 9 | 5 | 1 | 60.0% |

## Stability / borderline (meta)

| Dataset | n | Unstable across {0.45,0.50,0.55} | Near-threshold band at τ=0.5 |
|---------|--:|---------------------------------:|-----------------------------:|
| java250 | 15 | 1 | 1 |
| java906 | 15 | 0 | 0 |
| javascript250 | 15 | 4 | 4 |
| javascript454 | 15 | 1 | 1 |

## Per-model levels

### java250

| Model | s_enc | s_dead | τ=0.45 | τ=0.50 | τ=0.55 | Stable? | Near τ=0.5? | Δ(s_enc,0.5) |
|-------|------:|-------:|--------|--------|--------|---------|-------------|-------------:|
| GLM-5 | 0.780 | 0.853 | Semantic | Semantic | Semantic | ✓ | no | +0.2802 |
| Gemini-3-preview | 0.777 | 0.831 | Semantic | Semantic | Semantic | ✓ | no | +0.2775 |
| Kimi-K2.7 | 0.775 | 0.873 | Semantic | Semantic | Semantic | ✓ | no | +0.2750 |
| O4-mini | 0.741 | 0.853 | Semantic | Semantic | Semantic | ✓ | no | +0.2414 |
| Qwen3.7-plus | 0.737 | 0.838 | Semantic | Semantic | Semantic | ✓ | no | +0.2368 |
| DeepSeek-R1 | 0.727 | 0.860 | Semantic | Semantic | Semantic | ✓ | no | +0.2270 |
| Claude Sonnet 5 | 0.682 | 0.798 | Semantic | Semantic | Semantic | ✓ | no | +0.1822 |
| GPT-5-nano | 0.677 | 0.822 | Semantic | Semantic | Semantic | ✓ | no | +0.1771 |
| DeepSeek-V4-Pro | 0.664 | 0.794 | Semantic | Semantic | Semantic | ✓ | no | +0.1644 |
| DeepSeek-V3.1 | 0.655 | 0.824 | Semantic | Semantic | Semantic | ✓ | no | +0.1550 |
| GPT-4o | 0.583 | 0.791 | Semantic | Semantic | Semantic | ✓ | no | +0.0832 |
| GPT-3.5-turbo | 0.423 | 0.620 | Structural | Structural | Structural | ✓ | no | -0.0774 |
| Llama-70B | 0.419 | 0.599 | Structural | Structural | Structural | ✓ | no | -0.0814 |
| Qwen2.5-Coder-32B | 0.409 | 0.622 | Structural | Structural | Structural | ✓ | no | -0.0906 |
| Mistral | 0.372 | 0.489 | Structural | Lexical | Lexical | ✗ | s_dead | -0.1278 |

### java906

| Model | s_enc | s_dead | τ=0.45 | τ=0.50 | τ=0.55 | Stable? | Near τ=0.5? | Δ(s_enc,0.5) |
|-------|------:|-------:|--------|--------|--------|---------|-------------|-------------:|
| O4-mini | 0.829 | 0.880 | Semantic | Semantic | Semantic | ✓ | no | +0.3285 |
| Kimi-K2.7 | 0.828 | 0.884 | Semantic | Semantic | Semantic | ✓ | no | +0.3284 |
| GLM-5 | 0.828 | 0.877 | Semantic | Semantic | Semantic | ✓ | no | +0.3278 |
| Gemini-3-preview | 0.825 | 0.862 | Semantic | Semantic | Semantic | ✓ | no | +0.3249 |
| Qwen3.7-plus | 0.805 | 0.835 | Semantic | Semantic | Semantic | ✓ | no | +0.3047 |
| DeepSeek-R1 | 0.785 | 0.860 | Semantic | Semantic | Semantic | ✓ | no | +0.2850 |
| Claude Sonnet 5 | 0.775 | 0.859 | Semantic | Semantic | Semantic | ✓ | no | +0.2747 |
| GPT-5-nano | 0.758 | 0.863 | Semantic | Semantic | Semantic | ✓ | no | +0.2575 |
| DeepSeek-V3.1 | 0.735 | 0.822 | Semantic | Semantic | Semantic | ✓ | no | +0.2346 |
| GPT-4o | 0.723 | 0.794 | Semantic | Semantic | Semantic | ✓ | no | +0.2226 |
| DeepSeek-V4-Pro | 0.705 | 0.779 | Semantic | Semantic | Semantic | ✓ | no | +0.2053 |
| Llama-70B | 0.703 | 0.821 | Semantic | Semantic | Semantic | ✓ | no | +0.2028 |
| GPT-3.5-turbo | 0.659 | 0.789 | Semantic | Semantic | Semantic | ✓ | no | +0.1594 |
| Mistral | 0.658 | 0.786 | Semantic | Semantic | Semantic | ✓ | no | +0.1584 |
| Qwen2.5-Coder-32B | 0.627 | 0.758 | Semantic | Semantic | Semantic | ✓ | no | +0.1266 |

### javascript250

| Model | s_enc | s_dead | τ=0.45 | τ=0.50 | τ=0.55 | Stable? | Near τ=0.5? | Δ(s_enc,0.5) |
|-------|------:|-------:|--------|--------|--------|---------|-------------|-------------:|
| GLM-5 | 0.844 | 0.887 | Semantic | Semantic | Semantic | ✓ | no | +0.3437 |
| Kimi-K2.7 | 0.834 | 0.894 | Semantic | Semantic | Semantic | ✓ | no | +0.3339 |
| O4-mini | 0.816 | 0.862 | Semantic | Semantic | Semantic | ✓ | no | +0.3164 |
| Qwen3.7-plus | 0.777 | 0.850 | Semantic | Semantic | Semantic | ✓ | no | +0.2769 |
| DeepSeek-R1 | 0.774 | 0.851 | Semantic | Semantic | Semantic | ✓ | no | +0.2743 |
| Claude Sonnet 5 | 0.753 | 0.819 | Semantic | Semantic | Semantic | ✓ | no | +0.2530 |
| DeepSeek-V3.1 | 0.702 | 0.763 | Semantic | Semantic | Semantic | ✓ | no | +0.2019 |
| DeepSeek-V4-Pro | 0.688 | 0.763 | Semantic | Semantic | Semantic | ✓ | no | +0.1883 |
| GPT-5-nano | 0.625 | 0.685 | Semantic | Semantic | Semantic | ✓ | no | +0.1245 |
| GPT-4o | 0.602 | 0.670 | Semantic | Semantic | Semantic | ✓ | no | +0.1020 |
| Qwen2.5-Coder-32B | 0.529 | 0.566 | Semantic | Semantic | Structural | ✗ | s_enc | +0.0288 |
| Mistral | 0.501 | 0.643 | Semantic | Semantic | Structural | ✗ | s_enc | +0.0009 |
| Llama-70B | 0.394 | 0.462 | Structural | Lexical | Lexical | ✗ | s_dead | -0.1061 |
| GPT-3.5-turbo | 0.371 | 0.494 | Structural | Lexical | Lexical | ✗ | s_dead | -0.1290 |
| Gemini-3-preview | 0.362 | 0.342 | Lexical | Lexical | Lexical | ✓ | no | -0.1380 |

### javascript454

| Model | s_enc | s_dead | τ=0.45 | τ=0.50 | τ=0.55 | Stable? | Near τ=0.5? | Δ(s_enc,0.5) |
|-------|------:|-------:|--------|--------|--------|---------|-------------|-------------:|
| GLM-5 | 0.813 | 0.880 | Semantic | Semantic | Semantic | ✓ | no | +0.3134 |
| Qwen3.7-plus | 0.799 | 0.864 | Semantic | Semantic | Semantic | ✓ | no | +0.2987 |
| Kimi-K2.7 | 0.791 | 0.869 | Semantic | Semantic | Semantic | ✓ | no | +0.2912 |
| DeepSeek-V4-Pro | 0.747 | 0.786 | Semantic | Semantic | Semantic | ✓ | no | +0.2467 |
| DeepSeek-R1 | 0.734 | 0.818 | Semantic | Semantic | Semantic | ✓ | no | +0.2340 |
| DeepSeek-V3.1 | 0.723 | 0.801 | Semantic | Semantic | Semantic | ✓ | no | +0.2227 |
| O4-mini | 0.711 | 0.852 | Semantic | Semantic | Semantic | ✓ | no | +0.2115 |
| Claude Sonnet 5 | 0.672 | 0.835 | Semantic | Semantic | Semantic | ✓ | no | +0.1721 |
| GPT-4o | 0.597 | 0.786 | Semantic | Semantic | Semantic | ✓ | no | +0.0972 |
| Qwen2.5-Coder-32B | 0.530 | 0.671 | Semantic | Semantic | Structural | ✗ | s_enc | +0.0300 |
| Mistral | 0.450 | 0.719 | Structural | Structural | Structural | ✓ | no | -0.0503 |
| GPT-5-nano | 0.429 | 0.766 | Structural | Structural | Structural | ✓ | no | -0.0710 |
| GPT-3.5-turbo | 0.412 | 0.731 | Structural | Structural | Structural | ✓ | no | -0.0881 |
| Llama-70B | 0.278 | 0.592 | Structural | Structural | Structural | ✓ | no | -0.2225 |
| Gemini-3-preview | 0.394 | 0.359 | Lexical | Lexical | Lexical | ✓ | no | -0.1063 |

## Takeaways for Comment (iv)

1. A single τ=0.5 cut remains sensitive: several models **flip** between 0.45 and 0.55 (especially on JavaScript).
2. Near-threshold models should be reported with continuous s_enc / s_dead and a **borderline** flag, not as sharp claims.
3. We do **not** apply Bonferroni across 14×4 as if each tier badge were an independent NHST; instead we (i) treat tiers as descriptive, (ii) foreground this sweep, (iii) flag the border band.
4. Historical borderline cases (GPT-4o s_enc=0.497, QwenCoder 0.536) illustrated the same fragility; absolute scores can move slightly across model snapshots, but the methodological point stands.

## Artefacts

- `results/threshold_sensitivity/sensitivity_by_model.csv`
- `results/threshold_sensitivity/sensitivity_counts.csv`
- `results/threshold_sensitivity/problem_pass_rates_by_tau.csv`
