import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int findSum(int[] arr, int n) {
        int sum = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for (int x : arr) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        for (int x : arr) {
            if (count.get(x) > 1) {
                sum += x;
            }
        }
        return sum;
    }
}
