public class PrimeChecker {
    public static boolean primeNum(int num) {
        if (num >= 1) {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    return false;
                } else {
                    return true;
                }
            }
        } else {
            return false;
        }
        return false;
    }
}
