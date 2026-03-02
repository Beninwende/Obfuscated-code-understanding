#!/usr/bin/env python3
"""
Visualize success vs failure: distributions, scatter plots, task-type breakdown,
and effect-size illustration. Reads full_code_metrics_consensus_50.csv from same directory.
"""

import csv
from pathlib import Path
import numpy as np

try:
    import matplotlib
    matplotlib.use("Agg")
    import matplotlib.pyplot as plt
except ImportError:
    plt = None

try:
    import seaborn as sns
except ImportError:
    sns = None

SCRIPT_DIR = Path(__file__).resolve().parent
CSV_PATH = SCRIPT_DIR / "full_code_metrics_consensus_50.csv"
OUT_DIR = SCRIPT_DIR

# Style: distinct, readable
COLOR_SUCCESS = "#2ecc71"
COLOR_FAILURE = "#e74c3c"
COLOR_THRESHOLD = "#3498db"
FIGSIZE = (7, 4.5)
FIGSIZE_WIDE = (10, 5)
FONT_SIZE = 11


def load_data():
    rows = []
    with open(CSV_PATH, "r", encoding="utf-8") as f:
        r = csv.DictReader(f)
        for row in r:
            row["success_rate"] = float(row["success_rate"])
            row["lines_of_code"] = int(row["lines_of_code"])
            row["cyclomatic_complexity_total"] = int(row["cyclomatic_complexity_total"])
            row["cyclomatic_complexity_max"] = int(row["cyclomatic_complexity_max"])
            row["density"] = float(row["density"])
            row["shannon_entropy"] = float(row["shannon_entropy"])
            row["function_count"] = int(row["function_count"])
            row["max_nesting_depth"] = int(row["max_nesting_depth"])
            row["has_recursion"] = row["has_recursion"] == "1"
            rows.append(row)
    return rows


def fig_success_rate_distribution(data):
    """Histogram of success rate + threshold line; shows polarization."""
    rates = [r["success_rate"] for r in data]
    fig, ax = plt.subplots(figsize=FIGSIZE)
    ax.hist(rates, bins=25, color="#95a5a6", edgecolor="white", alpha=0.85, density=False)
    ax.axvline(0.5, color=COLOR_THRESHOLD, linewidth=2, linestyle="--", label="Seuil 50%")
    ax.set_xlabel("Taux de succès (consensus)", fontsize=FONT_SIZE)
    ax.set_ylabel("Nombre de problèmes", fontsize=FONT_SIZE)
    ax.set_title("Distribution du taux de succès (consensus) sur tous les problèmes")
    ax.legend(loc="upper left", fontsize=FONT_SIZE - 1)
    ax.set_xlim(0, 1)
    fig.tight_layout()
    fig.savefig(OUT_DIR / "01_success_rate_distribution.png", dpi=150, bbox_inches="tight")
    plt.close(fig)


def fig_metric_distributions_by_group(data):
    """Violin + strip for key metrics: success vs failure."""
    metrics = [
        ("lines_of_code", "LOC", "Lines of code"),
        ("shannon_entropy", "Entropy", "Shannon entropy"),
        ("density", "Density", "CC / LOC"),
        ("cyclomatic_complexity_total", "CC total", "Cyclomatic complexity (total)"),
        ("function_count", "Functions", "Function count"),
        ("max_nesting_depth", "Nesting", "Max nesting depth"),
    ]
    n = len(metrics)
    ncol = 3
    nrow = (n + ncol - 1) // ncol
    fig, axes = plt.subplots(nrow, ncol, figsize=(4 * ncol, 3.5 * nrow))
    axes = axes.flatten() if n > 1 else [axes]
    for idx, (key, short_label, ylabel) in enumerate(metrics):
        ax = axes[idx]
        success_vals = [r[key] for r in data if r["group"] == "success"]
        failure_vals = [r[key] for r in data if r["group"] == "failure"]
        parts = ax.violinplot(
            [success_vals, failure_vals],
            positions=[1, 2],
            showmeans=True,
            showmedians=True,
        )
        for i, pc in enumerate(parts["bodies"]):
            pc.set_facecolor(COLOR_SUCCESS if i == 0 else COLOR_FAILURE)
            pc.set_alpha(0.7)
        ax.set_xticks([1, 2])
        ax.set_xticklabels(["Succès\n(≥50%)", "Échec\n(<50%)"], fontsize=FONT_SIZE - 1)
        ax.set_ylabel(ylabel, fontsize=FONT_SIZE - 1)
        ax.set_title(short_label, fontsize=FONT_SIZE)
        ax.grid(axis="y", alpha=0.3)
    for j in range(idx + 1, len(axes)):
        axes[j].set_visible(False)
    fig.suptitle("Distributions des métriques de code par groupe (succès vs échec)", fontsize=FONT_SIZE + 2, y=1.02)
    fig.tight_layout()
    fig.savefig(OUT_DIR / "02_metric_distributions_by_group.png", dpi=150, bbox_inches="tight")
    plt.close(fig)


