"""
Compare Comprehensive Obfuscation (Description_Simple) vs Encryption-only (Description_Simple)
for the three models: DeepSeek, Gemini, O4.
Outputs: CSV table and a short summary.
"""
import json
import csv
from pathlib import Path

# Base paths (script lives in Results/Comprehensive_OBFUS_Analysis)
BASE = Path(__file__).resolve().parent
RESULTS = BASE.parent  # Results/

DESC = "Description_Simple"

# Comprehensive: mixed obfuscation (Obfuscated_Without_comments)
COMPREHENSIVE_CONFIG = [
    ("DeepSeek", BASE / "ThreeModels_Simple" / "similarity" / "DeepSeek" / "combined_results_Obfuscated_Without_comments.json"),
    ("Gemini",   BASE / "ThreeModels_Simple" / "similarity" / "Gemini"   / "combined_results_Obfuscated_Without_comments.json"),
    ("O4",       BASE / "ThreeModels_Simple" / "similarity" / "O4"       / "combined_results_Obfuscated_Without_comments.json"),
]

# Encryption-only (Description_Simple used)
ENCRYPTION_CONFIG = [
    ("DeepSeek", RESULTS / "deepseek-r1_Results" / "combined_results_Dataset_Encryption_Description.json"),
    ("Gemini",   RESULTS / "Gemini_Results"     / "combined_results_Dataset_Encryption_Description.json"),
    ("O4",       RESULTS / "O4-mini_Results"    / "combined_results_Dataset_Encryption_Description.json"),
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

    for model_name, path in COMPREHENSIVE_CONFIG:
        if not path.exists():
            print(f"Warning: missing {path}")
            continue
        with open(path, "r", encoding="utf-8") as f:
            data = json.load(f)
        stats = extract_description_simple_stats(data)
        if stats is None:
            print(f"Warning: no {DESC} in {path}")
            continue
        rows.append({
            "Model": model_name,
            "Condition": "Comprehensive",
            "LLM_mean": round(stats["llm_mean"], 4),
            "LLM_consensus_rate": round(stats["llm_consensus_rate"], 4),
            "ST_mean": round(stats["st_mean"], 4),
            "ST_success_rate": round(stats["st_success_rate"], 4),
            "agreement_rate": round(stats["agreement_rate"], 4),
            "both_success_rate": round(stats["both_success_rate"], 4),
            "N": stats["n"],
        })

    for model_name, path in ENCRYPTION_CONFIG:
        if not path.exists():
            print(f"Warning: missing {path}")
            continue
        with open(path, "r", encoding="utf-8") as f:
            data = json.load(f)
        stats = extract_description_simple_stats(data)
        if stats is None:
            print(f"Warning: no {DESC} in {path}")
            continue
        rows.append({
            "Model": model_name,
            "Condition": "Encryption",
            "LLM_mean": round(stats["llm_mean"], 4),
            "LLM_consensus_rate": round(stats["llm_consensus_rate"], 4),
            "ST_mean": round(stats["st_mean"], 4),
            "ST_success_rate": round(stats["st_success_rate"], 4),
            "agreement_rate": round(stats["agreement_rate"], 4),
            "both_success_rate": round(stats["both_success_rate"], 4),
            "N": stats["n"],
        })

    # Sort: by model, then Comprehensive before Encryption
    order = {"Comprehensive": 0, "Encryption": 1}
    rows.sort(key=lambda r: (r["Model"], order[r["Condition"]]))

    # Write CSV
    out_csv = BASE / "encryption_vs_comprehensive_description_simple.csv"
    fieldnames = ["Model", "Condition", "LLM_mean", "LLM_consensus_rate", "ST_mean", "ST_success_rate", "agreement_rate", "both_success_rate", "N"]
    with open(out_csv, "w", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, fieldnames=fieldnames)
        w.writeheader()
        w.writerows(rows)
    print(f"Written: {out_csv}")

    # Short summary
    out_summary = BASE / "encryption_vs_comprehensive_summary.txt"
    lines = [
        "Encryption (Description_Simple) vs Comprehensive Obfuscation (Description_Simple)",
        "=" * 70,
        "",
    ]
    for model in ["DeepSeek", "Gemini", "O4"]:
        comp = next((r for r in rows if r["Model"] == model and r["Condition"] == "Comprehensive"), None)
        enc = next((r for r in rows if r["Model"] == model and r["Condition"] == "Encryption"), None)
        if not comp or not enc:
            continue
        lines.append(f"{model}")
        lines.append(f"  Comprehensive: LLM_mean={comp['LLM_mean']}, consensus={comp['LLM_consensus_rate']}, ST_mean={comp['ST_mean']}, ST_success={comp['ST_success_rate']}, N={comp['N']}")
        lines.append(f"  Encryption:     LLM_mean={enc['LLM_mean']}, consensus={enc['LLM_consensus_rate']}, ST_mean={enc['ST_mean']}, ST_success={enc['ST_success_rate']}, N={enc['N']}")
        llm_diff = enc["LLM_mean"] - comp["LLM_mean"]
        st_diff = enc["ST_mean"] - comp["ST_mean"]
        lines.append(f"  Delta (Enc - Comp): LLM_mean={llm_diff:+.4f}, ST_mean={st_diff:+.4f}")
        lines.append("")
    with open(out_summary, "w", encoding="utf-8") as f:
        f.write("\n".join(lines))
    print(f"Written: {out_summary}")


if __name__ == "__main__":
    main()
