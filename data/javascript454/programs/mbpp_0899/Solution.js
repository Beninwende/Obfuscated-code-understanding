function check(arr, n) {
    let g = 0;
    for (let i = 1; i < n; i++) {
        if (arr[i] - arr[i - 1] > 0 && g === 1) {
            return false;
        }
        if (arr[i] - arr[i - 1] < 0) {
            g = 1;
        }
    }
    return true;
}
