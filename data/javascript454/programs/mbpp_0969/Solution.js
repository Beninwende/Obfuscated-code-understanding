function joinTuples(testList) {
  const res = [];
  for (const sub of testList) {
    if (res.length && res[res.length - 1][0] === sub[0]) {
      res[res.length - 1].push(...sub.slice(1));
    } else {
      res.push(sub.slice());
    }
  }
  return res;
}
