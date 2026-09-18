public class PrimeUtils {
    public static boolean isNotPrime(int n) {
        boolean result = false;
        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (n % i == 0) {
                result = true;
            }
        }
        return result;
    }
}
