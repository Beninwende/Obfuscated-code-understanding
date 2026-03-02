#!/usr/bin/env python3
"""
Horizontal bar chart(s) of granular subtype occurrences across all models.
Uses Dataset_*_granular_subtypes.json from granular_subtypes/.
Outputs: subtype_bars.html (stacked by model) and optionally subtype_bars_simple.html (totals only).
ACM ColourBrewer palettes (colorblind-safe, print-friendly).
"""

import json
from pathlib import Path
from collections import OrderedDict, defaultdict

TAXONOMY_DIR = Path(__file__).resolve().parent.parent  # Results/Taxonomy
GRANULAR_DIR = TAXONOMY_DIR / "granular_subtypes"
OUTPUT_DIR = Path(__file__).resolve().parent  # Results/Taxonomy/sankey_diagram

# ACM / ColourBrewer 2.0 qualitative palettes
COLORBREWER_PAIRED = [
    "#a6cee3", "#1f78b4", "#b2df8a", "#33a02c", "#fb9a99", "#e31a1c",
    "#fdbf6f", "#ff7f00", "#cab2d6", "#6a3d9a", "#ffff99", "#b15928",
]
COLORBREWER_SET2 = [
    "#66c2a5", "#fc8d62", "#8da0cb", "#e78ac3", "#a6d854", "#ffd92f", "#e5c494", "#b3b3b3",
]


def hex_to_rgba(hex_color: str, a: float = 0.92) -> str:
    """Convert hex (#rrggbb) to rgba string."""
    hex_color = hex_color.lstrip("#")
    r, g, b = int(hex_color[0:2], 16), int(hex_color[2:4], 16), int(hex_color[4:6], 16)
    return f"rgba({r},{g},{b},{a})"


def load_subtype_counts_by_model():
    """
    Load (model, subtype, count) from per-model JSONs.
    Returns: (models_ordered, subtypes_ordered, subtype_total, subtype_by_model)
    - subtype_total: dict subtype -> total count
    - subtype_by_model: dict (subtype, model) -> count
    """
    subtype_total = defaultdict(int)
    subtype_by_model = defaultdict(int)
    models_ordered = []
    subtypes_seen = OrderedDict()

    for json_path in sorted(GRANULAR_DIR.glob("Dataset_*_granular_subtypes.json")):
        with open(json_path, "r", encoding="utf-8") as f:
            data = json.load(f)
        model = data.get("model", json_path.stem.replace("_granular_subtypes", ""))
        if model not in models_ordered:
            models_ordered.append(model)
        for r in data.get("failures_by_type_and_subtype", []):
            st = r.get("subtype", "").strip()
            c = r.get("count", 0)
            if not st or c <= 0:
                continue
            subtypes_seen[st] = None
            subtype_total[st] += c
            subtype_by_model[(st, model)] += c

    subtypes_ordered = list(subtypes_seen.keys())
    return models_ordered, subtypes_ordered, dict(subtype_total), dict(subtype_by_model)


def build_simple_bars(subtypes_ordered, subtype_total):
    """One horizontal bar per subtype, length = total count. Sorted by count descending."""
    sorted_subtypes = sorted(subtypes_ordered, key=lambda s: subtype_total.get(s, 0), reverse=True)
    y_labels = [s.replace("_", " ") for s in sorted_subtypes]
    x_values = [subtype_total.get(s, 0) for s in sorted_subtypes]
    colors = [hex_to_rgba(COLORBREWER_SET2[i % len(COLORBREWER_SET2)]) for i in range(len(sorted_subtypes))]
    return {
        "y": y_labels,
        "x": x_values,
        "colors": colors,
        "subtypes": sorted_subtypes,
    }


def build_stacked_bars(models_ordered, subtypes_ordered, subtype_total, subtype_by_model):
    """
    One horizontal bar per subtype, stacked by model.
    Subtypes sorted by total count descending.
    """
    sorted_subtypes = sorted(subtypes_ordered, key=lambda s: subtype_total.get(s, 0), reverse=True)
    y_labels = [s.replace("_", " ") for s in sorted_subtypes]
    model_colors = [hex_to_rgba(COLORBREWER_PAIRED[i % len(COLORBREWER_PAIRED)]) for i in range(len(models_ordered))]

    # For Plotly stacked bar: one trace per model, each trace has x = list of counts for that model per subtype
    traces = []
    for mi, model in enumerate(models_ordered):
        x = [subtype_by_model.get((st, model), 0) for st in sorted_subtypes]
        traces.append({
            "name": model.replace("Dataset_", ""),
            "x": x,
            "y": y_labels,
            "orientation": "h",
            "type": "bar",
            "marker": {"color": model_colors[mi]},
        })
    return {
        "traces": traces,
        "y_labels": y_labels,
        "subtypes": sorted_subtypes,
        "models": models_ordered,
    }


