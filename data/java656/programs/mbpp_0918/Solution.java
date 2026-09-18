public class CoinChange {
    public static int coinChange(int[] S, int m, int n) {
        int[][] table = new int[n + 1][m];
        for (int i = 0; i < m; i++) {
            table[0][i] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                int x = (i - S[j] >= 0) ? table[i - S[j]][j] : 0;
                int y = (j >= 1) ? table[i][j - 1] : 0;
                table[i][j] = x + y;
            }
        }
        return table[n][m - 1];
    }
}
