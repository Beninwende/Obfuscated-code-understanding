function findProduct(arr, n) {
    arr.sort((a, b) => a - b);
    let prod = 1;
    for (let i = 0; i < n; i++) {
        const prev = i > 0 ? arr[i - 1] : arr[n - 1];
        if (prev !== arr[i]) {
            prod *= arr[i];
        }
    }
    return prod;
}
