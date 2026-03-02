"""
Per-model comparison: all variants (With/Without comments, Variable renaming, Dead code,
Encryption, Comprehensive) for DeepSeek-R1, Gemini, O4-mini.
- Stacked bar: True/False % per model per variant (3 panels × 6 bars).
- Grouped bar: LLM consensus rate and ST mean (each model has 6 bars, one per variant).
Outputs PDF. Run compare_all_variants.py first to generate all_variants_description_simple.csv.
"""
import csv
from pathlib import Path

import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
import numpy as np

plt.rcParams["font.family"] = "Times New Roman"
plt.rcParams["font.size"] = 12

BASE = Path(__file__).resolve().parent
CSV_PATH = BASE / "all_variants_description_simple.csv"

# Variant order (must match CSV Condition values)
VARIANT_ORDER = [
    "With comments",
    "Without comments",
    "Variable renaming",
    "Dead code",
    "Encryption",
    "Comprehensive",
]
# Short labels for stacked bar x-axis (avoid overlap)
VARIANT_SHORT = [
    "With\ncom",
    "W/o\ncom",
    "Var.\nrename",
    "Dead\ncode",
    "Encrypt.",
    "All.",
]
# Colorblind-safe colors (one per variant)
COLORS = [
    "#7BA3C9",  # blue
    "#88C17C",  # green
    "#E69F00",  # orange
    "#C99B6D",  # tan
    "#D55E00",  # red (vermillion)
    "#5B7BA3",  # dark blue
]
COLOR_CONSENSUS_TRUE = "#7BA3C9"
COLOR_CONSENSUS_FALSE = "#D55E00"

MODELS_ORDER = ["DeepSeek", "Gemini", "O4"]
MODELS_DISPLAY = ["DeepSeek-R1", "Gemini", "O4-mini"]
N_VARIANTS = len(VARIANT_ORDER)
FIG_SIZE_GROUPED = (10, 4)
STACKED_FIG_SIZE = (12, 3)
STACKED_BAR_WIDTH = 0.45  # wider bars
COMPREHENSIVE_VARIANT_INDEX = 5  # Comprehensive is 6th variant (0-based)