def fig_scatter_entropy_vs_density(data):
    """2D scatter: entropy vs density, colored by group. Highlights separation."""
    fig, ax = plt.subplots(figsize=FIGSIZE_WIDE)
    for g, color, label in [("success", COLOR_SUCCESS, "Succès (≥50%)"), ("failure", COLOR_FAILURE, "Échec (<50%)")]:
        sub = [r for r in data if r["group"] == g]
        x = [r["shannon_entropy"] for r in sub]
        y = [r["density"] for r in sub]
        ax.scatter(x, y, c=color, label=label, alpha=0.6, s=40, edgecolors="white", linewidths=0.5)
    ax.set_xlabel("Entropie de Shannon", fontsize=FONT_SIZE)
    ax.set_ylabel("Densité (CC / LOC)", fontsize=FONT_SIZE)
    ax.set_title("Entropie vs densité : séparation des groupes succès / échec")
    ax.legend(loc="upper right", fontsize=FONT_SIZE)
    ax.grid(True, alpha=0.3)
    fig.tight_layout()
    fig.savefig(OUT_DIR / "03_scatter_entropy_vs_density.png", dpi=150, bbox_inches="tight")
    plt.close(fig)


def fig_scatter_loc_vs_entropy(data):
    """2D scatter: LOC vs entropy, colored by group."""
    fig, ax = plt.subplots(figsize=FIGSIZE_WIDE)
    for g, color, label in [("success", COLOR_SUCCESS, "Succès (≥50%)"), ("failure", COLOR_FAILURE, "Échec (<50%)")]:
        sub = [r for r in data if r["group"] == g]
        x = [r["lines_of_code"] for r in sub]
        y = [r["shannon_entropy"] for r in sub]
        ax.scatter(x, y, c=color, label=label, alpha=0.6, s=40, edgecolors="white", linewidths=0.5)
    ax.set_xlabel("Lines of code (LOC)", fontsize=FONT_SIZE)
    ax.set_ylabel("Entropie de Shannon", fontsize=FONT_SIZE)
    ax.set_title("LOC vs entropie : succès vs échec")
    ax.legend(loc="upper right", fontsize=FONT_SIZE)
    ax.grid(True, alpha=0.3)
    fig.tight_layout()
    fig.savefig(OUT_DIR / "04_scatter_loc_vs_entropy.png", dpi=150, bbox_inches="tight")
    plt.close(fig)


def fig_task_type_breakdown(data):
    """Stacked or grouped bar: task_type counts for success vs failure."""
    from collections import defaultdict
    success_by_type = defaultdict(int)
    failure_by_type = defaultdict(int)
    for r in data:
        t = r.get("task_type") or "other"
        if r["group"] == "success":
            success_by_type[t] += 1
        else:
            failure_by_type[t] += 1
    types = sorted(set(success_by_type) | set(failure_by_type))
    success_vals = [success_by_type[t] for t in types]
    failure_vals = [failure_by_type[t] for t in types]
    x = np.arange(len(types))
    width = 0.35
    fig, ax = plt.subplots(figsize=(max(10, len(types) * 0.5), 5))
    ax.bar(x - width / 2, success_vals, width, label="Succès (≥50%)", color=COLOR_SUCCESS, alpha=0.85)
    ax.bar(x + width / 2, failure_vals, width, label="Échec (<50%)", color=COLOR_FAILURE, alpha=0.85)
    ax.set_xticks(x)
    ax.set_xticklabels(types, rotation=45, ha="right", fontsize=FONT_SIZE - 1)
    ax.set_ylabel("Nombre de problèmes", fontsize=FONT_SIZE)
    ax.set_title("Répartition par type de tâche (référence) : succès vs échec")
    ax.legend(loc="upper right", fontsize=FONT_SIZE)
    ax.grid(axis="y", alpha=0.3)
    fig.tight_layout()
    fig.savefig(OUT_DIR / "05_task_type_breakdown.png", dpi=150, bbox_inches="tight")
    plt.close(fig)


