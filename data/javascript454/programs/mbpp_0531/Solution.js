function minCoins(coins, m, V) {
    if (V === 0) return 0;
    let res = Number.MAX_SAFE_INTEGER;
    for (let i = 0; i < m; i++) {
        if (coins[i] <= V) {
            const subRes = minCoins(coins, m, V - coins[i]);
            if (subRes !== Number.MAX_SAFE_INTEGER && subRes + 1 < res) {
                res = subRes + 1;
            }
        }
    }
    return res;
}
