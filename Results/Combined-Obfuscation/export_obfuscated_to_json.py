#!/usr/bin/env python3
"""
Extracts Java code from CodeNet_Obfuscated subdirectories and writes a single JSON file
in the same format as Without_comments.json (code_characteristics_analysis).

- One JSON item per problem folder (e.g. p00002_Java -> one object).
- "Sub Directory": problem id without _Java (e.g. p00002).
- "Java Code": concatenation of all .java files in decompiled/ (Main.java first, then others alphabetically).
"""

import json
from pathlib import Path


def main():
    script_dir = Path(__file__).parent.resolve()
    obfuscated_base = script_dir / "CodeNet_Obfuscated"
    output_path = script_dir / "Obfuscated_Without_comments.json"

    if not obfuscated_base.exists():
        print(f"Error: CodeNet_Obfuscated not found at {obfuscated_base}")
        return 1

    result = []

    for problem_dir in sorted(obfuscated_base.iterdir()):
        if not problem_dir.is_dir():
            continue
        name = problem_dir.name
        if not name.endswith("_Java"):
            continue

        decompiled_dir = problem_dir / "decompiled"
        if not decompiled_dir.exists():
            print(f"Warning: No decompiled/ in {name}, skipping.")
            continue

        java_files = sorted(decompiled_dir.glob("*.java"))
        if not java_files:
            print(f"Warning: No .java files in {decompiled_dir}, skipping.")
            continue

        # Main.java first, then others alphabetically by filename
        def order_key(p):
            if p.name == "Main.java":
                return (0, p.name)
            return (1, p.name)

        java_files_sorted = sorted(java_files, key=order_key)

        parts = []
        for jf in java_files_sorted:
            try:
                parts.append(jf.read_text(encoding="utf-8"))
            except Exception as e:
                print(f"Warning: Could not read {jf}: {e}")

        if not parts:
            continue

        java_code = "\n\n".join(parts)
        sub_dir = name[:-5]  # strip "_Java"

        result.append({
            "Sub Directory": sub_dir,
            "Java Code": java_code,
        })

    with open(output_path, "w", encoding="utf-8") as f:
        json.dump(result, f, indent=4, ensure_ascii=False)

    print(f"Done. Wrote {len(result)} problems to {output_path}")
    return 0


if __name__ == "__main__":
    exit(main())
