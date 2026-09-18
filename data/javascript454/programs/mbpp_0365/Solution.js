function countDigit(n) {
    let count = 0;
    while (n !== 0) {
        n = Math.trunc(n / 10);
        count++;
    }
    return count;
}
