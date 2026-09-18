public class Solution {
    public static boolean solve(int[] a, int n) {
        int mx = Integer.MIN_VALUE;
        for (int j = 1; j < n; j++) {
            if (mx > a[j]) {
                return false;
            }
            mx = Math.max(mx, a[j - 1]);
        }
        return true;
    }
}
