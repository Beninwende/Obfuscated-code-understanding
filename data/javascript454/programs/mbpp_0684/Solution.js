function countChar(str, x) {
    let count = 0;
    for (let i = 0; i < str.length; i++) {
        if (str[i] === x) {
            count++;
        }
    }
    const n = 10;
    const repetitions = Math.floor(n / str.length);
    count *= repetitions;
    const l = n % str.length;
    for (let i = 0; i < l; i++) {
        if (str[i] === x) {
            count++;
        }
    }
    return count;
}
