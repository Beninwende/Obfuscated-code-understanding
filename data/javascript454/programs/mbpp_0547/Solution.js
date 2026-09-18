function Total_Hamming_Distance(n) {
    let i = 1;
    let sum = 0;
    while (Math.floor(n / i) > 0) {
        sum += Math.floor(n / i);
        i *= 2;
    }
    return sum;
}
