#!/usr/bin/env python3
"""
Sankey diagram: all models in one figure.
Left = Models, Right = Failure_Type:Subtype (granular). Uses granular_subtype_frequencies.json
or per-model Dataset_*_granular_subtypes.json. Output: one HTML (all_granular_sankey.html).
Option --per-model: also generate one HTML per model (Failure Type → Subtype).
"""

import json
from pathlib import Path
from collections import OrderedDict

TAXONOMY_DIR = Path(__file__).resolve().parent.parent  # Results/Taxonomy
GRANULAR_DIR = TAXONOMY_DIR / "granular_subtypes"
OUTPUT_DIR = Path(__file__).resolve().parent  # Results/Taxonomy/sankey_diagram

# ACM / ColourBrewer 2.0 qualitative palettes (colorblind-safe, print-friendly).
# See: https://colorbrewer2.org/ and ACM accessibility recommendations for publishing.
COLORBREWER_PAIRED = [
    "#a6cee3", "#1f78b4", "#b2df8a", "#33a02c", "#fb9a99", "#e31a1c",
    "#fdbf6f", "#ff7f00", "#cab2d6", "#6a3d9a", "#ffff99", "#b15928",
]
COLORBREWER_DARK2 = [
    "#1b9e77", "#d95f02", "#7570b3", "#e7298a", "#66a61e", "#e6ab02", "#a6761d", "#666666",
]
COLORBREWER_SET2 = [
    "#66c2a5", "#fc8d62", "#8da0cb", "#e78ac3", "#a6d854", "#ffd92f", "#e5c494", "#b3b3b3",
]


def hex_to_rgba(hex_color: str, a: float = 0.92) -> str:
    """Convert hex (#rrggbb) to rgba string."""
    hex_color = hex_color.lstrip("#")
    r = int(hex_color[0:2], 16)
    g = int(hex_color[2:4], 16)
    b = int(hex_color[4:6], 16)
    return f"rgba({r},{g},{b},{a})"


def acm_palette(n: int, palette: list) -> list:
    """Return n colors from a ColourBrewer palette, cycling if needed."""
    if n <= 0:
        return []
    colors = [hex_to_rgba(palette[i % len(palette)]) for i in range(n)]
    return colors


FAILURE_TYPES_ORDER = [
    "Comment_Dependency",
    "Variable_Renaming_Failure",
    "Dead_Code_Failure",
    "Encryption_Failure",
]

# Map all granular subtypes to the 8 canonical subtypes (aligned with final_taxonomy_8subtypes).
SUBTYPE_TO_8 = {
    "Algorithm_confusion": "Algorithm_confusion",
    "Algorithm_misunderstanding": "Algorithm_misunderstanding",
    "Functional_inaccuracy": "Functional_inaccuracy",
    "Hallucination_unrelated": "Hallucination",
    "Minimal_code_understanding": "Minimal_code_understanding",
    "Obfuscation_narrative": "Obfuscation_narrative",
    "Semantic_drift": "Semantic_drift",
    "Structural_description_only": "Structural_description_only",
    "Empty_or_template": "Minimal_code_understanding",
    "Refusal_or_meta": "Minimal_code_understanding",
    "Creative_or_offtask": "Hallucination",
    "Wrong_IO_interpretation": "Functional_inaccuracy",
    "Overgeneralization": "Minimal_code_understanding",
}


def normalized_subtype(st: str) -> str:
    """Map any granular subtype to one of the 8 canonical subtypes."""
    return SUBTYPE_TO_8.get((st or "").strip(), "Minimal_code_understanding")


def load_all_model_subtype_counts():
    """
    Load (model, failure_type, subtype, count) from per-model JSONs.
    Returns list of dicts with model, failure_type, subtype, count.
    """
    rows = []
    for json_path in sorted(GRANULAR_DIR.glob("Dataset_*_granular_subtypes.json")):
        with open(json_path, "r", encoding="utf-8") as f:
            data = json.load(f)
        model = data.get("model", json_path.stem.replace("_granular_subtypes", ""))
        for r in data.get("failures_by_type_and_subtype", []):
            ft = r.get("failure_type", "")
            st = r.get("subtype", "")
            c = r.get("count", 0)
            if ft and st and c > 0:
                rows.append({"model": model, "failure_type": ft, "subtype": st, "count": c})
    return rows


