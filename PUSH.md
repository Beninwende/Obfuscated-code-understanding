# Push to GitHub

**This folder is the git repo root** (cloned from https://github.com/Beninwende/Obfuscated-code-understanding).

To sync experiment content from the parent folder and push:

```bash
# From the parent folder, copy everything into this repo (keeps this .git)
cd /Users/lionel.nikiema/Desktop/combined_dataset/obfuscation-comprehension-repo
rsync -a --exclude='Obfuscated-code-understanding' --exclude='.git' . Obfuscated-code-understanding/

# Then commit and push from the repo
cd Obfuscated-code-understanding
git add -A
git status
git commit -m "Your message"
git push origin main
```
