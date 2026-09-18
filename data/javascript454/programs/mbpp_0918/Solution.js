function coinChange(S, m, n) {
    const table = Array.from({ length: n + 1 }, () => Array(m).fill(0));
    for (let i = 0; i < m; i++) {
        table[0][i] = 1;
    }
    for (let i = 1; i <= n; i++) {
        for (let j = 0; j < m; j++) {
            const x = i - S[j] >= 0 ? table[i - S[j]][j] : 0;
            const y = j >= 1 ? table[i][j - 1] : 0;
            table[i][j] = x + y;
        }
    }
    return table[n][m - 1];
}
