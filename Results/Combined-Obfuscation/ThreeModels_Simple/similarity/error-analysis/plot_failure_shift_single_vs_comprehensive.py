#!/usr/bin/env python3
"""
Failure-type shift: Single obfuscation → Comprehensive obfuscation for DeepSeek-R1, Gemini, O4-mini.

Primary output: one unified alluvial (flow) figure showing, for each model, how each failure subtype's
share moves from Single obfuscation (left) to Comprehensive obfuscation (right). Publication-ready.

Data:
  - Single obfuscation: Taxonomy granular_subtype_frequencies.json (Dataset_deepseek-r1, Dataset_Gemini, Dataset_O4-mini).
  - Comprehensive: categorized_failures.csv (DeepSeek, Gemini, O4).

Run from error-analysis dir: python plot_failure_shift_single_vs_comprehensive.py
Output: figure_failure_shift_unified.pdf
"""
import csv
import json
from pathlib import Path
from collections import Counter, defaultdict

import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
import matplotlib.patches as mpatches
import numpy as np

ERROR_ANALYSIS_DIR = Path(__file__).resolve().parent
# error-analysis is under Results/Comprehensive_OBFUS_Analysis/ThreeModels_Simple/similarity/error-analysis
# parents[3] = Results
TAXONOMY_ROOT = ERROR_ANALYSIS_DIR.parents[3] / "Taxonomy"
GRANULAR_FREQ_PATH = TAXONOMY_ROOT / "granular_subtypes" / "granular_subtype_frequencies.json"
CATEGORIZED_CSV = ERROR_ANALYSIS_DIR / "categorized_failures.csv"

# Model key: granular JSON uses Dataset_*; categorized CSV uses DeepSeek, Gemini, O4
MODELS_GRANULAR = ["Dataset_deepseek-r1", "Dataset_Gemini", "Dataset_O4-mini"]
MODELS_CATEGORIZED = ["DeepSeek", "Gemini", "O4"]
MODELS_DISPLAY = ["DeepSeek-R1", "Gemini", "O4-mini"]
FONT_NAME = "Times New Roman"
FONT_SIZE = 14

# Subtype colors (consistent across figures); extend if more subtypes
SUBTYPE_COLORS = {
    "Algorithm_misunderstanding": "#4477AA",
    "Algorithm_confusion": "#66CCEE",
    "Obfuscation_narrative": "#228833",
    "Hallucination_unrelated": "#EE6677",
    "Functional_inaccuracy": "#CCBB44",
    "Semantic_drift": "#BBBBBB",
    "Structural_description_only": "#EE8866",
    "Minimal_code_understanding": "#FFAABB",
    "Empty_or_template": "#99DDFF",
    "Refusal_or_meta": "#DDDDDD",
}


def subtype_label(name: str) -> str:
    """Short label for subtype (first underscore → newline for long names)."""
    if "_" in name:
        return name.replace("_", "\n", 1)
    return name


def _bezier_quadratic(t: np.ndarray, p0: float, p1: float, p2: float) -> np.ndarray:
    """Quadratic Bezier: B(t) = (1-t)^2 P0 + 2(1-t)t P1 + t^2 P2."""
    return (1 - t) ** 2 * p0 + 2 * (1 - t) * t * p1 + t ** 2 * p2


