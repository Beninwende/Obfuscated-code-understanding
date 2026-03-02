"""
Export all-variants results as tables from all_variants_description_simple.csv.
Outputs: table_all_variants.tex, table_all_variants.md, figure_all_variants_table.pdf
Run compare_all_variants.py first to generate the CSV.
"""
import csv
from pathlib import Path

BASE = Path(__file__).resolve().parent
CSV_PATH = BASE / "all_variants_description_simple.csv"

VARIANT_ORDER = [
    "With comments",
    "Without comments",
    "Variable renaming",
    "Dead code",
    "Encryption",
    "Comprehensive",
]
MODELS_ORDER = ["DeepSeek", "Gemini", "O4"]
MODELS_DISPLAY = ["DeepSeek-R1", "Gemini", "O4-mini"]


def load_data():
    with open(CSV_PATH, "r", encoding="utf-8") as f:
        return list(csv.DictReader(f))


def data_by_model_and_variant(data):
    by_model = {m: {} for m in MODELS_ORDER}
    for row in data:
        if row["Condition"] in VARIANT_ORDER:
            by_model[row["Model"]][row["Condition"]] = row
    return by_model


def write_latex(by_model, out_path):
    cols = " & ".join([v.replace(" ", r"\ ") for v in VARIANT_ORDER])
    lines = [
        r"\begin{table}[htbp]",
        r"\centering",
        r"\caption{LLM consensus rate and ST mean by model and variant (Description\_Simple).}",
        r"\label{tab:all_variants}",
        r"\textbf{LLM consensus rate (0--1)}",
        r"\begin{tabular}{l|cccccc}",
        r"\toprule",
        r"\textbf{Model} & " + cols + r" \\",
        r"\midrule",
    ]
    for m, disp in zip(MODELS_ORDER, MODELS_DISPLAY):
        row = [disp]
        for v in VARIANT_ORDER:
            r = by_model[m].get(v, {})
            if r:
                x = float(r["LLM_consensus_rate"])
                row.append(f"{x:.3f} ({x*100:.1f}\\%)")
            else:
                row.append("--")
        lines.append(" & ".join(row) + r" \\")
    lines.extend([
        r"\bottomrule",
        r"\end{tabular}",
        r"\vspace{1em}",
        r"\textbf{ST mean similarity (0--1)}",
        r"\begin{tabular}{l|cccccc}",
        r"\toprule",
        r"\textbf{Model} & " + cols + r" \\",
        r"\midrule",
    ])
    for m, disp in zip(MODELS_ORDER, MODELS_DISPLAY):
        row = [disp]
        for v in VARIANT_ORDER:
            r = by_model[m].get(v, {})
            if r:
                x = float(r["ST_mean"])
                row.append(f"{x:.3f} ({x*100:.1f}\\%)")
            else:
                row.append("--")
        lines.append(" & ".join(row) + r" \\")
    lines.extend([
        r"\bottomrule",
        r"\end{tabular}",
        r"\end{table}",
    ])
    with open(out_path, "w", encoding="utf-8") as f:
        f.write("\n".join(lines))
    print(f"Written: {out_path}")


def write_markdown(by_model, out_path):
    header = "| Model | " + " | ".join(VARIANT_ORDER) + " |"
    sep = "|" + "---|" * (len(VARIANT_ORDER) + 1)
    lines = [
        "# All variants results (Description_Simple)",
        "",
        "## LLM consensus rate (0–1)",
        "",
        header,
        sep,
    ]
    for m, disp in zip(MODELS_ORDER, MODELS_DISPLAY):
        row_llm = [f"**{disp}**"]
        row_st = [disp]
        for v in VARIANT_ORDER:
            r = by_model[m].get(v, {})
            if r:
                llm = float(r["LLM_consensus_rate"])
                st = float(r["ST_mean"])
                row_llm.append(f"{llm:.3f} ({llm*100:.1f}%)")
                row_st.append(f"{st:.3f} ({st*100:.1f}%)")
            else:
                row_llm.append("--")
                row_st.append("--")
        lines.append("| " + " | ".join(row_llm) + " |")
    lines.append("")
    lines.append("## ST mean similarity (0–1)")
    lines.append("")
    lines.append(header)
    lines.append(sep)
    for m, disp in zip(MODELS_ORDER, MODELS_DISPLAY):
        row_st = [f"**{disp}**"]
        for v in VARIANT_ORDER:
            r = by_model[m].get(v, {})
            if r:
                st = float(r["ST_mean"])
                row_st.append(f"{st:.3f} ({st*100:.1f}%)")
            else:
                row_st.append("--")
        lines.append("| " + " | ".join(row_st) + " |")
    with open(out_path, "w", encoding="utf-8") as f:
        f.write("\n".join(lines))
    print(f"Written: {out_path}")


