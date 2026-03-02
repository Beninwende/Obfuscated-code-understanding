#!/usr/bin/env python3
"""
Compute code metrics for top 10 success and top 10 failure problems:
- Lines of code (LOC)
- Cyclomatic complexity (via lizard)
- Shannon entropy of the code

Uses Without_comments.json for original code and closest_to_universal_*.csv for problem lists.
Output: CSV and JSON in this directory.
"""

import csv
import json
import math
import tempfile
from pathlib import Path

try:
    import lizard
except ImportError:
    lizard = None  # will fail at runtime with clear message

SCRIPT_DIR = Path(__file__).resolve().parent
PARENT_DIR = SCRIPT_DIR.parent
WITHOUT_COMMENTS_JSON = PARENT_DIR / "Without_comments.json"
SUCCESS_CSV = PARENT_DIR / "closest_to_universal_success.csv"
FAILURE_CSV = PARENT_DIR / "closest_to_universal_failure.csv"
TOP_N = 10


def load_code_by_problem_id():
    """Load Without_comments.json -> { problem_id: java_code }."""
    with open(WITHOUT_COMMENTS_JSON, "r", encoding="utf-8") as f:
        data = json.load(f)
    return {entry["Sub Directory"].strip(): entry.get("Java Code", "") for entry in data if entry.get("Sub Directory")}


