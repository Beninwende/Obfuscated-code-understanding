function findNthDigit(p, q, N) {
    let res;
    while (N > 0) {
        N--;
        p *= 10;
        res = Math.floor(p / q);
        p %= q;
    }
    return res;
}
