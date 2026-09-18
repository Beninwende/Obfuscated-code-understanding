function sumOfPrimes(n) {
    const prime = new Array(n + 1).fill(true);
    let p = 2;
    while (p * p <= n) {
        if (prime[p]) {
            for (let i = p * 2; i <= n; i += p) {
                prime[i] = false;
            }
        }
        p++;
    }
    let sum = 0;
    for (let i = 2; i <= n; i++) {
        if (prime[i]) sum += i;
    }
    return sum;
}
