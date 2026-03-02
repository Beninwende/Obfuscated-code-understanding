#!/usr/bin/env python3
"""
Generate the global failure types pie chart and save as PDF.
Uses the same colors as global_failure_pie.html.

Requires: matplotlib (pip install matplotlib)
Run: python3 plot_global_failure_pie.py
Output: global_failure_pie.pdf (in this directory)
"""
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
import numpy as np
from pathlib import Path

plt.rcParams["font.family"] = "Times New Roman"

# Same data and order as global_failure_pie.html (total 1720)
values = [976, 350, 334, 60]
labels = ["Encryption\nFailure", "Variable\nRenaming\nFailure", "Dead Code\nFailure", "Comment\nDependency"]

# Same colors as HTML (RGB 0-1)
colors = [
    (252 / 255, 141 / 255, 98 / 255),   # Encryption
    (141 / 255, 160 / 255, 203 / 255),   # Variable Renaming
    (102 / 255, 194 / 255, 165 / 255),   # Dead Code
    (229 / 255, 196 / 255, 148 / 255),   # Comment Dependency
]

def main():
    fig, ax = plt.subplots(figsize=(6, 5))
    wedges, texts, autotexts = ax.pie(
        values,
        labels=None,
        colors=colors,
        autopct="%1.1f%%",
        startangle=90,
        pctdistance=0.75,
        textprops={"fontsize": 20},
    )
    for t in autotexts:
        t.set_fontsize(14)

    # Place labels manually outside the pie (radius 1); "Comment Dependency" slightly further to avoid Dead Code
    label_distance = 1.32
    for i, (wedge, label) in enumerate(zip(wedges, labels)):
        ang = (wedge.theta2 + wedge.theta1) / 2
        r = label_distance
        if i == 3:
            r = 1.28
        x = r * np.cos(np.radians(ang))
        y = r * np.sin(np.radians(ang))
        ha = "center" if -90 <= ang <= 90 else "center"
        ax.text(x, y, label, fontsize=20, ha=ha, va="center")
    ax.set_title("", fontsize=20)
    plt.tight_layout()

    out_dir = Path(__file__).resolve().parent
    pdf_path = out_dir / "global_failure_pie.pdf"
    fig.savefig(pdf_path, format="pdf", bbox_inches="tight", facecolor="white")
    plt.close()
    print(f"Saved {pdf_path}")


if __name__ == "__main__":
    main()
