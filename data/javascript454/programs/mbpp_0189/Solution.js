function firstMissingPositive(arr) {
    const n = arr.length;
    let hasOne = false;
    for (let i = 0; i < n; i++) {
        if (arr[i] === 1) {
            hasOne = true;
            break;
        }
    }
    if (!hasOne) {
        return 1;
    }
    for (let i = 0; i < n; i++) {
        if (arr[i] <= 0 || arr[i] > n) {
            arr[i] = 1;
        }
    }
    for (let i = 0; i < n; i++) {
        const index = (arr[i] - 1) % n;
        arr[index] += n;
    }
    for (let i = 0; i < n; i++) {
        if (arr[i] <= n) {
            return i + 1;
        }
    }
    return n + 1;
}
