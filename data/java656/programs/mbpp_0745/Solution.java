import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> divisibleByDigits(int startnum, int endnum) {
        List<Integer> result = new ArrayList<>();
        for (int n = startnum; n <= endnum; n++) {
            String s = Integer.toString(n);
            boolean valid = true;
            for (char ch : s.toCharArray()) {
                int digit = ch - '0';
                if (digit == 0 || n % digit != 0) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                result.add(n);
            }
        }
        return result;
    }
}
