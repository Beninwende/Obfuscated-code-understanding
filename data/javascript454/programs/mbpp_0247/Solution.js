function lps(s) {
    const n = s.length;
    const L = Array.from({ length: n }, () => Array(n).fill(0));
    for (let i = 0; i < n; i++) {
        L[i][i] = 1;
    }
    for (let cl = 2; cl <= n; cl++) {
        for (let i = 0; i < n - cl + 1; i++) {
            const j = i + cl - 1;
            if (s[i] === s[j] && cl === 2) {
                L[i][j] = 2;
            } else if (s[i] === s[j]) {
                L[i][j] = L[i + 1][j - 1] + 2;
            } else {
                L[i][j] = Math.max(L[i][j - 1], L[i + 1][j]);
            }
        }
    }
    return L[0][n - 1];
}
