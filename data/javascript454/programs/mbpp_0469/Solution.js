function maxProfit(price, k) {
    const n = price.length;
    const finalProfit = Array.from({ length: k + 1 }, () => Array(n).fill(null));
    for (let i = 0; i <= k; i++) {
        for (let j = 0; j < n; j++) {
            if (i === 0 || j === 0) {
                finalProfit[i][j] = 0;
            } else {
                let maxSoFar = 0;
                for (let x = 0; x < j; x++) {
                    const currPrice = price[j] - price[x] + finalProfit[i - 1][x];
                    if (maxSoFar < currPrice) {
                        maxSoFar = currPrice;
                    }
                }
                finalProfit[i][j] = Math.max(finalProfit[i][j - 1], maxSoFar);
            }
        }
    }
    return finalProfit[k][n - 1];
}
