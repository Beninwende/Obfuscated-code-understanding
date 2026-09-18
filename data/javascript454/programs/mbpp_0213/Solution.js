function concatenateStrings(testTup1, testTup2) {
  const len = Math.min(testTup1.length, testTup2.length);
  const res = [];
  for (let i = 0; i < len; i++) {
    res.push(testTup1[i] + testTup2[i]);
  }
  return res;
}
