public class FactorialDigits {
    public static long findDigits(int n) {
        if (n < 0) {
            return 0;
        }
        if (n <= 1) {
            return 1;
        }
        double x = n * Math.log10(n / Math.E) + Math.log10(2 * Math.PI * n) / 2.0;
        return (long) Math.floor(x) + 1;
    }
}
