import java.util.Arrays;

public class Solution {
    public static int maxSumPairDiffLessThanK(int[] arr, int N, int K) {
        Arrays.sort(arr);
        int[] dp = new int[N];
        dp[0] = 0;
        for (int i = 1; i < N; i++) {
            dp[i] = dp[i - 1];
            if (arr[i] - arr[i - 1] < K) {
                int pairSum = arr[i] + arr[i - 1];
                if (i >= 2) {
                    dp[i] = Math.max(dp[i], dp[i - 2] + pairSum);
                } else {
                    dp[i] = Math.max(dp[i], pairSum);
                }
            }
        }
        return dp[N - 1];
    }
}
