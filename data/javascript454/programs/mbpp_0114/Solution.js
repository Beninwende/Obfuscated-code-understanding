function assign_freq(testList) {
  const freqMap = new Map();
  testList.forEach(tup => {
    const key = JSON.stringify(tup);
    freqMap.set(key, (freqMap.get(key) || 0) + 1);
  });
  const res = Array.from(freqMap, ([key, val]) => {
    const arr = JSON.parse(key);
    arr.push(val);
    return arr;
  });
  return JSON.stringify(res);
}
