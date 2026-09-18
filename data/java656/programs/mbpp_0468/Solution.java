public class MaxProductIncreasingSubsequence {
    public static int maxProduct(int[] arr, int n) {
        int[] mpis = new int[n];
        for (int i = 0; i < n; i++) {
            mpis[i] = arr[i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && mpis[i] < mpis[j] * arr[i]) {
                    mpis[i] = mpis[j] * arr[i];
                }
            }
        }
        int max = mpis[0];
        for (int value : mpis) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
