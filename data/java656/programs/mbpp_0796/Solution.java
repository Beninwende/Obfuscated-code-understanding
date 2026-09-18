import java.util.Map;

public class Solution {
    public static int returnSum(Map<?, Integer> map) {
        int sum = 0;
        for (int value : map.values()) {
            sum += value;
        }
        return sum;
    }
}
