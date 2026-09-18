function maxPrimeFactors(n) {
    let maxPrime = -1;
    while (n % 2 === 0) {
        maxPrime = 2;
        n /= 2;
    }
    let limit = Math.sqrt(n);
    for (let i = 3; i <= limit; i += 2) {
        while (n % i === 0) {
            maxPrime = i;
            n /= i;
        }
    }
    if (n > 2) {
        maxPrime = n;
    }
    return Math.trunc(maxPrime);
}
