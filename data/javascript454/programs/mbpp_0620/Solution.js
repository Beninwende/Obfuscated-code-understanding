function largestSubset(a, n) {
    const dp = new Array(n).fill(0);
    dp[n - 1] = 1;
    for (let i = n - 2; i >= 0; i--) {
        let mxm = 0;
        for (let j = i + 1; j < n; j++) {
            if (a[j] % a[i] === 0 || a[i] % a[j] === 0) {
                mxm = Math.max(mxm, dp[j]);
            }
        }
        dp[i] = 1 + mxm;
    }
    return Math.max(...dp);
}
