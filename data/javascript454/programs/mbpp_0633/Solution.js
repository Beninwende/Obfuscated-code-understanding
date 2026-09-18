function pair_OR_Sum(arr, n) {
    let ans = 0;
    for (let i = 0; i < n; i++) {
        for (let j = i + 1; j < n; j++) {
            ans += arr[i] ^ arr[j];
        }
    }
    return ans;
}
