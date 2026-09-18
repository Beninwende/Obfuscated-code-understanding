function longestCommonSubsequence(X, Y, m, n) {
    if (m === 0 || n === 0) {
        return 0;
    } else if (X[m - 1] === Y[n - 1]) {
        return 1 + longestCommonSubsequence(X, Y, m - 1, n - 1);
    } else {
        return Math.max(
            longestCommonSubsequence(X, Y, m, n - 1),
            longestCommonSubsequence(X, Y, m - 1, n)
        );
    }
}
