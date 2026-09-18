function maxSubArraySum(a, size) {
    let maxSoFar = 0;
    let maxEndingHere = 0;
    for (let i = 0; i < size; i++) {
        maxEndingHere += a[i];
        if (maxEndingHere < 0) {
            maxEndingHere = 0;
        } else if (maxSoFar < maxEndingHere) {
            maxSoFar = maxEndingHere;
        }
    }
    return maxSoFar;
}
