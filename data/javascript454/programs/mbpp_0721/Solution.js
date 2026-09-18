function maxAverageOfPath(cost, N) {
    const dp = Array.from({ length: N }, () => Array(N).fill(0));
    dp[0][0] = cost[0][0];
    for (let i = 1; i < N; i++) {
        dp[i][0] = dp[i - 1][0] + cost[i][0];
    }
    for (let j = 1; j < N; j++) {
        dp[0][j] = dp[0][j - 1] + cost[0][j];
    }
    for (let i = 1; i < N; i++) {
        for (let j = 1; j < N; j++) {
            dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + cost[i][j];
        }
    }
    return dp[N - 1][N - 1] / (2 * N - 1);
}
