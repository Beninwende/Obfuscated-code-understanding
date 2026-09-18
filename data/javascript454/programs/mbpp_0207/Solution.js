function findLongestRepeatingSubseq(str) {
  const n = str.length;
  const dp = Array.from({ length: n + 1 }, () => Array(n + 1).fill(0));
  for (let i = 1; i <= n; i++) {
    for (let j = 1; j <= n; j++) {
      if (str[i - 1] === str[j - 1] && i !== j) {
        dp[i][j] = 1 + dp[i - 1][j - 1];
      } else {
        dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
      }
    }
  }
  return dp[n][n];
}
