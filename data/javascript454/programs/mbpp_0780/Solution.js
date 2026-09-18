function findCombinations(testList) {
  const res = [];
  for (let i = 0; i < testList.length; i++) {
    for (let j = i + 1; j < testList.length; j++) {
      const [a1, a2] = testList[i];
      const [b1, b2] = testList[j];
      res.push([a1 + b1, a2 + b2]);
    }
  }
  return res;
}
