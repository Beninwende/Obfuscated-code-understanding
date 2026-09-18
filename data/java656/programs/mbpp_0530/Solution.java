public class NegativeCounter {
    public static double negativeRatio(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int x : nums) {
            if (x < 0) {
                count++;
            }
        }
        if (n == 0) {
            return 0.0;
        }
        double ratio = (double) count / n;
        return Math.round(ratio * 100.0) / 100.0;
    }
}
