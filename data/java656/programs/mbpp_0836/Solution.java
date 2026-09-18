public class Solution {
    public static int maxSubArrayLength(int[] a) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        int start = 0, end = 0, s = 0;
        for (int i = 0; i < a.length; i++) {
            maxEndingHere += a[i];
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                start = s;
                end = i;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
                s = i + 1;
            }
        }
        return end - start + 1;
    }
}
