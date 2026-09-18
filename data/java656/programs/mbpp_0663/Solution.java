public class Solution {
    public static long findMaxVal(long n, long x, long y) {
        long ans = Long.MIN_VALUE;
        for (long k = 0; k <= n; k++) {
            if (k % x == y) {
                ans = Math.max(ans, k);
            }
        }
        return (ans >= 0 && ans <= n) ? ans : -1;
    }
}
