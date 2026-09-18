public class ClosestElements {
    public static int[] findClosest(int[] A, int[] B, int[] C, int p, int q, int r) {
        int diff = Integer.MAX_VALUE;
        int resI = 0, resJ = 0, resK = 0;
        int i = 0, j = 0, k = 0;
        while (i < p && j < q && k < r) {
            int minimum = Math.min(A[i], Math.min(B[j], C[k]));
            int maximum = Math.max(A[i], Math.max(B[j], C[k]));
            if (maximum - minimum < diff) {
                resI = i;
                resJ = j;
                resK = k;
                diff = maximum - minimum;
            }
            if (diff == 0) {
                break;
            }
            if (A[i] == minimum) {
                i++;
            } else if (B[j] == minimum) {
                j++;
            } else {
                k++;
            }
        }
        return new int[]{A[resI], B[resJ], C[resK]};
    }
}
