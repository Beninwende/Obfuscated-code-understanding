function maxAbsDiff(arr, n) {
    let minEle = arr[0];
    let maxEle = arr[0];
    for (let i = 1; i < n; i++) {
        minEle = Math.min(minEle, arr[i]);
        maxEle = Math.max(maxEle, arr[i]);
    }
    return maxEle - minEle;
}
