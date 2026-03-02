# Code metrics for top 10 success / top 10 failure

Metrics are computed on the **original code without comments** from `../Without_comments.json`, for the problem IDs in:
- **Top 10 success:** first 10 rows of `../closest_to_universal_success.csv`
- **Top 10 failure:** first 10 rows of `../closest_to_universal_failure.csv`

## Metrics

| Metric | Description |
|--------|-------------|
| **lines_of_code** | Non-empty lines in the source (after strip). |
| **lizard_nloc** | Non-comment lines of code from lizard (usually equals LOC for code without comments). |
| **cyclomatic_complexity_total** | Sum of cyclomatic complexity over all functions (lizard). |
| **cyclomatic_complexity_max** | Maximum cyclomatic complexity of any single function (lizard). |
| **shannon_entropy** | Shannon entropy (bits) of the source string: H = −Σ p(x) log₂ p(x) over character frequencies. |
| **function_count** | Number of functions reported by lizard. |

## Output files

- **top10_code_metrics.csv** — All 20 problems (10 success + 10 failure) with the metrics above.
- **top10_code_metrics.json** — Same data in JSON with keys `top10_success` and `top10_failure`.

## Regenerating

From this directory, run (lizard must be installed for cyclomatic complexity):

```bash
pip install lizard   # if needed
python compute_top10_metrics.py
```

If `lizard` is not installed, the script still computes LOC and entropy and uses a simple Java-based estimate for cyclomatic complexity.
