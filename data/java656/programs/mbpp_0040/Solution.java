import java.util.*;

public class Solution {
    public static <T> Map<T, Integer> freqElement(List<List<T>> nums) {
        Map<T, Integer> result = new HashMap<>();
        for (List<T> sublist : nums) {
            for (T element : sublist) {
                result.put(element, result.getOrDefault(element, 0) + 1);
            }
        }
        return result;
    }
}
