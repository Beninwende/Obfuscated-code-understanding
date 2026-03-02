"""
Compute semantic stability per problem and per model from pairwise_similarity.json.
Uses formula: Stability_M(P) = (1/15) * sum(avg_llm_score) over 15 pairs per problem.
Overall: Stability_M = mean over problems of Stability_M(P).
"""
import json
import csv
from pathlib import Path

NUM_PAIRS = 15  # C(6,2) = 15 pairs per problem

def main():
    base = Path(__file__).resolve().parent
    results_dir = base
    pairwise_path = base.parent / "Semantic_Consistency" / "pairwise_similarity.json"

    with open(pairwise_path, "r") as f:
        data = json.load(f)

    per_problem_rows = []
    model_stabilities = []

    for model_block in data:
        model = model_block["model"]
        problems = model_block["problems"]
        problem_stabilities = []

        for prob in problems:
            problem_id = prob["problem_id"]
            pairs = prob["pairs"]
            scores = [p["avg_llm_score"] for p in pairs if p.get("avg_llm_score") is not None]
            if not scores:
                stability_p = None
            else:
                total_sim = sum(scores)
                n = len(scores)
                stability_p = total_sim / n  # average over available pairs (typically 15)
            if stability_p is not None:
                problem_stabilities.append(stability_p)
            per_problem_rows.append({
                "model": model,
                "problem_id": problem_id,
                "stability": round(stability_p, 6) if stability_p is not None else "",
            })

        overall_stability = sum(problem_stabilities) / len(problem_stabilities)
        model_stabilities.append({
            "model": model,
            "stability": round(overall_stability, 6),
        })

    # Save per-problem stability
    per_problem_path = results_dir / "stability_per_problem.csv"
    with open(per_problem_path, "w", newline="") as f:
        w = csv.DictWriter(f, fieldnames=["model", "problem_id", "stability"])
        w.writeheader()
        w.writerows(per_problem_rows)
    print(f"Wrote {per_problem_path} ({len(per_problem_rows)} rows)")

    # Save per-model stability
    model_stability_path = results_dir / "model_stability.csv"
    with open(model_stability_path, "w", newline="") as f:
        w = csv.DictWriter(f, fieldnames=["model", "stability"])
        w.writeheader()
        w.writerows(model_stabilities)
    print(f"Wrote {model_stability_path} ({len(model_stabilities)} models)")

if __name__ == "__main__":
    main()
