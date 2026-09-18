function getUnique(testList) {
  const res = {};
  for (const sub of testList) {
    const key = sub[1];
    const val = sub[0];
    if (!res[key]) {
      res[key] = [];
    }
    res[key].push(val);
  }
  const resDict = {};
  for (const key in res) {
    resDict[key] = new Set(res[key]).size;
  }
  return JSON.stringify(resDict);
}
