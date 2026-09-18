public class BinomialProductSum {
    public static long binomialCoeff(int n, int k) {
        long[] C = new long[k + 1];
        C[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, k); j > 0; j--) {
                C[j] += C[j - 1];
            }
        }
        return C[k];
    }

    public static long sumOfProduct(int n) {
        return binomialCoeff(2 * n, n - 1);
    }
}