def build_all_in_one_sankey(rows: list) -> dict:
    """
    Three-level Sankey: Models (left) → Failure Types (middle) → Subtypes (right).
    Subtypes are normalized to the 8 canonical subtypes.
    Nodes: [models..., failure_types..., subtypes...]
    Links 1: model -> failure_type (sum over subtypes per model,failure_type)
    Links 2: failure_type -> subtype (sum over models per failure_type,subtype)
    """
    from collections import defaultdict
    models_ordered = list(OrderedDict.fromkeys(r["model"] for r in rows))
    failure_types_ordered = list(FAILURE_TYPES_ORDER)
    subtypes_seen = list(OrderedDict.fromkeys(normalized_subtype(r["subtype"]) for r in rows))
    n_models = len(models_ordered)
    n_ft = len(failure_types_ordered)
    model_to_idx = {m: i for i, m in enumerate(models_ordered)}
    ft_to_idx = {ft: i for i, ft in enumerate(failure_types_ordered)}
    st_to_idx = {st: i for i, st in enumerate(subtypes_seen)}
    # Display model names without "Dataset_" prefix
    model_labels = [(m.replace("Dataset_", "", 1) if m.startswith("Dataset_") else m) for m in models_ordered]
    node_labels = model_labels + failure_types_ordered + subtypes_seen

    # Aggregates: (model, ft) -> count, (ft, subtype) -> count (subtype already normalized)
    model_ft = defaultdict(int)
    ft_subtype = defaultdict(int)
    for r in rows:
        st = normalized_subtype(r["subtype"])
        model_ft[(r["model"], r["failure_type"])] += r["count"]
        ft_subtype[(r["failure_type"], st)] += r["count"]

    link_sources = []
    link_targets = []
    link_values = []
    for (m, ft), v in model_ft.items():
        if v <= 0:
            continue
        i = model_to_idx.get(m)
        j = ft_to_idx.get(ft)
        if i is not None and j is not None:
            link_sources.append(i)
            link_targets.append(n_models + j)
            link_values.append(v)
    for (ft, st), v in ft_subtype.items():
        if v <= 0:
            continue
        j = ft_to_idx.get(ft)
        k = st_to_idx.get(st)
        if j is not None and k is not None:
            link_sources.append(n_models + j)
            link_targets.append(n_models + n_ft + k)
            link_values.append(v)

    return {
        "node_labels": node_labels,
        "link_sources": link_sources,
        "link_targets": link_targets,
        "link_values": link_values,
    }


def build_per_model_sankey(data: dict) -> dict:
    """Per-model: Failure Type (left) → Subtype (right). Subtypes normalized to 8 canonical."""
    failure_types_ordered = list(FAILURE_TYPES_ORDER)
    subtype_ordered = []
    failure_type_to_idx = {ft: i for i, ft in enumerate(failure_types_ordered)}
    subtype_to_idx = {}

    for row in data.get("failures_by_type_and_subtype", []):
        ft = row.get("failure_type", "")
        st = normalized_subtype(row.get("subtype", ""))
        if ft and ft not in failure_type_to_idx:
            failure_type_to_idx[ft] = len(failure_types_ordered)
            failure_types_ordered.append(ft)
        if st and st not in subtype_to_idx:
            subtype_to_idx[st] = len(subtype_ordered)
            subtype_ordered.append(st)

    n_ft = len(failure_types_ordered)
    node_labels = failure_types_ordered + subtype_ordered
    link_sources = []
    link_targets = []
    link_values = []

    for row in data.get("failures_by_type_and_subtype", []):
        ft = row.get("failure_type", "")
        st = normalized_subtype(row.get("subtype", ""))
        count = row.get("count", 0)
        if not ft or not st or count <= 0:
            continue
        src = failure_type_to_idx.get(ft)
        tgt = subtype_to_idx.get(st)
        if src is None or tgt is None:
            continue
        link_sources.append(src)
        link_targets.append(n_ft + tgt)
        link_values.append(count)

    return {
        "node_labels": node_labels,
        "link_sources": link_sources,
        "link_targets": link_targets,
        "link_values": link_values,
        "n_ft": n_ft,
    }


