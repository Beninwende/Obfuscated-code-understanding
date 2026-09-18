function isArmstrongNumber(number) {
    let sum = 0;
    let times = 0;
    let temp = number;
    while (temp > 0) {
        times++;
        temp = Math.floor(temp / 10);
    }
    temp = number;
    while (temp > 0) {
        const remainder = temp % 10;
        sum += remainder ** times;
        temp = Math.floor(temp / 10);
    }
    return number === sum;
}
