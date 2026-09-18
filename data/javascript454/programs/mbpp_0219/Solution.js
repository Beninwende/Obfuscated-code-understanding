function extractMinMax(testArr, K) {
  const res = [];
  const temp = [...testArr].sort((a, b) => a - b);
  for (let idx = 0; idx < temp.length; idx++) {
    if (idx < K || idx >= temp.length - K) {
      res.push(temp[idx]);
    }
  }
  return res;
}
