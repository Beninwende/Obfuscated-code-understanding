"""
Use GPT-4o to categorize failed descriptions (LLM consensus = False) using the taxonomy
from Results/Taxonomy/final_taxonomy/final_taxonomy.csv.
Reads selected_sample_ids.json and each model's combined_results; outputs categorized CSV/JSON
in error-analysis/.
"""
import csv
import json
import os
import time
from pathlib import Path

# Paths (error-analysis -> similarity -> ThreeModels_Simple -> Comprehensive_OBFUS_Analysis -> Results)
ERROR_ANALYSIS_DIR = Path(__file__).resolve().parent
SIMILARITY_DIR = ERROR_ANALYSIS_DIR.parent
RESULTS_DIR = ERROR_ANALYSIS_DIR.parent.parent.parent.parent
TAXONOMY_CSV = RESULTS_DIR / "Taxonomy" / "final_taxonomy" / "final_taxonomy.csv"
MODELS = ["DeepSeek", "Gemini", "O4"]
DESC_TYPE = "Description_Simple"
# Truncate long texts for API (chars)
MAX_REFERENCE = 2000
MAX_FAILED_DESC = 2000
# Category for this study (comprehensive obfuscation failures)
FAILURE_CATEGORY = "Comprehensive_Obfuscation_Failure"


