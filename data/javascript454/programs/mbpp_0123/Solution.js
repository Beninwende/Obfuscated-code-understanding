function amicableNumbersSum(limit) {
    if (!Number.isInteger(limit)) {
        return "Input is not an integer!";
    }
    if (limit < 1) {
        return "Input must be bigger than 0!";
    }
    const amicables = new Set();
    function sumOfProperDivisors(n) {
        let sum = 0;
        for (let i = 1; i < n; i++) {
            if (n % i === 0) {
                sum += i;
            }
        }
        return sum;
    }
    for (let num = 2; num <= limit; num++) {
        if (amicables.has(num)) {
            continue;
        }
        const sumFact = sumOfProperDivisors(num);
        const sumFact2 = sumOfProperDivisors(sumFact);
        if (num === sumFact2 && num !== sumFact) {
            amicables.add(num);
            amicables.add(sumFact2);
        }
    }
    return Array.from(amicables).reduce((acc, val) => acc + val, 0);
}
