# Sous-types granulaires des échecs de taxonomie

Ce dossier contient la **taxonomie granulaire** (sous-types d’erreur) et le **script de classification par GPT-4o en batch**.

## Fichiers

- **CODING_GUIDE.md** – Guide de codage : définitions des sous-types (code-related / unrelated), règles de décision, liste des sous-types valides.
- **SAMPLE_ANALYSIS.md** – Analyse d’échantillon (codellama, deepseek-r1, GPT3.5) ayant servi à affiner les sous-types.
- **taxonomy_subtypes.json** – Liste des sous-types et regroupement par famille (code_related / unrelated).
- **classify_granular_subtypes.py** – Script qui charge toutes les entrées de `Results/Taxonomy/Dataset_*_taxonomy_failures.json`, envoie chaque paire de descriptions à GPT-4o avec le guide, et enregistre le sous-type prédit + les fréquences pour Sankey.

## Utilisation

1. **Clé API**  
   Définir `OPENAI_API_KEY` (ou la passer au script si vous modifiez l’appel).

2. **Test (sans appel API)**  
   ```bash
   cd /chemin/vers/combined_dataset
   python3 Results/Taxonomy/granular_subtypes/classify_granular_subtypes.py --dry-run
   ```
   Affiche le nombre d’entrées à classifier (ex. 1720).

3. **Test avec API (recommandé avant le run complet)**  
   ```bash
   export OPENAI_API_KEY="your-key"
   python3 Results/Taxonomy/granular_subtypes/classify_granular_subtypes.py --test
   ```
   - Classifie **5 entrées** par défaut, en **séquentiel** (pas de concurrence), pour valider prompt + parsing.
   - Résultats dans `granular_subtypes/test_output/` : `test_classifications.json`, `test_frequencies.json`.
   - Options : `--test-size 10` (plus d’entrées), `--test-quiet` (moins de logs).

4. **Test sur un sous-ensemble**  
   ```bash
   python3 Results/Taxonomy/granular_subtypes/classify_granular_subtypes.py --limit 100 --batch-size 10
   ```

5. **Classification sur tout le jeu**  
   ```bash
   python3 Results/Taxonomy/granular_subtypes/classify_granular_subtypes.py --batch-size 20
   ```
   Par défaut, 20 requêtes concurrentes (GPT-4o). Les résultats sont écrits dans ce dossier.

## Sorties

- **`{model}_granular_subtypes.json`** – Pour chaque modèle : liste des classifications (problem_id, failure_type, granular_subtype, raw_response).
- **`granular_subtype_frequencies.json`** – Agrégats pour Sankey :
  - `by_failure_type_and_subtype` : (failure_type, subtype) → count
  - `by_model_failure_type_and_subtype` : (model, failure_type, subtype) → count

Ces fréquences peuvent être utilisées pour construire un diagramme de Sankey (modèle → failure_type → granular_subtype).