def write_simple_bars_html(out_path: Path, data: dict, title: str):
    """Single horizontal bar chart: subtype vs total count."""
    traces_js = json.dumps([{
        "x": data["x"],
        "y": data["y"],
        "orientation": "h",
        "type": "bar",
        "marker": {"color": data["colors"]},
        "text": [str(v) for v in data["x"]],
        "textposition": "outside",
        "hovertemplate": "%{y}: %{x}<extra></extra>",
    }])
    layout_js = json.dumps({
        "title": {"text": title, "font": {"size": 14}},
        "xaxis": {"title": "Occurrences", "gridcolor": "rgba(0,0,0,0.08)"},
        "yaxis": {"title": "", "categoryorder": "array", "categoryarray": list(reversed(data["y"])), "gridcolor": "rgba(0,0,0,0.08)"},
        "margin": {"l": 180, "r": 60, "t": 48, "b": 48},
        "height": 400 + len(data["y"]) * 22,
        "showlegend": False,
        "paper_bgcolor": "rgba(250,250,250,0)",
        "plot_bgcolor": "rgba(250,250,250,0)",
        "font": {"size": 11, "family": "Inter, system-ui, sans-serif"},
    })
    html = f"""<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <script src="https://cdn.plot.ly/plotly-2.27.0.min.js"></script>
  <title>{title}</title>
  <style>
    body {{ margin: 0; font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, sans-serif; background: #fafafa; }}
    .title {{ padding: 12px 20px; font-size: 18px; font-weight: 600; color: #333; }}
  </style>
</head>
<body>
  <div class="title">{title}</div>
  <div id="chart" style="width:100%;"></div>
  <script>
    var traces = {traces_js};
    var layout = {layout_js};
    Plotly.newPlot("chart", traces, layout, {{ responsive: true }});
  </script>
</body>
</html>"""
    out_path.write_text(html, encoding="utf-8")


def write_stacked_bars_html(out_path: Path, data: dict, title: str):
    """Stacked horizontal bar chart: subtype vs count, stacked by model."""
    traces_js = json.dumps(data["traces"])
    layout_js = json.dumps({
        "title": {"text": title, "font": {"size": 14}},
        "barmode": "stack",
        "xaxis": {"title": "Occurrences", "gridcolor": "rgba(0,0,0,0.08)"},
        "yaxis": {"title": "", "categoryorder": "array", "categoryarray": list(reversed(data["y_labels"])), "gridcolor": "rgba(0,0,0,0.08)"},
        "margin": {"l": 200, "r": 60, "t": 48, "b": 48},
        "height": 400 + len(data["y_labels"]) * 22,
        "legend": {"orientation": "h", "yanchor": "bottom", "y": 1.02, "xanchor": "right", "x": 1},
        "paper_bgcolor": "rgba(250,250,250,0)",
        "plot_bgcolor": "rgba(250,250,250,0)",
        "font": {"size": 11, "family": "Inter, system-ui, sans-serif"},
    })
    html = f"""<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <script src="https://cdn.plot.ly/plotly-2.27.0.min.js"></script>
  <title>{title}</title>
  <style>
    body {{ margin: 0; font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, sans-serif; background: #fafafa; }}
    .title {{ padding: 12px 20px; font-size: 18px; font-weight: 600; color: #333; }}
  </style>
</head>
<body>
  <div class="title">{title}</div>
  <div id="chart" style="width:100%;"></div>
  <script>
    var traces = {traces_js};
    var layout = {layout_js};
    Plotly.newPlot("chart", traces, layout, {{ responsive: true }});
  </script>
</body>
</html>"""
    out_path.write_text(html, encoding="utf-8")


def main():
    import argparse
    parser = argparse.ArgumentParser(description="Subtype occurrence bars across models")
    parser.add_argument("--simple-only", action="store_true", help="Only generate simple (total) bars")
    parser.add_argument("--stacked-only", action="store_true", help="Only generate stacked bars")
    args = parser.parse_args()

    OUTPUT_DIR.mkdir(parents=True, exist_ok=True)
    models_ordered, subtypes_ordered, subtype_total, subtype_by_model = load_subtype_counts_by_model()
    if not subtypes_ordered:
        print("No subtype data found in granular_subtypes/")
        return

    do_simple = not args.stacked_only
    do_stacked = not args.simple_only

    if do_simple:
        simple_data = build_simple_bars(subtypes_ordered, subtype_total)
        out_simple = OUTPUT_DIR / "subtype_bars_simple.html"
        write_simple_bars_html(out_simple, simple_data, "Subtype occurrences (total across models)")
        print(f"Saved: {out_simple}")

    if do_stacked:
        stacked_data = build_stacked_bars(models_ordered, subtypes_ordered, subtype_total, subtype_by_model)
        out_stacked = OUTPUT_DIR / "subtype_bars.html"
        write_stacked_bars_html(out_stacked, stacked_data, "Subtype occurrences by model (stacked)")
        print(f"Saved: {out_stacked}")

    print("Open the HTML file(s) in a browser to view the chart(s).")


if __name__ == "__main__":
    main()
