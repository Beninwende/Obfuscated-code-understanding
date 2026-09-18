function count_Rotation(arr, n) {
    for (let i = 1; i < n; i++) {
        if (arr[i] < arr[i - 1]) {
            return i;
        }
    }
    return 0;
}
