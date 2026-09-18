# Failure taxonomy

LLM classifications of cascade failure pairs (score drop across adjacent transformations).

Gold human sample for agreement (n=165): `../human-annotation/taxonomy_annotations_pairs.csv` (LLM↔expert Cohen κ ≈ 0.85).

## Corpora

| File stem | Role |
|-----------|------|
| `java250` | Java CodeNet (250) |
| `java656` | Java MBPP extension (656) |
| `java906` | Pooled Java250+Java656 (paper pooled analyses) |
| `javascript454` | JavaScript MBPP (454) |

Classified pair counts (incl. Correct): java250=1969, java656=2845, javascript454=2092 → **6906** total (paper).

## Layout

- `classifications/*.jsonl` — per-pair LLM labels
- `failure_pairs_*.csv|jsonl` — extracted cascade pairs
- `metrics/` — distribution tables
- `PROTOCOL.md` — labeling protocol
- Combined-obfuscation taxonomy: `../combined/taxonomy/`
