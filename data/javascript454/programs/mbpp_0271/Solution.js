function evenPowerSum(n) {
    let sum = 0;
    for (let i = 1; i <= n; i++) {
        const j = 2 * i;
        sum += Math.pow(j, 5);
    }
    return sum;
}
