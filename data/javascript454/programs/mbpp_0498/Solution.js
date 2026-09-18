function gcd(x, y) {
    let gcd = 1;
    if (x % y === 0) {
        return y;
    }
    for (let k = Math.floor(y / 2); k > 0; k--) {
        if (x % k === 0 && y % k === 0) {
            gcd = k;
            break;
        }
    }
    return gcd;
}
