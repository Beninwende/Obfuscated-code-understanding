public class Solution {
    public static long sumPairs(int[] arr, int n) {
        long sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += (long)i * arr[i] - (long)(n - 1 - i) * arr[i];
        }
        return sum;
    }
}
