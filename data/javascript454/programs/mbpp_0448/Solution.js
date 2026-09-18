function calSum(n) {
    let a = 3;
    let b = 0;
    let c = 2;
    if (n === 0) {
        return 3;
    }
    if (n === 1) {
        return 3;
    }
    if (n === 2) {
        return 5;
    }
    let sum = 5;
    while (n > 2) {
        let d = a + b;
        sum += d;
        a = b;
        b = c;
        c = d;
        n -= 1;
    }
    return sum;
}
