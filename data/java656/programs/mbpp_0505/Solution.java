public class Solution {
    public static int[] reOrder(int[] A) {
        int k = 0;
        for (int i : A) {
            if (i != 0) {
                A[k] = i;
                k++;
            }
        }
        for (int i = k; i < A.length; i++) {
            A[i] = 0;
        }
        return A;
    }
}
