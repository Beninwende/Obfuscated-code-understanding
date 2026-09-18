function binomial_Coeff(n, k) {
    const C = new Array(k + 1).fill(0);
    C[0] = 1;
    for (let i = 1; i <= n; i++) {
        for (let j = Math.min(i, k); j > 0; j--) {
            C[j] += C[j - 1];
        }
    }
    return C[k];
}

function sum_Of_product(n) {
    return binomial_Coeff(2 * n, n - 1);
}
