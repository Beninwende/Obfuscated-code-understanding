function countPairs(arr, n) {
    let cnt = 0;
    for (let i = 0; i < n; i++) {
        for (let j = i + 1; j < n; j++) {
            if (arr[i] === arr[j]) {
                cnt++;
            }
        }
    }
    return cnt;
}
