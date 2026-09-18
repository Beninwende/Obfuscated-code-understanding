function countNo(A, N, L, R) {
    let count = 0;
    let result;
    for (let i = L; i <= R; i++) {
        if (i % A !== 0) {
            count++;
        }
        if (count === N) {
            result = i;
            break;
        }
    }
    return result;
}
