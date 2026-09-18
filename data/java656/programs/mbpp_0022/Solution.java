import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int findFirstDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num)) {
                return num;
            }
            numSet.add(num);
        }
        return -1;
    }
}
