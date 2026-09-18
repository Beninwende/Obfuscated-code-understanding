function smallestMultiple(n) {
    if (n <= 2) return n;
    let i = n * 2;
    const factors = [];
    for (let number = n; number > 1; number--) {
        if (number * 2 > n) factors.push(number);
    }
    while (true) {
        for (let a of factors) {
            if (i % a !== 0) {
                i += n;
                break;
            }
            if (a === factors[factors.length - 1]) {
                return i;
            }
        }
    }
}
