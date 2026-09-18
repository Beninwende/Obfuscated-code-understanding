function maxSubArrayLength(a, size) {
    let maxSoFar = -Infinity;
    let maxEndingHere = 0;
    let start = 0, end = 0, s = 0;
    for (let i = 0; i < size; i++) {
        maxEndingHere += a[i];
        if (maxSoFar < maxEndingHere) {
            maxSoFar = maxEndingHere;
            start = s;
            end = i;
        }
        if (maxEndingHere < 0) {
            maxEndingHere = 0;
            s = i + 1;
        }
    }
    return end - start + 1;
}
