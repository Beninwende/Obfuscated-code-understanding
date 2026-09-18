function maxSumOfThreeConsecutive(arr, n) {
    const dp = new Array(n).fill(0);
    if (n >= 1) dp[0] = arr[0];
    if (n >= 2) dp[1] = arr[0] + arr[1];
    if (n > 2) dp[2] = Math.max(dp[1], Math.max(arr[1] + arr[2], arr[0] + arr[2]));
    for (let i = 3; i < n; i++) {
        dp[i] = Math.max(
            dp[i - 1],
            dp[i - 2] + arr[i],
            arr[i] + arr[i - 1] + dp[i - 3]
        );
    }
    return dp[n - 1];
}
