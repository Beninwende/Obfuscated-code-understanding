function isNotPrime(n) {
    let result = false;
    const limit = Math.floor(Math.sqrt(n));
    for (let i = 2; i <= limit; i++) {
        if (n % i === 0) {
            result = true;
        }
    }
    return result;
}
