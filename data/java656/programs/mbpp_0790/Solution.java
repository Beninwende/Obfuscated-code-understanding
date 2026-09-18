public class Solution {
    public static boolean evenPosition(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != i % 2) {
                return false;
            }
        }
        return true;
    }
}
