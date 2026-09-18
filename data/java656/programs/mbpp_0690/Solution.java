import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Integer> mulConsecutiveNums(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size() - 1; i++) {
            result.add(nums.get(i) * nums.get(i + 1));
        }
        return result;
    }
}
