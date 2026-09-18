function evenBitToggleNumber(n) {
    let res = 0;
    let count = 0;
    let temp = n;
    while (temp > 0) {
        if (count % 2 === 0) {
            res |= (1 << count);
        }
        count++;
        temp >>= 1;
    }
    return n ^ res;
}
