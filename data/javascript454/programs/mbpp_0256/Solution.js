function countPrimesNums(n) {
    let ctr = 0;
    for (let num = 0; num < n; num++) {
        if (num <= 1) continue;
        let isPrime = true;
        for (let i = 2; i < num; i++) {
            if (num % i === 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) ctr++;
    }
    return ctr;
}
