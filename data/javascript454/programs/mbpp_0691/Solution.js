function groupElement(testList) {
  const res = {};
  const sortedList = [...testList].sort((a, b) => a[1] > b[1] ? 1 : a[1] < b[1] ? -1 : 0);
  for (const ele of sortedList) {
    const key = ele[1];
    if (!res[key]) res[key] = [];
    res[key].push(ele[0]);
  }
  return res;
}
