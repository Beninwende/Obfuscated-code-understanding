function firstElement(arr, n, k) {
    const countMap = {};
    for (let i = 0; i < n; i++) {
        if (countMap[arr[i]] !== undefined) {
            countMap[arr[i]]++;
        } else {
            countMap[arr[i]] = 1;
        }
    }
    for (let i = 0; i < n; i++) {
        if (countMap[arr[i]] === k) {
            return arr[i];
        }
    }
    return -1;
}
