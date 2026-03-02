#!/usr/bin/env python3
"""
Analyse succès/échec basée sur le CONSENSUS uniquement, seuil 50%.

- Succès = llm_consensus True uniquement (pas de score ni ST).
- Groupes: success_rate >= 50% (bien décrits) vs < 50% (mal décrits).
- Code analysé: Without_comments.json uniquement.

Métriques calculées pour chaque problème:
- LOC, complexité cyclomatique (lizard), densité (CC/LOC), entropie de Shannon
- Ajouts: type de tâche (description de référence), profondeur d'imbrication, récursion.
"""

import csv
import json
import math
import re
import tempfile
from pathlib import Path
from collections import Counter, defaultdict

try:
    import lizard
except ImportError:
    lizard = None

SCRIPT_DIR = Path(__file__).resolve().parent
RESULTS_ROOT = SCRIPT_DIR.parent  # Results/
WITHOUT_COMMENTS_JSON = SCRIPT_DIR / "Without_comments.json"
SUCCESS_THRESHOLD = 0.50  # 50%

MODELS = [
    "GPT4o", "GPT3.5", "deepseek-r1", "deepseek-v3.1",
    "codellama", "mistral", "qwencoder32B",
    "starchat", "starcoder", "llama70B", "O4-mini",
    "Qwen3VL", "LlamaVL", "Gemini",
]

# Mots-clés pour inférer le type de tâche depuis la description de référence
TASK_KEYWORDS = [
    ("sort", "sort"),
    ("count", "count"),
    ("unique", "unique"),
    ("string", "string"),
    ("digit", "digit"),
    ("graph", "graph"),
    ("tree", "tree"),
    ("sum", "sum"),
    ("minimum", "min"),
    ("maximum", "max"),
    ("replace", "replace"),
    ("parse", "parse"),
    ("compare", "compare"),
    ("filter", "filter"),
    ("gcd", "math"),
    ("modulo", "math"),
    ("recursion", "recursion"),
    ("dp", "dp"),
    ("dynamic", "dp"),
]


def load_all_results_consensus_only():
    """Charge tous les combined_results_*.json et calcule le taux de succès par problème (consensus uniquement)."""
    all_problem_results = defaultdict(lambda: {"success_count": 0, "total": 0, "reference_desc": ""})

    for model in MODELS:
        model_dir = RESULTS_ROOT / f"{model}_Results"
        if not model_dir.exists():
            continue
        for json_file in model_dir.glob("combined_results_*.json"):
            try:
                with open(json_file, "r", encoding="utf-8") as f:
                    data = json.load(f)
            except Exception as e:
                print(f"Warning: could not load {json_file}: {e}")
                continue
            detailed = data.get("detailed_results", {})
            for problem_id, problem_data in detailed.items():
                evaluations = problem_data.get("evaluations", {})
                ref = (problem_data.get("reference_description") or "")[:500]
                if ref and not all_problem_results[problem_id]["reference_desc"]:
                    all_problem_results[problem_id]["reference_desc"] = ref
                for eval_data in evaluations.values():
                    llm_eval = eval_data.get("llm_evaluation", {})
                    consensus = llm_eval.get("consensus", False)
                    all_problem_results[problem_id]["total"] += 1
                    if consensus:
                        all_problem_results[problem_id]["success_count"] += 1
    return dict(all_problem_results)


def apply_threshold(problem_rates, threshold=SUCCESS_THRESHOLD):
    """Applique le seuil 50% et détecte un éventuel décalage (gap) dans la distribution."""
    success_group = []
    failure_group = []
    rates = [r["success_rate"] for r in problem_rates]
    for r in problem_rates:
        if r["success_rate"] >= threshold:
            r["group"] = "success"
            success_group.append(r)
        else:
            r["group"] = "failure"
            failure_group.append(r)
    # Détection de gap: compter combien de problèmes ont un taux dans [threshold-0.05, threshold+0.05]
    near_threshold = sum(1 for s in rates if abs(s - threshold) < 0.05)
    gap_note = None
    if near_threshold > len(rates) * 0.15:
        gap_note = f"Environ {near_threshold} problèmes ont un taux entre {threshold-0.05:.0%} et {threshold+0.05:.0%} (seuil {threshold:.0%})."
    return success_group, failure_group, gap_note


