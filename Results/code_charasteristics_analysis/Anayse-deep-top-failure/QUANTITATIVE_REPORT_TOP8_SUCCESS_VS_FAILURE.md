# Quantitative Report: Top 8 Success vs Top 8 Failure

**Objective:** Compare two groups of code problems using **defined, reproducible metrics** and a **standard statistical test**. No causal or interpretive claims beyond what the data and test support.

---

## 1. Methodology

| Element | Definition |
|--------|------------|
| **Population** | All problems in `consensus_only_success_rates.csv` with code in `Without_comments.json` (N=250). |
| **Success criterion** | Consensus-only: an evaluation is “success” iff the LLM evaluation field `consensus` is True. |
| **Success group** | The **8 problems with highest consensus rate** (≥50%). IDs: p03470, p02701, p02898, p03160, p02393, p02259, p02835, p02831. |
| **Failure group** | The **8 problems with lowest consensus rate** (bottom 8). IDs: p02717, p02687, p03107, p02390, p03449, p03242, p02753, p03469. |
| **Data sources** | (1) `full_code_metrics_consensus_50.csv` for code metrics; (2) `problems_java/<id>/Main.java` for source-based metrics. |
| **Statistical test** | Mann-Whitney U (two-sided), α = 0.05. Non-parametric (no normality assumption). |
| **Reproducibility** | All metrics are computed by the script `compute_top8_quantitative_metrics.py`. Re-run that script to reproduce the numbers below. |

---

## 2. Metric Definitions (reproducible)

| Metric | Source | Definition |
|--------|--------|------------|
| **lines_of_code** | CSV | Non-empty lines in the code (from Without_comments.json at metric computation time). |
| **cyclomatic_complexity_total** | CSV | Sum of cyclomatic complexity over all functions (lizard). |
| **cyclomatic_complexity_max** | CSV | Max cyclomatic complexity among functions (lizard). |
| **density** | CSV | cyclomatic_complexity_total / lines_of_code. |
| **shannon_entropy** | CSV | Character-level Shannon entropy (bits) of the source string. |
| **function_count** | CSV | Number of functions reported by lizard. |
| **max_nesting_depth** | CSV | Maximum nesting depth of braces in the source. |
| **has_recursion** | CSV | 1 if any method appears to call itself (heuristic), else 0. |
| **magic_number_count** | Source | Count of integer literals in `Main.java` (regex `\b(-?\d+)\b`) excluding {0, 1, 2, -1, 10, 100, 1000, 10000, 1024}. |
| **has_custom_io** | Source | 1 if the file contains any of the tokens (as type/class names): FastScanner, InputReader, FastReader, hayami, Foster, BKagamiMochi; else 0. |
| **non_ascii_identifier_count** | Source | Count of tokens matching Java identifier pattern that contain at least one character with code point > 127. |
| **static_field_count** | Source | Count of matches of the regex: `static` followed by a primitive or String type and an identifier. |

---

## 3. Results

**Sample size:** Success n=8, Failure n=8.

**Table:** For each metric, mean ± standard deviation for each group, and p-value of the Mann-Whitney U test (two-sided). No correction for multiple comparisons.

| Metric | Success (mean ± std) | Failure (mean ± std) | p-value (M-W U) |
|--------|----------------------|----------------------|------------------|
| lines_of_code | 118.25 ± 58.94 | 88.12 ± 38.54 | 0.328 |
| cyclomatic_complexity_total | 34.25 ± 10.31 | 26.25 ± 12.03 | 0.188 |
| cyclomatic_complexity_max | 15.38 ± 5.40 | 15.12 ± 4.36 | 0.912 |
| density | 0.32 ± 0.12 | 0.32 ± 0.15 | 0.645 |
| shannon_entropy | 3.97 ± 0.56 | 4.32 ± 0.48 | 0.161 |
| function_count | 8.00 ± 4.50 | 5.00 ± 4.60 | 0.308 |
| max_nesting_depth | 4.88 ± 1.25 | 5.00 ± 0.93 | 0.827 |
| has_recursion | 0.75 ± 0.46 | 0.50 ± 0.53 | 0.348 |
| magic_number_count | 3.88 ± 1.96 | 5.75 ± 6.48 | 0.914 |
| has_custom_io | 0.75 ± 0.46 | 0.38 ± 0.52 | 0.161 |
| non_ascii_identifier_count | 0.00 ± 0.00 | 0.00 ± 0.00 | 1.000 |
| static_field_count | 0.88 ± 0.99 | 1.25 ± 2.05 | 0.955 |

**Interpretation of test:** For none of the metrics is p < 0.05. Therefore, **no statistically significant difference** between the two groups is demonstrated for any of the listed metrics under this design.

---

## 4. Descriptive observations (no inference)

Reported only as **observed differences in sample means** (not as evidence of a population effect):

