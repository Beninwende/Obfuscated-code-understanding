function findRotationCount(A) {
    let left = 0;
    let right = A.length - 1;
    while (left <= right) {
        if (A[left] <= A[right]) {
            return left;
        }
        let mid = Math.floor((left + right) / 2);
        let next = (mid + 1) % A.length;
        let prev = (mid - 1 + A.length) % A.length;
        if (A[mid] <= A[next] && A[mid] <= A[prev]) {
            return mid;
        } else if (A[mid] <= A[right]) {
            right = mid - 1;
        } else if (A[mid] >= A[left]) {
            left = mid + 1;
        }
    }
    return -1;
}