def load_top10_success_ids():
    """First 10 problem IDs from closest_to_universal_success.csv."""
    with open(SUCCESS_CSV, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        rows = list(reader)
    return [row["Problem_ID"] for row in rows[:TOP_N]]


def load_top10_failure_ids():
    """First 10 problem IDs from closest_to_universal_failure.csv."""
    with open(FAILURE_CSV, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        rows = list(reader)
    return [row["Problem_ID"] for row in rows[:TOP_N]]


def lines_of_code(code: str) -> int:
    """Count non-empty lines (strip whitespace)."""
    if not code:
        return 0
    lines = [ln.strip() for ln in code.splitlines() if ln.strip()]
    return len(lines)


def shannon_entropy(code: str) -> float:
    """Shannon entropy (bits) of the source string. H = -sum(p(x)*log2(p(x)))."""
    if not code:
        return 0.0
    from collections import Counter
    n = len(code)
    if n == 0:
        return 0.0
    counts = Counter(code)
    h = 0.0
    for c, cnt in counts.items():
        p = cnt / n
        h -= p * math.log2(p)
    return round(h, 6)


def cyclomatic_complexity_estimate_java(code: str) -> int:
    """Rough cyclomatic complexity: 1 + number of decision points (if, for, while, case, catch, &&, ||, ?)."""
    import re
    # Avoid counting inside strings/comments roughly: count keywords that start a decision
    decision_patterns = [
        r"\bif\s*\(", r"\belse\b", r"\bfor\s*\(", r"\bwhile\s*\(", r"\bcase\s+", r"\bcatch\s*\(",
        r"\?\s*", r"&&", r"\|\|",
    ]
    count = 1
    for pat in decision_patterns:
        count += len(re.findall(pat, code))
    return count


def cyclomatic_complexity_lizard(code: str) -> dict:
    """
    Run lizard on Java code. Returns dict with:
    - total_nloc: total non-comment lines (file-level)
    - total_cyclomatic_complexity: sum of CC over all functions
    - max_cyclomatic_complexity: max CC among functions
    - function_count: number of functions
    """
    if lizard is None:
        est = cyclomatic_complexity_estimate_java(code)
        return {
            "total_nloc": lines_of_code(code),
            "total_cyclomatic_complexity": est,
            "max_cyclomatic_complexity": est,
            "function_count": 0,
            "note": "estimated (lizard not installed)",
        }
    with tempfile.NamedTemporaryFile(mode="w", suffix=".java", delete=False, encoding="utf-8") as tf:
        tf.write(code)
        path = tf.name
    try:
        result = lizard.analyze_file(path)
        # lizard can return a single FileInformation (not a list) in some versions
        if isinstance(result, list) and result:
            fi = result[0]
        elif result is not None and not isinstance(result, list):
            fi = result
        else:
            fi = None
        if fi is None:
            return {"total_nloc": 0, "total_cyclomatic_complexity": 0, "max_cyclomatic_complexity": 0, "function_count": 0}
        nloc = getattr(fi, "nloc", 0) or 0
        funcs = getattr(fi, "function_list", []) or []
        ccs = [getattr(f, "cyclomatic_complexity", 0) or 0 for f in funcs]
        total_cc = sum(ccs)
        max_cc = max(ccs) if ccs else 0
        return {
            "total_nloc": nloc,
            "total_cyclomatic_complexity": total_cc,
            "max_cyclomatic_complexity": max_cc,
            "function_count": len(funcs),
        }
    except (TypeError, AttributeError, IndexError) as e:
        # Fallback: use estimated CC when lizard API differs
        est = cyclomatic_complexity_estimate_java(code)
        return {
            "total_nloc": lines_of_code(code),
            "total_cyclomatic_complexity": est,
            "max_cyclomatic_complexity": est,
            "function_count": 0,
            "note": f"lizard API: {e}; used estimate",
        }
    except Exception as e:
        return {
            "total_nloc": 0,
            "total_cyclomatic_complexity": 0,
            "max_cyclomatic_complexity": 0,
            "function_count": 0,
            "error": str(e),
        }
    finally:
        Path(path).unlink(missing_ok=True)


def compute_metrics(problem_id: str, code: str) -> dict:
    loc = lines_of_code(code)
    entropy = shannon_entropy(code)
    lizard_result = cyclomatic_complexity_lizard(code)
    out = {
        "problem_id": problem_id,
        "lines_of_code": loc,
        "shannon_entropy": entropy,
        "cyclomatic_complexity_total": lizard_result.get("total_cyclomatic_complexity", 0),
        "cyclomatic_complexity_max": lizard_result.get("max_cyclomatic_complexity", 0),
        "lizard_nloc": lizard_result.get("total_nloc", 0),
        "function_count": lizard_result.get("function_count", 0),
    }
    if lizard_result.get("note"):
        out["note"] = lizard_result["note"]
    if lizard_result.get("error"):
        out["error"] = lizard_result["error"]
    return out


def main():
    if lizard is None:
        print("Note: lizard not installed; using estimated cyclomatic complexity. Install with: pip install lizard")
    code_by_pid = load_code_by_problem_id()
    success_ids = load_top10_success_ids()
    failure_ids = load_top10_failure_ids()
    all_ids = list(success_ids) + list(failure_ids)
    missing = [pid for pid in all_ids if pid not in code_by_pid]
    if missing:
        print(f"Warning: no code for problem IDs: {missing}")
    results_success = []
    results_failure = []
    for i, pid in enumerate(success_ids):
        code = code_by_pid.get(pid, "")
        m = compute_metrics(pid, code)
        m["rank"] = i + 1
        m["group"] = "top10_success"
        results_success.append(m)
    for i, pid in enumerate(failure_ids):
        code = code_by_pid.get(pid, "")
        m = compute_metrics(pid, code)
        m["rank"] = i + 1
        m["group"] = "top10_failure"
        results_failure.append(m)
    all_results = results_success + results_failure
    # CSV
    fieldnames = [
        "group", "rank", "problem_id", "lines_of_code", "shannon_entropy",
        "cyclomatic_complexity_total", "cyclomatic_complexity_max", "lizard_nloc", "function_count",
    ]
    csv_path = SCRIPT_DIR / "top10_code_metrics.csv"
    with open(csv_path, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, fieldnames=fieldnames, extrasaction="ignore")
        w.writeheader()
        for r in all_results:
            w.writerow({k: r.get(k, "") for k in fieldnames})
    print(f"Wrote {csv_path}")
    # JSON
    json_path = SCRIPT_DIR / "top10_code_metrics.json"
    out = {
        "top10_success": results_success,
        "top10_failure": results_failure,
    }
    with open(json_path, "w", encoding="utf-8") as f:
        json.dump(out, f, indent=2, ensure_ascii=False)
    print(f"Wrote {json_path}")


if __name__ == "__main__":
    main()
