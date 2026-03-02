#!/usr/bin/env python3
"""
Generate the all-models Sankey diagram as PDF (8 canonical subtypes).

Tries, in order:
  1. Plotly + Kaleido: pip install plotly kaleido
  2. Headless Chrome/Chromium: prints all_granular_sankey.html to PDF
     (no pip packages; needs Chrome or Chromium, e.g. brew install chromium)

Usage:
  cd Results/Taxonomy/sankey_diagram && python3 plot_granular_sankey_pdf.py

Output: all_granular_sankey.pdf
"""

import subprocess
import sys
from pathlib import Path

OUTPUT_DIR = Path(__file__).resolve().parent
# Allow importing plot_granular_sankey when run from any directory
if str(OUTPUT_DIR) not in sys.path:
    sys.path.insert(0, str(OUTPUT_DIR))

from collections import OrderedDict

from plot_granular_sankey import (
    COLORBREWER_DARK2,
    COLORBREWER_PAIRED,
    COLORBREWER_SET2,
    FAILURE_TYPES_ORDER,
    acm_palette,
    build_all_in_one_sankey,
    load_all_model_subtype_counts,
)


def try_plotly_kaleido(out_path: Path) -> bool:
    """Generate PDF with Plotly + Kaleido. Return True on success."""
    try:
        import plotly.graph_objects as go
    except ImportError:
        return False
    try:
        import kaleido  # noqa: F401
    except ImportError:
        return False

    rows = load_all_model_subtype_counts()
    if not rows or not build_all_in_one_sankey(rows)["link_values"]:
        return False

    sankey = build_all_in_one_sankey(rows)
    n_models = len(list(OrderedDict.fromkeys(r["model"] for r in rows)))
    n_ft = len(FAILURE_TYPES_ORDER)
    n = len(sankey["node_labels"])
    n_subtypes = n - n_models - n_ft
    node_colors = (
        acm_palette(n_models, COLORBREWER_PAIRED)
        + acm_palette(n_ft, COLORBREWER_DARK2)
        + acm_palette(n_subtypes, COLORBREWER_SET2)
    )

    trace = go.Sankey(
        orientation="h",
        node=dict(
            label=sankey["node_labels"],
            color=node_colors,
            pad=18,
            thickness=22,
            line=dict(color="rgba(0,0,0,0.4)", width=1),
        ),
        link=dict(
            source=sankey["link_sources"],
            target=sankey["link_targets"],
            value=sankey["link_values"],
            line=dict(color="rgba(0,0,0,0.15)", width=0),
        ),
    )
    fig = go.Figure(data=[trace])
    fig.update_layout(
        font=dict(size=16, family="Times New Roman"),
        height=920,
        margin=dict(l=24, r=24, t=24, b=24),
        paper_bgcolor="rgba(255,255,255,1)",
        plot_bgcolor="rgba(255,255,255,1)",
    )
    try:
        fig.write_image(str(out_path), format="pdf", engine="kaleido")
        return True
    except Exception:
        return False


def try_chrome_headless(html_path: Path, out_path: Path) -> bool:
    """Print HTML to PDF using headless Chrome/Chromium. Return True on success."""
    html_uri = html_path.as_uri()
    # Prefer chromium on Linux/macOS (Homebrew), then Google Chrome
    for cmd in [
        ["chromium", "--headless", "--disable-gpu", "--print-to-pdf=" + str(out_path), html_uri],
        ["/opt/homebrew/bin/chromium", "--headless", "--disable-gpu", "--print-to-pdf=" + str(out_path), html_uri],
        ["/usr/local/bin/chromium", "--headless", "--disable-gpu", "--print-to-pdf=" + str(out_path), html_uri],
        ["chromium-browser", "--headless", "--disable-gpu", "--print-to-pdf=" + str(out_path), html_uri],
        ["google-chrome", "--headless", "--disable-gpu", "--print-to-pdf=" + str(out_path), html_uri],
        ["google-chrome-stable", "--headless", "--disable-gpu", "--print-to-pdf=" + str(out_path), html_uri],
        ["/Applications/Google Chrome.app/Contents/MacOS/Google Chrome", "--headless", "--disable-gpu", "--print-to-pdf=" + str(out_path), html_uri],
    ]:
        try:
            result = subprocess.run(
                cmd,
                capture_output=True,
                timeout=30,
                cwd=str(OUTPUT_DIR),
            )
            if result.returncode == 0 and out_path.exists():
                return True
        except (FileNotFoundError, subprocess.TimeoutExpired):
            continue
    return False


def main():
    out_path = OUTPUT_DIR / "all_granular_sankey.pdf"
    html_path = OUTPUT_DIR / "all_granular_sankey.html"

    # 1) Try Plotly + Kaleido
    if try_plotly_kaleido(out_path):
        print(f"Saved: {out_path} (Plotly + Kaleido)")
        return

    # 2) Ensure HTML exists, then try headless Chrome
    if not html_path.exists():
        print("Generating all_granular_sankey.html...", file=sys.stderr)
        from plot_granular_sankey import main as run_sankey
        run_sankey()
    if html_path.exists() and try_chrome_headless(html_path, out_path):
        print(f"Saved: {out_path} (Chrome headless)")
        return

    # 3) Failed
    print("Could not generate PDF.", file=sys.stderr)
    print("Option A: pip install plotly kaleido", file=sys.stderr)
    print("Option B: Install Chrome or Chromium and run from a terminal:", file=sys.stderr)
    print(f"  {html_path.as_uri()}", file=sys.stderr)
    print("  then use browser Print → Save as PDF.", file=sys.stderr)
    if html_path.exists():
        print("Option C: Open the HTML in your browser and Print → Save as PDF:", file=sys.stderr)
        print(f"  {html_path}", file=sys.stderr)
    sys.exit(1)


if __name__ == "__main__":
    main()
