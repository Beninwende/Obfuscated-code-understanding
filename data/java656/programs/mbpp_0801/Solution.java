import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int testThreeEqual(int x, int y, int z) {
        Set<Integer> result = new HashSet<>();
        result.add(x);
        result.add(y);
        result.add(z);
        if (result.size() == 3) {
            return 0;
        } else {
            return 4 - result.size();
        }
    }
}
