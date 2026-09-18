import java.math.BigInteger;

public class Solution {
    public static BigInteger countBinarySeq(int n) {
        BigInteger nCr = BigInteger.ONE;
        BigInteger res = BigInteger.ONE;
        for (int r = 1; r <= n; r++) {
            nCr = nCr.multiply(BigInteger.valueOf(n + 1 - r))
                     .divide(BigInteger.valueOf(r));
            res = res.add(nCr.multiply(nCr));
        }
        return res;
    }
}
