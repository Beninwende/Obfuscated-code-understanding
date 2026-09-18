public class FractionDigitFinder {
    public static int findNthDigit(int p, int q, int N) {
        int res = 0;
        while (N > 0) {
            N--;
            p *= 10;
            res = p / q;
            p %= q;
        }
        return res;
    }
}
