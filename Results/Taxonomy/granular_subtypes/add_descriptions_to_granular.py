#!/usr/bin/env python3
"""
Add corresponding descriptions to each classification item in Dataset_*_granular_subtypes.json.

For each classification (problem_id, failure_type), looks up the matching entry in
Dataset_*_taxonomy_failures.json and adds all example_* description fields to that item.
"""

import json
from pathlib import Path

TAXONOMY_DIR = Path(__file__).resolve().parent.parent  # Results/Taxonomy
GRANULAR_DIR = Path(__file__).resolve().parent  # Results/Taxonomy/granular_subtypes

DESCRIPTION_KEYS = (
    "example_with_comments",
    "example_without_comments",
    "example_variable_renaming",
    "example_dead_code",
    "example_encryption",
)


def build_failure_lookup(taxonomy_path: Path) -> dict:
    """Build (problem_id, failure_type) -> failure dict from taxonomy failures JSON."""
    with open(taxonomy_path, "r", encoding="utf-8") as f:
        data = json.load(f)
    lookup = {}
    for failure in data.get("failures", []):
        pid = failure.get("problem_id", "")
        ft = failure.get("failure_type", "")
        if pid and ft:
            lookup[(pid, ft)] = failure
    return lookup


def add_descriptions_to_classification(classification: dict, failure: dict) -> dict:
    """Add all example_* description fields from failure to classification (copy)."""
    out = dict(classification)
    for key in DESCRIPTION_KEYS:
        if key in failure and failure[key]:
            out[key] = failure[key]
    return out


def process_one_model(granular_path: Path, taxonomy_path: Path, dry_run: bool = False) -> int:
    """
    Load granular subtypes, enrich each classification with descriptions, write back.
    Returns number of classifications enriched.
    """
    if not taxonomy_path.exists():
        print(f"  Skip: taxonomy file not found: {taxonomy_path.name}")
        return 0

    with open(granular_path, "r", encoding="utf-8") as f:
        data = json.load(f)

    lookup = build_failure_lookup(taxonomy_path)
    classifications = data.get("classifications", [])
    enriched = 0
    for i, item in enumerate(classifications):
        pid = item.get("problem_id", "")
        ft = item.get("failure_type", "")
        key = (pid, ft)
        if key not in lookup:
            continue
        failure = lookup[key]
        data["classifications"][i] = add_descriptions_to_classification(item, failure)
        enriched += 1

    if not dry_run and enriched > 0:
        with open(granular_path, "w", encoding="utf-8") as f:
            json.dump(data, f, indent=2, ensure_ascii=False)

    return enriched


def main():
    import argparse
    parser = argparse.ArgumentParser(description="Add descriptions to granular subtype classifications")
    parser.add_argument("--dry-run", action="store_true", help="Do not write files")
    parser.add_argument("--model", type=str, help="Process only this model (e.g. Dataset_codellama)")
    args = parser.parse_args()

    granular_files = sorted(GRANULAR_DIR.glob("Dataset_*_granular_subtypes.json"))
    if args.model:
        granular_files = [p for p in granular_files if args.model in p.name]
    if not granular_files:
        print("No Dataset_*_granular_subtypes.json files found.")
        return

    for granular_path in granular_files:
        # Dataset_codellama_granular_subtypes.json -> Dataset_codellama_taxonomy_failures.json
        stem = granular_path.stem.replace("_granular_subtypes", "")
        taxonomy_path = TAXONOMY_DIR / f"{stem}_taxonomy_failures.json"
        n = process_one_model(granular_path, taxonomy_path, dry_run=args.dry_run)
        if args.dry_run:
            print(f"{granular_path.name}: would enrich {n} classifications (taxonomy: {taxonomy_path.name})")
        else:
            print(f"{granular_path.name}: enriched {n} classifications")

    if args.dry_run:
        print("Dry run: no files written. Run without --dry-run to apply.")


if __name__ == "__main__":
    main()
