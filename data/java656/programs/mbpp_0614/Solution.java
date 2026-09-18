import java.util.List;

public class CumulativeSumCalculator {
    public static int cummulativeSum(List<List<Integer>> testList) {
        int res = 0;
        for (List<Integer> tuple : testList) {
            for (int val : tuple) {
                res += val;
            }
        }
        return res;
    }
}
