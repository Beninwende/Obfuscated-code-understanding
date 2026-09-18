function maxSumPairDiffLessThanK(arr, N, K) {
    arr.sort((a, b) => a - b);
    const dp = new Array(N).fill(0);
    for (let i = 1; i < N; i++) {
        dp[i] = dp[i - 1];
        if (arr[i] - arr[i - 1] < K) {
            const pairSum = arr[i] + arr[i - 1];
            if (i >= 2) {
                dp[i] = Math.max(dp[i], dp[i - 2] + pairSum);
            } else {
                dp[i] = Math.max(dp[i], pairSum);
            }
        }
    }
    return dp[N - 1];
}
