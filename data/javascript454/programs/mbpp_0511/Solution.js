function findMinSum(num) {
    let sum = 0;
    let i = 2;
    while (i * i <= num) {
        while (num % i === 0) {
            sum += i;
            num /= i;
        }
        i++;
    }
    sum += num;
    return sum;
}
