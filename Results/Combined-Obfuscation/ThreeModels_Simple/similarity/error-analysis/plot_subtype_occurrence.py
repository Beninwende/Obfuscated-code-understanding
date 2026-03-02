"""
Horizontal bar chart: occurrence of each failure subtype as percentage.
1) Overall. 2) Per model (DeepSeek, Gemini, O4). 3) Per model with thin bars, single label (Algorithm misunderstanding).
Reads categorized_failures.csv; saves figure_subtype_occurrence.pdf, figure_subtype_occurrence_per_model.pdf,
and figure_subtype_occurrence_per_model_thin.pdf.
"""
import csv
from pathlib import Path
from collections import Counter, defaultdict

import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
import numpy as np

ERROR_ANALYSIS_DIR = Path(__file__).resolve().parent
CSV_PATH = ERROR_ANALYSIS_DIR / "categorized_failures.csv"
FIG_SIZE = (4, 3)
# IEEE single-column width = 3.5 in; height chosen to fit two-line labels
FIG_SIZE_PER_MODEL = (3.5, 4.5)
FIG_SIZE_PER_MODEL_THIN = (3.5, 4.0)  # slightly shorter than per_model; enough to avoid overlap
LABEL_FONT_SIZE_THIN = 13
COLOR_BARS = "#7BA3C9"
MODELS_ORDER = ["DeepSeek", "Gemini", "O4"]
MODELS_DISPLAY = ["DeepSeek-R1", "Gemini", "O4-mini"]
COLORS_PER_MODEL = ["#7BA3C9", "#C99B6D", "#6B8E6B"]
FONT_NAME = "Times New Roman"
FONT_SIZE = 14


def subtype_label_two_lines(name: str) -> str:
    """Put subtype name on two lines (replace first underscore with newline). Display 'Hallucination_unrelated' as 'Hallucination'."""
    if name == "Hallucination_unrelated":
        return "Hallucination"
    if "_" in name:
        return name.replace("_", "\n", 1)
    return name


