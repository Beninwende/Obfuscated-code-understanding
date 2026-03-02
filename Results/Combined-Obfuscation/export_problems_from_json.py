#!/usr/bin/env python3
"""
Reads Dataset_Without_Comments.json and creates a folder with one subfolder per problem,
each containing the Java code in .java format.
Subfolders are named as in the JSON with "_Java" suffix (e.g. p03494_Java, p02921_Java).
"""

import json
import os
from pathlib import Path


def main():
    # Paths
    script_dir = Path(__file__).parent.resolve()
    json_path = script_dir  / "Dataset_Without_Comments.json"
    output_base = script_dir / "problems_java"

    if not json_path.exists():
        print(f"Error: JSON file not found at {json_path}")
        return 1

    with open(json_path, "r", encoding="utf-8") as f:
        data = json.load(f)

    if not isinstance(data, list):
        print("Error: JSON root should be an array.")
        return 1

    output_base.mkdir(parents=True, exist_ok=True)
    count = 0

    for item in data:
        sub_dir = item.get("Sub Directory")
        java_code = item.get("Java Code")

        if not sub_dir:
            print("Warning: Skipping entry with missing 'Sub Directory'.")
            continue
        if java_code is None:
            print(f"Warning: No 'Java Code' for {sub_dir}, skipping.")
            continue

        # Create subfolder (e.g. problems_java/p03494_Java)
        problem_dir = output_base / (sub_dir.strip() + "_Java")
        problem_dir.mkdir(parents=True, exist_ok=True)

        # Write Main.java (standard name for these solutions)
        java_path = problem_dir / "Main.java"
        with open(java_path, "w", encoding="utf-8") as jf:
            jf.write(java_code)

        count += 1

    print(f"Done. Created {count} problem folders under: {output_base}")
    return 0


if __name__ == "__main__":
    exit(main())
