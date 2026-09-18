public class GeometricSum {
    public static double geometricSum(int n) {
        if (n < 0) {
            return 0;
        } else {
            return 1.0 / Math.pow(2, n) + geometricSum(n - 1);
        }
    }
}
