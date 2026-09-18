function findClosest(A, B, C, p, q, r) {
    let diff = Number.MAX_SAFE_INTEGER;
    let res_i = 0, res_j = 0, res_k = 0;
    let i = 0, j = 0, k = 0;
    while (i < p && j < q && k < r) {
        const minimum = Math.min(A[i], B[j], C[k]);
        const maximum = Math.max(A[i], B[j], C[k]);
        if (maximum - minimum < diff) {
            res_i = i;
            res_j = j;
            res_k = k;
            diff = maximum - minimum;
        }
        if (diff === 0) {
            break;
        }
        if (A[i] === minimum) {
            i++;
        } else if (B[j] === minimum) {
            j++;
        } else {
            k++;
        }
    }
    return [A[res_i], B[res_j], C[res_k]];
}