def fig_effect_size_bars(data):
    """Bar chart: mean(metric) difference (success - failure) or standardized; shows which metrics differentiate most."""
    success = [r for r in data if r["group"] == "success"]
    failure = [r for r in data if r["group"] == "failure"]
    if not success or not failure:
        return
    metrics = [
        ("lines_of_code", "LOC"),
        ("shannon_entropy", "Entropie Shannon"),
        ("density", "Densité (CC/LOC)"),
        ("cyclomatic_complexity_total", "CC totale"),
        ("function_count", "Nb fonctions"),
        ("max_nesting_depth", "Prof. imbrication"),
    ]
    labels = []
    diffs = []
    for key, label in metrics:
        m_s = np.mean([r[key] for r in success])
        m_f = np.mean([r[key] for r in failure])
        # Normalize by pooled std so effect sizes are comparable
        all_vals = [r[key] for r in data]
        std = np.std(all_vals) or 1e-6
        d = (m_s - m_f) / std
        labels.append(label)
        diffs.append(d)
    colors = [COLOR_SUCCESS if d > 0 else COLOR_FAILURE for d in diffs]
    fig, ax = plt.subplots(figsize=(8, 4.5))
    y_pos = np.arange(len(labels))
    ax.barh(y_pos, diffs, color=colors, alpha=0.8)
    ax.axvline(0, color="black", linewidth=0.8)
    ax.set_yticks(y_pos)
    ax.set_yticklabels(labels, fontsize=FONT_SIZE)
    ax.set_xlabel("Effet (moyenne succès − moyenne échec), en écarts-types", fontsize=FONT_SIZE)
    ax.set_title("Différenciateurs : quel groupe a des valeurs plus élevées ?\n(positif = succès > échec)")
    ax.grid(axis="x", alpha=0.3)
    fig.tight_layout()
    fig.savefig(OUT_DIR / "06_effect_size_differentiators.png", dpi=150, bbox_inches="tight")
    plt.close(fig)


def fig_radar_profile(data):
    """Radar chart: average normalized profile of success vs failure across metrics."""
    success = [r for r in data if r["group"] == "success"]
    failure = [r for r in data if r["group"] == "failure"]
    if not success or not failure:
        return
    metrics = [
        "lines_of_code",
        "shannon_entropy",
        "density",
        "cyclomatic_complexity_total",
        "function_count",
        "max_nesting_depth",
    ]
    all_vals = {k: [r[k] for r in data] for k in metrics}
    # Normalize each metric to [0,1] over full dataset
    mins = {k: min(all_vals[k]) for k in metrics}
    maxs = {k: max(all_vals[k]) for k in metrics}
    def norm(vals, k):
        lo, hi = mins[k], maxs[k]
        if hi == lo:
            return [0.5] * len(vals)
        return [(v - lo) / (hi - lo) for v in vals]
    angles = np.linspace(0, 2 * np.pi, len(metrics), endpoint=False).tolist()
    angles += angles[:1]
    success_means = [np.mean(norm([r[k] for r in success], k)) for k in metrics]
    failure_means = [np.mean(norm([r[k] for r in failure], k)) for k in metrics]
    success_means += success_means[:1]
    failure_means += failure_means[:1]
    short = ["LOC", "Entropy", "Density", "CC", "Funcs", "Nesting"]
    fig, ax = plt.subplots(figsize=(6, 6), subplot_kw=dict(projection="polar"))
    ax.plot(angles, success_means, "o-", linewidth=2, label="Succès (≥50%)", color=COLOR_SUCCESS)
    ax.fill(angles, success_means, alpha=0.25, color=COLOR_SUCCESS)
    ax.plot(angles, failure_means, "o-", linewidth=2, label="Échec (<50%)", color=COLOR_FAILURE)
    ax.fill(angles, failure_means, alpha=0.25, color=COLOR_FAILURE)
    ax.set_xticks(angles[:-1])
    ax.set_xticklabels(short, fontsize=FONT_SIZE - 1)
    ax.set_ylim(0, 1)
    ax.legend(loc="upper right", bbox_to_anchor=(1.3, 1.0), fontsize=FONT_SIZE)
    ax.set_title("Profil moyen des métriques (normalisées 0–1)\nSuccès vs Échec", fontsize=FONT_SIZE, pad=20)
    fig.tight_layout()
    fig.savefig(OUT_DIR / "07_radar_metric_profiles.png", dpi=150, bbox_inches="tight")
    plt.close(fig)


