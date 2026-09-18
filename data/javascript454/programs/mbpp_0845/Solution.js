function findDigits(n) {
    if (n < 0) {
        return 0;
    }
    if (n <= 1) {
        return 1;
    }
    const x = n * Math.log10(n / Math.E) + 0.5 * Math.log10(2 * Math.PI * n);
    return Math.floor(x) + 1;
}
