# Generation

LLM description outputs and generation scripts.

## Layout

```
generation/
  prompts.txt
  scripts/                         # API generation scripts
  outputs/<corpus>/<Model>/        # description JSON per variant
```

Corpora match `data/` and `evaluation/`:

| Corpus | Models | Files per model |
|--------|--------|-----------------|
| `java250` | 20 | 5 variant JSON |
| `java656` | 20 | 5 variant JSON |
| `javascript250` | 20 | 5 variant JSON |
| `javascript454` | 20 | 5 variant JSON |
| `combined` | 8 | stacked-obfuscation JSON |

Model folder names are uniform across corpora, e.g. `GLM5`, `KimiK25`, `ClaudeSonnet5`, `Deepseek-R1`, `GPT4o`.  
Evaluation counterparts live under `evaluation/<corpus>/<Model>_Results/` (legacy casing may differ slightly, e.g. `deepseek-r1_Results`).

## Variant files (single-transform corpora)

- `Data_With_Comments_Description.json`
- `Data_Without_Comments_Description.json`
- `Variable_Renaming_Description.json`
- `Dataset_DeadCode_Description.json`
- `Dataset_Encryption_Description.json`

## Combined

`outputs/combined/<Model>/Dataset_Combined_Obfuscation_Description.json`  
(eight models used in the combined-obfuscation experiment).
