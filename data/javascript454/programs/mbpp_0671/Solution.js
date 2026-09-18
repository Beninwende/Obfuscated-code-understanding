function getPosOfRightMostSetBit(n) {
    return Math.floor(Math.log2(n & -n) + 1);
}

function setRightMostUnsetBit(n) {
    if (n === 0) {
        return 1;
    }
    if ((n & (n + 1)) === 0) {
        return n;
    }
    const pos = getPosOfRightMostSetBit(~n);
    return (1 << (pos - 1)) | n;
}
