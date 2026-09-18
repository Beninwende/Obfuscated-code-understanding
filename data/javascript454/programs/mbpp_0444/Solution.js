function trimTuple(testList, K) {
  const res = [];
  for (const ele of testList) {
    const N = ele.length;
    res.push(ele.slice(K, N - K));
  }
  return JSON.stringify(res);
}
