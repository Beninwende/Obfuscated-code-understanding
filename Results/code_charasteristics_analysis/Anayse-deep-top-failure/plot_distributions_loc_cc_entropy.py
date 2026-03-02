#!/usr/bin/env python3
"""
Overlaid distribution plots (KDE, filled) for LOC, CC total, Shannon entropy.
Style: stacked distributions by group (Succès / Échec), semi-transparent fill,
similar to multi-generation perplexity plots.
Reads full_code_metrics_consensus_50.csv from same directory.
"""

import csv
from pathlib import Path
import numpy as np

import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt

try:
    import seaborn as sns
    HAS_SEABORN = True
except ImportError:
    HAS_SEABORN = False

try:
    from scipy.stats import gaussian_kde
except ImportError:
    gaussian_kde = None

SCRIPT_DIR = Path(__file__).resolve().parent
CSV_PATH = SCRIPT_DIR / "full_code_metrics_consensus_50.csv"

# Colors: blue tones for Success, orange/brown for Failure (like the reference)
COLOR_SUCCESS = "#2166ac"
COLOR_FAILURE = "#b35806"
FONT_SIZE = 11


def load_data():
    rows = []
    with open(CSV_PATH, "r", encoding="utf-8") as f:
        r = csv.DictReader(f)
        for row in r:
            row["group"] = row["group"].strip()
            row["success_rate"] = float(row["success_rate"])
            row["lines_of_code"] = int(row["lines_of_code"])
            row["cyclomatic_complexity_total"] = int(row["cyclomatic_complexity_total"])
            row["shannon_entropy"] = float(row["shannon_entropy"])
            rows.append(row)
    return rows


def kde_and_plot(ax, values, color, label, x_grid, bw_factor=0.6):
    """Compute KDE with finer bandwidth and plot."""
    values = np.array(values, dtype=float)
    values = values[np.isfinite(values)]
    if len(values) < 2:
        return
    if gaussian_kde is not None:
        try:
            # Scott's rule then scale by bw_factor: <1 gives finer detail (more peaks visible)
            kde = gaussian_kde(values, bw_method="scott")
            kde.set_bandwidth(kde.factor * bw_factor)
            density = kde(x_grid)
            density = np.maximum(density, 1e-10)
            ax.fill_between(x_grid, density, alpha=0.35, color=color)
            ax.plot(x_grid, density, color=color, linewidth=2, label=label)
        except Exception:
            ax.hist(values, bins=40, density=True, alpha=0.35, color=color, label=label, edgecolor=color)
    else:
        ax.hist(values, bins=40, density=True, alpha=0.35, color=color, label=label, edgecolor=color)


def add_rug(ax, success_vals, failure_vals, log_y):
    """Add rug plot (tick marks) at bottom for each data point."""
    success_vals = np.asarray(success_vals)
    failure_vals = np.asarray(failure_vals)
    if len(success_vals) == 0 and len(failure_vals) == 0:
        return
    y_lo, y_hi = ax.get_ylim()
    if log_y and y_lo > 0:
        rug_y = y_lo * (y_hi / y_lo) ** 0.02
    else:
        rug_y = y_lo - 0.02 * (max(y_hi - y_lo, 1e-10))
    if len(success_vals) > 0:
        ax.scatter(success_vals, np.full_like(success_vals, rug_y), c=COLOR_SUCCESS, s=6, alpha=0.7, marker="|", linewidths=0.5, zorder=10)
    if len(failure_vals) > 0:
        ax.scatter(failure_vals, np.full_like(failure_vals, rug_y), c=COLOR_FAILURE, s=6, alpha=0.7, marker="|", linewidths=0.5, zorder=10)


def plot_one_distribution(data, key, short_label, xlabel, out_path, log_y=False, rug=True):
    success_rows = [r for r in data if r["group"] == "success"]
    failure_rows = [r for r in data if r["group"] == "failure"]
    success_vals = np.array([r[key] for r in success_rows], dtype=float)
    failure_vals = np.array([r[key] for r in failure_rows], dtype=float)
    # Taux de succès LLM (consensus) par groupe : min – max en %
    rate_success = [r["success_rate"] * 100 for r in success_rows]
    rate_failure = [r["success_rate"] * 100 for r in failure_rows]
    min_s, max_s = (min(rate_success), max(rate_success)) if rate_success else (0, 0)
    min_f, max_f = (min(rate_failure), max(rate_failure)) if rate_failure else (0, 0)
    label_success = f"Top succeed — taux LLM : {min_s:.1f} % – {max_s:.1f} %"
    label_failure = f"Top failed — taux LLM : {min_f:.1f} % – {max_f:.1f} %"
    all_vals = np.concatenate([success_vals, failure_vals])
    all_vals = all_vals[np.isfinite(all_vals)]
    if len(all_vals) == 0:
        return
    x_min, x_max = all_vals.min(), all_vals.max()
    x_range = x_max - x_min or 1
    # Finer grid: more points for smoother curves and detail
    n_grid = 800
    x_grid = np.linspace(max(0, x_min - 0.03 * x_range), x_max + 0.03 * x_range, n_grid)

    fig, ax = plt.subplots(figsize=(8, 5))
    kde_and_plot(ax, success_vals, COLOR_SUCCESS, label_success, x_grid, bw_factor=0.55)
    kde_and_plot(ax, failure_vals, COLOR_FAILURE, label_failure, x_grid, bw_factor=0.55)
    if rug:
        add_rug(ax, success_vals, failure_vals, log_y)

    ax.set_xlabel(xlabel, fontsize=FONT_SIZE)
    ax.set_ylabel("Density", fontsize=FONT_SIZE)
    ax.set_title(f"{short_label} (fine-grained KDE)", fontsize=FONT_SIZE + 1)
    if log_y:
        ax.set_yscale("log")
        ax.set_ylim(bottom=1e-5)
    ax.legend(loc="upper right", fontsize=FONT_SIZE)
    ax.grid(True, alpha=0.3, linestyle="--")
    ax.set_xlim(x_grid[0], x_grid[-1])
    fig.tight_layout()
    fig.savefig(out_path, dpi=200, bbox_inches="tight")
    plt.close(fig)


def main():
    if not CSV_PATH.exists():
        print(f"CSV not found: {CSV_PATH}")
        return
    data = load_data()
    if not data:
        print("No data loaded.")
        return

    criteria = [
        ("lines_of_code", "LOC", "Lines of code"),
        ("cyclomatic_complexity_total", "CC total", "Cyclomatic complexity (total)"),
        ("shannon_entropy", "Shannon entropy", "Shannon entropy"),
    ]
    for key, short_label, xlabel in criteria:
        out_path = SCRIPT_DIR / f"distribution_{key}.png"
        plot_one_distribution(data, key, short_label, xlabel, out_path, log_y=True)
        print(f"  - {out_path.name}")
    print("Done. Figures in:", SCRIPT_DIR)


if __name__ == "__main__":
    main()
