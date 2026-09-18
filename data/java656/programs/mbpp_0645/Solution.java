import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static int getProduct(List<Integer> val) {
        int res = 1;
        for (int ele : val) {
            res *= ele;
        }
        return res;
    }

    public static int findKProduct(List<List<Integer>> testList, int K) {
        List<Integer> values = new ArrayList<>();
        for (List<Integer> sub : testList) {
            values.add(sub.get(K));
        }
        return getProduct(values);
    }
}
