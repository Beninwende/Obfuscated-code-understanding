public class RectangleSquares {
    public static long countSquares(long m, long n) {
        if (n < m) {
            long temp = m;
            m = n;
            n = temp;
        }
        return m * (m + 1) * (2 * m + 1) / 6 + (n - m) * m * (m + 1) / 2;
    }
}
