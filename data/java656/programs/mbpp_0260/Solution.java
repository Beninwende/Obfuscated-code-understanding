import java.math.BigInteger;

public class NewmanShanksWilliams {
    public static BigInteger newmanPrime(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(2).multiply(newmanPrime(n - 1))
                                   .add(newmanPrime(n - 2));
    }
}