def load_taxonomy_subtypes(csv_path):
    """Load unique (subtype, brief_description) from taxonomy CSV."""
    if not csv_path.exists():
        raise FileNotFoundError(f"Taxonomy not found: {csv_path}")
    seen = {}
    with open(csv_path, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for row in reader:
            st = row.get("subtype", "").strip()
            brief = (row.get("brief_description") or "").strip()
            if st and st not in seen:
                seen[st] = brief
    return list(seen.items())


def load_selected_samples():
    """Load flat list of {model, problem_id} from selected_sample_ids.json."""
    path = ERROR_ANALYSIS_DIR / "selected_sample_ids.json"
    with open(path, "r", encoding="utf-8") as f:
        data = json.load(f)
    return data["flat"]


def get_failure_texts(model, problem_id):
    """Load reference_description and failed (comparison_text) for this sample."""
    path = SIMILARITY_DIR / model / "combined_results_Obfuscated_Without_comments.json"
    if not path.exists():
        return None, None
    with open(path, "r", encoding="utf-8") as f:
        data = json.load(f)
    dr = data.get("detailed_results", {}).get(problem_id)
    if not dr:
        return None, None
    ref = (dr.get("reference_description") or "").strip()
    ev = dr.get("evaluations", {}).get(DESC_TYPE, {})
    failed = (ev.get("comparison_text") or "").strip()
    if not ref or not failed:
        return None, None
    ref = ref[:MAX_REFERENCE] + ("..." if len(ref) > MAX_REFERENCE else "")
    failed = failed[:MAX_FAILED_DESC] + ("..." if len(failed) > MAX_FAILED_DESC else "")
    return ref, failed


def build_system_prompt(subtypes_with_brief):
    """Build system prompt with taxonomy subtypes."""
    lines = [
        "You are a classifier for code description failures. Given a REFERENCE (ground-truth) description of what the code does and a FAILED description produced by a model (that did not match the reference), you must choose exactly one subtype from the following taxonomy. All failures are from comprehensive obfuscation (mixed obfuscation, no comments).",
        "",
        "Respond with valid JSON only: {\"subtype\": \"<subtype>\", \"brief_reason\": \"<short explanation>\"}",
        "",
        "Subtypes (choose one):",
    ]
    for st, brief in subtypes_with_brief:
        lines.append(f"  - {st}: {brief}")
    return "\n".join(lines)


def call_gpt4o(system_prompt, user_content):
    """Call OpenAI GPT-4o; return parsed JSON or None."""
    try:
        import openai
    except ImportError:
        print("Install openai: pip install openai")
        return None
    api_key = os.environ.get("OPENAI_API_KEY")
    if not api_key:
        print("Set OPENAI_API_KEY")
        return None
    client = openai.OpenAI(api_key=api_key)
    try:
        resp = client.chat.completions.create(
            model="gpt-4o",
            messages=[
                {"role": "system", "content": system_prompt},
                {"role": "user", "content": user_content},
            ],
            temperature=0.1,
            max_tokens=500,
        )
        text = (resp.choices[0].message.content or "").strip()
        # Extract JSON (handle markdown code blocks)
        if "```" in text:
            start = text.find("{")
            end = text.rfind("}") + 1
            if start >= 0 and end > start:
                text = text[start:end]
        return json.loads(text)
    except Exception as e:
        print(f"API error: {e}")
        return None


def main():
    import sys
    dry_run = "--dry-run" in sys.argv
    if dry_run:
        print("Dry run: processing first 2 samples only (no API key required for load steps).")

    ERROR_ANALYSIS_DIR.mkdir(parents=True, exist_ok=True)

    # 1. Load taxonomy subtypes
    taxonomy_path = TAXONOMY_CSV
    if not taxonomy_path.exists():
        taxonomy_path = ERROR_ANALYSIS_DIR / ".." / ".." / ".." / ".." / "Taxonomy" / "final_taxonomy" / "final_taxonomy.csv"
        taxonomy_path = taxonomy_path.resolve()
    if not taxonomy_path.exists():
        raise FileNotFoundError(f"Taxonomy not found. Tried {TAXONOMY_CSV} and {taxonomy_path}")
    subtypes_with_brief = load_taxonomy_subtypes(taxonomy_path)
    print(f"Loaded {len(subtypes_with_brief)} taxonomy subtypes")

    # 2. Load selected samples
    samples = load_selected_samples()
    if dry_run:
        samples = samples[:2]
        print(f"Dry run: using {len(samples)} samples")
    else:
        print(f"Loaded {len(samples)} selected samples")

    system_prompt = build_system_prompt(subtypes_with_brief)

    results = []
    for i, item in enumerate(samples):
        model = item["model"]
        pid = item["problem_id"]
        ref, failed = get_failure_texts(model, pid)
        if ref is None:
            print(f"  Skip {model} {pid}: no data")
            results.append({"model": model, "problem_id": pid, "category": FAILURE_CATEGORY, "subtype": "", "brief_reason": "missing_data", "reference_excerpt": "", "failed_description_excerpt": ""})
            continue
        user_content = f"REFERENCE (ground truth):\n{ref}\n\nFAILED DESCRIPTION (model output):\n{failed}\n\nClassify the failure. Respond with JSON: subtype and brief_reason."
        out = call_gpt4o(system_prompt, user_content)
        if out:
            subtype = out.get("subtype", "").strip()
            brief_reason = out.get("brief_reason", "").strip()
            # Validate subtype
            valid_subtypes = [s[0] for s in subtypes_with_brief]
            if subtype not in valid_subtypes:
                # Find closest or use first
                for s in valid_subtypes:
                    if s.lower() in subtype.lower() or subtype.lower() in s.lower():
                        subtype = s
                        break
                else:
                    subtype = valid_subtypes[0] if valid_subtypes else "Other"
            results.append({
                "model": model,
                "problem_id": pid,
                "category": FAILURE_CATEGORY,
                "subtype": subtype,
                "brief_reason": brief_reason,
                "reference_excerpt": ref[:500],
                "failed_description_excerpt": failed[:500],
            })
        else:
            results.append({"model": model, "problem_id": pid, "category": FAILURE_CATEGORY, "subtype": "api_error", "brief_reason": "", "reference_excerpt": ref[:500], "failed_description_excerpt": failed[:500]})
        print(f"  [{i+1}/{len(samples)}] {model} {pid} -> {results[-1].get('subtype', '?')}")
        time.sleep(0.3)

    # Save CSV (same columns as taxonomy: category, subtype, brief_description, plus model, problem_id, excerpts)
    out_csv = ERROR_ANALYSIS_DIR / "categorized_failures.csv"
    fieldnames = ["model", "problem_id", "category", "subtype", "brief_reason", "reference_excerpt", "failed_description_excerpt"]
    with open(out_csv, "w", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, fieldnames=fieldnames, extrasaction="ignore")
        w.writeheader()
        for r in results:
            w.writerow({k: r.get(k, "") for k in fieldnames})
    print(f"Saved: {out_csv}")

    out_json = ERROR_ANALYSIS_DIR / "categorized_failures.json"
    with open(out_json, "w", encoding="utf-8") as f:
        json.dump({"samples": results, "taxonomy_subtypes": subtypes_with_brief}, f, indent=2)
    print(f"Saved: {out_json}")


if __name__ == "__main__":
    main()
