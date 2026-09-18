function extractMissing(testList, startVal, stopVal) {
  const res = [];
  for (const sub of testList) {
    if (sub[0] > startVal) {
      res.push([startVal, sub[0]]);
      startVal = sub[1];
    }
    if (startVal < stopVal) {
      res.push([startVal, stopVal]);
    }
  }
  return res;
}