def load_data():
    with open(CSV_PATH, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        return [
            {
                **row,
                "LLM_consensus_rate": float(row["LLM_consensus_rate"]),
                "ST_mean": float(row["ST_mean"]),
            }
            for row in reader
        ]


def data_by_model_and_variant(data):
    """Return dict: model -> { condition: row }."""
    by_model = {m: {} for m in MODELS_ORDER}
    for row in data:
        if row["Condition"] in VARIANT_ORDER:
            by_model[row["Model"]][row["Condition"]] = row
    return by_model


def draw_stacked_consensus(by_model):
    """Three panels (one per model), each with 6 stacked bars (one per variant)."""
    fig, axes = plt.subplots(1, 3, figsize=STACKED_FIG_SIZE, sharey=True)
    fig.suptitle("", fontsize=12, y=1.02, fontfamily="Times New Roman")

    for idx, (m, display_name) in enumerate(zip(MODELS_ORDER, MODELS_DISPLAY)):
        ax = axes[idx]
        true_pct = []
        false_pct = []
        for v in VARIANT_ORDER:
            row = by_model[m].get(v)
            if row is None:
                true_pct.append(0)
                false_pct.append(100)
            else:
                t = row["LLM_consensus_rate"] * 100
                true_pct.append(t)
                false_pct.append(100 - t)

        x = np.arange(N_VARIANTS)
        width = STACKED_BAR_WIDTH
        ax.bar(x, true_pct, width, bottom=0, label="LLM Consensus True", color=COLOR_CONSENSUS_TRUE)
        ax.bar(x, false_pct, width, bottom=true_pct, label="LLM Consensus False", color=COLOR_CONSENSUS_FALSE)

        # Red line at the top of each True segment (True/False boundary)
        for i in range(N_VARIANTS):
            if true_pct[i] > 0:
                ax.hlines(true_pct[i], x[i] - width / 2, x[i] + width / 2, colors="red", linewidths=1.5, zorder=5)

        # Explicit failure (False) annotation at Comprehensive bar
        i_comp = COMPREHENSIVE_VARIANT_INDEX
        f_comp = false_pct[i_comp]
        if f_comp > 0:
            ax.annotate(f"Fail: {f_comp:.0f}%", xy=(i_comp, true_pct[i_comp] + f_comp / 2), ha="center", va="center",
                        fontsize=12, color="white", fontweight="bold",
                        bbox=dict(boxstyle="round,pad=0.2", facecolor="red", alpha=0.8, edgecolor="darkred"))

        ax.set_xticks(x)
        ax.set_xticklabels(VARIANT_SHORT, fontsize=12, fontfamily="Times New Roman")
        ax.set_ylabel("Percentage of samples (%)" if idx == 0 else "", fontsize=12, fontfamily="Times New Roman")
        ax.set_title(display_name, fontsize=12, fontfamily="Times New Roman")
        ax.set_ylim(0, 100)
        ax.tick_params(axis="both", labelsize=12)
        ax.grid(axis="y", alpha=0.3)
        for spine in ax.spines.values():
            spine.set_linewidth(0.6)

        # No value annotations inside bars; only "Fail" at Comprehensive is kept above

    handles, labels = axes[0].get_legend_handles_labels()
    fig.legend(handles, labels, loc="lower center", bbox_to_anchor=(0.5, -0.07), ncol=2, fontsize=12)
    for ax in axes[1:]:
        ax.set_yticklabels([])
    for ax in axes:
        plt.setp(ax.get_yticklabels(), fontfamily="Times New Roman", fontsize=12)
    fig.tight_layout()
    return fig


def draw_grouped_bars(ax, by_model, key, ylabel, title):
    """Grouped bar: for each model, one bar per variant (6 bars per model)."""
    x = np.arange(len(MODELS_ORDER))
    width = 0.12  # 6 bars + small gap per model
    total_width = width * N_VARIANTS + 0.05
    offset = np.linspace(-total_width / 2 + width / 2, total_width / 2 - width / 2, N_VARIANTS)

    for i, (v, short) in enumerate(zip(VARIANT_ORDER, VARIANT_SHORT)):
        vals = [by_model[m].get(v, {}).get(key, 0) for m in MODELS_ORDER]
        bars = ax.bar(x + offset[i], vals, width, label=v.replace("\n", " "), color=COLORS[i])
        for b in bars:
            h = b.get_height()
            if h > 0.05:
                ax.annotate(f"{h:.2f}", xy=(b.get_x() + b.get_width() / 2, h), xytext=(0, 2), textcoords="offset points", ha="center", fontsize=12)

    ax.set_ylabel(ylabel, fontsize=12, fontfamily="Times New Roman")
    ax.set_xticks(x)
    ax.set_xticklabels(MODELS_DISPLAY, fontsize=12, fontfamily="Times New Roman")
    ax.set_title(title, fontsize=12, fontfamily="Times New Roman")
    ax.legend(loc="upper right", fontsize=12, ncol=2)
    ax.set_ylim(0, 1.02)
    ax.tick_params(axis="both", labelsize=12)
    ax.grid(axis="y", alpha=0.3, linestyle="--")
    ax.set_axisbelow(True)
    for spine in ax.spines.values():
        spine.set_linewidth(0.6)


def save_pdf(fig, stem):
    out = BASE / f"{stem}.pdf"
    fig.tight_layout()
    fig.savefig(out, format="pdf", bbox_inches="tight")
    plt.close(fig)
    print(f"Saved: {out}")


def main():
    if not CSV_PATH.exists():
        print(f"Run compare_all_variants.py first to create {CSV_PATH}")
        return
    data = load_data()
    by_model = data_by_model_and_variant(data)

    # 1. Stacked: per model, 6 variants with True/False %
    fig0 = draw_stacked_consensus(by_model)
    save_pdf(fig0, "figure_all_variants_consensus_stacked")

    # 2. Grouped: LLM consensus rate (all variants)
    fig1, ax1 = plt.subplots(figsize=FIG_SIZE_GROUPED)
    draw_grouped_bars(
        ax1, by_model, "LLM_consensus_rate",
        ylabel="",
        title="",
    )
    save_pdf(fig1, "figure_all_variants_llm_consensus_boxplot")

    # 3. Grouped: ST mean (all variants)
    fig2, ax2 = plt.subplots(figsize=FIG_SIZE_GROUPED)
    draw_grouped_bars(
        ax2, by_model, "ST_mean",
        ylabel="ST mean similarity (0–1)",
        title="ST Mean Score: All variants per model (Description_Simple)",
    )
    save_pdf(fig2, "figure_all_variants_st_mean_boxplot")


if __name__ == "__main__":
    main()
