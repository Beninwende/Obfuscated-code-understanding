# Guide de codage – Sous-types granulaires des échecs de description de code

## Contexte

Chaque entrée est un **échec** de similarité sémantique entre **deux descriptions** produites par un modèle pour le même code (sous deux transformations : with/without comments, variable_renaming, dead_code, encryption).  
Vous devez **choisir un seul sous-type** qui caractère le mieux la **nature de l’erreur** en comparant les deux textes (souvent : le second texte est dégradé ou incohérent par rapport au premier).

---

## Famille A : Lié au code (code-related)

L’erreur concerne la compréhension ou la description du **comportement du code**, mais reste dans le domaine du code.

| Sous-type | Définition | Exemple typique |
|-----------|------------|------------------|
| **Algorithm_misunderstanding** | Le modèle décrit un **autre algorithme** que celui du code (logique différente, objectif différent). | Code : « trouve le plus proche nombre non dans la liste » → Description : « trie les entiers et affiche la différence ou la valeur absolue ». |
| **Algorithm_confusion** | Mélange d’idées correctes et fausses sur l’algorithme ; même domaine mais détails inversés ou confus (min vs max, condition inversée, etc.). | « Nombre minimal de chiffres pour représenter N » vs « longueur maximale du plus long nombre dans une série ». |
| **Functional_inaccuracy** | Bon domaine général (même type de tâche) mais **détails fonctionnels faux** : mauvais I/O, mauvaises formules, mauvais cas limites. | Code : « supprime les B » → Description : « inverse la chaîne avec une pile ». |
| **Minimal_code_understanding** | Description **très vague ou générique** ; peu ou pas d’information sur le comportement réel (phrases passe-partout). | « Le code lit des entrées, fait des calculs et affiche un résultat » sans préciser quoi. |
| **Structural_description_only** | Le texte parle surtout des **classes, méthodes, variables, utilitaires I/O** (FastScanner, BufferedReader, etc.) et **pas** de ce que fait le programme sémantiquement. | Long paragraphe sur FastScanner et le buffer ; aucune explication du problème résolu. |
| **Wrong_IO_interpretation** | Mauvaise compréhension des **entrées/sorties** ou des contraintes (ce qui est lu, ce qui est écrit, format). | Confusion entre « joueurs/points » et « votes/seuil » pour le même schéma d’entrée. |
| **Semantic_drift** | Même domaine de haut niveau (ex. comptage, seuil) mais **autre tâche ou autres entités** (autre problème, autre interprétation). | « Statut des joueurs selon les bonnes réponses » vs « seuil de votes par item ». |

---

## Famille B : Non lié au code (unrelated)

Le texte ne décrit pas (ou plus) le code de façon pertinente ; il sort de la tâche.

| Sous-type | Définition | Exemple typique |
|-----------|------------|------------------|
| **Hallucination_unrelated** | Contenu **sans rapport** avec le code : autre problème, autre algorithme, questions/exercices différents. | Liste de questions : « nombres premiers ≤ n », « chaînes dans Google », « 4 points sur un plan ». |
| **Obfuscation_narrative** | Le modèle décrit surtout **chiffrement/déchiffrement, DES/Blowfish/XOR, messages cachés**, au lieu de la logique métier du programme. | Code (p.ex. poules/tortues) décrit comme « déchiffre des messages avec Blowfish et MD5 ». |
| **Empty_or_template** | Texte **vide ou uniquement template** : titres de sections (« #### Title: », « #### Description: »), questions génériques (« What I have learned? »), placeholders (« Your response here », « Solution: »). Peu ou pas de description réelle. | « #### Title:\n#### Description:\n#### Goal:\n#### Functions:\n#### Example:\n#### Conclusion:\n#### References: » |
| **Creative_or_offtask** | Poème, histoire, réflexion personnelle, ou réponse à une autre consigne que « décris ce code ». | Texte créatif ou méta non demandé. |
| **Refusal_or_meta** | Refus de répondre, ou discussion sur la tâche / les instructions au lieu de décrire le code. | « I cannot… », « Please provide… », discussion sur le format. |
| **Overgeneralization** | Phrase **trop générique** répétée ; pourrait s’appliquer à n’importe quel programme (« takes input, performs calculations, outputs result ») sans aucun détail spécifique. | À classer en **Minimal_code_understanding** si c’est la seule option « code-related » ; sinon **Empty_or_template** si c’est du remplissage. |

---

## Règles de décision

1. **Un seul sous-type** par entrée : celui qui correspond le mieux à l’erreur observée entre les deux descriptions.
2. **Priorité** : si plusieurs familles/sous-types s’appliquent, privilégier dans l’ordre :  
   - **Unrelated** (Hallucination_unrelated, Obfuscation_narrative, Empty_or_template, etc.) avant **code-related** si le second texte sort clairement du code.
   - Parmi code-related : **Algorithm_misunderstanding** > **Algorithm_confusion** > **Functional_inaccuracy** > **Structural_description_only** > **Minimal_code_understanding** selon la gravité de l’erreur.
3. **Obfuscation_narrative** : réserver aux cas où le modèle **insiste sur** chiffrement/obfuscation (DES, Blowfish, XOR, « decrypts », « encrypted strings ») et **ne décrit pas** la logique réelle du programme.
4. **Empty_or_template** : dès que le texte est principalement des en-têtes, questions vagues ou placeholders sans contenu substantiel.
5. **Réponse** : répondre **uniquement** par le libellé exact du sous-type (ex. `Algorithm_misunderstanding`, `Empty_or_template`), sans phrase ni explication.

---

## Liste des sous-types valides (à utiliser tels quels)

```
Algorithm_misunderstanding
Algorithm_confusion
Functional_inaccuracy
Minimal_code_understanding
Structural_description_only
Wrong_IO_interpretation
Semantic_drift
Hallucination_unrelated
Obfuscation_narrative
Empty_or_template
Creative_or_offtask
Refusal_or_meta
```
