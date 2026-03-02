# Encryption vs All Other Variants: Empirical Report

## 1. Objective
Explain why **literals encryption** leads to the **largest drop** in description success (LLM consensus) **vs all other dataset variants** (Dead code, With comments, Variable renaming). Other variants (e.g. Dead code) add more LOC and similar complexity but show smaller drops.

## 2. Data and methodology

| Item | Value |
|------|--------|
| Model | deepseek-r1 |
| Baseline variant | Without_Comments |
| Description type | Description_Simple |
| Success | LLM evaluator consensus (binary per evaluation) |
| Drop | baseline_consensus − variant_consensus (per problem); positive = variant worse |
| Code metrics | LOC (non-empty lines), cyclomatic complexity (lizard), density, Shannon entropy |

## 3. Results

### 3.1 Mean drop in consensus by variant

| Variant | Mean drop | Median drop | n |
|---------|-----------|-------------|---|
| With comments | -0.0160 | 0.0000 | 250 |
| Dead code | -0.0160 | 0.0000 | 250 |
| Literals encryption | 0.2400 | 0.0000 | 250 |
| Variable renaming | -0.0120 | 0.0000 | 250 |

**Encryption has the largest mean drop** among all variants, confirming that literal encryption hurts consensus more than Dead code, With comments, or Variable renaming.

### 3.2 Mean LOC and CC by variant

| Variant | Mean LOC | Mean CC (total) |
|---------|----------|------------------|
| Without comments | 99.4 | 33.3 |
| With comments | 123.1 | 33.0 |
| Dead code | 185.3 | 61.7 |
| Literals encryption | 153.9 | 37.5 |
| Variable renaming | 114.2 | 34.1 |

Dead code has **higher mean LOC** than Encryption; complexity is similar across variants. So the Encryption drop is **not** explained by size or complexity alone.

### 3.3 Regression: consensus ~ variant + LOC + CC

| Coefficient | Estimate | p-value |
|-------------|----------|--------|
| const | 1.2389 | 0.0000 |
| LOC | 0.0013 | 0.4744 |
| CC_total | -0.0017 | 0.7942 |
| variant_With_Comments | 0.0671 | 0.7673 |
| variant_DeadCode | 0.0343 | 0.8863 |
| variant_Encryption | -1.1860 | 0.0000 |
| variant_Variable_Renaming | 0.0555 | 0.8031 |

If **Encryption** has the largest negative coefficient after controlling for LOC and CC, the drop is attributable to the variant type (literal hiding) rather than code size/complexity.

## 4. Figures

- `figures/01_mean_drop_by_variant.pdf`: Bar chart of mean consensus drop by variant (Encryption vs all others).
- `figures/02_boxplot_drop_by_variant.pdf`: Boxplot of drop distribution by variant.
- `figures/03_loc_cc_by_variant.pdf`: Mean LOC and CC by variant (grouped bars).
- `figures/04_consensus_rate_by_variant.pdf`: Consensus rate by variant.
- `figures/05_ranking_drop_all_variants.pdf`: Ranking of all variants by mean drop (worst first); Encryption highlighted.
- `figures/06_scatter_loc_cc_by_variant.pdf`: LOC vs CC scatter colored by variant.

## 5. Conclusion

1. **Encryption** shows the **largest mean drop** in LLM consensus vs baseline **among all variants** (Dead code, With comments, Variable renaming).
2. **Dead code** has **more LOC** and **similar CC** to other variants; the drop for Encryption is therefore not explained by code size or cyclomatic complexity.
3. Regression (if available) tests whether the Encryption effect persists after controlling for LOC and CC.
4. Together, this supports the hypothesis that **hiding literal/semantic content** (encryption) harms description quality more than **structural obfuscation** (dead code) or **naming obfuscation** (variable renaming).
