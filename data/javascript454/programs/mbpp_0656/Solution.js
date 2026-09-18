function findMinSum(a, b, n) {
  a.sort((x, y) => x - y);
  b.sort((x, y) => x - y);
  let sum = 0;
  for (let i = 0; i < n; i++) {
    sum += Math.abs(a[i] - b[i]);
  }
  return sum;
}
