# Analyse d’échantillon – Sous-types d’erreur observés

## Échantillon 1 : Dataset_codellama

### p02641 – Comment_Dependency
- **Avec commentaires** : décrit correctement « plus proche nombre à X dans le tableau », exemples I/O.
- **Sans commentaires** : décrit « deux entiers, tri, si premier > 0 alors différence sinon valeur absolue » → **autre algorithme**.
- **Sous-type proposé** : `Algorithm_misunderstanding`.

### p03239 – Variable_Renaming_Failure
- **Sans commentaires** : décrit bien TLE / coût minimal, tâches, limite de temps.
- **Variable_renaming** : « purpose not clear », « no function except read/write », focus sur `lllllllllllllll`, `FastScanner` → perte de sémantique, description structurelle.
- **Sous-type proposé** : `Structural_description_only` (ou `Minimal_code_understanding` si on insiste sur la perte de sens).

### p03239 – Dead_Code_Failure
- **Sans commentaires** : même description TLE / coût.
- **Dead_code** : uniquement « #### Title: », « #### Description: », « #### Goal: », etc. – pas de contenu.
- **Sous-type proposé** : `Empty_or_template`.

### p03239 – Encryption_Failure
- **Sans commentaires** : TLE / coût.
- **Encryption** : « Question 10: find all prime numbers », « Question 11: strings in Google search », « Question 12: four points on Cartesian plane » → contenu sans rapport.
- **Sous-type proposé** : `Hallucination_unrelated`.

### p02898 – Variable_Renaming_Failure / Dead_Code_Failure
- **Sans commentaires** : « What I have learned? », « What are the problems? », « How can we improve? » (questions génériques).
- **Variable_renaming** : « Explanation: », « Solution: » (placeholders).
- **Sous-type proposé** : `Empty_or_template`.

### p04030 – Variable_Renaming_Failure
- **Sans commentaires** : « supprime les B », pile, ex. "abBBxy" → "aby".
- **Variable_renaming** : « #### Title: », « #### Description: », « #### Solution: », « Questions: », « References: » – template vide.
- **Sous-type proposé** : `Empty_or_template`.

### p04030 – Dead_Code_Failure
- **Sans commentaires** : supprime les B, pile.
- **Dead_code** : décrit « reverse string using stack », « Scanner », « stack » – **autre fonction** (inverser au lieu de supprimer B).
- **Sous-type proposé** : `Functional_inaccuracy`.

---

## Échantillon 2 : Dataset_deepseek-r1

### p02640 – Encryption_Failure
- **Sans commentaires** : poules/tortues, têtes/jambes, « Yes »/« No ».
- **Encryption** : « decrypts hidden messages using DES, Blowfish, XOR », « numC and numT », « decrypted message » → focalisation sur l’obfuscation au lieu de la logique.
- **Sous-type proposé** : `Obfuscation_narrative`.

### p03371 – Variable_Renaming_Failure
- **Sans commentaires** : coût combo a,b,c,x,y, min(x,y)*2*c, etc.
- **Variable_renaming** : « five input integers », « minimum of two values », « weighting factors » – même thème (calcul de coût) mais **détails différents / confus**.
- **Sous-type proposé** : `Algorithm_confusion` ou `Semantic_drift`.

### p02911 – Variable_Renaming_Failure
- **Sans commentaires** : joueurs, points, bonnes réponses, « Yes »/« No ».
- **Variable_renaming** : « vote count », « threshold », « frequency of votes » – **autre cadre** (votes vs joueurs) mais même schéma « seuil / comptage ».
- **Sous-type proposé** : `Semantic_drift`.

### p02911 – Encryption_Failure
- **Sans commentaires** : joueurs, points, bonnes réponses.
- **Encryption** : « encrypted strings », « bitwise », « Yes/No » – encore une fois **narrative obfuscation**.
- **Sous-type proposé** : `Obfuscation_narrative`.

---

## Échantillon 3 : Dataset_GPT3.5

### p03013 – Variable_Renaming_Failure
- **Sans commentaires** : escalier, marches cassées, DP, modulo 1000000007.
- **Variable_renaming** : « takes input, performs calculations, outputs result », « manipulate arrays » – **très vague**.
- **Sous-type proposé** : `Minimal_code_understanding`.

### p03013 – Dead_Code_Failure
- **Sans commentaires** : même (escalier, DP).
- **Dead_code** : « compare integers, check conditions, calculate values using a specific formula » – **générique**, pas d’escalier/DP.
- **Sous-type proposé** : `Minimal_code_understanding`.

### p03013 – Encryption_Failure
- **Sans commentaires** : escalier, DP.
- **Encryption** : « Blowfish », « encryption and decryption », « array manipulation, encryption techniques » → **Obfuscation_narrative**.

### p03775 – Variable_Renaming_Failure / Dead_Code_Failure
- **Sans commentaires** : « minimum number of digits to represent N » (facteurs).
- **Variable_renaming** : « maximum length of digits in the factors » → **min vs max**, même domaine.
- **Dead_code** : « length of the longest number in a series » → **autre objectif**.
- **Sous-type proposé** : `Algorithm_confusion` (min vs max) / `Algorithm_misunderstanding` (série vs facteurs).

---

## Sous-types supplémentaires retenus pour la taxonomie

À partir de ces échantillons, les sous-types suivants ont été **ajoutés ou précisés** par rapport à la liste initiale :

1. **Empty_or_template** – Template ou placeholders sans contenu (très fréquent dans les pires cas).
2. **Obfuscation_narrative** – Insistance sur chiffrement/obfuscation au lieu de la logique (typique Encryption_Failure).
3. **Semantic_drift** – Même domaine (comptage, seuil) mais autre tâche ou entités (ex. joueurs vs votes).
4. **Structural_description_only** – Décrit classes/variables/I/O au lieu du comportement (typique après variable_renaming).
5. **Minimal_code_understanding** – Phrases génériques (« takes input, calculations, output ») sans détail.
6. **Overgeneralization** – Fusionné avec Minimal_code_understanding ou Empty selon le cas dans le guide.

Tous sont intégrés dans le **CODING_GUIDE.md** et la liste des sous-types valides pour le LLM.
