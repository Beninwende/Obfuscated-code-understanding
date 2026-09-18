public class Solution {
    public static int maxSubArraySumRepeated(int[] a, int n, int k) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for (int i = 0; i < n * k; i++) {
            maxEndingHere += a[i % n];
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}
