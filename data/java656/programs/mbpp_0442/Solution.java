public class PositiveCounter {
    public static double positiveCount(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0.0;
        }
        int count = 0;
        for (int x : nums) {
            if (x > 0) {
                count++;
            }
        }
        double ratio = (double) count / n;
        return Math.round(ratio * 100.0) / 100.0;
    }
}
