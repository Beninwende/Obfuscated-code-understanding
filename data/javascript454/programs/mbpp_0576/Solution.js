function isSubArray(A, B, n, m) {
    let i = 0, j = 0;
    while (i < n && j < m) {
        if (A[i] === B[j]) {
            i++;
            j++;
            if (j === m) {
                return true;
            }
        } else {
            i = i - j + 1;
            j = 0;
        }
    }
    return false;
}
