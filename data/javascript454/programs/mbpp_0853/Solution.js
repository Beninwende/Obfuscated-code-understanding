function sumOfOddFactors(n) {
    let res = 1;
    while (n % 2 === 0) {
        n /= 2;
    }
    const limit = Math.sqrt(n);
    for (let i = 3; i <= limit; i++) {
        let currSum = 1;
        let currTerm = 1;
        while (n % i === 0) {
            n /= i;
            currTerm *= i;
            currSum += currTerm;
        }
        res *= currSum;
    }
    if (n >= 2) {
        res *= (1 + n);
    }
    return res;
}
