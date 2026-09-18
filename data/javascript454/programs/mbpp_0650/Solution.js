function areEqual(arr1, arr2, n, m) {
    if (n !== m) {
        return false;
    }
    arr1.sort((a, b) => a - b);
    arr2.sort((a, b) => a - b);
    for (let i = 0; i < n - 1; i++) {
        if (arr1[i] !== arr2[i]) {
            return false;
        }
    }
    return true;
}
