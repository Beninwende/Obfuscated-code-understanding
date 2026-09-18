function sumEvenAndEvenIndex(arr, n) {
    let sum = 0;
    for (let i = 0; i < n; i += 2) {
        if (arr[i] % 2 === 0) {
            sum += arr[i];
        }
    }
    return sum;
}
