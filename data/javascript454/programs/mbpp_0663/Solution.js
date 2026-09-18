function findMaxVal(n, x, y) {
  let ans = -Infinity;
  for (let k = 0; k <= n; k++) {
    if (k % x === y) {
      ans = Math.max(ans, k);
    }
  }
  return (ans >= 0 && ans <= n) ? ans : -1;
}
