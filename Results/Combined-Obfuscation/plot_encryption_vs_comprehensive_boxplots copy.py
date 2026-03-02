"""
Per-model comparison: Encryption vs Comprehensive Obfuscation for DeepSeek-R1, Gemini, O4-mini.
- Grouped bar charts: LLM consensus rate and ST mean (each model has Enc + Comp bars).
- Stacked bar: True/False % per model per condition (6 bars in 3 groups).
Outputs PDF.
"""
import csv
from pathlib import Path

import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
import numpy as np

# Paths
BASE = Path(__file__).resolve().parent
CSV_PATH = BASE / "encryption_vs_comprehensive_description_simple.csv"

# Style (ACM-style: colorblind-safe; False = red)
COLOR_ENCRYPTION = "#7BA3C9"
COLOR_COMPREHENSIVE = "#C99B6D"
COLOR_CONSENSUS_TRUE = COLOR_ENCRYPTION   # soft blue
COLOR_CONSENSUS_FALSE = "#D55E00"        # ACM-style red (vermillion, colorblind-safe)
FIG_SIZE = (4.5, 3)
STACKED_FIG_SIZE = (6, 3)   # 3 panels side by side
BAR_WIDTH = 0.32
STACKED_BAR_WIDTH = 0.38
MODELS_ORDER = ["DeepSeek", "Gemini", "O4"]
MODELS_DISPLAY = ["DeepSeek-R1", "Gemini", "O4-mini"]


def load_data():
    """Load CSV; return list of dicts with numeric fields."""
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


def data_by_model(data):
    """Return dict: model -> { 'Encryption': row, 'Comprehensive': row }."""
    by_model = {m: {} for m in MODELS_ORDER}
    for row in data:
        by_model[row["Model"]][row["Condition"]] = row
    return by_model


def draw_grouped_bars(ax, by_model, key, ylabel, title):
    """Grouped bar chart: for each model, Encryption vs Comprehensive."""
    x = np.arange(len(MODELS_ORDER))
    width = BAR_WIDTH
    enc_vals = [by_model[m]["Encryption"][key] for m in MODELS_ORDER]
    comp_vals = [by_model[m]["Comprehensive"][key] for m in MODELS_ORDER]

    bars_enc = ax.bar(x - width / 2, enc_vals, width, label="Encryption", color=COLOR_ENCRYPTION)
    bars_comp = ax.bar(x + width / 2, comp_vals, width, label="Comprehensive Obfuscation", color=COLOR_COMPREHENSIVE)

    ax.set_ylabel(ylabel, fontsize=8)
    ax.set_xticks(x)
    ax.set_xticklabels(MODELS_DISPLAY, fontsize=8)
    ax.set_title(title, fontsize=9)
    ax.legend(loc="upper right", fontsize=7)
    ax.set_ylim(0, 1.02)
    ax.tick_params(axis="both", labelsize=7)
    ax.grid(axis="y", alpha=0.3, linestyle="--")
    ax.set_axisbelow(True)
    for spine in ax.spines.values():
        spine.set_linewidth(0.6)

    for b in bars_enc:
        h = b.get_height()
        if h > 0.05:
            ax.annotate(f"{h:.2f}", xy=(b.get_x() + b.get_width() / 2, h), xytext=(0, 2), textcoords="offset points", ha="center", fontsize=6)
    for b in bars_comp:
        h = b.get_height()
        if h > 0.05:
            ax.annotate(f"{h:.2f}", xy=(b.get_x() + b.get_width() / 2, h), xytext=(0, 2), textcoords="offset points", ha="center", fontsize=6)


def draw_stacked_consensus(by_model):
    """Three distinct blocks (subplots): one per model, each with two stacked bars (Encryption | Comprehensive). False = ACM red."""
    fig, axes = plt.subplots(1, 3, figsize=STACKED_FIG_SIZE, sharey=True)
    fig.suptitle("LLM Consensus: Succeeded (True) vs Failed (False) per model (Description_Simple)", fontsize=9, y=1.02)

    for idx, (m, display_name) in enumerate(zip(MODELS_ORDER, MODELS_DISPLAY)):
        ax = axes[idx]
        enc_row = by_model[m]["Encryption"]
        comp_row = by_model[m]["Comprehensive"]
        true_pct = [enc_row["LLM_consensus_rate"] * 100, comp_row["LLM_consensus_rate"] * 100]
        false_pct = [100 - t for t in true_pct]

        x = np.array([0, 1])
        width = STACKED_BAR_WIDTH
        ax.bar(x, true_pct, width, bottom=0, label="LLM Consensus True", color=COLOR_CONSENSUS_TRUE)
        ax.bar(x, false_pct, width, bottom=true_pct, label="LLM Consensus False", color=COLOR_CONSENSUS_FALSE)

        ax.set_xticks(x)
        ax.set_xticklabels(["Encryption", "Comprehensive\nObfuscation"], fontsize=7)
        ax.set_ylabel("Percentage of samples (%)" if idx == 0 else "", fontsize=8)
        ax.set_title(display_name, fontsize=8)
        ax.set_ylim(0, 100)
        ax.tick_params(axis="both", labelsize=7)
        ax.grid(axis="y", alpha=0.3)
        for spine in ax.spines.values():
            spine.set_linewidth(0.6)

        for i, (t, f) in enumerate(zip(true_pct, false_pct)):
            if t > 5:
                ax.annotate(f"{t:.1f}%", xy=(i, t / 2), ha="center", va="center", fontsize=7, color="white", fontweight="bold")
            if f > 5:
                ax.annotate(f"{f:.1f}%", xy=(i, t + f / 2), ha="center", va="center", fontsize=7, color="white", fontweight="bold")

    axes[0].legend(loc="upper right", fontsize=6)
    for ax in axes[1:]:
        ax.set_yticklabels([])
    fig.tight_layout()
    save_pdf(fig, "figure_encryption_vs_comprehensive_consensus_stacked")


def save_pdf(fig, stem):
    out = BASE / f"{stem}.pdf"
    fig.tight_layout()
    fig.savefig(out, format="pdf", bbox_inches="tight")
    plt.close(fig)
    print(f"Saved: {out}")


def main():
    data = load_data()
    by_model = data_by_model(data)

    # 1. Stacked bar: per model, Enc vs Comp with True/False %
    draw_stacked_consensus(by_model)

    # 2. Grouped bar: LLM consensus rate per model (Enc vs Comp)
    fig1, ax1 = plt.subplots(figsize=FIG_SIZE)
    draw_grouped_bars(
        ax1, by_model, "LLM_consensus_rate",
        ylabel="LLM consensus rate (0–1)",
        title="LLM Consensus Rate: Encryption vs Comprehensive per model (Description_Simple)",
    )
    save_pdf(fig1, "figure_encryption_vs_comprehensive_llm_consensus_boxplot")

    # 3. Grouped bar: ST mean per model (Enc vs Comp)
    fig2, ax2 = plt.subplots(figsize=FIG_SIZE)
    draw_grouped_bars(
        ax2, by_model, "ST_mean",
        ylabel="ST mean similarity (0–1)",
        title="ST Mean Score: Encryption vs Comprehensive per model (Description_Simple)",
    )
    save_pdf(fig2, "figure_encryption_vs_comprehensive_st_mean_boxplot")


if __name__ == "__main__":
    main()
