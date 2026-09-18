public class Solution {
    public static int maxSum(int[] arr, int n) {
        int[] MSIBS = arr.clone();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && MSIBS[i] < MSIBS[j] + arr[i]) {
                    MSIBS[i] = MSIBS[j] + arr[i];
                }
            }
        }
        int[] MSDBS = arr.clone();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                int idxI = n - i;
                int idxJ = n - j;
                if (arr[idxI] > arr[idxJ] && MSDBS[idxI] < MSDBS[idxJ] + arr[idxI]) {
                    MSDBS[idxI] = MSDBS[idxJ] + arr[idxI];
                }
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for (int k = 0; k < n; k++) {
            maxSum = Math.max(maxSum, MSIBS[k] + MSDBS[k] - arr[k]);
        }
        return maxSum;
    }
}
