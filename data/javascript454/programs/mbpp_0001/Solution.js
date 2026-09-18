function minCost(cost, m, n) {
    const tc = Array.from({ length: m + 1 }, () => Array(n + 1).fill(0));
    tc[0][0] = cost[0][0];
    for (let i = 1; i <= m; i++) {
        tc[i][0] = tc[i - 1][0] + cost[i][0];
    }
    for (let j = 1; j <= n; j++) {
        tc[0][j] = tc[0][j - 1] + cost[0][j];
    }
    for (let i = 1; i <= m; i++) {
        for (let j = 1; j <= n; j++) {
            tc[i][j] = Math.min(tc[i - 1][j - 1], tc[i - 1][j], tc[i][j - 1]) + cost[i][j];
        }
    }
    return tc[m][n];
}
