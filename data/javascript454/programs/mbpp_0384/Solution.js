function frequencyOfSmallest(n, arr) {
    let mn = arr[0];
    let freq = 1;
    for (let i = 1; i < n; i++) {
        if (arr[i] < mn) {
            mn = arr[i];
            freq = 1;
        } else if (arr[i] === mn) {
            freq++;
        }
    }
    return freq;
}
