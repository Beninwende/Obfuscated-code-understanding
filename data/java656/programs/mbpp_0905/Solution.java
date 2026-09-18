import java.math.BigInteger;

public class BinomialCoefficients {
    public static BigInteger factorial(int start, int end) {
        BigInteger res = BigInteger.ONE;
        for (int i = start; i <= end; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public static BigInteger sumOfSquare(int n) {
        BigInteger numerator = factorial(n + 1, 2 * n);
        BigInteger denominator = factorial(1, n);
        return numerator.divide(denominator);
    }
}
