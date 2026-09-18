public class Solution {
    public static boolean isMonotonic(int[] A) {
        if (A == null || A.length < 2) {
            return true;
        }
        boolean nonDecreasing = true;
        boolean nonIncreasing = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                nonDecreasing = false;
            }
            if (A[i] < A[i + 1]) {
                nonIncreasing = false;
            }
            if (!nonDecreasing && !nonIncreasing) {
                return false;
            }
        }
        return true;
    }
}
