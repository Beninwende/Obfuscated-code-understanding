# Model complementarity

Threshold τ = 0.5. Measured generation models only (n=15, incl. DeepSeek-V4-Pro). Success = average_score ≥ τ.

Datasets: java250 / java656 / java906 / javascript250 / javascript454 / javascript704.

Paper figure style: (figures live with the paper manuscript)

## java250

### with_comments (n_problems=250, n_models=15)
- Best single: **Gemini** = 86.0%
- Best pair: **O4-mini + Gemini** = 92.0% (both 76.0%, +6.0% / +10.0%)

### without_comments (n_problems=250, n_models=15)
- Best single: **Gemini** = 86.0%
- Best pair: **Gemini + Kimi-K2.7** = 92.4% (both 60.8%, +25.2% / +6.4%)

### variable_renaming (n_problems=250, n_models=15)
- Best single: **Gemini** = 80.0%
- Best pair: **Gemini + Qwen3.7** = 89.6% (both 54.0%, +26.0% / +9.6%)

### dead_code (n_problems=250, n_models=15)
- Best single: **O4-mini** = 82.4%
- Best pair: **O4-mini + Kimi-K2.7** = 91.2% (both 59.2%, +23.2% / +8.8%)

### encryption (n_problems=250, n_models=15)
- Best single: **GLM-5** = 65.6%
- Best pair: **Gemini + GLM-5** = 77.2% (both 48.8%, +11.6% / +16.8%)

## java656

### with_comments (n_problems=656, n_models=15)
- Best single: **Gemini** = 79.7%
- Best pair: **GPT-3.5 + Gemini** = 85.8% (both 68.6%, +6.1% / +11.1%)

### without_comments (n_problems=656, n_models=15)
- Best single: **Gemini** = 79.3%
- Best pair: **GPT-3.5 + GPT-5** = 85.5% (both 66.5%, +9.3% / +9.8%)

### variable_renaming (n_problems=656, n_models=15)
- Best single: **Claude-5** = 80.2%
- Best pair: **QwenCoder + Claude-5** = 86.0% (both 70.1%, +5.8% / +10.1%)

### dead_code (n_problems=656, n_models=15)
- Best single: **Gemini** = 79.4%
- Best pair: **GPT-3.5 + Gemini** = 85.2% (both 64.6%, +5.8% / +14.8%)

### encryption (n_problems=656, n_models=15)
- Best single: **Gemini** = 79.9%
- Best pair: **Gemini + Claude-5** = 84.8% (both 69.7%, +10.2% / +4.9%)

## java906

### with_comments (n_problems=906, n_models=15)
- Best single: **Gemini** = 81.5%
- Best pair: **Gemini + Llama-70B** = 86.4% (both 65.7%, +15.8% / +5.0%)

### without_comments (n_problems=906, n_models=15)
- Best single: **Gemini** = 81.1%
- Best pair: **GPT-3.5 + Gemini** = 86.3% (both 66.9%, +5.2% / +14.2%)

### variable_renaming (n_problems=906, n_models=15)
- Best single: **Gemini** = 79.9%
- Best pair: **Gemini + Claude-5** = 86.3% (both 68.1%, +11.8% / +6.4%)

### dead_code (n_problems=906, n_models=15)
- Best single: **Gemini** = 77.2%
- Best pair: **Gemini + DeepSeek-V3.1** = 84.1% (both 62.6%, +14.6% / +7.0%)

### encryption (n_problems=906, n_models=15)
- Best single: **Gemini** = 74.5%
- Best pair: **Gemini + Claude-5** = 82.5% (both 61.0%, +13.5% / +7.9%)

## javascript250

### with_comments (n_problems=250, n_models=15)
- Best single: **GLM-5** = 92.4%
- Best pair: **Claude-5 + Kimi-K2.7** = 96.8% (both 80.4%, +4.8% / +11.6%)

### without_comments (n_problems=250, n_models=15)
- Best single: **Kimi-K2.7** = 92.4%
- Best pair: **DeepSeek-R1 + Kimi-K2.7** = 97.6% (both 84.8%, +5.2% / +7.6%)

### variable_renaming (n_problems=250, n_models=15)
- Best single: **GLM-5** = 90.8%
- Best pair: **Qwen3.7 + GLM-5** = 96.8% (both 80.4%, +6.0% / +10.4%)

### dead_code (n_problems=250, n_models=15)
- Best single: **GLM-5** = 89.2%
- Best pair: **Qwen3.7 + GLM-5** = 94.8% (both 76.4%, +5.6% / +12.8%)

### encryption (n_problems=250, n_models=15)
- Best single: **GLM-5** = 84.0%
- Best pair: **O4-mini + GLM-5** = 88.0% (both 72.0%, +4.0% / +12.0%)

## javascript454

### with_comments (n_problems=454, n_models=15)
- Best single: **GPT-4o** = 79.1%
- Best pair: **GPT-3.5 + DeepSeek-R1** = 87.7% (both 65.6%, +10.6% / +11.5%)

### without_comments (n_problems=454, n_models=15)
- Best single: **QwenCoder** = 79.7%
- Best pair: **Llama-70B + GLM-5** = 87.2% (both 67.2%, +8.8% / +11.2%)

### variable_renaming (n_problems=454, n_models=15)
- Best single: **Claude-5** = 78.0%
- Best pair: **GPT-3.5 + DeepSeek-R1** = 86.6% (both 61.0%, +10.6% / +15.0%)

### dead_code (n_problems=454, n_models=15)
- Best single: **Claude-5** = 81.5%
- Best pair: **QwenCoder + Claude-5** = 87.9% (both 59.9%, +6.4% / +21.6%)

### encryption (n_problems=89, n_models=15)
- Best single: **GLM-5** = 75.3%
- Best pair: **GPT-4o + Qwen3.7** = 86.5% (both 58.4%, +12.4% / +15.7%)

## javascript704

### with_comments (n_problems=704, n_models=15)
- Best single: **GLM-5** = 83.2%
- Best pair: **GPT-3.5 + DeepSeek-R1** = 88.9% (both 59.1%, +8.2% / +21.6%)

### without_comments (n_problems=704, n_models=15)
- Best single: **Kimi-K2.7** = 83.2%
- Best pair: **Llama-70B + GLM-5** = 89.3% (both 62.9%, +6.2% / +20.2%)

### variable_renaming (n_problems=704, n_models=15)
- Best single: **GLM-5** = 82.0%
- Best pair: **DeepSeek-V4-Pro + GLM-5** = 88.1% (both 71.2%, +6.1% / +10.8%)

### dead_code (n_problems=704, n_models=15)
- Best single: **GLM-5** = 81.8%
- Best pair: **Claude-5 + GLM-5** = 88.4% (both 73.2%, +6.5% / +8.7%)

### encryption (n_problems=339, n_models=15)
- Best single: **GLM-5** = 81.7%
- Best pair: **GLM-5 + Kimi-K2.7** = 86.7% (both 72.6%, +9.1% / +5.0%)

