import java.math.BigInteger;

public class SequenceCounter {
    public static BigInteger binCoff(int n, int r) {
        BigInteger val = BigInteger.ONE;
        if (r > n - r) {
            r = n - r;
        }
        for (int i = 0; i < r; i++) {
            val = val.multiply(BigInteger.valueOf(n - i))
                     .divide(BigInteger.valueOf(i + 1));
        }
        return val;
    }

    public static BigInteger findWays(int M) {
        int n = M / 2;
        BigInteger a = binCoff(2 * n, n);
        return a.divide(BigInteger.valueOf(n + 1));
    }
}
