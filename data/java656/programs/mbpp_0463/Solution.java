public class Solution {
    public static int maxSubarrayProduct(int[] arr) {
        int n = arr.length;
        int maxEndingHere = 1;
        int minEndingHere = 1;
        int maxSoFar = 0;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                maxEndingHere *= arr[i];
                minEndingHere = Math.min(minEndingHere * arr[i], 1);
                flag = 1;
            } else if (arr[i] == 0) {
                maxEndingHere = 1;
                minEndingHere = 1;
            } else {
                int temp = maxEndingHere;
                maxEndingHere = Math.max(minEndingHere * arr[i], 1);
                minEndingHere = temp * arr[i];
            }
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
        }
        if (flag == 0 && maxSoFar == 0) {
            return 0;
        }
        return maxSoFar;
    }
}
