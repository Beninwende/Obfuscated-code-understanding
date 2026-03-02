#!/usr/bin/env python3
"""
Compute comprehension level per model from pairwise_similarity.json.

Defines:
- Encryption pairs: pair has "encryption" in {transform1, transform2}
- Dead-code (no enc) pairs: "dead_code" in pair and "encryption" not in pair
- Lexical pairs: both transforms in {original_description, with_comments, without_comments, variable_renaming}

Per model: s_enc, s_dead, s_lex (mean similarity over respective pairs, over all problems).
Comprehension level: Semantic (s_enc >= tau), Structural (s_enc < tau & s_dead >= tau), Lexical (s_dead < tau).
"""
import json
import csv
from pathlib import Path

TAU = 0.5
LEXICAL_VARIANTS = {"original_description", "with_comments", "without_comments", "variable_renaming"}


def pair_is_encryption(t1: str, t2: str) -> bool:
    return "encryption" in (t1, t2)


def pair_is_dead_no_enc(t1: str, t2: str) -> bool:
    return "dead_code" in (t1, t2) and "encryption" not in (t1, t2)


def pair_is_lexical(t1: str, t2: str) -> bool:
    return t1 in LEXICAL_VARIANTS and t2 in LEXICAL_VARIANTS


def main():
    base = Path(__file__).resolve().parent
    # pairwise_similarity.json is in Results/Semantic_Consistency
    pairwise_path = base.parent.parent / "Semantic_Consistency" / "pairwise_similarity.json"
    out_dir = base

    with open(pairwise_path, "r") as f:
        data = json.load(f)

    rows = []
    per_problem_rows = []

    for model_block in data:
        model = model_block["model"]
        scores_enc = []
        scores_dead = []
        scores_lex = []

        for prob in model_block["problems"]:
            problem_id = prob["problem_id"]
            p_enc = []
            p_dead = []
            p_lex = []

            for pair in prob["pairs"]:
                s = pair.get("avg_llm_score")
                if s is None:
                    continue
                t1, t2 = pair["transform1"], pair["transform2"]
                if pair_is_encryption(t1, t2):
                    p_enc.append(s)
                if pair_is_dead_no_enc(t1, t2):
                    p_dead.append(s)
                if pair_is_lexical(t1, t2):
                    p_lex.append(s)

            if p_enc:
                m_enc = sum(p_enc) / len(p_enc)
                scores_enc.append(m_enc)
            if p_dead:
                m_dead = sum(p_dead) / len(p_dead)
                scores_dead.append(m_dead)
            if p_lex:
                m_lex = sum(p_lex) / len(p_lex)
                scores_lex.append(m_lex)

            per_problem_rows.append({
                "model": model,
                "problem_id": problem_id,
                "s_enc": round(sum(p_enc) / len(p_enc), 6) if p_enc else "",
                "s_dead": round(sum(p_dead) / len(p_dead), 6) if p_dead else "",
                "s_lex": round(sum(p_lex) / len(p_lex), 6) if p_lex else "",
            })

        s_enc = sum(scores_enc) / len(scores_enc) if scores_enc else None
        s_dead = sum(scores_dead) / len(scores_dead) if scores_dead else None
        s_lex = sum(scores_lex) / len(scores_lex) if scores_lex else None

        if s_enc is not None and s_enc >= TAU:
            level = "Semantic"
        elif s_dead is not None and s_dead >= TAU:
            level = "Structural"
        else:
            level = "Lexical"

        rows.append({
            "model": model,
            "s_enc": round(s_enc, 6) if s_enc is not None else "",
            "s_dead": round(s_dead, 6) if s_dead is not None else "",
            "s_lex": round(s_lex, 6) if s_lex is not None else "",
            "comprehension_level": level,
        })

    # Save per-model summary
    summary_path = out_dir / "model_comprehension.csv"
    with open(summary_path, "w", newline="") as f:
        w = csv.DictWriter(f, fieldnames=["model", "s_enc", "s_dead", "s_lex", "comprehension_level"])
        w.writeheader()
        w.writerows(rows)
    print(f"Wrote {summary_path} ({len(rows)} models)")

    # Save per-problem detail (optional)
    detail_path = out_dir / "comprehension_per_problem.csv"
    with open(detail_path, "w", newline="") as f:
        w = csv.DictWriter(f, fieldnames=["model", "problem_id", "s_enc", "s_dead", "s_lex"])
        w.writeheader()
        w.writerows(per_problem_rows)
    print(f"Wrote {detail_path} ({len(per_problem_rows)} rows)")


if __name__ == "__main__":
    main()
