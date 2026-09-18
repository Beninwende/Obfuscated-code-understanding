function minNum(arr, n) {
    let odd = 0;
    for (let i = 0; i < n; i++) {
        if (arr[i] % 2 !== 0) {
            odd++;
        }
    }
    if (odd % 2 !== 0) {
        return 1;
    }
    return 2;
}
