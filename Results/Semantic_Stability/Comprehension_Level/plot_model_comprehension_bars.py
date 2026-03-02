#!/usr/bin/env python3
"""
Vertical grouped bar chart for model_comprehension.csv.
Three bars per model: s_enc, s_dead, s_lex. Dashed line at 0.5.
Colors: ACM-compliant (colorblind-safe, distinct luminance for greyscale).
"""
import numpy as np
import pandas as pd
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
from pathlib import Path
import warnings
warnings.filterwarnings("ignore")

LEVEL_ORDER = ["Semantic", "Structural", "Lexical"]
# Bar order: Lexical, Structural, Semantic. Nice, cohesive palette (colorblind-safe).
COLORS = {
    "Lexical": "#F4A261",    # warm peach/orange
    "Structural": "#2A9D8F", # teal
    "Semantic": "#457B9D",   # soft blue
}


def model_display_name(name: str) -> str:
    s = name.replace("Dataset_", "", 1) if name.startswith("Dataset_") else name
    if s == "Llama70b_Generation":
        return "Llama70B"
    if s.endswith("_Generation"):
        return s[: -len("_Generation")]
    return s


def main():
    base = Path(__file__).resolve().parent
    csv_path = base / "model_comprehension.csv"
    out_path = base / "model_comprehension_bars.png"

    df = pd.read_csv(csv_path)
    df["model_display"] = df["model"].map(model_display_name)
    df["_level_ord"] = df["comprehension_level"].map(lambda x: LEVEL_ORDER.index(x) if x in LEVEL_ORDER else 99)
    df = df.sort_values(["_level_ord", "s_enc"], ascending=[True, False]).reset_index(drop=True)
    n = len(df)
    x_pos = np.arange(n)
    width = 0.26

    fig, ax = plt.subplots(figsize=(12, 6))
    # Bar order (left to right): Lexical, Structural, Semantic
    ax.bar(x_pos - width, df["s_lex"], width, color=COLORS["Lexical"], label="Lexical", edgecolor="0.25", linewidth=0.8)
    ax.bar(x_pos, df["s_dead"], width, color=COLORS["Structural"], label="Structural", edgecolor="0.25", linewidth=0.8)
    ax.bar(x_pos + width, df["s_enc"], width, color=COLORS["Semantic"], label="Semantic", edgecolor="0.25", linewidth=0.8)
    ax.axhline(y=0.5, color="red", linestyle="--", linewidth=1.2, zorder=0)
    ax.set_xticks(x_pos)
    ax.set_xticklabels(df["model_display"], rotation=45, ha="right")
    ax.set_ylabel("Score", fontsize=11, fontweight="bold")
    ax.set_xlabel("Model", fontsize=11, fontweight="bold")
    ax.set_ylim(0, 1.05)
    ax.legend(loc="upper right", fontsize=9)
    ax.set_title("Comprehension scores by transform type", fontsize=12, fontweight="bold")
    plt.tight_layout()
    plt.savefig(out_path, dpi=150, bbox_inches="tight")
    plt.close()
    print(f"Saved {out_path}")


if __name__ == "__main__":
    main()