def load_subtype_counts():
    """Load CSV and return (counts Counter, total)."""
    counts = Counter()
    with open(CSV_PATH, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for row in reader:
            st = (row.get("subtype") or "").strip()
            if st:
                counts[st] += 1
    total = sum(counts.values())
    return counts, total


def load_subtype_counts_per_model():
    """Load CSV and return (dict model -> Counter(subtype), set of all subtypes)."""
    per_model = defaultdict(Counter)
    all_subtypes = set()
    with open(CSV_PATH, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for row in reader:
            model = (row.get("model") or "").strip()
            st = (row.get("subtype") or "").strip()
            if model and st:
                per_model[model][st] += 1
                all_subtypes.add(st)
    return dict(per_model), all_subtypes


def draw_horizontal_bars(ax, subtypes, pcts, title, color=COLOR_BARS, show_pct_labels=True):
    """Draw one horizontal bar chart."""
    y_pos = np.arange(len(subtypes))
    bars = ax.barh(y_pos, pcts, height=0.6, color=color, edgecolor="gray", linewidth=0.6)
    ax.set_yticks(y_pos)
    ax.set_yticklabels(subtypes, fontsize=7)
    ax.set_xlabel("Percentage of failures (%)", fontsize=8)
    ax.set_title(title, fontsize=9)
    ax.set_xlim(0, max(pcts) * 1.15 if pcts else 10)
    ax.tick_params(axis="both", labelsize=6)
    ax.grid(axis="x", alpha=0.3, linestyle="--")
    ax.set_axisbelow(True)
    for spine in ax.spines.values():
        spine.set_linewidth(0.6)
    if show_pct_labels:
        for bar, pct in zip(bars, pcts):
            if pct > 0:
                ax.annotate(f"{pct:.1f}%", xy=(bar.get_width(), bar.get_y() + bar.get_height() / 2),
                            xytext=(4, 0), textcoords="offset points", ha="left", va="center", fontsize=6)


def plot_per_model():
    """Vertical grouped bar chart: one x-position per subtype, three bars per model (DeepSeek-R1, Gemini, O4-mini)."""
    plt.rcParams["font.family"] = FONT_NAME
    plt.rcParams["font.size"] = 16
    per_model, all_subtypes = load_subtype_counts_per_model()
    if not per_model or not all_subtypes:
        print("No per-model data in", CSV_PATH)
        return
    total_per_subtype = Counter()
    for c in per_model.values():
        total_per_subtype.update(c)
    subtype_order = [s for s, _ in total_per_subtype.most_common()]
    x_labels_two_lines = [subtype_label_two_lines(s) for s in subtype_order]
    n_subtypes = len(subtype_order)
    x_pos = np.arange(n_subtypes)
    bar_width = 0.25  # width of each bar; three bars per group
    max_pct = 0

    fig_width = max(10, n_subtypes * 0.9)
    fig, ax = plt.subplots(figsize=(fig_width, 4))
    for idx, (model, display_name) in enumerate(zip(MODELS_ORDER, MODELS_DISPLAY)):
        counts = per_model.get(model, Counter())
        total = sum(counts.values())
        if total == 0:
            pcts = [0.0] * n_subtypes
        else:
            pcts = [100 * counts.get(s, 0) / total for s in subtype_order]
        if pcts:
            max_pct = max(max_pct, max(pcts))
        offset = (idx - 1) * bar_width
        ax.bar(x_pos + offset, pcts, bar_width, label=display_name, color=COLORS_PER_MODEL[idx], edgecolor="gray", linewidth=0.6)

    ax.set_xticks(x_pos)
    ax.set_xticklabels(x_labels_two_lines, fontsize=18, fontfamily=FONT_NAME, rotation=30, ha="right")
    ax.set_ylabel("Percentage of failures (%)", fontsize=16, fontfamily=FONT_NAME)
    ax.tick_params(axis="both", labelsize=16)
    plt.setp(ax.get_yticklabels(), fontfamily=FONT_NAME)
    ax.legend(loc="upper right", ncol=1, fontsize=16, prop={"family": FONT_NAME, "size": 16})
    ax.set_ylim(0, min(100, max(10, max_pct) * 1.2))
    ax.grid(axis="y", alpha=0.3, linestyle="--")
    ax.set_axisbelow(True)
    for spine in ax.spines.values():
        spine.set_linewidth(0.6)
    fig.tight_layout()
    out = ERROR_ANALYSIS_DIR / "figure_subtype_occurrence_per_model.pdf"
    fig.savefig(out, format="pdf", bbox_inches="tight")
    plt.close(fig)
    print(f"Saved: {out}")


# Subtype that gets the only value label in the thin-bar figure (match case-insensitively with underscore/space)
LABEL_SUBTYPE_ONLY = "Algorithm_misunderstanding"


def plot_per_model_thin():
    """Same as per-model chart but with thin bars and only one label: 'Algorithm misunderstanding = X.X'."""
    plt.rcParams["font.family"] = FONT_NAME
    plt.rcParams["font.size"] = FONT_SIZE
    per_model, all_subtypes = load_subtype_counts_per_model()
    if not per_model or not all_subtypes:
        return
    total_per_subtype = Counter()
    for c in per_model.values():
        total_per_subtype.update(c)
    subtype_order = [s for s, _ in total_per_subtype.most_common()]
    y_labels_two_lines = [subtype_label_two_lines(s) for s in subtype_order]
    n_subtypes = len(subtype_order)
    y_pos = np.arange(n_subtypes)
    bar_height = 0.12  # thin bars

    fig, ax = plt.subplots(figsize=FIG_SIZE_PER_MODEL_THIN)
    max_pct = 0
    label_pct = None
    label_y = None
    label_x = None
    for idx, (model, display_name) in enumerate(zip(MODELS_ORDER, MODELS_DISPLAY)):
        counts = per_model.get(model, Counter())
        total = sum(counts.values())
        if total == 0:
            pcts = [0.0] * n_subtypes
        else:
            pcts = [100 * counts.get(s, 0) / total for s in subtype_order]
        if pcts:
            max_pct = max(max_pct, max(pcts))
        offset = (idx - 1) * bar_height
        bars = ax.barh(y_pos + offset, pcts, height=bar_height, label=display_name, color=COLORS_PER_MODEL[idx], edgecolor="gray", linewidth=0.5)
        # Only label: Algorithm misunderstanding = Gemini's percentage
        if model == "Gemini":
            for i, (bar, pct) in enumerate(zip(bars, pcts)):
                if subtype_order[i] == LABEL_SUBTYPE_ONLY:
                    label_pct = pct
                    label_y = bar.get_y() + bar.get_height() / 2
                    label_x = bar.get_width()
                    break

    ax.set_yticks(y_pos)
    ax.set_yticklabels(y_labels_two_lines, fontsize=LABEL_FONT_SIZE_THIN, fontfamily=FONT_NAME)
    ax.set_xlabel("Percentage of failures (%)", fontsize=LABEL_FONT_SIZE_THIN, fontfamily=FONT_NAME)
    ax.tick_params(axis="both", labelsize=LABEL_FONT_SIZE_THIN)
    plt.setp(ax.get_xticklabels(), fontfamily=FONT_NAME)
    ax.legend(loc="upper center", bbox_to_anchor=(0.5, 1.02), ncol=3, fontsize=LABEL_FONT_SIZE_THIN, prop={"family": FONT_NAME, "size": LABEL_FONT_SIZE_THIN})
    ax.set_xlim(0, max(10, max_pct) * 1.15)
    ax.grid(axis="x", alpha=0.3, linestyle="--")
    ax.set_axisbelow(True)
    for spine in ax.spines.values():
        spine.set_linewidth(0.6)
    if label_pct is not None and label_x is not None and label_y is not None:
        ax.annotate(f"{label_pct:.1f}",
                    xy=(label_x, label_y), xytext=(4, 0), textcoords="offset points",
                    ha="left", va="center", fontsize=LABEL_FONT_SIZE_THIN, fontfamily=FONT_NAME)
    fig.tight_layout()
    out = ERROR_ANALYSIS_DIR / "figure_subtype_occurrence_per_model_thin.pdf"
    fig.savefig(out, format="pdf", bbox_inches="tight")
    plt.close(fig)
    print(f"Saved: {out}")


def main():
    counts, total = load_subtype_counts()
    if total == 0:
        print("No subtypes found in", CSV_PATH)
        return

    # Sort by count descending; compute percentages
    sorted_items = sorted(counts.items(), key=lambda x: -x[1])
    subtypes = [s for s, _ in sorted_items]
    pcts = [100 * c / total for _, c in sorted_items]

    fig, ax = plt.subplots(figsize=FIG_SIZE)
    y_pos = np.arange(len(subtypes))
    bars = ax.barh(y_pos, pcts, height=0.6, color=COLOR_BARS, edgecolor="gray", linewidth=0.6)
    ax.set_yticks(y_pos)
    ax.set_yticklabels([subtype_label_two_lines(s) for s in subtypes], fontsize=16)
    ax.set_xlabel("Percentage of failures (%)", fontsize=16)
    ax.set_title(f"Failure subtype occurrence (n={total} comprehensive obfuscation failures)", fontsize=16)
    ax.set_xlim(0, max(pcts) * 1.12 if pcts else 10)
    ax.tick_params(axis="both", labelsize=16)
    ax.grid(axis="x", alpha=0.3, linestyle="--")
    ax.set_axisbelow(True)
    for spine in ax.spines.values():
        spine.set_linewidth(0.6)

    # Label each bar with percentage
    for i, (bar, pct) in enumerate(zip(bars, pcts)):
        w = bar.get_width()
        ax.annotate(f"{pct:.1f}%", xy=(w, bar.get_y() + bar.get_height() / 2),
                    xytext=(4, 0), textcoords="offset points", ha="left", va="center", fontsize=16)

    fig.tight_layout()
    out = ERROR_ANALYSIS_DIR / "figure_subtype_occurrence.pdf"
    fig.savefig(out, format="pdf", bbox_inches="tight")
    plt.close(fig)
    print(f"Saved: {out}")

    # Per-model horizontal bar charts
    plot_per_model()
    # Thin bars, single label (Algorithm misunderstanding = X.X)
    plot_per_model_thin()


if __name__ == "__main__":
    main()
