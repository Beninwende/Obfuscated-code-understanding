function countNoOfWays(n, k) {
    const dp = new Array(n + 1).fill(0);
    const mod = 1000000007;
    dp[1] = k;
    dp[2] = k * k;
    for (let i = 3; i <= n; i++) {
        dp[i] = ((k - 1) * (dp[i - 1] + dp[i - 2])) % mod;
    }
    return dp[n];
}
