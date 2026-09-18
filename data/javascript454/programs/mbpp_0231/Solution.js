function maxSum(tri, n) {
  if (n > 1) {
    tri[1][1] += tri[0][0];
    tri[1][0] += tri[0][0];
  }
  for (let i = 2; i < n; i++) {
    tri[i][0] += tri[i - 1][0];
    tri[i][i] += tri[i - 1][i - 1];
    for (let j = 1; j < i; j++) {
      const sum1 = tri[i][j] + tri[i - 1][j - 1];
      const sum2 = tri[i][j] + tri[i - 1][j];
      tri[i][j] = sum1 >= sum2 ? sum1 : sum2;
    }
  }
  return Math.max(...tri[n - 1]);
}
