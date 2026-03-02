"""
Collect Description_Simple stats for all variants (With/Without comments, Variable renaming,
Dead code, Encryption, Comprehensive obfuscation) for the three models: DeepSeek, Gemini, O4.
Outputs: all_variants_description_simple.csv
"""
import json
import csv
from pathlib import Path

BASE = Path(__file__).resolve().parent
RESULTS = BASE.parent
DESC = "Description_Simple"

# Model key -> (display name, Results folder name for per-variant JSONs)
MODELS = [
    ("DeepSeek", "DeepSeek-R1", "deepseek-r1_Results"),
    ("Gemini", "Gemini", "Gemini_Results"),
    ("O4", "O4-mini", "O4-mini_Results"),
]

# Variants from main Results: (condition_key, display_name, results file stem)
VARIANTS_FROM_RESULTS = [
    ("With_Comments", "With comments", "Dataset_With_Comments_Description"),
    ("Without_Comments", "Without comments", "Dataset_Without_Comments_Description"),
    ("Variable_Renaming", "Variable renaming", "Variable_Renaming_Description"),
    ("DeadCode", "Dead code", "Dataset_DeadCode_Description"),
    ("Encryption", "Encryption", "Dataset_Encryption_Description"),
]

# Comprehensive: from ThreeModels_Simple (different path)
COMPREHENSIVE_PATHS = [
    ("DeepSeek", BASE / "ThreeModels_Simple" / "similarity" / "DeepSeek" / "combined_results_Obfuscated_Without_comments.json"),
    ("Gemini",   BASE / "ThreeModels_Simple" / "similarity" / "Gemini"   / "combined_results_Obfuscated_Without_comments.json"),
    ("O4",       BASE / "ThreeModels_Simple" / "similarity" / "O4"       / "combined_results_Obfuscated_Without_comments.json"),
]


def extract_description_simple_stats(data):
    """Extract Description_Simple stats from a combined_results JSON."""
    if DESC not in data.get("summary", {}).get("llm_statistics", {}):
        return None
    llm = data["summary"]["llm_statistics"][DESC]
    st = data["summary"]["st_statistics"][DESC]
    comb = data["summary"]["combined_statistics"][DESC]
    return {
        "llm_mean": llm["mean"],
        "llm_consensus_rate": llm["consensus_rate"],
        "st_mean": st["mean"],
        "st_success_rate": st["success_rate"],
        "agreement_rate": comb["agreement_rate"],
        "both_success_rate": comb["both_success_rate"],
        "n": llm["count"],
    }


def main():
    rows = []

    # Per-variant from Results (With/Without comments, Variable renaming, Dead code, Encryption)
    for model_key, display_name, folder in MODELS:
        model_dir = RESULTS / folder
        for cond_key, cond_display, stem in VARIANTS_FROM_RESULTS:
            path = model_dir / f"combined_results_{stem}.json"
            if not path.exists():
                print(f"Warning: missing {path}")
                continue
            with open(path, "r", encoding="utf-8") as f:
                data = json.load(f)
            stats = extract_description_simple_stats(data)
            if stats is None:
                continue
            rows.append({
                "Model": model_key,
                "Model_Display": display_name,
                "Condition": cond_display,
                "Condition_Key": cond_key,
                "LLM_mean": round(stats["llm_mean"], 4),
                "LLM_consensus_rate": round(stats["llm_consensus_rate"], 4),
                "ST_mean": round(stats["st_mean"], 4),
                "ST_success_rate": round(stats["st_success_rate"], 4),
                "agreement_rate": round(stats["agreement_rate"], 4),
                "both_success_rate": round(stats["both_success_rate"], 4),
                "N": stats["n"],
            })

    # Comprehensive obfuscation (ThreeModels_Simple)
    for model_key, path in COMPREHENSIVE_PATHS:
        if not path.exists():
            print(f"Warning: missing {path}")
            continue
        with open(path, "r", encoding="utf-8") as f:
            data = json.load(f)
        stats = extract_description_simple_stats(data)
        if stats is None:
            continue
        display_name = next(m[1] for m in MODELS if m[0] == model_key)
        rows.append({
            "Model": model_key,
            "Model_Display": display_name,
            "Condition": "Comprehensive",
            "Condition_Key": "Comprehensive",
            "LLM_mean": round(stats["llm_mean"], 4),
            "LLM_consensus_rate": round(stats["llm_consensus_rate"], 4),
            "ST_mean": round(stats["st_mean"], 4),
            "ST_success_rate": round(stats["st_success_rate"], 4),
            "agreement_rate": round(stats["agreement_rate"], 4),
            "both_success_rate": round(stats["both_success_rate"], 4),
            "N": stats["n"],
        })

    # Sort: by model, then by condition order
    condition_order = ["With comments", "Without comments", "Variable renaming", "Dead code", "Encryption", "Comprehensive"]
    def row_key(r):
        mi = next(i for i, m in enumerate(MODELS) if m[0] == r["Model"])
        ci = condition_order.index(r["Condition"]) if r["Condition"] in condition_order else 99
        return (mi, ci)
    rows.sort(key=row_key)

    out_csv = BASE / "all_variants_description_simple.csv"
    fieldnames = ["Model", "Model_Display", "Condition", "Condition_Key", "LLM_mean", "LLM_consensus_rate", "ST_mean", "ST_success_rate", "agreement_rate", "both_success_rate", "N"]
    with open(out_csv, "w", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, fieldnames=fieldnames)
        w.writeheader()
        w.writerows(rows)
    print(f"Written: {out_csv} ({len(rows)} rows)")


if __name__ == "__main__":
    main()