def write_pdf_table(by_model, out_path):
    try:
        import matplotlib
        matplotlib.use("Agg")
        import matplotlib.pyplot as plt
    except Exception:
        print("Skipping PDF table (matplotlib not available).")
        return
    plt.rcParams["font.family"] = "Times New Roman"
    plt.rcParams["font.size"] = 11
    # Build cell text
    cell_llm = []
    cell_st = []
    for m, disp in zip(MODELS_ORDER, MODELS_DISPLAY):
        row_llm = [disp]
        row_st = [disp]
        for v in VARIANT_ORDER:
            r = by_model[m].get(v, {})
            if r:
                row_llm.append(f"{float(r['LLM_consensus_rate']):.3f}")
                row_st.append(f"{float(r['ST_mean']):.3f}")
            else:
                row_llm.append("--")
                row_st.append("--")
        cell_llm.append(row_llm)
        cell_st.append(row_st)

    fig, ax = plt.subplots(figsize=(14, 3.5))
    ax.axis("off")
    table1 = ax.table(
        cellText=cell_llm,
        colLabels=["Model"] + VARIANT_ORDER,
        loc="center",
        cellLoc="center",
        colColours=["#f0f0f0"] * (len(VARIANT_ORDER) + 1),
    )
    table1.auto_set_font_size(False)
    table1.set_fontsize(10)
    table1.scale(1.2, 2.2)
    for (i, j), cell in table1.get_celld().items():
        cell.set_text_props(fontfamily="Times New Roman")
    ax.set_title("LLM consensus rate (0–1)", fontsize=12, fontfamily="Times New Roman", pad=10)
    fig.tight_layout()
    fig.savefig(out_path.with_name(out_path.stem + "_llm.pdf"), bbox_inches="tight", format="pdf")
    plt.close()

    fig2, ax2 = plt.subplots(figsize=(14, 3.5))
    ax2.axis("off")
    table2 = ax2.table(
        cellText=cell_st,
        colLabels=["Model"] + VARIANT_ORDER,
        loc="center",
        cellLoc="center",
        colColours=["#f0f0f0"] * (len(VARIANT_ORDER) + 1),
    )
    table2.auto_set_font_size(False)
    table2.set_fontsize(10)
    table2.scale(1.2, 2.2)
    for (i, j), cell in table2.get_celld().items():
        cell.set_text_props(fontfamily="Times New Roman")
    ax2.set_title("ST mean similarity (0–1)", fontsize=12, fontfamily="Times New Roman", pad=10)
    fig2.tight_layout()
    fig2.savefig(out_path.with_name(out_path.stem + "_st.pdf"), bbox_inches="tight", format="pdf")
    plt.close()

    cell_combined = []
    for m, disp in zip(MODELS_ORDER, MODELS_DISPLAY):
        row = [disp]
        for v in VARIANT_ORDER:
            r = by_model[m].get(v, {})
            if r:
                row.append(f"{float(r['LLM_consensus_rate']):.2f}\n{float(r['ST_mean']):.2f}")
            else:
                row.append("--")
        cell_combined.append(row)

    fig3, ax3 = plt.subplots(figsize=(12, 3))
    ax3.axis("off")
    tab3 = ax3.table(
        cellText=cell_combined,
        colLabels=["Model"] + VARIANT_ORDER,
        loc="center",
        cellLoc="center",
        colColours=["#f0f0f0"] * (len(VARIANT_ORDER) + 1),
    )
    tab3.auto_set_font_size(False)
    tab3.set_fontsize(10)
    tab3.scale(1.2, 2.5)
    for (i, j), cell in tab3.get_celld().items():
        cell.set_text_props(fontfamily="Times New Roman")
    ax3.set_title("LLM consensus (top) / ST mean (bottom) by variant", fontsize=12, fontfamily="Times New Roman", pad=10)
    fig3.tight_layout()
    fig3.savefig(out_path, bbox_inches="tight", format="pdf")
    plt.close()
    print(f"Written: {out_path}, {out_path.with_name(out_path.stem + '_llm.pdf')}, {out_path.with_name(out_path.stem + '_st.pdf')}")


def main():
    if not CSV_PATH.exists():
        print(f"Run compare_all_variants.py first to create {CSV_PATH}")
        return
    data = load_data()
    by_model = data_by_model_and_variant(data)

    write_latex(by_model, BASE / "table_all_variants.tex")
    write_markdown(by_model, BASE / "table_all_variants.md")
    try:
        write_pdf_table(by_model, BASE / "figure_all_variants_table.pdf")
    except Exception as e:
        print(f"PDF table skipped: {e}")


if __name__ == "__main__":
    main()
