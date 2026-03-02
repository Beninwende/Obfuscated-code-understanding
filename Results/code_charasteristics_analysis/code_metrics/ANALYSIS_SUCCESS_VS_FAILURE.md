# What Differentiates Top 10 Success vs Top 10 Failure?

This document analyzes the code metrics (LOC, cyclomatic complexity, Shannon entropy) for the **top 10 easiest-to-describe** (success) and **top 10 hardest-to-describe** (failure) problems, to identify factors that distinguish the two groups.

---

## Summary statistics

| Metric | Top 10 success (easy to describe) | Top 10 failure (hard to describe) |
|--------|-----------------------------------|-----------------------------------|
| **Lines of code (LOC)** | mean **128.5**, std 62.0, range [43–240] | mean **76.2**, std 40.4, range [17–149] |
| **Shannon entropy** | mean **3.91**, std 0.51, range [3.27–5.00] | mean **4.39**, std 0.43, range [3.61–5.01] |
| **Cyclomatic complexity (total)** | mean 35.0, std 9.8 | mean 27.7, std 12.8 |
| **Cyclomatic complexity (max)** | mean 15.4, std 4.9 | mean 15.9, std 4.1 |
| **Function count** | mean 8.7, std 4.1 | mean 6.3, std 6.6 |

---

## Main differentiators

### 1. **Shannon entropy — strongest signal**

- **Failures have higher entropy** (4.39 vs 3.91, about **+0.5 bits**).
- Higher entropy means a more **diverse distribution of characters** in the source (more variety in the symbols used, less repetition).

**Important:** All code here is **original source without comments** (from `Without_comments.json`), not obfuscated or renamed.

**Possible reasons (for original code):**

- **Token variety:** Code that is harder to describe often uses a **wider variety** of identifiers, operators, and literals (e.g. string/character tasks, many branches, mixed constructs). That increases character-level diversity and thus entropy.
- **Repetition vs variety:** Easier-to-describe code often has **more repetitive structure** (similar loops, same patterns, repeated calls), which lowers entropy. Harder-to-describe code tends to have **less repetition** and more varied tokens per line.
- **Task type:** Problems that are conceptually harder for LLMs (e.g. toggle, character replacement, digit expansion) may be implemented with more diverse syntax; “easy” problems (counting, sorting) often share similar, repetitive patterns.

So: **code that is harder for LLMs to describe tends to have more character-level variety (higher entropy) in the original source — reflecting task or structural diversity, not obfuscation.**

---

### 2. **Lines of code (size)**

- **Success problems are longer** on average (128.5 LOC vs 76.2 LOC; success is about **1.7×** the size of failure).
- So the **easiest-to-describe** snippets tend to be **longer**; the **hardest** tend to be **shorter**.

**Possible reasons:**

- **More context:** Longer code often includes more structure (classes, helpers, I/O), which gives the model more cues (names, control flow) to infer behavior.
- **Short but hard:** Short snippets that are hard to describe may pack non-obvious logic (state machines, bit tricks, minimal identifiers), so “small” does not mean “simple” for the model.
- **Task type:** Many easy tasks (counting, sorting, filtering) are implemented with moderate length and clear structure; some hard tasks (toggle, replacement, expansion) are short but conceptually or notationally dense.

So: **longer, more “spread out” code tends to be easier to describe; shorter, denser code tends to be harder.**

---

### 3. **Cyclomatic complexity — weak or reversed**

- **Total CC** is slightly higher for success (35.0 vs 27.7); **max CC** is almost the same (15.4 vs 15.9).
- So **raw cyclomatic complexity does not explain** “easy vs hard to describe.” If anything, easier-to-describe code has *more* total branching (more functions, more structure), not less.

**Interpretation:** Difficulty of description is not simply “more branches = harder.” It is more tied to **entropy and size** (and likely to **semantic** and **naming** factors not captured by these metrics).

---

### 4. **Function count**

- Success has more functions on average (8.7 vs 6.3), but failure has higher variance (e.g. one snippet with 22 functions — p03282).
- So **modular, multi-function code** is often **easier** to describe; **very small (few functions) or very fragmented (many tiny functions)** code can be **harder**.

---

## Takeaways

| Factor | Effect | Interpretation |
|--------|--------|----------------|
| **Higher Shannon entropy** | → **Harder** to describe | More character/token variety in the original code (less repetitive structure). |
| **More lines of code** | → **Easier** to describe | More context and visible structure for the model. |
| **Higher total cyclomatic complexity** | Slight association with **easier** | More structured control flow, not necessarily “complex” in a bad way for description. |
| **More functions (moderate)** | → **Easier** to describe | Clearer separation of concerns. |

---

## Implications

1. **For model developers:** Code that is **short and has high token variety** (typical of certain task types in *original* code) is harder to describe; models may benefit from better handling of **diverse, non-repetitive** source patterns.
2. **For benchmarking:** **Entropy** and **size (LOC)** are simple, static features that correlate with success vs failure; they can be used to stratify or analyze evaluation results.
3. **For code documentation:** In *original* code (no comments), **short snippets with high character diversity** tend to be harder for automatic description; **longer code with more repetitive structure** tends to be easier.

---

## Data source

- **Metrics:** `top10_code_metrics.csv` / `top10_code_metrics.json`
- **Success group:** First 10 rows of `../closest_to_universal_success.csv`
- **Failure group:** First 10 rows of `../closest_to_universal_failure.csv`
- **Code:** Original code without comments from `../Without_comments.json`
