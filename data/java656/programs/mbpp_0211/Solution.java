public class Solution {
    public static long countNum(int n) {
        if (n == 1) {
            return 1;
        }
        return 1L << (n - 2);
    }
}
