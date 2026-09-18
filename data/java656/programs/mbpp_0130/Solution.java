import java.util.*;

public class Solution {
    public static <T> Map.Entry<T, Integer> maxOccurrences(List<T> nums) {
        Map<T, Integer> freq = new HashMap<>();
        for (T num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        Map.Entry<T, Integer> maxEntry = null;
        for (Map.Entry<T, Integer> entry : freq.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        return maxEntry;
    }
}
