function modularSum(arr, n, m) {
    if (n > m) return true;
    const DP = new Array(m).fill(false);
    for (let i = 0; i < n; i++) {
        if (DP[0]) return true;
        const temp = new Array(m).fill(false);
        for (let j = 0; j < m; j++) {
            if (DP[j] && !DP[(j + arr[i]) % m]) {
                temp[(j + arr[i]) % m] = true;
            }
        }
        for (let j = 0; j < m; j++) {
            if (temp[j]) {
                DP[j] = true;
            }
        }
        DP[arr[i] % m] = true;
    }
    return DP[0];
}
