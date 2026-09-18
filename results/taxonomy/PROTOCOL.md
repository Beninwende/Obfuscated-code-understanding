# Failure taxonomy protocol

Cascade failure pairs are adjacent transformation comparisons where the LLM-judge score drops across the step (τ = 0.5). Categories:

| Step | Cascade label |
|------|----------------|
| with_comments → without_comments | Comment_Dependency |
| without_comments → renaming | Identifier_Sensitivity |
| renaming → dead_code | Structural_Fragility |
| dead_code → encryption | Semantic_Frontier |

Each pair is labeled with one of eight failure types (or Correct):

1. Obfuscation Narrative  
2. Algorithm Confusion  
3. Algorithm Misunderstanding  
4. Functional Inaccuracy  
5. Hallucination  
6. Semantic Drift  
7. Structural Description Only  
8. Minimal Code Understanding  

## Package artefacts

- Single-transform classifications: `classifications/`, `failure_pairs_*.csv|jsonl`, `metrics/`
- Human gold sample (n=165): `../human-annotation/taxonomy_annotations_pairs.csv`
- Combined obfuscation: `../combined/taxonomy/`

Classifier used for population labels: Gemini taxonomy model (see paper methodology).
