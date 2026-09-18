function isPerfectSquare(n) {
    let i = 1;
    while (i * i <= n) {
        if (n % i === 0 && n / i === i) {
            return true;
        }
        i++;
    }
    return false;
}
