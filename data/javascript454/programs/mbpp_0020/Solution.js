function isWoodall(x) {
    if (x % 2 === 0) {
        return false;
    }
    if (x === 1) {
        return true;
    }
    let m = x + 1;
    let p = 0;
    while (m % 2 === 0) {
        m /= 2;
        p++;
        if (p === m) {
            return true;
        }
    }
    return false;
}