def write_sankey_html(
    out_path: Path,
    sankey: dict,
    title: str,
    n_models: int = 0,
    n_ft: int = 0,
    font_family: str = "Inter, system-ui, sans-serif",
    font_size: int = 11,
    font_bold: bool = False,
):
    """Write Sankey HTML. If n_models and n_ft are set, color nodes by layer (ACM ColourBrewer palettes)."""
    data_json = json.dumps(sankey)
    n = len(sankey["node_labels"])
    title_block = f'<div class="title">{title}</div>' if title else ""
    # Three-level: models → failure types → subtypes
    if n_models > 0 and n_ft > 0:
        n_subtypes = n - n_models - n_ft
        node_colors = (
            acm_palette(n_models, COLORBREWER_PAIRED)
            + acm_palette(n_ft, COLORBREWER_DARK2)
            + acm_palette(n_subtypes, COLORBREWER_SET2)
        )
        node_colors_js = json.dumps(node_colors)
        node_block = f"""node: {{
        pad: 18,
        thickness: 22,
        line: {{ color: "rgba(0,0,0,0.4)", width: 1 }},
        label: data.node_labels,
        color: {node_colors_js}
      }}"""
    # Two-level (per-model): failure types → subtypes
    elif n_ft > 0 and n_ft <= n:
        n_subtypes = n - n_ft
        node_colors = acm_palette(n_ft, COLORBREWER_DARK2) + acm_palette(n_subtypes, COLORBREWER_SET2)
        node_colors_js = json.dumps(node_colors)
        node_block = f"""node: {{
        pad: 18,
        thickness: 22,
        line: {{ color: "rgba(0,0,0,0.4)", width: 1 }},
        label: data.node_labels,
        color: {node_colors_js}
      }}"""
    else:
        node_block = """node: {
        pad: 18,
        thickness: 22,
        line: { color: "rgba(0,0,0,0.4)", width: 1 },
        label: data.node_labels
      }"""
    html = f"""<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <script src="https://cdn.plot.ly/plotly-2.27.0.min.js"></script>
  <title>{title}</title>
  <style>
    body {{ margin: 0; font-family: "{font_family}", serif; font-size: {font_size}px; background: #fafafa; }}
    #sankey {{ width: 100%; }}
    {"" if not font_bold else "#sankey text { font-weight: bold; }"}
    .title {{ padding: 12px 20px; font-size: {font_size}px; font-weight: 600; color: #333; font-family: "{font_family}", serif; }}
  </style>
</head>
<body>
  {title_block}
  <div id="sankey" style="width:100%;height:920px;"></div>
  <script>
    var data = {data_json};
    var trace = {{
      type: "sankey",
      orientation: "h",
      {node_block},
      link: {{
        source: data.link_sources,
        target: data.link_targets,
        value: data.link_values,
        line: {{ color: "rgba(0,0,0,0.15)", width: 0 }}
      }}
    }};
    var layout = {{
      font: {{ size: {font_size}, family: "{font_family}" }},
      height: 920,
      margin: {{ l: 24, r: 24, t: 12, b: 24 }},
      paper_bgcolor: "rgba(250,250,250,0)",
      plot_bgcolor: "rgba(250,250,250,0)"
    }};
    Plotly.newPlot("sankey", [trace], layout);
  </script>
</body>
</html>
"""
    out_path.write_text(html, encoding="utf-8")


def main():
    import argparse
    parser = argparse.ArgumentParser(description="Granular subtypes Sankey (all models in one figure)")
    parser.add_argument("--per-model", action="store_true", help="Also generate one HTML per model")
    args = parser.parse_args()

    OUTPUT_DIR.mkdir(parents=True, exist_ok=True)
    rows = load_all_model_subtype_counts()
    if not rows:
        print("No granular subtype data found in granular_subtypes/")
        return

    # Single figure: Models → Categories (failure types) → Subtypes
    sankey = build_all_in_one_sankey(rows)
    if sankey["link_values"]:
        n_models = len(list(OrderedDict.fromkeys(r["model"] for r in rows)))
        n_ft = len(FAILURE_TYPES_ORDER)
        out_path = OUTPUT_DIR / "all_granular_sankey.html"
        write_sankey_html(
            out_path,
            sankey,
            "",  # no title above diagram
            n_models=n_models,
            n_ft=n_ft,
            font_family="Times New Roman",
            font_size=20,
            font_bold=True,
        )
        print(f"Saved: {out_path}")

    if args.per_model:
        for json_path in sorted(GRANULAR_DIR.glob("Dataset_*_granular_subtypes.json")):
            with open(json_path, "r", encoding="utf-8") as f:
                data = json.load(f)
            model = data.get("model", json_path.stem.replace("_granular_subtypes", ""))
            if not data.get("failures_by_type_and_subtype"):
                continue
            sankey = build_per_model_sankey(data)
            if not sankey["link_values"]:
                continue
            safe = model.replace("/", "_").replace(" ", "_")
            out_path = OUTPUT_DIR / f"{safe}_granular_sankey.html"
            n_ft = sankey.get("n_ft", 0)
            write_sankey_html(out_path, sankey, f"{model}: Failure Type → Subtype", n_models=0, n_ft=n_ft)
            print(f"Saved: {out_path}")

    print("Open the HTML in a browser to view the Sankey diagram.")


if __name__ == "__main__":
    main()