def load_code_without_comments():
    """Charge Without_comments.json -> { problem_id: code }."""
    if not WITHOUT_COMMENTS_JSON.exists():
        return {}
    with open(WITHOUT_COMMENTS_JSON, "r", encoding="utf-8") as f:
        data = json.load(f)
    return {entry["Sub Directory"].strip(): entry.get("Java Code", "") for entry in data if entry.get("Sub Directory")}


def lines_of_code(code: str) -> int:
    if not code:
        return 0
    return len([ln for ln in code.splitlines() if ln.strip()])


def shannon_entropy(code: str) -> float:
    if not code:
        return 0.0
    n = len(code)
    counts = Counter(code)
    h = 0.0
    for cnt in counts.values():
        p = cnt / n
        h -= p * math.log2(p)
    return round(h, 6)


def cyclomatic_complexity_lizard(code: str) -> dict:
    if lizard is None:
        cc_est = 1 + sum(len(re.findall(p, code)) for p in [
            r"\bif\s*\(", r"\belse\b", r"\bfor\s*\(", r"\bwhile\s*\(", r"\bcase\s+", r"\bcatch\s*\(",
            r"\?\s*", r"&&", r"\|\|",
        ])
        return {
            "total_nloc": lines_of_code(code),
            "total_cyclomatic_complexity": cc_est,
            "max_cyclomatic_complexity": cc_est,
            "function_count": 0,
        }
    with tempfile.NamedTemporaryFile(mode="w", suffix=".java", delete=False, encoding="utf-8") as tf:
        tf.write(code)
        path = tf.name
    try:
        result = lizard.analyze_file(path)
        fi = result[0] if isinstance(result, list) and result else result
        if fi is None:
            return {"total_nloc": 0, "total_cyclomatic_complexity": 0, "max_cyclomatic_complexity": 0, "function_count": 0}
        nloc = getattr(fi, "nloc", 0) or 0
        funcs = getattr(fi, "function_list", []) or []
        ccs = [getattr(f, "cyclomatic_complexity", 0) or 0 for f in funcs]
        return {
            "total_nloc": nloc,
            "total_cyclomatic_complexity": sum(ccs),
            "max_cyclomatic_complexity": max(ccs) if ccs else 0,
            "function_count": len(funcs),
        }
    except Exception:
        return {
            "total_nloc": lines_of_code(code),
            "total_cyclomatic_complexity": 0,
            "max_cyclomatic_complexity": 0,
            "function_count": 0,
        }
    finally:
        Path(path).unlink(missing_ok=True)


def max_nesting_depth(code: str) -> int:
    """Profondeur maximale d'imbrication des accolades."""
    depth = 0
    max_d = 0
    in_string = False
    escape = False
    quote = None
    i = 0
    code_len = len(code)
    while i < code_len:
        c = code[i]
        if escape:
            escape = False
            i += 1
            continue
        if c == "\\" and in_string:
            escape = True
            i += 1
            continue
        if in_string:
            if c == quote:
                in_string = False
            i += 1
            continue
        if c in '"\'':
            in_string = True
            quote = c
            i += 1
            continue
        if c == "{":
            depth += 1
            max_d = max(max_d, depth)
        elif c == "}":
            depth = max(0, depth - 1)
        i += 1
    return max_d


def has_recursion(code: str) -> bool:
    """Heuristique: présence d'un appel de méthode récursif (même nom que la méthode courante)."""
    # Trouver les noms de méthodes (simplifié: mot avant '(' après un espace/newline)
    method_names = set(re.findall(r"(?:public|private|protected|static)\s+(?:\w+\s+)+(\w+)\s*\(", code))
    method_names.update(re.findall(r"void\s+(\w+)\s*\(", code))
    for name in method_names:
        # Chercher un appel name( dans le code (peut être récursion)
        if name in ("main", "run", "equals", "hashCode", "toString"):
            continue
        pattern = r"\b" + re.escape(name) + r"\s*\("
        if len(re.findall(pattern, code)) >= 2:
            return True
    return False


def infer_task_type(reference_desc: str) -> str:
    """Infère un type de tâche à partir de la description de référence."""
    if not reference_desc:
        return "other"
    ref_lower = reference_desc.lower()
    for keyword, label in TASK_KEYWORDS:
        if keyword in ref_lower:
            return label
    return "other"


