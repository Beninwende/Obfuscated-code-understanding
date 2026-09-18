import java.util.List;

public class MinDifference {
    public static int minDifference(List<int[]> testList) {
        int res = Integer.MAX_VALUE;
        for (int[] pair : testList) {
            int diff = Math.abs(pair[1] - pair[0]);
            if (diff < res) {
                res = diff;
            }
        }
        return res;
    }
}
