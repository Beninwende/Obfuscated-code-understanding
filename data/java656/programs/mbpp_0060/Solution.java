public class MaxSubsequence {
    public static int maxLenSub(int[] arr, int n) {
        int[] mls = new int[n];
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            mls[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(arr[i] - arr[j]) <= 1 && mls[i] < mls[j] + 1) {
                    mls[i] = mls[j] + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (maxLen < mls[i]) {
                maxLen = mls[i];
            }
        }
        return maxLen;
    }
}
