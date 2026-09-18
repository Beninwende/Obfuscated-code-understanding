function octalToDecimal(n) {
    let num = n;
    let decValue = 0;
    let base = 1;
    let temp = num;
    while (temp > 0) {
        let lastDigit = temp % 10;
        temp = Math.floor(temp / 10);
        decValue += lastDigit * base;
        base *= 8;
    }
    return decValue;
}
