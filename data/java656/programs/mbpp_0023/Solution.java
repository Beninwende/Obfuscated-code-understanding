import java.util.List;

public class Solution {
    public static int maximumSum(List<List<Integer>> list1) {
        int maxi = Integer.MIN_VALUE;
        for (List<Integer> x : list1) {
            int sum = 0;
            for (int y : x) {
                sum += y;
            }
            if (sum > maxi) {
                maxi = sum;
            }
        }
        return maxi;
    }
}
