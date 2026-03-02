#!/usr/bin/env python3
"""
Sankey diagram of taxonomy failures: flow from Models (left) to Failure Types (right).
Link width = number of failures for that model × failure_type.
Outputs a standalone HTML file (Plotly from CDN), no pip install required.
"""

import json
from pathlib import Path

TAXONOMY_DIR = Path(__file__).resolve().parent.parent  # Results/Taxonomy
OUTPUT_DIR = Path(__file__).resolve().parent  # Results/Taxonomy/sankey_diagram


def main():
    model_names = []
    failure_types_ordered = [
        "Comment_Dependency",
        "Variable_Renaming_Failure",
        "Dead_Code_Failure",
        "Encryption_Failure",
    ]
    failure_type_to_idx = {t: i for i, t in enumerate(failure_types_ordered)}
    model_to_idx = {}
    links = []  # (source_idx, target_idx, value)

    for json_path in sorted(TAXONOMY_DIR.glob("Dataset_*_taxonomy_failures.json")):
        with open(json_path, "r", encoding="utf-8") as f:
            data = json.load(f)
        model = data["model"]
        if model not in model_to_idx:
            model_to_idx[model] = len(model_names)
            model_names.append(model)
        src = model_to_idx[model]
        for failure_type, count in data.get("failures_by_type", {}).items():
            if failure_type not in failure_type_to_idx:
                failure_type_to_idx[failure_type] = len(failure_types_ordered)
                failure_types_ordered.append(failure_type)
            links.append((src, failure_type, count))

    n_models = len(model_names)
    node_labels = model_names + failure_types_ordered
    link_sources = [s for s, _, _ in links]
    link_targets = [n_models + failure_type_to_idx[ft] for _, ft, _ in links]
    link_values = [v for _, _, v in links]

    # Standalone HTML with Plotly from CDN
    data_js = {
        "node_labels": node_labels,
        "link_sources": link_sources,
        "link_targets": link_targets,
        "link_values": link_values,
    }
    data_json = json.dumps(data_js)

    html = f"""<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <script src="https://cdn.plot.ly/plotly-2.27.0.min.js"></script>
  <title>Taxonomy Failures - Sankey</title>
</head>
<body>
  <div id="sankey" style="width:100%;height:700px;"></div>
  <script>
    var data = {data_json};
    var trace = {{
      type: "sankey",
      orientation: "h",
      node: {{
        pad: 15,
        thickness: 20,
        line: {{ color: "black", width: 0.5 }},
        label: data.node_labels
      }},
      link: {{
        source: data.link_sources,
        target: data.link_targets,
        value: data.link_values
      }}
    }};
    var layout = {{
      title: "Taxonomy Failures: Models → Failure Types (Sankey)",
      font: {{ size: 11 }},
      height: 700,
      margin: {{ l: 20, r: 20, t: 50, b: 20 }}
    }};
    Plotly.newPlot("sankey", [trace], layout);
  </script>
</body>
</html>
"""

    OUTPUT_DIR.mkdir(parents=True, exist_ok=True)
    html_path = OUTPUT_DIR / "failure_sankey.html"
    html_path.write_text(html, encoding="utf-8")
    print(f"Saved: {html_path}")
    print("Open in a browser to view the Sankey diagram.")


if __name__ == "__main__":
    main()
