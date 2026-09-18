function findMinDiff(arr, n) {
    arr = arr.slice().sort((a, b) => a - b);
    let diff = Infinity;
    for (let i = 0; i < n - 1; i++) {
        const d = arr[i + 1] - arr[i];
        if (d < diff) {
            diff = d;
        }
    }
    return diff;
}
