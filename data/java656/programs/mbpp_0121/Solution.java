public class Solution {
    public static boolean checkTriplet(int[] A, int n, int sum, int count) {
        if (count == 3 && sum == 0) {
            return true;
        }
        if (count == 3 || n == 0 || sum < 0) {
            return false;
        }
        return checkTriplet(A, n - 1, sum - A[n - 1], count + 1)
            || checkTriplet(A, n - 1, sum, count);
    }
}
