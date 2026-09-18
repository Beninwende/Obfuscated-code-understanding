public class Solution {
    public static int[][] subtractElements(int[][] testTup1, int[][] testTup2) {
        int rows = Math.min(testTup1.length, testTup2.length);
        int[][] res = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int cols = Math.min(testTup1[i].length, testTup2[i].length);
            int[] row = new int[cols];
            for (int j = 0; j < cols; j++) {
                row[j] = testTup1[i][j] - testTup2[i][j];
            }
            res[i] = row;
        }
        return res;
    }
}
