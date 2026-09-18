public class GoldMine {
    public static int getMaxGold(int[][] gold, int m, int n) {
        int[][] goldTable = new int[m][n];
        for (int col = n - 1; col >= 0; col--) {
            for (int row = 0; row < m; row++) {
                int right = (col == n - 1) ? 0 : goldTable[row][col + 1];
                int rightUp = (row == 0 || col == n - 1) ? 0 : goldTable[row - 1][col + 1];
                int rightDown = (row == m - 1 || col == n - 1) ? 0 : goldTable[row + 1][col + 1];
                goldTable[row][col] = gold[row][col] + Math.max(Math.max(right, rightUp), rightDown);
            }
        }
        int res = goldTable[0][0];
        for (int i = 1; i < m; i++) {
            res = Math.max(res, goldTable[i][0]);
        }
        return res;
    }
}
