function sameOrder(l1, l2) {
  const set1 = new Set(l1);
  const set2 = new Set(l2);
  const common = new Set([...set1].filter(x => set2.has(x)));
  const filtered1 = l1.filter(e => common.has(e));
  const filtered2 = l2.filter(e => common.has(e));
  if (filtered1.length !== filtered2.length) return false;
  return filtered1.every((v, i) => v === filtered2[i]);
}
