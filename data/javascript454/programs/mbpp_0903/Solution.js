function countUnsetBits(n) {
    let cnt = 0;
    for (let i = 1; i <= n; i++) {
        let temp = i;
        while (temp) {
            if (temp % 2 === 0) {
                cnt++;
            }
            temp = Math.floor(temp / 2);
        }
    }
    return cnt;
}
