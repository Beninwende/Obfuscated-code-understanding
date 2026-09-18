function getMinSquares(n) {
  if (n <= 3) {
    return n;
  }
  let res = n;
  for (let x = 1; x * x <= n; x++) {
    res = Math.min(res, 1 + getMinSquares(n - x * x));
  }
  return res;
}
