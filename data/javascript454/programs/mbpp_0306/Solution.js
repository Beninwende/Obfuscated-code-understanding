function maxSumIncreasingSubseq(a, n, index, k) {
    const dp = Array.from({ length: n }, () => Array(n).fill(0));
    for (let i = 0; i < n; i++) {
        if (a[i] > a[0]) {
            dp[0][i] = a[i] + a[0];
        } else {
            dp[0][i] = a[i];
        }
    }
    for (let i = 1; i < n; i++) {
        for (let j = 0; j < n; j++) {
            if (a[j] > a[i] && j > i) {
                if (dp[i - 1][i] + a[j] > dp[i - 1][j]) {
                    dp[i][j] = dp[i - 1][i] + a[j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            } else {
                dp[i][j] = dp[i - 1][j];
            }
        }
    }
    return dp[index][k];
}
