function reOrder(A) {
  let k = 0;
  for (const val of A) {
    if (val) {
      A[k] = val;
      k++;
    }
  }
  for (let i = k; i < A.length; i++) {
    A[i] = 0;
  }
  return A;
}
