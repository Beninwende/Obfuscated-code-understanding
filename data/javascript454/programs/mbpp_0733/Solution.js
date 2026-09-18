function findFirstOccurrence(A, x) {
    let left = 0;
    let right = A.length - 1;
    let result = -1;
    while (left <= right) {
        const mid = Math.floor((left + right) / 2);
        if (x === A[mid]) {
            result = mid;
            right = mid - 1;
        } else if (x < A[mid]) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return result;
}
