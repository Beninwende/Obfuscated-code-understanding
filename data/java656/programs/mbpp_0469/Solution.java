public class Solution {
    public static int maxProfit(int[] price, int k) {
        int n = price.length;
        int[][] finalProfit = new int[k + 1][n];
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    finalProfit[i][j] = 0;
                } else {
                    int maxSoFar = 0;
                    for (int x = 0; x < j; x++) {
                        int currPrice = price[j] - price[x] + finalProfit[i - 1][x];
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
}
