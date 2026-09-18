public class Solution {
    public static boolean isProductEven(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if ((arr[i] & 1) == 0) {
                return true;
            }
        }
        return false;
    }
}
