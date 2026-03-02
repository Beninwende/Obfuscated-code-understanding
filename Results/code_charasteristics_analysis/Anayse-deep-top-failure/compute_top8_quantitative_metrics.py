#!/usr/bin/env python3
"""
Reproducible, quantitative comparison: Top 8 success vs Top 8 failure.

Methodology:
- Population: problems with consensus-only success rate (from consensus_only_success_rates.csv).
- Success group: 8 problems with highest success rate (≥50%).
- Failure group: 8 problems with lowest success rate (bottom 8).
- All metrics are computed automatically from (1) full_code_metrics_consensus_50.csv,
  (2) source code in problems_java/<id>/Main.java.

Metrics definitions (reproducible):
- LOC, CC_total, CC_max, density, shannon_entropy, function_count, max_nesting_depth, has_recursion, task_type: from CSV.
- magic_number_count: count of integer literals in source (regex \\b\\d+\\b) excluding {0,1,2,10,100,1024,1000,10000,-1} (common constants).
- has_custom_io: 1 if source contains any of (FastScanner|InputReader|FastReader|hayami|Foster|BKagamiMochi) as type/class name, else 0.
- non_ascii_identifier_count: count of tokens matching Java identifier pattern that contain at least one character with code point > 127.
- static_field_count: count of matches of "static" followed by primitive/String type and identifier (regex).

Output: metrics_top8_success_vs_failure.csv, quantitative_comparison_results.json, and printed table with Mann-Whitney U test (p-value) per metric.
"""

import csv
import re
from pathlib import Path
from collections import defaultdict

SCRIPT_DIR = Path(__file__).resolve().parent
REPO_ROOT = SCRIPT_DIR.parent.parent.parent
PROBLEMS_JAVA = REPO_ROOT / "problems_java"
CSV_METRICS = SCRIPT_DIR / "full_code_metrics_consensus_50.csv"

TOP8_SUCCESS_IDS = [
    "p03470", "p02701", "p02898", "p03160", "p02393", "p02259", "p02835", "p02831"
]
TOP8_FAILURE_IDS = [
    "p02717", "p02687", "p03107", "p02390", "p03449", "p03242", "p02753", "p03469"
]

COMMON_CONSTANTS = {0, 1, 2, -1, 10, 100, 1000, 10000, 1024}
CUSTOM_IO_PATTERN = re.compile(
    r"\b(FastScanner|InputReader|FastReader|hayami|Foster|BKagamiMochi)\b",
    re.IGNORECASE
)
IDENTIFIER_PATTERN = re.compile(r"\b[a-zA-Z_]\w*\b")
STATIC_FIELD_PATTERN = re.compile(
    r"static\s+(?:int|long|boolean|String|double|float|byte|short)\s+\w+"
)


