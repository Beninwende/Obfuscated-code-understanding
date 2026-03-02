# Expert Code Analysis: Top 8 Success vs Top 8 Failure

**Note:** This document is **interpretive**. For **quantifiable, methodologically sound, and reproducible** evidence, see **QUANTITATIVE_REPORT_TOP8_SUCCESS_VS_FAILURE.md** and the script **compute_top8_quantitative_metrics.py**.

**Context:** LLMs were asked to describe code (consensus-only success rate).  
**Top 8 success:** 50.0 % – 60.5 % consensus. **Top 8 failure:** 11.2 % – 15.0 % consensus.  
This document explains **why** some code is consistently easier or harder for LLMs to describe correctly.

---

## 1. Top 8 success — what they have in common

| ID    | Core task (from code) | Why LLMs succeed |
|-------|------------------------|------------------|
| p03470 | Count **distinct integers** (HashSet) | Single, well-known pattern: read N, add to Set, output size. No ambiguity. |
| p02701 | Count **distinct strings** (HashSet) | Same pattern as above; standard library and naming make intent obvious. |
| p02898 | Count elements **≥ k** in array | Simple loop + one condition. Variable names (arr, k, c) support the narrative. |
| p03160 | **Min cost path** (1 or 2 steps, DP/memo) | Classic algorithm; recursive structure and `minCostFrom` make the “min cost” intent clear despite boilerplate. |
| p02393 | **Sort three numbers** (output ordered a,b,c) | Many branches but a single, universally understood intent: “order three values.” |
| p02259 | **Bubble sort** + count swaps | Classic algorithm; `flag`, `count`, `tmp` and the nested loop match textbook bubble sort. |
| p02835 | Read 3 ints; if sum ≤ 21 output "win" else "bust" | Trivial I/O + one condition. No extra structure to misinterpret. |
| p02831 | **LCM** via prime factorization (merge factor lists) | Clear phases: factorize A and B, merge by prime, multiply. Names like `a_num`, `b_num` suggest “numbers/factors.” |

### Recurring success factors

1. **Single, nameable task** — “count distinct,” “sort three numbers,” “bubble sort,” “min cost path,” “LCM.” The main behavior can be stated in one sentence.
2. **Standard algorithms or patterns** — Set for uniqueness, classic sort, simple DP. LLMs have strong priors for these.
3. **Consistent naming** — Variables (e.g. `mochi`, `set`, `count`, `minCostFrom`) align with the high-level intent.
4. **Clear control flow** — Linear or simple recursion; no obscure state machines.
5. **Boilerplate separable** — Fast I/O or helpers can be ignored; the “solver” or main logic is localized and readable.

---

## 2. Top 8 failure — what makes description hard

| ID    | What the code does (brief) | Why LLMs fail |
|-------|----------------------------|----------------|
| p02717 | **Trivial:** read x,y,z → print z,x,y | **Dead code:** many unused static fields (`S`, `n`, `seen`, `field`, `mod`) and a full `FastScanner` with `nextIntArray`, `nextLongArray`. Models may describe the scaffolding or “unused state” instead of the three-line permutation. |
| p02687 | **Trivial:** if input "ABC" → "ARC" else "ABC" | **Non-standard API:** `in.String()`, `in.Int()` (capital S, capital I) instead of `next()`/`nextInt()`. Unusual naming distracts from the trivial branching. |
| p03107 | **Custom linked list** over digit string; state machine (0/1) | **Opaque intent:** no comments; pointer/start updates and branches are hard to summarize as one “task.” Describing “what” vs “how” is ambiguous. |
| p02390 | Parse input and output **time as H:MM:SS** (seconds → formatted) | **Magic numbers** (47, 58, 10, 32); **Japanese names** (`hairetsu`, `keta`, `deru`); raw `System.in.read()`. Parsing logic is low-level and culture-specific. |
| p03449 | **2D grid max-path** (dfs) | **Verbose, repetitive conditions** (`0<=x+1 && x+1<2 && 0<=y && y<n && ...`). The idea is simple but buried in bounds checks; LLMs may focus on condition structure rather than “max sum path.” |
| p03242 | **Digit-based counting** (e.g. count 1s/9s in decimal representation) | **Nested digit logic** (N/100, a/10, a/1) with no explanatory names. “What” is being counted is not obvious from identifiers. |
| p02753 | **main:** count A/B in first 3 chars → "Yes"/"No" | **Large dead code:** most of the file is `kMarsh` (grid rectangle algorithm). Main is a few lines; the rest is unrelated. Models often describe the big, complex function instead of the tiny main. |
| p03469 | **Trivial:** replace "2017" with "2018" in string and print | **Obfuscated reader:** class `hayami`, methods `nextHayami()`, `HayamiSaori()`, `saori_hayami()`. Intent is trivial; the reader looks like the “main” program and draws attention away from the one-line logic. |

### Recurring failure factors

1. **Trivial core + noisy context** — Very simple behavior (permutation, ABC/ARC, string replace) surrounded by unused or non-standard code. LLMs describe the wrong part.
2. **Non-standard or obfuscated naming** — `String()`/`Int()`, `hayami`/`saori`, Japanese identifiers. Breaks expectations and shifts focus from intent to “what is this API?”.
3. **Intent not nameable in one sentence** — Custom state machines, low-level parsing, or digit hacks without a clear, standard label (“run-length on digits,” “parse time,” “digit-count rule”).
4. **Magic numbers and raw I/O** — `47`, `58`, `10`, `32`; `System.in.read()`. No semantic cues; LLMs must infer domain (e.g. digits, newline, space) from usage.
5. **Dead code or misleading proportion** — One short main vs a large unused function (e.g. kMarsh) or many unused fields. Length and complexity bias the description toward the wrong component.
6. **Verbose conditionals** — Long boolean expressions that obscure a simple idea (e.g. “max path on 2 rows”) and invite description of the condition structure instead of the task.

---

## 3. How this justifies the success/failure discrepancy

- **Success:** Code that is easy to describe has a **single, standard, nameable task**, **consistent naming**, and **clear separation** between boilerplate and core logic. That matches what LLMs are good at: recognizing common patterns and summarizing them in one sentence.
- **Failure:** Code that is hard to describe either (a) has **trivial intent hidden** by dead code, obfuscation, or non-standard APIs, or (b) has **non-standard, multi-step intent** (custom structures, state machines, digit/parsing tricks) with few semantic cues. In both cases, the model’s “summary” does not align with the actual main behavior, so consensus drops.

So the discrepancy is **not** mainly about “harder algorithms” in the failure set. It is about:

1. **Clarity of the main task** (one clear sentence vs many possible interpretations).  
2. **Consistency with common patterns and naming** (standard algorithms and names vs obfuscation and culture-specific names).  
3. **Signal vs noise** (core logic easy to locate vs buried in dead code or boilerplate).

---

## 4. Practical takeaways

- **For benchmarking:** Include both “simple task + noisy context” and “opaque intent” (state machines, digit logic, custom parsing) to stress-test whether models describe the **right** part and the **right** level of abstraction.
- **For model improvement:** Better handling of (1) dead code and (2) non-standard identifiers would help on the “trivial core” failures; better abstraction over verbose conditions and custom control flow would help on the “opaque intent” failures.
- **For code quality:** Code that is easier for LLMs to describe tends to have a clear, nameable task, standard names, and minimal irrelevant structure—properties that also help human readers.

---

*Analysis based on the 8 highest and 8 lowest consensus-rate problems in `consensus_only_success_rates.csv`, with source code from `problems_java/`.*
