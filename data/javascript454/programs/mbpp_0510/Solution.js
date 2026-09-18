function noOfSubsequences(arr, k) {
    const n = arr.length;
    const dp = Array.from({ length: k + 1 }, () => Array(n + 1).fill(0));
    for (let i = 1; i <= k; i++) {
        for (let j = 1; j <= n; j++) {
            dp[i][j] = dp[i][j - 1];
            if (arr[j - 1] > 0 && arr[j - 1] <= i) {
                dp[i][j] += dp[Math.floor(i / arr[j - 1])][j - 1] + 1;
            }
        }
    }
    return dp[k][n];
}
