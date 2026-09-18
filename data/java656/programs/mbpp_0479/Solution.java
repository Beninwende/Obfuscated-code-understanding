public class FirstDigitFinder {
    public static int firstDigit(long n) {
        while (n >= 10) {
            n /= 10;
        }
        return (int) n;
    }
}
