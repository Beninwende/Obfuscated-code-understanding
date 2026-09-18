function bitwiseXor(testArr1, testArr2) {
  const length = Math.min(testArr1.length, testArr2.length);
  const res = [];
  for (let i = 0; i < length; i++) {
    res.push(testArr1[i] ^ testArr2[i]);
  }
  return res;
}
