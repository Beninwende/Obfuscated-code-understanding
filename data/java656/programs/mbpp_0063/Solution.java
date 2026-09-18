import java.util.List;

public class Solution {
    public static int maxDifference(List<int[]> testList) {
        int res = 0;
        for (int[] pair : testList) {
            int diff = Math.abs(pair[1] - pair[0]);
            if (diff > res) {
                res = diff;
            }
        }
        return res;
    }
}
