function countPairs(arr, n, k) {
    let count = 0;
    for (let i = 0; i < n; i++) {
        for (let j = i + 1; j < n; j++) {
            if (Math.abs(arr[i] - arr[j]) === k) {
                count++;
            }
        }
    }
    return count;
}