- **LOC:** Success group mean (118.25) is higher than failure group mean (88.12). p = 0.328.
- **Shannon entropy:** Failure group mean (4.32) is higher than success group mean (3.97). p = 0.161.
- **has_custom_io:** Success group mean (0.75) is higher than failure group mean (0.38). p = 0.161.
- **function_count:** Success group mean (8) is higher than failure group mean (5). p = 0.308.

These directions are **not** asserted as generalizable; they are descriptive for this sample only.

---

## 5. Limitations

1. **Sample size:** With n=8 per group, the Mann-Whitney U test has low power. Small or moderate effects may not reach significance.
2. **No multiple-testing correction:** With 12 tests, the chance of at least one false positive at α=0.05 is elevated; we do not claim any significant effect here.
3. **Causation:** This report does not claim that any metric “causes” or “explains” success or failure; only that two groups defined by outcome were compared on these metrics.
4. **Metric definitions:** Magic number and custom I/O metrics depend on the chosen regex and token list; changing them would change the counts.

---

## 6. Reproducibility

- **Script:** `compute_top8_quantitative_metrics.py` (same directory).
- **Inputs:** `full_code_metrics_consensus_50.csv`, `problems_java/<id>/Main.java` for the 16 problem IDs.
- **Outputs:** `metrics_top8_success_vs_failure.csv` (one row per problem for the 16 in 8v8), `quantitative_comparison_results.json` (8 vs 8 summary), `quantitative_comparison_8_vs_242_results.json` (8 vs 242 summary).

Command to reproduce:

```bash
python Results/code_charasteristics_analysis/Anayse-deep-top-failure/compute_top8_quantitative_metrics.py
```

(Optional: `scipy` is required for p-values; without it, the script still writes the CSV and JSON with descriptive statistics.)

---

## 7. Comparison: 8 success vs 242 failure

**Design:** Same success group (8 problems with highest consensus rate). Failure group = **all 242** problems with consensus rate < 50% (not only the bottom 8). Same metrics and Mann-Whitney U (two-sided), α = 0.05.

**Sample size:** Success n=8, Failure n=242.

**Table:** Mean ± standard deviation per group, and p-value (M-W U). Source: `quantitative_comparison_8_vs_242_results.json`.

| Metric | Success (n=8) mean ± std | Failure (n=242) mean ± std | p-value (M-W U) |
|--------|---------------------------|----------------------------|------------------|
| lines_of_code | 118.25 ± 58.94 | 98.74 ± 58.04 | 0.306 |
| cyclomatic_complexity_total | 34.25 ± 10.31 | 33.24 ± 16.16 | 0.711 |
| cyclomatic_complexity_max | 15.38 ± 5.40 | 17.29 ± 9.71 | 0.626 |
| density | 0.32 ± 0.12 | 0.38 ± 0.17 | 0.190 |
| shannon_entropy | 3.97 ± 0.56 | 4.28 ± 0.57 | 0.162 |
| function_count | 8.00 ± 4.50 | 7.25 ± 6.52 | 0.658 |
| max_nesting_depth | 4.88 ± 1.25 | 5.00 ± 1.33 | 0.834 |
| has_recursion | 0.75 ± 0.46 | 0.55 ± 0.50 | 0.255 |
| magic_number_count | 3.88 ± 1.96 | 6.35 ± 11.91 | 0.998 |
| has_custom_io | 0.75 ± 0.46 | 0.44 ± 0.50 | 0.086 |
| non_ascii_identifier_count | 0.00 ± 0.00 | 0.00 ± 0.00 | 1.000 |
| static_field_count | 0.88 ± 0.99 | 0.66 ± 1.13 | 0.263 |

**Interpretation:** For none of the metrics is p < 0.05. **No statistically significant difference** between the 8 success and the 242 failure groups is demonstrated for any of the listed metrics.

**Output file:** `quantitative_comparison_8_vs_242_results.json` (produced by the same script).

---

## 8. Analysis (8 vs 242)

**Significance:** With n=8 vs n=242, the Mann-Whitney U test has adequate power to detect moderate effects in the failure group distribution. None of the 12 metrics reached p < 0.05. The smallest p-value is **has_custom_io** (p = 0.086): a larger proportion of the 8 success problems (mean 0.75, i.e. 6/8) use a custom I/O class (FastScanner, InputReader, hayami, etc.) than the 242 failure problems (mean 0.44, i.e. about 44%). This difference is **not** significant at α = 0.05 and is reported only as an observed direction.

**Descriptive summary (no inference):**

- **Shannon entropy:** Success mean (3.97) is lower than failure mean (4.28). p = 0.162. Consistent with the full-sample analysis (Section 4) but not significant.
- **Density (CC/LOC):** Failure mean (0.38) is higher than success mean (0.32). p = 0.190.
- **LOC:** Success mean (118.25) is higher than failure mean (98.74). p = 0.306.
- **has_custom_io:** Success mean (0.75) is higher than failure mean (0.44). p = 0.086 (smallest p-value).

