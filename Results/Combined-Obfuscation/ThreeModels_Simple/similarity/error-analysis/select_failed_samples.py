"""
Select 86 failed samples (LLM consensus = False) for error analysis.
Balanced across DeepSeek, Gemini, O4: ~29, ~29, ~28 per model.
Outputs in error-analysis/: selected_sample_ids.json, selected_samples_manifest.csv
"""
import json
import random
import csv
from pathlib import Path

# Paths: script lives in similarity/error-analysis/
ERROR_ANALYSIS_DIR = Path(__file__).resolve().parent
SIMILARITY_DIR = ERROR_ANALYSIS_DIR.parent
MODELS = ["DeepSeek", "Gemini", "O4"]
DESC_TYPE = "Description_Simple"
TOTAL_SAMPLES = 86
RANDOM_SEED = 42


def get_failed_sample_ids_per_model():
    """Load each model's combined_results and return { model: [problem_id, ...] } for failed (consensus=False) only."""
    out = {}
    for model in MODELS:
        path = SIMILARITY_DIR / model / "combined_results_Obfuscated_Without_comments.json"
        if not path.exists():
            print(f"Warning: {path} not found")
            out[model] = []
            continue
        with open(path, "r", encoding="utf-8") as f:
            data = json.load(f)
        failed = []
        for pid, entry in data.get("detailed_results", {}).items():
            ev = entry.get("evaluations", {}).get(DESC_TYPE, {})
            le = ev.get("llm_evaluation", {})
            if le.get("consensus") is False:
                failed.append(pid)
        out[model] = failed
        print(f"{model}: {len(failed)} failed samples (consensus=False)")
    return out


def select_balanced(failed_per_model, total=86, seed=42):
    """
    Select total samples balanced across models. Uses floor(total/3) for first two, rest for third.
    Returns [ (model, problem_id), ... ]
    """
    random.seed(seed)
    n = total
    per_first = n // 3
    per_second = n // 3
    per_third = n - per_first - per_second
    targets = [per_first, per_second, per_third]
    selected = []
    for model, target in zip(MODELS, targets):
        pool = failed_per_model.get(model, [])
        if len(pool) <= target:
            chosen = list(pool)
        else:
            chosen = random.sample(pool, target)
        for pid in chosen:
            selected.append((model, pid))
    return selected


def main():
    ERROR_ANALYSIS_DIR.mkdir(parents=True, exist_ok=True)

    failed_per_model = get_failed_sample_ids_per_model()
    selected = select_balanced(failed_per_model, total=TOTAL_SAMPLES, seed=RANDOM_SEED)

    # Save list of (model, problem_id)
    ids_by_model = {m: [] for m in MODELS}
    for model, pid in selected:
        ids_by_model[model].append(pid)

    out_json = ERROR_ANALYSIS_DIR / "selected_sample_ids.json"
    with open(out_json, "w", encoding="utf-8") as f:
        json.dump({"total": len(selected), "seed": RANDOM_SEED, "by_model": ids_by_model, "flat": [{"model": m, "problem_id": p} for m, p in selected]}, f, indent=2)
    print(f"Saved: {out_json}")

    out_csv = ERROR_ANALYSIS_DIR / "selected_samples_manifest.csv"
    with open(out_csv, "w", newline="", encoding="utf-8") as f:
        w = csv.writer(f)
        w.writerow(["model", "problem_id"])
        for model, pid in selected:
            w.writerow([model, pid])
    print(f"Saved: {out_csv}")

    print(f"Total selected: {len(selected)} (target {TOTAL_SAMPLES})")
    for m in MODELS:
        print(f"  {m}: {len(ids_by_model[m])}")


if __name__ == "__main__":
    main()
