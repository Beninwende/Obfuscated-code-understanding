function setLeftMostUnsetBit(n) {
    if (!(n & (n + 1))) {
        return n;
    }
    let pos = 0, temp = n, count = 0;
    while (temp) {
        if (!(temp & 1)) {
            pos = count;
        }
        count++;
        temp >>= 1;
    }
    return n | (1 << pos);
}