**Conclusion:** Under the current definitions and metrics, the **8 success** and **242 failure** groups do not differ statistically on any of the measured code attributes at α = 0.05. The observed tendency (lower entropy and density, higher LOC and more frequent custom I/O in the success group) may warrant replication with a larger success sample or additional metrics; no causal or generalizable claim is made here.

---

## 9. Taxonomic categories: High-Level (HL) vs Low-Level (LL)

**Objective:** Test whether the system favors **high-level algorithmic / standard-library** tasks over **low-level logic / state-manipulation** tasks, using a reproducible categorization and standard statistics.

### 9.1 Category definitions (reproducible)

**Source:** The field `task_type` in `full_code_metrics_consensus_50.csv` is inferred from reference descriptions (keyword-based). Each problem is assigned one category:

| Category | Label | task_type values | Interpretation |
|----------|--------|-------------------|-----------------|
| **HL** | High-Level Algorithmic / Standard Library | sort, count, unique, tree | Tasks that rely on standard data structures or known algorithms (sorting, unique counting, tree structures). |
| **LL** | Low-Level Logic / State Manipulation | digit, string, replace, compare | Tasks that involve digit/character manipulation, replacement, or low-level comparison. |
| **Other** | Uncategorized | other, math, max, min, sum | Excluded from the HL vs LL hypothesis test. |

### 9.2 Metrics and tests

- **Δ Success** = μ_HL − μ_LL (mean success rate in HL minus mean in LL). Positive value indicates higher success for HL.
- **Mann-Whitney U:** One-sided (alternative: HL > LL). H₀: no difference in success rates between HL and LL; H₁: HL has higher success rate than LL.
- **Effect size:** Cohen’s *d* = (μ_HL − μ_LL) / pooled_std.

### 9.3 Results (summary table for reproducibility)

| Metric | Value | Purpose |
|--------|--------|---------|
| n_HL | 80 | Sample size, HL category. |
| n_LL | 49 | Sample size, LL category. |
| n_Other | 121 | Excluded from HL vs LL test. |
| μ_HL | 0.3500 | Mean success rate (consensus) for HL. |
| μ_LL | 0.3263 | Mean success rate (consensus) for LL. |
| μ_Other | 0.3195 | Mean success rate for Other (descriptive only). |
| **Δ Success** | **0.0237** | μ_HL − μ_LL; positive = higher mean success for HL. |
| **p-value (one-sided)** | **0.114** | Mann-Whitney U, H₁: HL > LL. |
| **p-value (two-sided)** | 0.229 | Mann-Whitney U, two-sided. |
| **Cohen’s *d*** | **0.24** | Effect size (small: |d| < 0.5). |

**Interpretation:** At α = 0.05, the one-sided test does **not** reject H₀ (p = 0.114). A statistically significant bias toward HL over LL is **not** demonstrated. The observed Δ Success is positive (HL mean higher than LL mean) with a small effect size (Cohen’s *d* ≈ 0.24).

**Outputs:** `hl_vs_ll_results.json`, `category_vs_success_rate.png` (bar chart: category vs mean success rate). Script: `compute_hl_vs_ll_analysis.py`.

Command to reproduce:

```bash
python Results/code_charasteristics_analysis/Anayse-deep-top-failure/compute_hl_vs_ll_analysis.py
```

---

## 10. Analysis (HL vs LL taxonomy)

**Statistical conclusion:** The hypothesis that high-level algorithmic tasks (HL) have a higher success rate than low-level logic tasks (LL) is **not** supported at α = 0.05 (p = 0.114). The observed difference (Δ Success = 0.024, Cohen’s *d* ≈ 0.24) is in the direction of “HL favored over LL” but is not statistically significant under the current taxonomy and sample sizes (n_HL = 80, n_LL = 49).

**Reproducibility:** The categorization is fully determined by `task_type` and the fixed sets HL = {sort, count, unique, tree} and LL = {digit, string, replace, compare}. Re-running `compute_hl_vs_ll_analysis.py` on the same CSV reproduces the table and tests.

**Limitations:** (1) `task_type` is keyword-based from reference descriptions and may misclassify some problems. (2) “Other” (121 problems) is excluded from the test; including or reclassifying them could change the result. (3) With p = 0.11, a larger sample or a refined taxonomy might yield significance; no claim of “no bias” is made—only that the data do not show a significant bias with this definition.

**Summary for reproducibility:**

| Metric | Formula/Test | Purpose |
|--------|----------------|--------|
| Category mean | Mean success rate per task type | Describes performance by category. |
| Δ Success | μ_HL − μ_LL | Quantifies direction of the gap (HL − LL). |
| p-value | Mann-Whitney U (one-sided) | Tests whether the “HL favored” gap is statistically significant. |
| Effect size | Cohen’s *d* | Quantifies the magnitude of the performance gap (here: small). |
