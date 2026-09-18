# Combined obfuscation

Stacked setting: renaming + dead code + encryption (Java). Eight models, Zero-shot vs OAP2*.

| Path | Contents |
|------|----------|
| `model_performance.csv` | Mean LLM-judge score + consensus rate (`eval_file` points to `evaluation/combined/`) |
| `taxonomy/` | Failure-type labels for scores < 0.5 (paper: 2,240 failures; ZS 1,182 / OAP2* 1,058) |

Paper table means are recomputed from the linked evaluation summaries.
