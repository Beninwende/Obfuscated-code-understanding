public class TriangleMaxSum {
    public static int maxSum(int[][] tri, int n) {
        if (n > 1) {
            tri[1][1] += tri[0][0];
            tri[1][0] += tri[0][0];
        }
        for (int i = 2; i < n; i++) {
            tri[i][0] += tri[i - 1][0];
            tri[i][i] += tri[i - 1][i - 1];
            for (int j = 1; j < i; j++) {
                int left = tri[i][j] + tri[i - 1][j - 1];
                int right = tri[i][j] + tri[i - 1][j];
                tri[i][j] = Math.max(left, right);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int val : tri[n - 1]) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
}
