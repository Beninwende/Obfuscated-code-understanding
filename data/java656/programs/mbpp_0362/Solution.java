import java.util.*;

public class MaxOccurrences {
    public static <T> T maxOccurrences(List<T> nums) {
        if (nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException("List must not be empty");
        }
        int maxVal = 0;
        T result = nums.get(0);
        for (T item : nums) {
            int occu = Collections.frequency(nums, item);
            if (occu > maxVal) {
                maxVal = occu;
                result = item;
            }
        }
        return result;
    }
}
