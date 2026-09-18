function sumDiv(number) {
    const divisors = [1];
    for (let i = 2; i < number; i++) {
        if (number % i === 0) {
            divisors.push(i);
        }
    }
    return divisors.reduce((sum, div) => sum + div, 0);
}
