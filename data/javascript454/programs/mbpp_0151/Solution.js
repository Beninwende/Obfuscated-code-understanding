function gcd(p, q) {
    while (q !== 0) {
        [p, q] = [q, p % q];
    }
    return p;
}

function isCoprime(x, y) {
    return gcd(x, y) === 1;
}
