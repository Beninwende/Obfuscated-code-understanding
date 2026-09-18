function findMaxNum(arr, n) {
    arr.sort((a, b) => b - a);
    let num = arr[0];
    for (let i = 1; i < n; i++) {
        num = num * 10 + arr[i];
    }
    return num;
}
