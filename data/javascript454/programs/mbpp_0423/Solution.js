function getMaxGold(gold, m, n) {
    const goldTable = Array.from({ length: m }, () => Array(n).fill(0));
    for (let col = n - 1; col >= 0; col--) {
        for (let row = 0; row < m; row++) {
            const right = (col === n - 1) ? 0 : goldTable[row][col + 1];
            const rightUp = (row === 0 || col === n - 1) ? 0 : goldTable[row - 1][col + 1];
            const rightDown = (row === m - 1 || col === n - 1) ? 0 : goldTable[row + 1][col + 1];
            goldTable[row][col] = gold[row][col] + Math.max(right, rightUp, rightDown);
        }
    }
    let res = goldTable[0][0];
    for (let i = 1; i < m; i++) {
        res = Math.max(res, goldTable[i][0]);
    }
    return res;
}
