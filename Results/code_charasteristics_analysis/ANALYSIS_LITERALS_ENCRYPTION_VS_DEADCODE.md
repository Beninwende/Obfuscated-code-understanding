# Analysis: Why Literals Encryption Creates the Biggest Drop vs All Other Variants

**Goal:** Identify which analyses to run for **sound empirical evidence** on why **literals encryption** leads to the **largest drop** in description success **vs all other dataset variants** (Dead code, With comments, Variable renaming), while e.g. **dead code** adds **more LOC** and **similar complexity** but a smaller drop. **No modifications** — analysis and proposal only.

---

## 1. The Five Dataset Variants (Results/Datasets)

| Variant | File | Structure | What differs |
|--------|------|-----------|---------------|
| **With_Comments** | `Dataset_With_Comments.json` | `Sub Directory` + `Java Code` | Inline comments; readable identifiers. |
| **Without_Comments** | `Dataset_Without_Comments.json` | Same | Comments stripped; same logic and literals. |
| **DeadCode** | `Dataset_DeadCode.json` | Same | Dead code (`"".length();`, opaque predicates), obfuscated names (`I`, `Il`, `IIl`), **literal obfuscation** (e.g. `(0x92 ^ 0x96)`), more branches → **more LOC**, similar or higher CC. |
| **Encryption** | `Dataset_Encryption.json` | Same | **Literals encryption**: ints in static arrays (`ll[0]`, `ll[7]`), **strings** via Base64 + DES/Blowfish/XOR; model sees `Main.I("IOpoh3Hiknw=", "tKLbx")` instead of `"3"`. Semantic content (Yes/No, digits, key constants) **hidden**. |
| **Variable_Renaming** | `Variable_Renaming.json` | Same | Identifiers obfuscated (e.g. `Illllllllllllll`); **literals and control flow remain readable**. |

**Link to evaluations:** Problem ID = `Sub Directory` (e.g. `p03494`). Each variant is evaluated separately; results live in `Results/<Model>_Results/combined_results_Dataset_<Variant>_Description.json` (and similarly for other prompts).

---

## 2. Where the “Biggest Drop” Comes From

- **Outcome:** e.g. **consensus rate** (LLM `consensus` = true) or **ST success rate** (semantic similarity above threshold) per (model, prompt type, variant).
- **Baseline:** Typically **Without_Comments** (or With_Comments).
- **Observation (from files):** For the same model (e.g. deepseek-r1) and same prompt (e.g. Description_Detailed):
  - **DeadCode:** consensus_rate ≈ 0.77, ST success_rate ≈ 0.52.
  - **Encryption:** consensus_rate ≈ 0.53, ST success_rate ≈ 0.44.
- So **Encryption** shows a much **larger drop** in both LLM consensus and ST success than **DeadCode**, even though DeadCode has **more LOC** and **similar (or higher) cyclomatic complexity**.

**Implication:** The drop is unlikely to be explained by size/complexity alone; **literal/semantic hiding** (encryption) may matter more than **structural obfuscation** (dead code, extra branches).

---

## 3. Proposed Analyses for Sound Empirical Evidence

### 3.1 Per-variant success (and drop) quantification

- **Inputs:**  
  - For each variant: `Results/<Model>_Results/combined_results_Dataset_<Variant>_Description.json`  
  - Same model(s) and same prompt type(s) (e.g. Description_Simple) across variants.
- **Outputs:**  
  - Table: (Variant, Model, Prompt) → mean score, consensus_rate, ST success_rate, both_success_rate.  
  - **Drop:** e.g. `baseline_success − variant_success` per (problem_id, variant), with baseline = Without_Comments (or With_Comments).  
  - Mean drop (and variance) **by variant** (Encryption, DeadCode, With_Comments, Variable_Renaming).
- **Tests:**  
  - Paired comparisons (same 250 problems): e.g. Wilcoxon signed-rank or mixed model (problem random effect, variant fixed).  
  - Compare **mean drop for Encryption** vs **mean drop for DeadCode**; report p-value and effect size (e.g. Cohen’s d or median difference).
- **Purpose:** Establish with numbers that **Encryption has the largest drop** (and by how much) relative to **all other variants** (DeadCode, With_Comments, Variable_Renaming).

### 3.2 LOC and complexity **by variant** (on variant code)

- **Inputs:**  
  - The **five dataset JSONs** in `Results/Datasets/`: for each problem and each variant, the **Java Code** string for that variant.
- **Computation:**  
  - For each (problem_id, variant): **LOC** (non-empty lines), **cyclomatic complexity** (e.g. lizard: total and max), **density** (CC/LOC), optionally **Shannon entropy** (and any existing metrics from `full_code_metrics_consensus_50.csv` methodology, but applied to **variant** code).
- **Outputs:**  
  - Table/CSV: (problem_id, variant, LOC, CC_total, CC_max, density, entropy).  
  - Summary: mean LOC and mean CC **per variant** (Encryption vs DeadCode vs Without_Comments vs With_Comments vs Variable_Renaming).
