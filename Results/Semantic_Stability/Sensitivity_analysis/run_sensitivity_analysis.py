#!/usr/bin/env python3
"""
Sensitivity analysis: re-run comprehension level assignment at three thresholds τ.

Reads model_comprehension.csv (s_enc, s_dead per model) from Comprehension_Level/.
For each τ in {0.45, 0.50, 0.55}:
  - Semantic   if s_enc >= τ
  - Structural if s_enc < τ and s_dead >= τ
  - Lexical    if s_dead < τ

Outputs: sensitivity_table.csv and sensitivity_table.md (Table X for Section 3.6).
"""
import csv
from pathlib import Path

SCRIPT_DIR = Path(__file__).resolve().parent
COMPREHENSION_DIR = SCRIPT_DIR.parent / "Comprehension_Level"
INPUT_CSV = COMPREHENSION_DIR / "model_comprehension.csv"
THRESHOLDS = (0.45, 0.50, 0.55)

# Display names for table (paper)
MODEL_DISPLAY = {
    "Dataset_Gemini": "Gemini",
    "Dataset_deepseek-r1": "DeepSeek-R1",
    "Dataset_O4-mini": "O4-mini",
    "Dataset_qwencoder32B": "Qwen-Coder32B",
    "Dataset_DeepseekV3.1": "DeepSeek-V3.1",
    "Dataset_GPT4o": "GPT-4o",
    "Dataset_GPT3.5": "GPT-3.5",
    "Llama70b_Generation": "Llama-70B",
    "Dataset_mistral": "Mistral",
    "Dataset_Qwen3VL": "Qwen3-VL",
    "Dataset_starchat": "StarChat",
    "Dataset_LlamaVL": "LlamaVL",
    "Dataset_codellama": "CodeLlama",
    "Dataset_starcoder": "StarCoder",
}


def _float_or_none(s: str):
    if s is None or (isinstance(s, str) and s.strip() == ""):
        return None
    try:
        return float(s)
    except (ValueError, TypeError):
        return None


def level_at_tau(s_enc: float | None, s_dead: float | None, tau: float) -> str:
    if s_enc is not None and s_enc >= tau:
        return "Semantic"
    if s_dead is not None and s_dead >= tau:
        return "Structural"
    return "Lexical"


def fmt_metric(val: float | None) -> str:
    if val is None:
        return "—"
    return f"{val:.3f}"


def main():
    if not INPUT_CSV.exists():
        print(f"Missing {INPUT_CSV}. Run Comprehension_Level/compute_comprehension_level.py first.")
        return

    rows = []
    with open(INPUT_CSV, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for row in reader:
            model = (row.get("model") or "").strip()
            s_enc = _float_or_none(row.get("s_enc"))
            s_dead = _float_or_none(row.get("s_dead"))
            display = MODEL_DISPLAY.get(model, model.replace("Dataset_", "", 1) if model.startswith("Dataset_") else model)

            levels = [level_at_tau(s_enc, s_dead, tau) for tau in THRESHOLDS]
            stable = "✓" if len(set(levels)) == 1 else "✗"

            rows.append({
                "model": model,
                "model_display": display,
                "s_enc": s_enc,
                "s_dead": s_dead,
                "level_tau045": levels[0],
                "level_tau050": levels[1],
                "level_tau055": levels[2],
                "stable": stable,
            })

    # Sort: Semantic first, then Structural, then Lexical (by level at 0.50); within group by s_enc desc then s_dead desc
    def order_key(r):
        L = {"Semantic": 0, "Structural": 1, "Lexical": 2}
        return (L.get(r["level_tau050"], 3), -(r["s_enc"] or 0), -(r["s_dead"] or 0))

    rows.sort(key=order_key)

    # CSV
    out_csv = SCRIPT_DIR / "sensitivity_table.csv"
    fieldnames = ["model_display", "s_enc", "s_dead", "level_tau045", "level_tau050", "level_tau055", "stable"]
    with open(out_csv, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, fieldnames=fieldnames, extrasaction="ignore")
        w.writeheader()
        for r in rows:
            out_row = {**r, "s_enc": fmt_metric(r["s_enc"]), "s_dead": fmt_metric(r["s_dead"])}
            w.writerow(out_row)
    print(f"Wrote {out_csv}")

    # Markdown table (Table X for paper)
    out_md = SCRIPT_DIR / "sensitivity_table.md"
    md_lines = [
        "# Sensitivity analysis (Table X)",
        "",
        "Level assignment at τ = 0.45, 0.50, 0.55. Stable? = ✓ if same level for all three.",
        "",
        "| Model | s_enc | s_dead | Level (τ=0.45) | Level (τ=0.50) | Level (τ=0.55) | Stable? |",
        "|-------|-------|--------|-----------------|----------------|----------------|---------|",
    ]
    for r in rows:
        md_lines.append(
            f"| {r['model_display']} | {fmt_metric(r['s_enc'])} | {fmt_metric(r['s_dead'])} | "
            f"{r['level_tau045']} | {r['level_tau050']} | {r['level_tau055']} | {r['stable']} |"
        )
    Path(out_md).write_text("\n".join(md_lines), encoding="utf-8")
    print(f"Wrote {out_md}")


if __name__ == "__main__":
    main()
