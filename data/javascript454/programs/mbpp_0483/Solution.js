function firstFactorialDivisibleNumber(x) {
    let fact = 1;
    let i;
    for (i = 1; i < x; i++) {
        fact *= i;
        if (fact % x === 0) {
            break;
        }
    }
    return i;
}
