public class Solution {
    public static long countNoOfWays(int n, int k) {
        long mod = 1000000007;
        long[] dp = new long[n + 1];
        if (n >= 1) dp[1] = k;
        if (n >= 2) dp[2] = (long) k * k % mod;
        for (int i = 3; i <= n; i++) {
            dp[i] = ((long) (k - 1) * (dp[i - 1] + dp[i - 2])) % mod;
        }
        return dp[n];
    }
}
