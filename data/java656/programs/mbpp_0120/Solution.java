import java.util.List;

public class Solution {
    public static int maxProductTuple(List<int[]> list1) {
        int resultMax = Integer.MIN_VALUE;
        for (int[] pair : list1) {
            int product = Math.abs(pair[0] * pair[1]);
            if (product > resultMax) {
                resultMax = product;
            }
        }
        return resultMax;
    }
}
