public class CoinChange {
    public static int minCoins(int[] coins, int m, int V) {
        if (V == 0) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            if (coins[i] <= V) {
                int subRes = minCoins(coins, m, V - coins[i]);
                if (subRes != Integer.MAX_VALUE && subRes + 1 < res) {
                    res = subRes + 1;
                }
            }
        }
        return res;
    }
}