def _curved_ribbon_verts(x_left: float, x_right: float, y1_lo: float, y1_hi: float, y2_lo: float, y2_hi: float, n_points: int = 25) -> np.ndarray:
    """
    Vertices of a ribbon with smooth curved sides (quadratic Bezier).
    Bottom edge: (x_left, y1_lo) -> (x_right, y2_lo). Top edge: (x_left, y1_hi) -> (x_right, y2_hi).
    Control point at x_mid, y = midpoint of each edge.
    """
    t = np.linspace(0, 1, n_points)
    x_mid = (x_left + x_right) / 2
    # Bottom curve: x and y
    x_bot = _bezier_quadratic(t, x_left, x_mid, x_right)
    y_bot = _bezier_quadratic(t, y1_lo, (y1_lo + y2_lo) / 2, y2_lo)
    # Top curve: same t, from left to right
    x_top = _bezier_quadratic(t, x_left, x_mid, x_right)
    y_top = _bezier_quadratic(t, y1_hi, (y1_hi + y2_hi) / 2, y2_hi)
    # Polygon: bottom edge left->right, then top edge right->left
    verts = np.vstack([
        np.column_stack([x_bot, y_bot]),
        np.column_stack([x_top[::-1], y_top[::-1]]),
    ])
    return verts


def load_single_obfuscation_subtype_counts():
    """
    Load granular_subtype_frequencies.json; for each of the 3 models, sum counts over failure_type
    to get subtype counts (single obfuscation = any of Encryption, Dead_Code, etc.).
    Returns: dict model_display_name -> Counter(subtype), all_subtypes set.
    """
    if not GRANULAR_FREQ_PATH.exists():
        print("Missing:", GRANULAR_FREQ_PATH)
        return {}, set()
    with open(GRANULAR_FREQ_PATH, "r", encoding="utf-8") as f:
        data = json.load(f)
    entries = data.get("by_model_failure_type_and_subtype") or []
    per_model = defaultdict(Counter)
    all_subtypes = set()
    for e in entries:
        model = e.get("model") or ""
        if model not in MODELS_GRANULAR:
            continue
        st = (e.get("subtype") or "").strip()
        if not st:
            continue
        cnt = int(e.get("count") or 0)
        per_model[model][st] += cnt
        all_subtypes.add(st)
    # Map to display names
    display_to_key = dict(zip(MODELS_DISPLAY, MODELS_GRANULAR))
    out = {}
    for disp, key in display_to_key.items():
        if key in per_model:
            out[disp] = per_model[key]
    return out, all_subtypes


