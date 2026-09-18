function tupleToDict(testTup) {
  const res = {};
  for (let i = 0; i < testTup.length; i += 2) {
    const key = testTup[i];
    const value = testTup[i + 1];
    res[key] = value;
  }
  return res;
}
