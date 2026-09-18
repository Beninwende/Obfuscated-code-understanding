import java.math.BigInteger;

public class BellNumber {
    public static BigInteger bellNumber(int n) {
        BigInteger[][] bell = new BigInteger[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                bell[i][j] = BigInteger.ZERO;
            }
        }
        bell[0][0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            bell[i][0] = bell[i - 1][i - 1];
            for (int j = 1; j <= i; j++) {
                bell[i][j] = bell[i - 1][j - 1].add(bell[i][j - 1]);
            }
        }
        return bell[n][0];
    }
}
