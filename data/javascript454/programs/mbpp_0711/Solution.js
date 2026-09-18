function productEqual(n) {
    if (n < 10) {
        return false;
    }
    let prodOdd = 1, prodEven = 1;
    while (n > 0) {
        let digit = n % 10;
        prodOdd *= digit;
        n = Math.floor(n / 10);
        if (n === 0) {
            break;
        }
        digit = n % 10;
        prodEven *= digit;
        n = Math.floor(n / 10);
    }
    return prodOdd === prodEven;
}
