public class PrimeUtils {
    public static int smallestDivisor(int n) {
        if (n % 2 == 0) {
            return 2;
        }
        int i = 3;
        while ((long) i * i <= n) {
            if (n % i == 0) {
                return i;
            }
            i += 2;
        }
        return n;
    }
}
