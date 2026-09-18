public class SumSquareChecker {
    public static boolean sumSquare(int n) {
        for (int i = 1; i * i <= n; i++) {
            for (int j = 1; j * j <= n; j++) {
                if (i * i + j * j == n) {
                    return true;
                }
            }
        }
        return false;
    }
}
