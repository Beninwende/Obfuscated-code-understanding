public class BreakSum {
    public static long breakSum(int n) {
        long[] dp = new long[n + 1];
        dp[0] = 0;
        if (n >= 1) {
            dp[1] = 1;
        }
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i/2] + dp[i/3] + dp[i/4], i);
        }
        return dp[n];
    }
}
