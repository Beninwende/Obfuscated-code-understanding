public class Solution {
    public static long countSquares(int m, int n) {
        if (n < m) {
            int temp = m;
            m = n;
            n = temp;
        }
        return (long) n * (n + 1) * (3L * m - n + 1) / 6;
    }
}
