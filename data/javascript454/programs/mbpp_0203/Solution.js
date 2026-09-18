function hammingDistance(n1, n2) {
    let x = n1 ^ n2;
    let setBits = 0;
    while (x > 0) {
        setBits += x & 1;
        x >>= 1;
    }
    return setBits;
}
