# Failure-Type Shift: Single vs Comprehensive Obfuscation (Unified Figure)

This document describes the **unified alluvial (flow) figure** that shows how each failure subtype's share **moves** from **single obfuscation** to **comprehensive obfuscation** for the three models **DeepSeek-R1**, **Gemini**, and **O4-mini**. Suitable for top-tier venues (ACM, IEEE, NeurIPS, etc.).

---

## Data sources

- **Single obfuscation:** Subtype counts per model from the taxonomy's granular classifications (`Results/Taxonomy/granular_subtypes/granular_subtype_frequencies.json`) for `Dataset_deepseek-r1`, `Dataset_Gemini`, and `Dataset_O4-mini`. Counts are summed over all failure types (Encryption, Dead Code, Variable Renaming, Comment Dependency) so the distribution is "over all single-obfuscation failures" per model.
- **Comprehensive obfuscation:** Subtype counts per model from `categorized_failures.csv` (GPT-4o–categorized comprehensive obfuscation failures).

All plots use **percentages** (within each model and condition) so distributions are comparable.

---

## Unified alluvial (flow) figure

**File:** `figure_failure_shift_unified.pdf`

**Design:** One figure with **three panels** (one per model: DeepSeek-R1, Gemini, O4-mini). In each panel:

- **Left column:** "Single obfuscation" — stacked blocks by failure subtype (height = % of failures).
- **Right column:** "Comprehensive obfuscation" — same subtypes, stacked by %.
- **Ribbons (flows):** Each failure subtype is one colored band connecting its segment on the left to its segment on the right. The **width** of the band on the left is that subtype's share under single obfuscation; the width on the right is its share under comprehensive. Narrowing = subtype loses share; widening = subtype gains share.

Same subtype order and color in both columns; a single legend identifies all subtypes. Typography: Times New Roman, clean axes.

**Why it works for a paper:** One unified view of the **movement** of each failure type from single to comprehensive obfuscation. Readers see which subtypes grow or shrink and how the pattern differs across the three models. Standard alluvial/flow style used in top-tier venues.

**Suggested caption:** "Shift of failure subtypes from single obfuscation to comprehensive obfuscation for DeepSeek-R1, Gemini, and O4-mini. Left: distribution under single obfuscation. Right: distribution under comprehensive. Ribbons connect each subtype's share; narrowing (widening) indicates decrease (increase) under comprehensive."

---

## How to generate the figure

From the `error-analysis` directory:

```bash
python plot_failure_shift_single_vs_comprehensive.py
```

**Requirements:** `matplotlib`, `numpy`. Inputs:

- `Results/Taxonomy/granular_subtypes/granular_subtype_frequencies.json`
- `Results/Comprehensive_OBFUS_Analysis/ThreeModels_Simple/similarity/error-analysis/categorized_failures.csv`

**Output (in the same directory):** `figure_failure_shift_unified.pdf`
