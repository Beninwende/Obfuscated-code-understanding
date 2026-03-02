#!/bin/bash
# Run this from the obfuscation-comprehension-repo directory to init git and prepare for push.
set -e
cd "$(dirname "$0")"

if [ ! -d .git ]; then
  git init
  git remote add origin https://github.com/Beninwende/Obfuscated-code-understanding.git
  git branch -M main
  git add -A
  git commit -m "Add obfuscation & code comprehension experiments: generation, taxonomy, semantic analysis, figures"
  echo "Done. Run:  git push -u origin main"
else
  echo "Already a git repo. Run:  git push -u origin main"
fi
