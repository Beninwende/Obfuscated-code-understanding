public class ZeroCounter {
    public static double zeroCount(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int x : nums) {
            if (x == 0) {
                count++;
            }
        }
        double ratio = (double) count / n;
        return Math.round(ratio * 100) / 100.0;
    }
}
