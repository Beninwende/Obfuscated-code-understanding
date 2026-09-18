function getProduct(val) {
  let res = 1;
  for (const ele of val) {
    res *= ele;
  }
  return res;
}

function findKProduct(testList, K) {
  const res = getProduct(testList.map(sub => sub[K]));
  return res;
}
