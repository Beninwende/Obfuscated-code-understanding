function countUnsetBits(n) {
    let count = 0;
    let x = 1;
    while (x < n + 1) {
        if ((x & n) === 0) {
            count++;
        }
        x <<= 1;
    }
    return count;
}
