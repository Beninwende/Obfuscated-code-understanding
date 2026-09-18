public class MaxSumSubseq {
    public static int maxSumSubseq(int[] A) {
        int n = A.length;
        if (n == 1) {
            return A[0];
        }
        int[] lookUp = new int[n];
        lookUp[0] = A[0];
        lookUp[1] = Math.max(A[0], A[1]);
        for (int i = 2; i < n; i++) {
            lookUp[i] = Math.max(lookUp[i - 1], lookUp[i - 2] + A[i]);
            lookUp[i] = Math.max(lookUp[i], A[i]);
        }
        return lookUp[n - 1];
    }
}
