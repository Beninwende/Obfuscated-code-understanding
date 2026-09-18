function countDivisors(n) {
    let count = 0;
    const limit = Math.floor(Math.sqrt(n)) + 2;
    for (let i = 1; i < limit; i++) {
        if (n % i === 0) {
            if (i * i === n) {
                count += 1;
            } else {
                count += 2;
            }
        }
    }
    return count % 2 === 0 ? "Even" : "Odd";
}
