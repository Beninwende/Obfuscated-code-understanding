import java.math.BigInteger;

public class TupleToIntUtil {
    public static BigInteger tupleToInt(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        return new BigInteger(sb.toString());
    }
}
