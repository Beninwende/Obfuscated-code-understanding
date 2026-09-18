function sumOfSubarrayProd(arr, n) {
    let ans = 0;
    let res = 0;
    let i = n - 1;
    while (i >= 0) {
        let incr = arr[i] * (1 + res);
        ans += incr;
        res = incr;
        i--;
    }
    return ans;
}
