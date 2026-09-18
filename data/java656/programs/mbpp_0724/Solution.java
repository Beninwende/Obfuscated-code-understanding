import java.math.BigInteger;

public class PowerBaseSum {
    public static int powerBaseSum(int base, int power) {
        BigInteger result = BigInteger.valueOf(base).pow(power);
        int sum = 0;
        for (char c : result.toString().toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
}
