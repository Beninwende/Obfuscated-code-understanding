const MAX = 3000;
function smartNumber(n) {
    const primes = new Array(MAX).fill(0);
    const result = [];
    for (let i = 2; i < MAX; i++) {
        if (primes[i] === 0) {
            primes[i] = 1;
            for (let j = i * 2; j < MAX; j += i) {
                primes[j] -= 1;
                if (primes[j] + 3 === 0) {
                    result.push(j);
                }
            }
        }
    }
    result.sort((a, b) => a - b);
    return result[n - 1];
}
