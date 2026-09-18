function setBitNumber(n) {
    if (n === 0) {
        return 0;
    }
    let msb = 0;
    n = Math.floor(n / 2);
    while (n > 0) {
        n = Math.floor(n / 2);
        msb++;
    }
    return 1 << msb;
}
