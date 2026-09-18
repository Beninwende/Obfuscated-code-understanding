public class Solution {
    public static int minOps(int[] arr, int n, int k) {
        int max1 = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            int diff = max1 - arr[i];
            if (diff % k != 0) {
                return -1;
            }
            res += diff / k;
        }
        return res;
    }
}
