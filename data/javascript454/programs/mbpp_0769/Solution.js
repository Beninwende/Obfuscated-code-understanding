function diff(li1, li2) {
  const set1 = new Set(li1);
  const set2 = new Set(li2);
  const result = [];
  for (const item of set1) {
    if (!set2.has(item)) {
      result.push(item);
    }
  }
  for (const item of set2) {
    if (!set1.has(item)) {
      result.push(item);
    }
  }
  return result;
}
