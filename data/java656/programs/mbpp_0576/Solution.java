public class SubarrayChecker {
    public static boolean isSubArray(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (A[i] == B[j]) {
                i++;
                j++;
                if (j == m) {
                    return true;
                }
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return false;
    }
}
