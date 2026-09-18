function maxSubArraySumRepeated(a, n, k) {
    let maxSoFar = -2147483648;
    let maxEndingHere = 0;
    for (let i = 0; i < n * k; i++) {
        maxEndingHere += a[i % n];
        if (maxSoFar < maxEndingHere) {
            maxSoFar = maxEndingHere;
        }
        if (maxEndingHere < 0) {
            maxEndingHere = 0;
        }
    }
    return maxSoFar;
}
