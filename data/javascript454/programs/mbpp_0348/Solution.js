function binCoff(n, r) {
  let val = 1;
  if (r > n - r) r = n - r;
  for (let i = 0; i < r; i++) {
    val *= (n - i);
    val = Math.floor(val / (i + 1));
  }
  return val;
}

function findWays(M) {
  const n = Math.floor(M / 2);
  const a = binCoff(2 * n, n);
  const b = Math.floor(a / (n + 1));
  return b;
}