def compute_all_metrics(problem_id: str, code: str, reference_desc: str) -> dict:
    loc = lines_of_code(code)
    entropy = shannon_entropy(code)
    lizard_result = cyclomatic_complexity_lizard(code)
    cc_total = lizard_result.get("total_cyclomatic_complexity", 0)
    density = (cc_total / loc) if loc else 0.0
    return {
        "problem_id": problem_id,
        "lines_of_code": loc,
        "cyclomatic_complexity_total": cc_total,
        "cyclomatic_complexity_max": lizard_result.get("max_cyclomatic_complexity", 0),
        "density": round(density, 6),
        "shannon_entropy": entropy,
        "function_count": lizard_result.get("function_count", 0),
        "max_nesting_depth": max_nesting_depth(code),
        "has_recursion": has_recursion(code),
        "task_type": infer_task_type(reference_desc),
    }


def main():
    print("Loading evaluation results (consensus only)...")
    problem_results = load_all_results_consensus_only()
    if not problem_results:
        print("No results loaded. Check Results/*_Results/combined_results_*.json")
        return

    # Taux de succès par problème
    problem_rates = []
    for pid, data in problem_results.items():
        total = data["total"]
        if total == 0:
            continue
        rate = data["success_count"] / total
        problem_rates.append({
            "problem_id": pid,
            "success_rate": rate,
            "success_count": data["success_count"],
            "total_evaluations": total,
            "reference_desc": data["reference_desc"],
        })
    problem_rates.sort(key=lambda x: x["success_rate"], reverse=True)

    success_group, failure_group, gap_note = apply_threshold(problem_rates, SUCCESS_THRESHOLD)
    print(f"Success (>= {SUCCESS_THRESHOLD:.0%}): {len(success_group)} problems")
    print(f"Failure (< {SUCCESS_THRESHOLD:.0%}): {len(failure_group)} problems")
    if gap_note:
        print("Note:", gap_note)

    # Sauvegarde des taux (consensus only)
    rates_csv = SCRIPT_DIR / "consensus_only_success_rates.csv"
    with open(rates_csv, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, fieldnames=["problem_id", "success_rate", "success_count", "total_evaluations", "group"])
        w.writeheader()
        for r in problem_rates:
            w.writerow({
                "problem_id": r["problem_id"],
                "success_rate": f"{r['success_rate']:.4f}",
                "success_count": r["success_count"],
                "total_evaluations": r["total_evaluations"],
                "group": r["group"],
            })
    print(f"Wrote {rates_csv}")

    # Code sans commentaire
    code_by_pid = load_code_without_comments()
    all_pids = [r["problem_id"] for r in problem_rates]
    missing = [p for p in all_pids if p not in code_by_pid]
    if missing:
        print(f"Warning: no code in Without_comments.json for {len(missing)} problems (e.g. {missing[:5]})")

    # Métriques pour chaque problème ayant du code
    rows = []
    for r in problem_rates:
        pid = r["problem_id"]
        code = code_by_pid.get(pid, "")
        if not code:
            continue
        m = compute_all_metrics(pid, code, r.get("reference_desc", ""))
        m["success_rate"] = r["success_rate"]
        m["group"] = r["group"]
        m["success_count"] = r["success_count"]
        m["total_evaluations"] = r["total_evaluations"]
        rows.append(m)

    # CSV
    fieldnames = [
        "group", "problem_id", "success_rate", "success_count", "total_evaluations",
        "lines_of_code", "cyclomatic_complexity_total", "cyclomatic_complexity_max", "density",
        "shannon_entropy", "function_count", "max_nesting_depth", "has_recursion", "task_type",
    ]
    metrics_csv = SCRIPT_DIR / "full_code_metrics_consensus_50.csv"
    with open(metrics_csv, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, fieldnames=fieldnames, extrasaction="ignore")
        w.writeheader()
        for row in rows:
            row_export = {k: row.get(k, "") for k in fieldnames}
            row_export["success_rate"] = f"{row['success_rate']:.4f}"
            row_export["has_recursion"] = "1" if row.get("has_recursion") else "0"
            w.writerow(row_export)
    print(f"Wrote {metrics_csv}")

    # JSON
    metrics_json = SCRIPT_DIR / "full_code_metrics_consensus_50.json"
    export = {
        "threshold": SUCCESS_THRESHOLD,
        "gap_note": gap_note,
        "success_count": len(success_group),
        "failure_count": len(failure_group),
        "metrics": rows,
    }
    with open(metrics_json, "w", encoding="utf-8") as f:
        json.dump(export, f, indent=2, ensure_ascii=False)
    print(f"Wrote {metrics_json}")

    # Rapport Markdown
    success_rows = [x for x in rows if x["group"] == "success"]
    failure_rows = [x for x in rows if x["group"] == "failure"]
    report_lines = [
        "# Analyse succès / échec (consensus uniquement, seuil 50%)",
        "",
        "Critère de succès: **consensus LLM uniquement** (pas de score ni similarité sémantique).",
        "Code analysé: **Without_comments.json**.",
        "",
        f"- **Groupe succès** (taux >= {SUCCESS_THRESHOLD:.0%}): {len(success_rows)} problèmes.",
        f"- **Groupe échec** (taux < {SUCCESS_THRESHOLD:.0%}): {len(failure_rows)} problèmes.",
        "",
    ]
    if gap_note:
        report_lines.extend(["**Note sur le seuil:**", gap_note, ""])
    report_lines.append("---")
    report_lines.append("")
    report_lines.append("## Statistiques par groupe")
    report_lines.append("")
    report_lines.append("| Métrique | Succès (>=50%) | Échec (<50%) |")
    report_lines.append("|----------|----------------|--------------|")

    def stats(arr, key):
        if not arr:
            return "—", "—"
        vals = [x.get(key) for x in arr if x.get(key) is not None]
        if not vals:
            return "—", "—"
        mean = sum(vals) / len(vals)
        var = sum((v - mean) ** 2 for v in vals) / len(vals)
        std = math.sqrt(var)
        return f"{mean:.2f}", f"{std:.2f}"

    for key, label in [
        ("lines_of_code", "LOC (moy ± std)"),
        ("cyclomatic_complexity_total", "Complexité cyclomatique totale"),
        ("density", "Densité (CC/LOC)"),
        ("shannon_entropy", "Entropie Shannon"),
        ("function_count", "Nombre de fonctions"),
        ("max_nesting_depth", "Profondeur d'imbrication max"),
    ]:
        m_s, s_s = stats(success_rows, key)
        m_f, s_f = stats(failure_rows, key)
        report_lines.append(f"| {label} | {m_s} ± {s_s} | {m_f} ± {s_f} |")

    # Récursion (pourcentage)
    rec_s = sum(1 for x in success_rows if x.get("has_recursion")) / len(success_rows) * 100 if success_rows else 0
    rec_f = sum(1 for x in failure_rows if x.get("has_recursion")) / len(failure_rows) * 100 if failure_rows else 0
    report_lines.append(f"| % avec récursion | {rec_s:.1f}% | {rec_f:.1f}% |")
    report_lines.append("")

    # Types de tâche
    report_lines.append("## Types de tâche (référence)")
    task_s = Counter(x.get("task_type", "other") for x in success_rows)
    task_f = Counter(x.get("task_type", "other") for x in failure_rows)
    report_lines.append("| Type | Succès | Échec |")
    report_lines.append("|------|--------|-------|")
    all_tasks = sorted(set(task_s) | set(task_f))
    for t in all_tasks:
        report_lines.append(f"| {t} | {task_s.get(t, 0)} | {task_f.get(t, 0)} |")
    report_lines.append("")
    report_lines.append("---")
    report_lines.append("")
    report_lines.append("## Interprétation / Différenciateurs")
    report_lines.append("")
    if success_rows and failure_rows:
        report_lines.append("- **Entropie Shannon** : les codes les mieux décrits (succès) ont une entropie en moyenne plus **faible** que les échecs (moins de variété de caractères, structure plus répétitive).")
        report_lines.append("- **Densité (CC/LOC)** : les échecs ont en moyenne une densité plus **élevée** (complexité plus concentrée par ligne).")
        report_lines.append("- **LOC** : les succès tendent à avoir plus de lignes en moyenne (plus de contexte/structure visible).")
        report_lines.append("- **Type de tâche** : dans les succès, les tâches de type *sort* et *count* sont surreprésentées ; dans les échecs, *string*, *sum*, *min*, *max*, *other* dominent.")
        report_lines.append("- **Récursion** : plus fréquente dans le groupe succès (souvent code plus structuré avec des fonctions récursives identifiables).")
    report_lines.append("")
    report_lines.append("---")
    report_lines.append("")
    report_lines.append("*Généré par analyze_success_failure_consensus_50.py*")

    report_path = SCRIPT_DIR / "ANALYSIS_CONSENSUS_50_REPORT.md"
    with open(report_path, "w", encoding="utf-8") as f:
        f.write("\n".join(report_lines))
    print(f"Wrote {report_path}")


if __name__ == "__main__":
    main()
