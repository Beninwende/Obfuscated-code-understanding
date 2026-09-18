public class Solution {
    public static int[][] generateMatrix(int n) {
        if (n <= 0) {
            return new int[0][0];
        }
        int[][] matrix = new int[n][n];
        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;
        int current = 1;
        while (true) {
            if (current > n * n) {
                break;
            }
            for (int c = colStart; c <= colEnd; c++) {
                matrix[rowStart][c] = current++;
            }
            rowStart++;
            for (int r = rowStart; r <= rowEnd; r++) {
                matrix[r][colEnd] = current++;
            }
            colEnd--;
            for (int c = colEnd; c >= colStart; c--) {
                matrix[rowEnd][c] = current++;
            }
            rowEnd--;
            for (int r = rowEnd; r >= rowStart; r--) {
                matrix[r][colStart] = current++;
            }
            colStart++;
        }
        return matrix;
    }
}