def fig_recursion_pie(data):
    """Pie or bar: proportion with recursion in success vs failure."""
    success = [r for r in data if r["group"] == "success"]
    failure = [r for r in data if r["group"] == "failure"]
    s_yes = sum(1 for r in success if r.get("has_recursion"))
    s_no = len(success) - s_yes
    f_yes = sum(1 for r in failure if r.get("has_recursion"))
    f_no = len(failure) - f_yes
    fig, axes = plt.subplots(1, 2, figsize=(8, 4))
    axes[0].pie([s_yes, s_no], labels=["Avec récursion", "Sans récursion"], autopct="%1.0f%%", colors=[COLOR_SUCCESS, "#bdc3c7"], startangle=90)
    axes[0].set_title("Succès (≥50%)", fontsize=FONT_SIZE)
    axes[1].pie([f_yes, f_no], labels=["Avec récursion", "Sans récursion"], autopct="%1.0f%%", colors=[COLOR_FAILURE, "#bdc3c7"], startangle=90)
    axes[1].set_title("Échec (<50%)", fontsize=FONT_SIZE)
    fig.suptitle("Présence de récursion dans le code", fontsize=FONT_SIZE + 2, y=1.02)
    fig.tight_layout()
    fig.savefig(OUT_DIR / "08_recursion_by_group.png", dpi=150, bbox_inches="tight")
    plt.close(fig)


def fig_boxplots_all_criteria(data):
    """Boxplots for all numeric criteria: one subplot per metric, success vs failure."""
    criteria = [
        ("lines_of_code", "LOC", "Lines of code"),
        ("cyclomatic_complexity_total", "CC total", "Cyclomatic complexity (total)"),
        ("cyclomatic_complexity_max", "CC max", "Cyclomatic complexity (max)"),
        ("density", "Density", "Density (CC / LOC)"),
        ("shannon_entropy", "Shannon entropy", "Shannon entropy"),
        ("function_count", "Function count", "Number of functions"),
        ("max_nesting_depth", "Max nesting depth", "Max nesting depth"),
    ]
    n = len(criteria)
    ncol = 2
    nrow = (n + ncol - 1) // ncol
    fig, axes = plt.subplots(nrow, ncol, figsize=(5 * ncol, 4 * nrow))
    axes = np.atleast_2d(axes)
    for idx, (key, short_label, ylabel) in enumerate(criteria):
        row, col = idx // ncol, idx % ncol
        ax = axes[row, col]
        success_vals = [r[key] for r in data if r["group"] == "success"]
        failure_vals = [r[key] for r in data if r["group"] == "failure"]
        bp = ax.boxplot(
            [success_vals, failure_vals],
            labels=["Succès (≥50%)", "Échec (<50%)"],
            patch_artist=True,
            notch=False,
            showmeans=True,
        )
        for i, patch in enumerate(bp["boxes"]):
            patch.set_facecolor(COLOR_SUCCESS if i == 0 else COLOR_FAILURE)
            patch.set_alpha(0.7)
        for whisker in bp["whiskers"]:
            whisker.set_color("#333")
        for cap in bp["caps"]:
            cap.set_color("#333")
        for median in bp["medians"]:
            median.set_color("#333")
            median.set_linewidth(1.5)
        ax.set_ylabel(ylabel, fontsize=FONT_SIZE - 1)
        ax.set_title(short_label, fontsize=FONT_SIZE)
        ax.grid(axis="y", alpha=0.3)
    # Hide unused subplots
    for idx in range(n, nrow * ncol):
        row, col = idx // ncol, idx % ncol
        axes[row, col].set_visible(False)
    fig.suptitle("Boxplots de tous les critères par groupe (Succès vs Échec)", fontsize=FONT_SIZE + 2, y=1.02)
    fig.tight_layout()
    fig.savefig(OUT_DIR / "09_boxplots_all_criteria.png", dpi=150, bbox_inches="tight")
    plt.close(fig)


def main():
    if plt is None:
        print("matplotlib required: pip install matplotlib")
        return
    if not CSV_PATH.exists():
        print(f"CSV not found: {CSV_PATH}")
        return
    data = load_data()
    if not data:
        print("No data loaded.")
        return
    print("Generating visualizations...")
    fig_success_rate_distribution(data)
    print("  - 01_success_rate_distribution.png")
    fig_metric_distributions_by_group(data)
    print("  - 02_metric_distributions_by_group.png")
    fig_scatter_entropy_vs_density(data)
    print("  - 03_scatter_entropy_vs_density.png")
    fig_scatter_loc_vs_entropy(data)
    print("  - 04_scatter_loc_vs_entropy.png")
    fig_task_type_breakdown(data)
    print("  - 05_task_type_breakdown.png")
    fig_effect_size_bars(data)
    print("  - 06_effect_size_differentiators.png")
    fig_radar_profile(data)
    print("  - 07_radar_metric_profiles.png")
    fig_recursion_pie(data)
    print("  - 08_recursion_by_group.png")
    fig_boxplots_all_criteria(data)
    print("  - 09_boxplots_all_criteria.png")
    print("Done. Figures saved in:", OUT_DIR)


if __name__ == "__main__":
    main()
