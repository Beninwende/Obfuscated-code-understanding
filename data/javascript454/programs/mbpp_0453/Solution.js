function sumofFactors(n) {
    if (n % 2 !== 0) return 0;
    let res = 1;
    const limit = Math.floor(Math.sqrt(n));
    for (let i = 2; i <= limit; i++) {
        let count = 0;
        let curr_sum = 1;
        let curr_term = 1;
        while (n % i === 0) {
            count++;
            n = n / i;
            if (i === 2 && count === 1) {
                curr_sum = 0;
            }
            curr_term *= i;
            curr_sum += curr_term;
        }
        res *= curr_sum;
    }
    if (n >= 2) {
        res *= (1 + n);
    }
    return res;
}