def load_csv_metrics(only_16=False):
    """Load full_code_metrics_consensus_50.csv. If only_16, return just the 16 IDs (top8 success + top8 failure). Else return all rows."""
    ids_16 = set(TOP8_SUCCESS_IDS) | set(TOP8_FAILURE_IDS)
    rows = []
    with open(CSV_METRICS, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for row in reader:
            if only_16 and row["problem_id"] not in ids_16:
                continue
            row["lines_of_code"] = int(row["lines_of_code"])
            row["cyclomatic_complexity_total"] = int(row["cyclomatic_complexity_total"])
            row["cyclomatic_complexity_max"] = int(row["cyclomatic_complexity_max"])
            row["density"] = float(row["density"])
            row["shannon_entropy"] = float(row["shannon_entropy"])
            row["function_count"] = int(row["function_count"])
            row["max_nesting_depth"] = int(row["max_nesting_depth"])
            row["has_recursion"] = int(row.get("has_recursion", 0) == 1 or row.get("has_recursion") == "1")
            rows.append(row)
    return rows


def read_source(problem_id):
    path = PROBLEMS_JAVA / problem_id / "Main.java"
    if not path.exists():
        return ""
    return path.read_text(encoding="utf-8", errors="replace")


def count_magic_numbers(source):
    """Count integer literals excluding common constants."""
    literals = re.findall(r"\b(-?\d+)\b", source)
    count = 0
    for s in literals:
        try:
            v = int(s)
            if v not in COMMON_CONSTANTS:
                count += 1
        except ValueError:
            pass
    return count


def has_custom_io(source):
    return 1 if CUSTOM_IO_PATTERN.search(source) else 0


def count_non_ascii_identifiers(source):
    n = 0
    for m in IDENTIFIER_PATTERN.finditer(source):
        if any(ord(c) > 127 for c in m.group()):
            n += 1
    return n


def count_static_fields(source):
    return len(STATIC_FIELD_PATTERN.findall(source))


def compute_source_metrics(problem_id):
    src = read_source(problem_id)
    return {
        "magic_number_count": count_magic_numbers(src),
        "has_custom_io": has_custom_io(src),
        "non_ascii_identifier_count": count_non_ascii_identifiers(src),
        "static_field_count": count_static_fields(src),
    }


def run_mann_whitney(success_vals, failure_vals):
    """Mann-Whitney U test (two-sided). Returns U and p-value, or None if scipy unavailable."""
    try:
        from scipy.stats import mannwhitneyu
        u, p = mannwhitneyu(success_vals, failure_vals, alternative="two-sided")
        return {"U": float(u), "p_value": float(p)}
    except Exception:
        return {"U": None, "p_value": None}


def run_comparison(success_rows, failure_rows, numeric_keys):
    """Compute per-metric Mann-Whitney and summary stats. Returns list of result dicts."""
    import statistics
    results = []
    for key in numeric_keys:
        s_vals = [r[key] for r in success_rows if key in r and r[key] is not None]
        f_vals = [r[key] for r in failure_rows if key in r and r[key] is not None]
        if not s_vals or not f_vals:
            continue
        mw = run_mann_whitney(s_vals, f_vals)
        results.append({
            "metric": key,
            "success_mean": round(statistics.mean(s_vals), 4),
            "success_median": round(statistics.median(s_vals), 4),
            "success_std": round(statistics.stdev(s_vals), 4) if len(s_vals) > 1 else 0,
            "failure_mean": round(statistics.mean(f_vals), 4),
            "failure_median": round(statistics.median(f_vals), 4),
            "failure_std": round(statistics.stdev(f_vals), 4) if len(f_vals) > 1 else 0,
            "U": mw["U"],
            "p_value": mw["p_value"],
        })
    return results


def main():
    import json
    import statistics

    numeric_keys = [
        "lines_of_code", "cyclomatic_complexity_total", "cyclomatic_complexity_max",
        "density", "shannon_entropy", "function_count", "max_nesting_depth",
        "has_recursion", "magic_number_count", "has_custom_io",
        "non_ascii_identifier_count", "static_field_count",
    ]

    # ---- Part A: Top 8 success vs Top 8 failure (16 samples) ----
    rows_16 = load_csv_metrics(only_16=True)
    if len(rows_16) < 16:
        print("Warning: expected 16 rows from CSV, got", len(rows_16))
    for row in rows_16:
        row.update(compute_source_metrics(row["problem_id"]))
    success_rows = [r for r in rows_16 if r["problem_id"] in TOP8_SUCCESS_IDS]
    failure_8_rows = [r for r in rows_16 if r["problem_id"] in TOP8_FAILURE_IDS]

    results_8v8 = run_comparison(success_rows, failure_8_rows, numeric_keys)

    out_csv = SCRIPT_DIR / "metrics_top8_success_vs_failure.csv"
    all_16 = success_rows + failure_8_rows
    fieldnames = ["group", "problem_id", "success_rate"] + numeric_keys + ["task_type"]
    with open(out_csv, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, fieldnames=fieldnames, extrasaction="ignore")
        w.writeheader()
        for r in all_16:
            w.writerow({k: r.get(k, "") for k in fieldnames})
    print("Wrote", out_csv)

    out_json = SCRIPT_DIR / "quantitative_comparison_results.json"
    with open(out_json, "w", encoding="utf-8") as f:
        json.dump({
            "methodology_8v8": "Top 8 success vs Top 8 failure (bottom 8). Mann-Whitney U, two-sided.",
            "n_success": len(success_rows),
            "n_failure_8": len(failure_8_rows),
            "metric_comparison_8v8": results_8v8,
        }, f, indent=2)
    print("Wrote", out_json)

    print("\n--- (A) Top 8 success vs Top 8 failure ---\n")
    print(f"{'Metric':<35} {'Success (mean±std)':<22} {'Failure (mean±std)':<22} {'p-value (M-W U)':<15}")
    print("-" * 95)
    for r in results_8v8:
        p_str = f"{r['p_value']:.4f}" if r['p_value'] is not None else "N/A"
        sig = " *" if r['p_value'] is not None and r['p_value'] < 0.05 else ""
        print(f"{r['metric']:<35} {r['success_mean']:.2f} ± {r['success_std']:.2f}          {r['failure_mean']:.2f} ± {r['failure_std']:.2f}          {p_str}{sig}")

    # ---- Part B: Top 8 success vs all 242 failure ----
    rows_all = load_csv_metrics(only_16=False)
    for row in rows_all:
        row.update(compute_source_metrics(row["problem_id"]))
    success_rows = [r for r in rows_all if r["group"] == "success"]
    failure_242_rows = [r for r in rows_all if r["group"] == "failure"]

    results_8v242 = run_comparison(success_rows, failure_242_rows, numeric_keys)

    out_json_242 = SCRIPT_DIR / "quantitative_comparison_8_vs_242_results.json"
    with open(out_json_242, "w", encoding="utf-8") as f:
        json.dump({
            "methodology_8v242": "Top 8 success (≥50% consensus) vs all 242 failure (<50% consensus). Mann-Whitney U, two-sided.",
            "n_success": len(success_rows),
            "n_failure": len(failure_242_rows),
            "metric_comparison": results_8v242,
        }, f, indent=2)
    print("\nWrote", out_json_242)

    print("\n--- (B) Top 8 success vs 242 failure ---\n")
    print(f"{'Metric':<35} {'Success (8) mean±std':<22} {'Failure (242) mean±std':<24} {'p-value (M-W U)':<15}")
    print("-" * 100)
    for r in results_8v242:
        p_str = f"{r['p_value']:.4f}" if r['p_value'] is not None else "N/A"
        sig = " *" if r['p_value'] is not None and r['p_value'] < 0.05 else ""
        print(f"{r['metric']:<35} {r['success_mean']:.2f} ± {r['success_std']:.2f}          {r['failure_mean']:.2f} ± {r['failure_std']:.2f}            {p_str}{sig}")
    print("\n* p < 0.05 (significant difference between groups)")


if __name__ == "__main__":
    main()
