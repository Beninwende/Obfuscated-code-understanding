import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
from pathlib import Path

plt.rcParams["font.family"] = "Times New Roman"
plt.rcParams["font.size"] = 16

# 1. Dataset Setup
data = [
    ["DeepSeek-R1", "Obfuscation_narrative", 91.1, 28.6],
    ["DeepSeek-R1", "Algorithm_misunderstanding", 3.6, 39.3],
    ["DeepSeek-R1", "Hallucination_unrelated", 1.8, 17.9],
    ["DeepSeek-R1", "Functional_inaccuracy", 1.8, 0.0],
    ["DeepSeek-R1", "Algorithm_confusion", 0.0, 7.1],
    ["DeepSeek-R1", "Structural_description_only", 0.0, 3.6],
    ["DeepSeek-R1", "Semantic_drift", 1.8, 3.6],
    
    ["Gemini", "Obfuscation_narrative", 81.5, 14.3],
    ["Gemini", "Algorithm_misunderstanding", 5.6, 60.7],
    ["Gemini", "Hallucination_unrelated", 1.9, 10.7],
    ["Gemini", "Functional_inaccuracy", 5.6, 7.1],
    ["Gemini", "Algorithm_confusion", 3.7, 7.1],
    ["Gemini", "Structural_description_only", 1.9, 0.0],
    ["Gemini", "Semantic_drift", 0.0, 0.0],
    
    ["O4-mini", "Obfuscation_narrative", 78.6, 20.0],
    ["O4-mini", "Algorithm_misunderstanding", 10.7, 26.7],
    ["O4-mini", "Hallucination_unrelated", 7.1, 23.3],
    ["O4-mini", "Functional_inaccuracy", 3.6, 13.3],
    ["O4-mini", "Algorithm_confusion", 0.0, 10.0],
    ["O4-mini", "Structural_description_only", 0.0, 6.7],
    ["O4-mini", "Semantic_drift", 0.0, 0.0],
]

df = pd.DataFrame(data, columns=["Model", "Subtype", "Single", "Comprehensive"])

# 2. Styling and Colors
color_map = {
    "Obfuscation_narrative": "#FF6B81",
    "Algorithm_misunderstanding": "#C4912B",
    "Hallucination_unrelated": "#7AA12E",
    "Functional_inaccuracy": "#34A88E",
    "Algorithm_confusion": "#00A5BC",
    "Structural_description_only": "#7B8FF7",
    "Semantic_drift": "#E854D8"
}

# 3. Plotting with Sigmoid Curves
fig, axes = plt.subplots(1, 3, figsize=(18, 8), sharey=True)
models = ["DeepSeek-R1", "Gemini", "O4-mini"]

for i, model in enumerate(models):
    ax = axes[i]
    model_df = df[df["Model"] == model]
    
    for _, row in model_df.iterrows():
        subtype = row["Subtype"]
        color = color_map[subtype]
        y1, y2 = row["Single"], row["Comprehensive"]
        
        # Create a sigmoid curve between 0 and 1
        x = np.linspace(0, 1, 100)
        # S-curve: y = y1 + (y2 - y1) * (1 / (1 + exp(-10 * (x - 0.5))))
        y_curve = y1 + (y2 - y1) * (1 / (1 + np.exp(-10 * (x - 0.5))))
        
        # Plot curve and endpoints
        ax.plot(x, y_curve, color=color, linewidth=3, alpha=0.8)
        ax.scatter([0, 1], [y1, y2], color=color, s=70, zorder=5)
        
        # Annotate values
        ax.text(-0.05, y1, f"{y1}%", ha='right', va='center', fontsize=16)
        ax.text(1.05, y2, f"{y2}%", ha='left', va='center', fontsize=16)

    ax.set_title(model, fontsize=16, pad=20, fontweight='bold')
    ax.set_xticks([0, 1])
    ax.set_xticklabels(["Single", "Comprehensive"], fontsize=16)
    ax.set_xlim(-0.4, 1.4)
    ax.tick_params(axis='both', labelsize=16)
    ax.grid(axis='y', linestyle='--', alpha=0.3)
    ax.spines[['top', 'right']].set_visible(False)

# Global Legend
from matplotlib.lines import Line2D
legend_elements = [Line2D([0], [0], color=c, lw=3, label=s) for s, c in color_map.items()]
fig.legend(handles=legend_elements, loc='lower center', ncol=4, bbox_to_anchor=(0.5, 0.02), fontsize=16)

plt.tight_layout(rect=[0, 0.12, 1, 0.98])
# Save PDF (bbox_inches='tight' avoids truncation)
out_path = Path(__file__).resolve().parent / "shift_figure.pdf"
fig.savefig(out_path, format="pdf", bbox_inches="tight")
plt.close(fig)
print(f"Saved: {out_path}")