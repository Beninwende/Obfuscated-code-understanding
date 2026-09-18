function countFac(n) {
    let m = n;
    let count = 0;
    let i = 2;
    while (i * i <= m) {
        let total = 0;
        while (n % i === 0) {
            n /= i;
            total++;
        }
        let temp = 0;
        let j = 1;
        while (temp + j <= total) {
            temp += j;
            count++;
            j++;
        }
        i++;
    }
    if (n !== 1) {
        count++;
    }
    return count;
}
