import java.math.BigInteger;

public class FactorialFirstDigit {
    public static int firstDigit(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
            while (fact.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
                fact = fact.divide(BigInteger.TEN);
            }
        }
        while (fact.compareTo(BigInteger.TEN) >= 0) {
            fact = fact.divide(BigInteger.TEN);
        }
        return fact.intValue();
    }
}
