function countSetBits(n) {
    n += 1;
    let powerOf2 = 2;
    let cnt = Math.floor(n / 2);
    while (powerOf2 <= n) {
        const totalPairs = Math.floor(n / powerOf2);
        cnt += Math.floor(totalPairs / 2) * powerOf2;
        if (totalPairs & 1) {
            cnt += n % powerOf2;
        }
        powerOf2 <<= 1;
    }
    return cnt;
}
