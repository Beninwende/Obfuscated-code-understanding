function nCr_mod_p(n, r, p) {
    if (r > n - r) {
        r = n - r;
    }
    const C = new Array(r + 1).fill(0);
    C[0] = 1;
    for (let i = 1; i <= n; i++) {
        for (let j = Math.min(i, r); j > 0; j--) {
            C[j] = (C[j] + C[j - 1]) % p;
        }
    }
    return C[r];
}
