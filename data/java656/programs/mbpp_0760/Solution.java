import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static String uniqueElement(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        if (set.size() == 1) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
