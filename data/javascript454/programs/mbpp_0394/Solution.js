function checkDistinct(testArr) {
  const temp = new Set();
  for (const ele of testArr) {
    if (temp.has(ele)) {
      return false;
    }
    temp.add(ele);
  }
  return true;
}
