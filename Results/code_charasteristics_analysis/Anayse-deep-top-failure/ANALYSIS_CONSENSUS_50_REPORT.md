# Analyse succès / échec (consensus uniquement, seuil 50%)

Critère de succès: **consensus LLM uniquement** (pas de score ni similarité sémantique).
Code analysé: **Without_comments.json**.

- **Top succeed** (taux >= 50%): **8 problèmes** — taux de succès LLM (consensus) : **50,0 % – 60,5 %** (ordre décroissant).
- **Top failed** (taux < 50%): **242 problèmes** — taux de succès LLM (consensus) : **11,2 % – 49,0 %** (ordre décroissant).
- *Total : 250 problèmes.*

---

## Statistiques par groupe

| Métrique | Succès (>=50%) | Échec (<50%) |
|----------|----------------|--------------|
| LOC (moy ± std) | 118.25 ± 55.14 | 98.74 ± 57.92 |
| Complexité cyclomatique totale | 34.25 ± 9.64 | 33.24 ± 16.12 |
| Densité (CC/LOC) | 0.32 ± 0.11 | 0.38 ± 0.17 |
| Entropie Shannon | 3.97 ± 0.53 | 4.28 ± 0.57 |
| Nombre de fonctions | 8.00 ± 4.21 | 7.25 ± 6.50 |
| Profondeur d'imbrication max | 4.88 ± 1.17 | 5.00 ± 1.33 |
| % avec récursion | 75.0% | 54.5% |

## Types de tâche (référence)
| Type | Succès | Échec |
|------|--------|-------|
| compare | 0 | 2 |
| count | 2 | 49 |
| digit | 0 | 9 |
| math | 0 | 2 |
| max | 0 | 12 |
| min | 0 | 16 |
| other | 2 | 63 |
| replace | 0 | 1 |
| sort | 3 | 11 |
| string | 0 | 37 |
| sum | 1 | 25 |
| tree | 0 | 1 |
| unique | 0 | 14 |

---

## Visualisations (distributions et illustrations)

Les graphiques suivants sont générés par `visualize_success_failure_distributions.py` à partir de `full_code_metrics_consensus_50.csv` :

| Fichier | Description |
|---------|-------------|
| **01_success_rate_distribution.png** | Distribution du taux de succès sur tous les problèmes (histogramme) avec la ligne du seuil 50 %. Montre la forte concentration des problèmes en dessous du seuil. |
| **02_metric_distributions_by_group.png** | Violins par groupe (succès vs échec) pour LOC, entropie, densité, CC totale, nombre de fonctions, profondeur d’imbrication. Compare les formes de distribution. |
| **03_scatter_entropy_vs_density.png** | Nuage de points entropie × densité, couleur = groupe. Illustre la séparation (succès souvent basse entropie / densité modérée). |
| **04_scatter_loc_vs_entropy.png** | Nuage de points LOC × entropie, couleur = groupe. Montre la tendance succès = plus de LOC, entropie plus faible. |
| **05_task_type_breakdown.png** | Barres groupées : nombre de problèmes par type de tâche pour succès vs échec. Met en évidence sort/count côté succès, string/sum/min/max/other côté échec. |
| **06_effect_size_differentiators.png** | Barres horizontales : différence standardisée (succès − échec) par métrique. Montre quelles métriques différencient le plus les deux groupes. |
| **07_radar_metric_profiles.png** | Profil radar des moyennes (métriques normalisées 0–1) : succès vs échec. Vue synthétique des différences de profil. |
| **08_recursion_by_group.png** | Parts « avec / sans récursion » pour chaque groupe (succès vs échec). |
| **09_boxplots_all_criteria.png** | Boxplots de tous les critères (LOC, CC total, CC max, densité, entropie Shannon, nombre de fonctions, prof. imbrication) par groupe succès vs échec. |

Pour régénérer les figures : `python visualize_success_failure_distributions.py` (depuis ce dossier, avec `matplotlib` et `numpy` installés).

---

## Interprétation / Différenciateurs

- **Entropie Shannon** : les codes les mieux décrits (succès) ont une entropie en moyenne plus **faible** que les échecs (moins de variété de caractères, structure plus répétitive).
- **Densité (CC/LOC)** : les échecs ont en moyenne une densité plus **élevée** (complexité plus concentrée par ligne).
- **LOC** : les succès tendent à avoir plus de lignes en moyenne (plus de contexte/structure visible).
- **Type de tâche** : dans les succès, les tâches de type *sort* et *count* sont surreprésentées ; dans les échecs, *string*, *sum*, *min*, *max*, *other* dominent.
- **Récursion** : plus fréquente dans le groupe succès (souvent code plus structuré avec des fonctions récursives identifiables).

---

*Généré par analyze_success_failure_consensus_50.py*