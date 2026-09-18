public class SumRangeList {
    public static int sumRangeList(int[] nums, int m, int n) {
        int sumRange = 0;
        for (int i = m; i <= n; i++) {
            sumRange += nums[i];
        }
        return sumRange;
    }
}
