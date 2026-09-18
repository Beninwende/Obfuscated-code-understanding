public class Solution {
    public static boolean modularSum(int[] arr, int n, int m) {
        if (n > m) {
            return true;
        }
        boolean[] DP = new boolean[m];
        for (int i = 0; i < n; i++) {
            if (DP[0]) {
                return true;
            }
            boolean[] temp = new boolean[m];
            for (int j = 0; j < m; j++) {
                if (DP[j]) {
                    int idx = (j + arr[i]) % m;
                    if (!DP[idx]) {
                        temp[idx] = true;
                    }
                }
            }
            for (int j = 0; j < m; j++) {
                if (temp[j]) {
                    DP[j] = true;
                }
            }
            DP[arr[i] % m] = true;
        }
        return DP[0];
    }
}
