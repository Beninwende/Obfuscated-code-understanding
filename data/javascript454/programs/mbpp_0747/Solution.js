function lcsOfThree(X, Y, Z, m, n, o) {
    const L = Array.from({ length: m + 1 }, () =>
        Array.from({ length: n + 1 }, () =>
            Array(o + 1).fill(0)
        )
    );
    for (let i = 0; i <= m; i++) {
        for (let j = 0; j <= n; j++) {
            for (let k = 0; k <= o; k++) {
                if (i === 0 || j === 0 || k === 0) {
                    L[i][j][k] = 0;
                } else if (X[i - 1] === Y[j - 1] && X[i - 1] === Z[k - 1]) {
                    L[i][j][k] = L[i - 1][j - 1][k - 1] + 1;
                } else {
                    L[i][j][k] = Math.max(
                        L[i - 1][j][k],
                        L[i][j - 1][k],
                        L[i][j][k - 1]
                    );
                }
            }
        }
    }
    return L[m][n][o];
}
