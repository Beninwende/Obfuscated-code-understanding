public class HarmonicSum {
    public static double harmonicSum(int n) {
        if (n < 2) {
            return 1.0;
        } else {
            return 1.0 / n + harmonicSum(n - 1);
        }
    }
}
