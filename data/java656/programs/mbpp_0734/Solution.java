public class Solution {
    public static long sumOfSubarrayProd(int[] arr, int n) {
        long ans = 0;
        long res = 0;
        int i = n - 1;
        while (i >= 0) {
            long incr = arr[i] * (1 + res);
            ans += incr;
            res = incr;
            i--;
        }
        return ans;
    }
}
