function find_Diff(arr, n) {
    arr.sort((a, b) => a - b);
    let count = 0, max_count = 0, min_count = n;
    for (let i = 0; i < n - 1; i++) {
        if (arr[i] === arr[i + 1]) {
            count++;
            continue;
        } else {
            max_count = Math.max(max_count, count);
            min_count = Math.min(min_count, count);
            count = 0;
        }
    }
    return max_count - min_count;
}