- **Purpose:** Check empirically that **DeadCode has higher LOC** and **similar (or same) complexity** vs Encryption (and vs baseline), so the “bigger drop for Encryption” is not trivially explained by “Encryption has more code or more branches.” Compare LOC/CC across **all variants**.

### 3.3 Regression / mediation: variant effect after controlling for size and complexity

- **Inputs:**  
  - Per-problem **outcome** (e.g. consensus 0/1 or ST success 0/1) for each variant (and baseline).  
  - Per-problem **metrics from 3.2** (LOC, CC, density, entropy) **for that variant**.  
  - Optional: task_type or category (if available).
- **Model:**  
  - e.g. Logistic regression: `success ~ variant + LOC + CC_total + (optional: task_type)`, with variant as categorical (baseline = Without_Comments).  
  - Or mixed model: problem random effect, variant + LOC + CC as fixed effects.
- **Outputs:**  
  - Coefficients for **Encryption** vs baseline and **DeadCode** vs baseline; **p-values** and confidence intervals.  
  - If **Encryption** remains the **largest negative coefficient** after controlling for LOC and CC, that supports: “literal encryption has an effect beyond size and complexity.”
- **Purpose:** Test whether the **Encryption drop** is still the biggest **vs all other variants** when LOC and complexity are held constant (or when we control for them).

### 3.4 Literal / semantic “readability” by variant (optional but informative)

- **Idea:** Quantify how much **semantic content** is visible in the code the model sees.
- **Possible metrics (per variant, per problem):**  
  - Fraction of **string literals** that are **plain** (e.g. `"Yes"`, `"No"`, `"3"`) vs **encrypted** (Base64 + decrypt call, or stored in array).  
  - Fraction of **integer literals** that are **direct** (e.g. `0`, `1`, `2`) vs **opaque** (XOR, array index, hex).  
  - Count or ratio of **readable vs opaque** literals.
- **Inputs:**  
  - Same dataset JSONs; simple parsers or heuristics (e.g. regex + list of known decryption patterns).
- **Outputs:**  
  - (problem_id, variant) → e.g. readable_string_ratio, opaque_int_count.  
  - Compare **Encryption** (low readability) vs **DeadCode** (mixed) vs **Without_Comments** (high).
- **Purpose:** Provide **mechanistic** evidence: Encryption reduces “readable” literals the most, aligning with the biggest drop.

---

## 4. Required Inputs and Outputs (reproducibility)

| Analysis | Inputs | Outputs |
|----------|--------|---------|
| **3.1 Drop by variant** | `combined_results_Dataset_*_Description.json` for each variant and one model (or all models); baseline = Without_Comments | CSV: per (problem, variant) success/consensus; table of mean drop by variant; test results (p, effect size) |
| **3.2 LOC/CC by variant** | `Results/Datasets/Dataset_*.json`, `Variable_Renaming.json` (Java Code per problem per variant) | CSV: (problem_id, variant, LOC, CC_total, CC_max, density, entropy); summary table per variant |
| **3.3 Regression** | Outputs of 3.1 (outcome) + 3.2 (metrics per variant) | Model coefficients (variant, LOC, CC), p-values, CIs; conclusion on Encryption vs DeadCode after controls |
| **3.4 Literal readability** | Same dataset JSONs | CSV: (problem_id, variant, readable_string_ratio, opaque_int_ratio or counts); short summary by variant |

---

## 5. Clarifications and Caveats

- **Success definition:** Must be fixed for all analyses (e.g. consensus-only at 50%, or ST threshold, or both_success). The existing pipeline uses **consensus** from LLM evaluators; ST success uses a similarity threshold. Same definition should be used when comparing variants.
- **Metrics on variant code:** Current `full_code_metrics_consensus_50.csv` and `Without_comments.json` are **without comments** only. For 3.2 and 3.3 we need metrics computed **on the exact code the model sees** for each variant (Encryption, DeadCode, etc.).
- **Causation:** These analyses support **associations** and **effect size of variant** after controls; they do not prove that “encryption causes the drop” without further design (e.g. ablation on literal visibility).

---

## 6. Summary

- **Five variants** are clearly defined in `Results/Datasets/`; they share the same (problem_id, Java Code) structure and differ in comments, dead code, **literals encryption**, and variable renaming.
- **“Biggest drop”** is observed for **Encryption** (consensus and ST success much lower than **all other variants** and baseline), while e.g. DeadCode has **more LOC** and **similar complexity**.
- **Sound empirical evidence** can be obtained by:  
  1) **Quantifying drop by variant** (3.1) with tests — compare Encryption vs **all other variants**;  
  2) **Computing LOC and complexity per variant** (3.2) to confirm DeadCode > Encryption in LOC and ≈ in CC across **all variants**;  
  3) **Regressing success on variant + LOC + CC** (3.3) to see if Encryption still has the largest negative effect **among all variants**;  
  4) Optionally **measuring literal/semantic readability** (3.4) to link the drop to hidden semantics.  
- Required **inputs** (dataset JSONs, combined_results JSONs, baseline definition) and **outputs** (CSVs, tables, model outputs) are listed above so the analyses are **reproducible** and reportable.
