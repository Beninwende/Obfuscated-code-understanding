#!/usr/bin/env python3
"""
Compute global failure percentages: share of each failure type (Encryption, Dead_Code,
Variable_Renaming, Comment_Dependency) across all models.
Uses granular_subtypes JSONs (same counts as taxonomy failures, with subtypes).
"""

import json
from pathlib import Path

SCRIPT_DIR = Path(__file__).resolve().parent
GRANULAR_DIR = SCRIPT_DIR / "granular_subtypes"


def main():
    total_by_type = {}
    total_failures = 0
    for path in sorted(GRANULAR_DIR.glob("Dataset_*_granular_subtypes.json")):
        with open(path, "r", encoding="utf-8") as f:
            data = json.load(f)
        by_type = data.get("failures_by_type") or {}
        for ft, count in by_type.items():
            total_by_type[ft] = total_by_type.get(ft, 0) + count
            total_failures += count

    if total_failures == 0:
        print("No failures found.")
        return

    # Order: Comment_Dependency, Variable_Renaming, Dead_Code, Encryption (then any other)
    order = [
        "Comment_Dependency",
        "Variable_Renaming_Failure",
        "Dead_Code_Failure",
        "Encryption_Failure",
    ]
    seen = set()
    for ft in order:
        seen.add(ft)
        count = total_by_type.get(ft, 0)
        pct = 100.0 * count / total_failures
        print(f"{ft}: {count} ({pct:.1f}%)")
    for ft, count in sorted(total_by_type.items()):
        if ft not in seen:
            pct = 100.0 * count / total_failures
            print(f"{ft}: {count} ({pct:.1f}%)")

    print(f"\nTotal failures (global): {total_failures}")

    # Write CSV
    out_path = SCRIPT_DIR / "global_failure_percentages.csv"
    with open(out_path, "w", encoding="utf-8") as f:
        f.write("failure_type,count,percentage\n")
        for ft in order:
            if ft in total_by_type:
                count = total_by_type[ft]
                pct = 100.0 * count / total_failures
                f.write(f"{ft},{count},{pct:.2f}\n")
        for ft in sorted(total_by_type.keys()):
            if ft not in order:
                count = total_by_type[ft]
                pct = 100.0 * count / total_failures
                f.write(f"{ft},{count},{pct:.2f}\n")
    print(f"Wrote {out_path}")


if __name__ == "__main__":
    main()
