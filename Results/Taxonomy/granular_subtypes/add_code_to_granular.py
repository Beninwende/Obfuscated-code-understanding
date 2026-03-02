#!/usr/bin/env python3
"""
Add corresponding Java code to each classification item in Dataset_*_granular_subtypes.json.

Only the code fields relevant to each entry's failure_type are added:
- Comment_Dependency: code_with_comments, code_without_comments
- Variable_Renaming_Failure: code_variable_renaming
- Dead_Code_Failure: code_dead_code
- Encryption_Failure: code_encryption

Loads code from Results/Java_code_snippets/. Any existing code_* keys not in the allowed set
for that failure_type are removed.
"""

import json
from pathlib import Path

GRANULAR_DIR = Path(__file__).resolve().parent  # Results/Taxonomy/granular_subtypes
# Results/Java_code_snippets is next to Results/Taxonomy
JAVA_SNIPPETS_DIR = Path(__file__).resolve().parent.parent.parent / "Java_code_snippets"

# Which code fields to add per failure_type
FAILURE_TYPE_TO_CODE_KEYS = {
    "Comment_Dependency": ["code_with_comments", "code_without_comments"],
    "Variable_Renaming_Failure": ["code_variable_renaming"],
    "Dead_Code_Failure": ["code_dead_code"],
    "Encryption_Failure": ["code_encryption"],
}

CODE_FILES = {
    "code_with_comments": "Data_With_Comments.json",
    "code_without_comments": "Data_Without_Comments.json",
    "code_variable_renaming": "Variable_Renaming.json",
    "code_dead_code": "DeadCode_injection.json",
    "code_encryption": "Dataset_Encryption.json",
}


def build_code_lookups() -> dict:
    """Build problem_id -> { code_key: "Java Code" } from each snippet file."""
    lookups = {key: {} for key in CODE_FILES}
    for code_key, filename in CODE_FILES.items():
        path = JAVA_SNIPPETS_DIR / filename
        if not path.exists():
            continue
        with open(path, "r", encoding="utf-8") as f:
            data = json.load(f)
        for entry in data:
            pid = entry.get("Sub Directory", "").strip()
            code = entry.get("Java Code", "")
            if pid:
                lookups[code_key][pid] = code
    return lookups


def add_code_to_classification(classification: dict, lookups: dict) -> dict:
    """Add only the code fields corresponding to this entry's failure_type (copy)."""
    out = dict(classification)
    pid = classification.get("problem_id", "").strip()
    failure_type = classification.get("failure_type", "").strip()
    allowed_keys = set(FAILURE_TYPE_TO_CODE_KEYS.get(failure_type, []))
    # Remove any code_* keys not in the allowed set for this failure_type
    code_keys_to_drop = [k for k in out if k.startswith("code_") and k not in allowed_keys]
    for k in code_keys_to_drop:
        del out[k]
    if not pid:
        return out
    for code_key in allowed_keys:
        pid_to_code = lookups.get(code_key, {})
        if pid in pid_to_code and pid_to_code[pid]:
            out[code_key] = pid_to_code[pid]
    return out


def process_one_model(granular_path: Path, lookups: dict, dry_run: bool = False) -> int:
    """Load granular subtypes, add code to each classification, write back. Returns count enriched."""
    with open(granular_path, "r", encoding="utf-8") as f:
        data = json.load(f)
    classifications = data.get("classifications", [])
    enriched = 0
    for i, item in enumerate(classifications):
        updated = add_code_to_classification(item, lookups)
        if updated != item:
            enriched += 1
        data["classifications"][i] = updated
    if not dry_run and enriched > 0:
        with open(granular_path, "w", encoding="utf-8") as f:
            json.dump(data, f, indent=2, ensure_ascii=False)
    return enriched


def main():
    import argparse
    parser = argparse.ArgumentParser(description="Add Java code to granular subtype classifications")
    parser.add_argument("--dry-run", action="store_true", help="Do not write files")
    parser.add_argument("--model", type=str, help="Process only this model (e.g. Dataset_codellama)")
    args = parser.parse_args()

    if not JAVA_SNIPPETS_DIR.exists():
        print(f"Java code snippets dir not found: {JAVA_SNIPPETS_DIR}")
        return

    lookups = build_code_lookups()
    total_entries = sum(len(v) for v in lookups.values())
    print(f"Loaded code for {total_entries} problem_ids across {len(CODE_FILES)} files.")

    granular_files = sorted(GRANULAR_DIR.glob("Dataset_*_granular_subtypes.json"))
    if args.model:
        granular_files = [p for p in granular_files if args.model in p.name]
    if not granular_files:
        print("No Dataset_*_granular_subtypes.json files found.")
        return

    for granular_path in granular_files:
        n = process_one_model(granular_path, lookups, dry_run=args.dry_run)
        if args.dry_run:
            print(f"{granular_path.name}: would add code to {n} classifications")
        else:
            print(f"{granular_path.name}: added code to {n} classifications")

    if args.dry_run:
        print("Dry run: no files written. Run without --dry-run to apply.")


if __name__ == "__main__":
    main()
