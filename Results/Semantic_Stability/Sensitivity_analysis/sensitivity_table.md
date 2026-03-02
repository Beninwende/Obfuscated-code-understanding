# Sensitivity analysis (Table X)

Level assignment at τ = 0.45, 0.50, 0.55. Stable? = ✓ if same level for all three.

| Model | s_enc | s_dead | Level (τ=0.45) | Level (τ=0.50) | Level (τ=0.55) | Stable? |
|-------|-------|--------|-----------------|----------------|----------------|---------|
| Gemini | 0.605 | 0.665 | Semantic | Semantic | Semantic | ✓ |
| O4-mini | 0.592 | 0.709 | Semantic | Semantic | Semantic | ✓ |
| DeepSeek-R1 | 0.590 | 0.725 | Semantic | Semantic | Semantic | ✓ |
| Qwen-Coder32B | 0.536 | 0.672 | Semantic | Semantic | Structural | ✗ |
| DeepSeek-V3.1 | 0.514 | 0.704 | Semantic | Semantic | Structural | ✗ |
| GPT-4o | 0.497 | 0.693 | Semantic | Structural | Structural | ✗ |
| Mistral | 0.428 | 0.545 | Structural | Structural | Lexical | ✗ |
| GPT-3.5 | 0.424 | 0.582 | Structural | Structural | Structural | ✓ |
| Llama-70B | 0.405 | 0.550 | Structural | Structural | Lexical | ✗ |
| Qwen3-VL | 0.363 | 0.394 | Lexical | Lexical | Lexical | ✓ |
| StarChat | 0.339 | 0.439 | Lexical | Lexical | Lexical | ✓ |
| LlamaVL | 0.264 | 0.249 | Lexical | Lexical | Lexical | ✓ |
| CodeLlama | 0.190 | 0.248 | Lexical | Lexical | Lexical | ✓ |
| StarCoder | 0.136 | 0.131 | Lexical | Lexical | Lexical | ✓ |