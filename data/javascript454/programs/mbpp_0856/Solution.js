function findMinSwaps(arr, n) {
    const noOfZeroes = new Array(n).fill(0);
    let count = 0;
    noOfZeroes[n - 1] = 1 - arr[n - 1];
    for (let i = n - 2; i >= 0; i--) {
        noOfZeroes[i] = noOfZeroes[i + 1];
        if (arr[i] === 0) {
            noOfZeroes[i]++;
        }
    }
    for (let i = 0; i < n; i++) {
        if (arr[i] === 1) {
            count += noOfZeroes[i];
        }
    }
    return count;
}
