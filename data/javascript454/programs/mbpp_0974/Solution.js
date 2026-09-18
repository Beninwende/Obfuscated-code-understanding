function minSumPath(A) {
    const n = A.length - 1;
    const memo = new Array(A.length);
    for (let i = 0; i < A[n].length; i++) {
        memo[i] = A[n][i];
    }
    for (let i = A.length - 2; i >= 0; i--) {
        for (let j = 0; j < A[i].length; j++) {
            memo[j] = A[i][j] + Math.min(memo[j], memo[j + 1]);
        }
    }
    return memo[0];
}
