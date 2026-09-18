public class PermutationCoefficient {
    public static long permutationCoefficient(int n, int k) {
        long[][] P = new long[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0) {
                    P[i][j] = 1;
                } else {
                    P[i][j] = P[i - 1][j] + j * P[i - 1][j - 1];
                }
                if (j < k) {
                    P[i][j + 1] = 0;
                }
            }
        }
        return P[n][k];
    }
}