def load_comprehensive_subtype_counts():
    """Load categorized_failures.csv; return dict model_display_name -> Counter(subtype), all_subtypes."""
    per_model = defaultdict(Counter)
    all_subtypes = set()
    if not CATEGORIZED_CSV.exists():
        print("Missing:", CATEGORIZED_CSV)
        return {}, set()
    with open(CATEGORIZED_CSV, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for row in reader:
            model = (row.get("model") or "").strip()
            st = (row.get("subtype") or "").strip()
            if not model or not st:
                continue
            # Map to display: DeepSeek -> DeepSeek-R1, Gemini -> Gemini, O4 -> O4-mini
            disp = "DeepSeek-R1" if model == "DeepSeek" else ("O4-mini" if model == "O4" else model)
            per_model[disp][st] += 1
            all_subtypes.add(st)
    return dict(per_model), all_subtypes


def build_subtype_order_and_pcts(single_per_model, comp_per_model, all_subtypes):
    """
    Unify subtype order (by total frequency across both conditions) and compute percentages per model.
    Returns: subtype_order, single_pcts[model][subtype], comp_pcts[model][subtype].
    """
    total_per_sub = Counter()
    for c in single_per_model.values():
        total_per_sub.update(c)
    for c in comp_per_model.values():
        total_per_sub.update(c)
    subtype_order = [s for s, _ in total_per_sub.most_common() if s in all_subtypes]
    for s in all_subtypes:
        if s not in subtype_order:
            subtype_order.append(s)

    def pcts_from_counter(counter):
        total = sum(counter.values())
        if total == 0:
            return {s: 0.0 for s in subtype_order}
        return {s: 100.0 * counter.get(s, 0) / total for s in subtype_order}

    single_pcts = {m: pcts_from_counter(single_per_model.get(m, Counter())) for m in MODELS_DISPLAY}
    comp_pcts = {m: pcts_from_counter(comp_per_model.get(m, Counter())) for m in MODELS_DISPLAY}
    return subtype_order, single_pcts, comp_pcts


def figure_unified_alluvial(subtype_order, single_pcts, comp_pcts):
    """
    Single unified figure: 3 panels (one per model). In each panel, an alluvial (flow) diagram:
    left = Single obfuscation (stacked % per subtype), right = Comprehensive (stacked % per subtype),
    ribbons connect each failure subtype from left to right showing the shift (movement).
    """
    plt.rcParams["font.family"] = FONT_NAME
    plt.rcParams["font.size"] = FONT_SIZE
    n_sub = len(subtype_order)
    x_left, x_right = 0.0, 1.0
    bar_width = 0.08  # width of left/right stacked bars in axes coords
    x_flow_left = bar_width
    x_flow_right = 1.0 - bar_width

    fig, axes = plt.subplots(1, 3, figsize=(12, 5.5), sharey=True)
    fig.suptitle(
        "Shift of failure subtypes: Single obfuscation → Comprehensive obfuscation",
        fontsize=15,
        fontfamily=FONT_NAME,
        fontweight="bold",
        y=1.00,
    )
    for ax, model in zip(axes, MODELS_DISPLAY):
        single_vals = np.array([single_pcts[model][s] for s in subtype_order])
        comp_vals = np.array([comp_pcts[model][s] for s in subtype_order])
        # Normalize to sum to 100 for stacking
        s_sum, c_sum = single_vals.sum(), comp_vals.sum()
        if s_sum > 0:
            single_vals = 100.0 * single_vals / s_sum
        if c_sum > 0:
            comp_vals = 100.0 * comp_vals / c_sum
        cum_single = np.concatenate([[0], np.cumsum(single_vals)])
        cum_comp = np.concatenate([[0], np.cumsum(comp_vals)])

        ax.set_xlim(-0.02, 1.02)
        ax.set_ylim(0, 100)
        ax.set_aspect("auto")
        ax.set_title(model, fontsize=FONT_SIZE, fontfamily=FONT_NAME, fontweight="bold")
        if ax == axes[0]:
            ax.set_ylabel("Percentage of failures (%)", fontsize=FONT_SIZE, fontfamily=FONT_NAME)
        ax.set_xticks([0.04, 0.96])
        ax.set_xticklabels(["Single\nobfuscation", "Comprehensive\nobfuscation"], fontsize=11, fontfamily=FONT_NAME)
        ax.tick_params(axis="y", labelsize=11)
        plt.setp(ax.get_yticklabels(), fontfamily=FONT_NAME)
        ax.spines["top"].set_visible(False)
        ax.spines["right"].set_visible(False)

        # Draw flow ribbons as smooth curves (Bezier), back to front: first subtype at bottom
        for i in range(n_sub):
            y1_lo, y1_hi = cum_single[i], cum_single[i + 1]
            y2_lo, y2_hi = cum_comp[i], cum_comp[i + 1]
            if (y1_hi - y1_lo) < 0.1 and (y2_hi - y2_lo) < 0.1:
                continue
            verts = _curved_ribbon_verts(x_flow_left, x_flow_right, y1_lo, y1_hi, y2_lo, y2_hi)
            poly = mpatches.Polygon(
                verts,
                facecolor=SUBTYPE_COLORS.get(subtype_order[i], "#AAAAAA"),
                edgecolor="white",
                linewidth=0.8,
                alpha=0.95,
            )
            ax.add_patch(poly)

        # Draw left stacked bar (segments)
        for i in range(n_sub):
            y_lo, y_hi = cum_single[i], cum_single[i + 1]
            if y_hi - y_lo < 0.05:
                continue
            rect = mpatches.Rectangle(
                (x_left, y_lo),
                bar_width,
                y_hi - y_lo,
                facecolor=SUBTYPE_COLORS.get(subtype_order[i], "#AAAAAA"),
                edgecolor="white",
                linewidth=0.6,
            )
            ax.add_patch(rect)

        # Draw right stacked bar (segments)
        for i in range(n_sub):
            y_lo, y_hi = cum_comp[i], cum_comp[i + 1]
            if y_hi - y_lo < 0.05:
                continue
            rect = mpatches.Rectangle(
                (x_right - bar_width, y_lo),
                bar_width,
                y_hi - y_lo,
                facecolor=SUBTYPE_COLORS.get(subtype_order[i], "#AAAAAA"),
                edgecolor="white",
                linewidth=0.6,
            )
            ax.add_patch(rect)

    # Single shared legend for subtypes (below the panels)
    legend_handles = [
        mpatches.Patch(facecolor=SUBTYPE_COLORS.get(s, "#AAAAAA"), edgecolor="white", label=subtype_label(s))
        for s in subtype_order
    ]
    fig.legend(
        handles=legend_handles,
        loc="upper center",
        bbox_to_anchor=(0.5, 0.96),
        ncol=min(5, n_sub),
        fontsize=9,
        prop={"family": FONT_NAME},
        frameon=True,
    )
    plt.tight_layout(rect=[0, 0.02, 1, 0.90])
    out = ERROR_ANALYSIS_DIR / "figure_failure_shift_unified.pdf"
    fig.savefig(out, format="pdf", bbox_inches="tight")
    plt.close(fig)
    print(f"Saved: {out}")


def figure1_paired_stacked_bars(subtype_order, single_pcts, comp_pcts):
    """
    For each model: two adjacent stacked bars (Single | Comprehensive), same subtype order and colors.
    """
    plt.rcParams["font.family"] = FONT_NAME
    plt.rcParams["font.size"] = FONT_SIZE
    n_sub = len(subtype_order)
    n_models = len(MODELS_DISPLAY)
    # 2 bars per model (Single, Comprehensive); group by model
    x_groups = np.arange(n_models) * 2.5  # two bars at x_groups[i], x_groups[i]+1
    width = 0.42

    fig, ax = plt.subplots(figsize=(10, 5))
    colors = [SUBTYPE_COLORS.get(s, "#AAAAAA") for s in subtype_order]
    bottom_single = np.zeros(n_models)
    bottom_comp = np.zeros(n_models)
    for i, st in enumerate(subtype_order):
        single_vals = [single_pcts[m][st] for m in MODELS_DISPLAY]
        comp_vals = [comp_pcts[m][st] for m in MODELS_DISPLAY]
        ax.bar(x_groups - width / 2, single_vals, width, bottom=bottom_single, color=colors[i], label=subtype_label(st) if i < 8 else None, edgecolor="white", linewidth=0.5)
        ax.bar(x_groups + width / 2, comp_vals, width, bottom=bottom_comp, color=colors[i], edgecolor="white", linewidth=0.5)
        bottom_single = bottom_single + np.array(single_vals)
        bottom_comp = bottom_comp + np.array(comp_vals)

    ax.set_xticks(x_groups)
    ax.set_xticklabels(MODELS_DISPLAY, fontsize=FONT_SIZE, fontfamily=FONT_NAME)
    ax.set_ylabel("Percentage of failures (%)", fontsize=FONT_SIZE, fontfamily=FONT_NAME)
    ax.set_ylim(0, 108)
    ax.legend(loc="upper left", bbox_to_anchor=(1.02, 1), fontsize=9, ncol=1, prop={"family": FONT_NAME})
    # Label the two bar groups above the first model
    ax.text(0 - width / 2, 102, "Single", fontsize=10, ha="center", fontfamily=FONT_NAME)
    ax.text(0 + width / 2, 102, "Compr.", fontsize=10, ha="center", fontfamily=FONT_NAME)
    ax.tick_params(axis="both", labelsize=FONT_SIZE)
    plt.setp(ax.get_yticklabels(), fontfamily=FONT_NAME)
    for spine in ax.spines.values():
        spine.set_linewidth(0.8)
    fig.tight_layout(rect=[0, 0.06, 0.85, 1])
    out = ERROR_ANALYSIS_DIR / "figure_failure_shift_stacked.pdf"
    fig.savefig(out, format="pdf", bbox_inches="tight")
    plt.close(fig)
    print(f"Saved: {out}")


def figure2_diverging_heatmap(subtype_order, single_pcts, comp_pcts):
    """
    Heatmap: rows = subtypes, columns = models; cell = (Comprehensive % − Single %).
    Diverging colormap: blue = more in comprehensive, red = more in single, white ≈ no change.
    """
    plt.rcParams["font.family"] = FONT_NAME
    plt.rcParams["font.size"] = FONT_SIZE
    n_sub = len(subtype_order)
    diff = np.array([[comp_pcts[m][s] - single_pcts[m][s] for m in MODELS_DISPLAY] for s in subtype_order])
    vmax = np.abs(diff).max() if diff.size else 10
    vmax = max(vmax, 1)

    fig, ax = plt.subplots(figsize=(5, max(4, n_sub * 0.35)))
    im = ax.imshow(diff, cmap="RdBu_r", aspect="auto", vmin=-vmax, vmax=vmax)
    ax.set_xticks(np.arange(len(MODELS_DISPLAY)))
    ax.set_xticklabels(MODELS_DISPLAY, fontsize=FONT_SIZE, fontfamily=FONT_NAME)
    ax.set_yticks(np.arange(n_sub))
    ax.set_yticklabels([subtype_label(s) for s in subtype_order], fontsize=10, fontfamily=FONT_NAME)
    for i in range(n_sub):
        for j in range(len(MODELS_DISPLAY)):
            val = diff[i, j]
            ax.text(j, i, f"{val:+.1f}", ha="center", va="center", fontsize=9, color="black" if -vmax * 0.4 < val < vmax * 0.4 else "white", fontfamily=FONT_NAME)
    cbar = plt.colorbar(im, ax=ax, shrink=0.6)
    cbar.set_label("Δ% (Comprehensive − Single)", fontsize=FONT_SIZE, fontfamily=FONT_NAME)
    ax.set_xlabel("Model", fontsize=FONT_SIZE, fontfamily=FONT_NAME)
    fig.tight_layout()
    out = ERROR_ANALYSIS_DIR / "figure_failure_shift_heatmap.pdf"
    fig.savefig(out, format="pdf", bbox_inches="tight")
    plt.close(fig)
    print(f"Saved: {out}")


def figure3_grouped_comparison(subtype_order, single_pcts, comp_pcts):
    """
    One panel per model; in each panel, grouped vertical bars per subtype (Single vs Comprehensive %).
    """
    plt.rcParams["font.family"] = FONT_NAME
    plt.rcParams["font.size"] = FONT_SIZE
    n_sub = len(subtype_order)
    x = np.arange(n_sub)
    width = 0.35
    fig, axes = plt.subplots(1, 3, figsize=(max(12, n_sub * 0.8), 5), sharey=True)
    for ax_idx, (ax, model) in enumerate(zip(axes, MODELS_DISPLAY)):
        single_vals = [single_pcts[model][s] for s in subtype_order]
        comp_vals = [comp_pcts[model][s] for s in subtype_order]
        ax.bar(x - width / 2, single_vals, width, label="Single obfuscation", color="#7BA3C9", edgecolor="gray", linewidth=0.5)
        ax.bar(x + width / 2, comp_vals, width, label="Comprehensive", color="#C99B6D", edgecolor="gray", linewidth=0.5)
        ax.set_xticks(x)
        ax.set_xticklabels([subtype_label(s) for s in subtype_order], rotation=45, ha="right", fontsize=9, fontfamily=FONT_NAME)
        ax.set_ylabel("Percentage of failures (%)" if ax_idx == 0 else "", fontsize=FONT_SIZE, fontfamily=FONT_NAME)
        ax.set_title(model, fontsize=FONT_SIZE, fontfamily=FONT_NAME)
        ax.legend(loc="upper right", fontsize=9, prop={"family": FONT_NAME})
        ax.set_ylim(0, max(max(single_vals or [0]), max(comp_vals or [0])) * 1.15 or 10)
        ax.grid(axis="y", alpha=0.3, linestyle="--")
        ax.tick_params(axis="both", labelsize=10)
    fig.tight_layout()
    out = ERROR_ANALYSIS_DIR / "figure_failure_shift_grouped.pdf"
    fig.savefig(out, format="pdf", bbox_inches="tight")
    plt.close(fig)
    print(f"Saved: {out}")


def export_failure_shift_table(
    subtype_order,
    single_per_model,
    comp_per_model,
    single_pcts,
    comp_pcts,
):
    """Export failure-shift data as CSV and Markdown table."""
    # CSV: long format (model, condition, subtype, count, percentage)
    csv_path = ERROR_ANALYSIS_DIR / "failure_shift_data.csv"
    rows = []
    for model in MODELS_DISPLAY:
        single_counts = single_per_model.get(model, Counter())
        comp_counts = comp_per_model.get(model, Counter())
        single_total = sum(single_counts.values())
        comp_total = sum(comp_counts.values())
        for st in subtype_order:
            sc = single_counts.get(st, 0)
            cc = comp_counts.get(st, 0)
            sp = 100.0 * sc / single_total if single_total else 0.0
            cp = 100.0 * cc / comp_total if comp_total else 0.0
            rows.append({"model": model, "condition": "Single obfuscation", "subtype": st, "count": sc, "percentage": round(sp, 2)})
            rows.append({"model": model, "condition": "Comprehensive", "subtype": st, "count": cc, "percentage": round(cp, 2)})

    with open(csv_path, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, fieldnames=["model", "condition", "subtype", "count", "percentage"])
        w.writeheader()
        w.writerows(rows)
    print(f"Saved: {csv_path}")

    # Markdown: one table per model (Subtype | Single % | Comprehensive % | Δ%)
    md_path = ERROR_ANALYSIS_DIR / "failure_shift_table.md"
    lines = [
        "# Failure subtype shift: Single obfuscation → Comprehensive obfuscation",
        "",
        "Percentages are within each model and condition (sum to 100% per model per condition).",
        "Δ% = Comprehensive % − Single %.",
        "",
    ]
    for model in MODELS_DISPLAY:
        lines.append(f"## {model}")
        lines.append("")
        lines.append("| Subtype | Single (%) | Comprehensive (%) | Δ% |")
        lines.append("|---------|------------|-------------------|-----|")
        for st in subtype_order:
            sp = single_pcts[model][st]
            cp = comp_pcts[model][st]
            delta = cp - sp
            lines.append(f"| {st} | {sp:.1f} | {cp:.1f} | {delta:+.1f} |")
        lines.append("")
    md_path.write_text("\n".join(lines), encoding="utf-8")
    print(f"Saved: {md_path}")


def main():
    single_per_model, single_subtypes = load_single_obfuscation_subtype_counts()
    comp_per_model, comp_subtypes = load_comprehensive_subtype_counts()
    all_subtypes = single_subtypes | comp_subtypes
    if not all_subtypes:
        print("No subtype data found. Check paths to granular_subtype_frequencies.json and categorized_failures.csv.")
        return
    subtype_order, single_pcts, comp_pcts = build_subtype_order_and_pcts(single_per_model, comp_per_model, all_subtypes)
    export_failure_shift_table(subtype_order, single_per_model, comp_per_model, single_pcts, comp_pcts)
    figure_unified_alluvial(subtype_order, single_pcts, comp_pcts)


if __name__ == "__main__":
    main()
