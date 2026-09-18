import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static List<Integer> twoUniqueNums(List<Integer> nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (Integer num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (freq.get(num) == 1) {
                result.add(num);
            }
        }
        return result;
    }
}
