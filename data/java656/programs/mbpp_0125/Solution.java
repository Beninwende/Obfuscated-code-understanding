public class Solution {
    public static int findLength(String string, int n) {
        int currentSum = 0;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += string.charAt(i) == '0' ? 1 : -1;
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
