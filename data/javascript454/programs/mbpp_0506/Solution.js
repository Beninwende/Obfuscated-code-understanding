function permutationCoefficient(n, k) {
    const P = Array.from({ length: n + 1 }, () => Array(k + 1).fill(0));
    for (let i = 0; i <= n; i++) {
        for (let j = 0; j <= Math.min(i, k); j++) {
            if (j === 0) {
                P[i][j] = 1;
            } else {
                P[i][j] = P[i - 1][j] + j * P[i - 1][j - 1];
            }
            if (j < k) {
                P[i][j + 1] = 0;
            }
        }
    }
    return P[n][k];
}
