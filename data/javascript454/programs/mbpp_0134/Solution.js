function checkLast(arr, n, p) {
    let sum = 0;
    for (let i = 0; i < n; i++) {
        sum += arr[i];
    }
    if (p === 1) {
        if (sum % 2 === 0) {
            return "ODD";
        } else {
            return "EVEN";
        }
    }
    return "EVEN";
}
