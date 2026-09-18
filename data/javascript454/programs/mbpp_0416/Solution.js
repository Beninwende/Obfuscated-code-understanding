function breakSum(n) {
    const dp = new Array(n + 1).fill(0);
    if (n >= 1) dp[1] = 1;
    for (let i = 2; i <= n; i++) {
        dp[i] = Math.max(
            dp[Math.floor(i / 2)] + dp[Math.floor(i / 3)] + dp[Math.floor(i / 4)],
            i
        );
    }
    return dp[n];
}
