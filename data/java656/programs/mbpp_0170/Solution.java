public class Solution {
    public static int sumRangeList(int[] list1, int m, int n) {
        int sumRange = 0;
        for (int i = m; i <= n; i++) {
            sumRange += list1[i];
        }
        return sumRange;
    }
}
