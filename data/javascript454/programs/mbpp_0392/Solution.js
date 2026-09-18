function getMaxSum(n) {
    const res = [0, 1];
    for (let i = 2; i <= n; i++) {
        res[i] = Math.max(
            i,
            res[Math.floor(i / 2)] +
            res[Math.floor(i / 3)] +
            res[Math.floor(i / 4)] +
            res[Math.floor(i / 5)]
        );
    }
    return res[n];
}
