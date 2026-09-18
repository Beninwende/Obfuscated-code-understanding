function extractSingly(testList) {
  const res = [];
  const temp = new Set();
  for (const inner of testList) {
    for (const ele of inner) {
      if (!temp.has(ele)) {
        temp.add(ele);
        res.push(ele);
      }
    }
  }
  return res;
}
