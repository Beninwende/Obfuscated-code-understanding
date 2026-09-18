function ngcd(x, y) {
    let i = 1;
    let gcd = 1;
    while (i <= x && i <= y) {
        if (x % i === 0 && y % i === 0) {
            gcd = i;
        }
        i += 1;
    }
    return gcd;
}

function num_comm_div(x, y) {
    const n = ngcd(x, y);
    let result = 0;
    const z = Math.floor(Math.sqrt(n));
    let i = 1;
    while (i <= z) {
        if (n % i === 0) {
            result += 2;
            if (i === n / i) {
                result -= 1;
            }
        }
        i += 1;
    }
    return result;
}
