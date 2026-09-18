function extractUnique(testDict) {
  const uniqueSet = new Set();
  for (const values of Object.values(testDict)) {
    for (const ele of values) {
      uniqueSet.add(ele);
    }
  }
  return Array.from(uniqueSet).sort();
}
