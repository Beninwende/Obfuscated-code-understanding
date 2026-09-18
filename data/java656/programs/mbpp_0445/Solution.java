import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<List<Integer>> indexMultiplication(List<List<Integer>> testTup1, List<List<Integer>> testTup2) {
        List<List<Integer>> res = new ArrayList<>();
        int rows = Math.min(testTup1.size(), testTup2.size());
        for (int i = 0; i < rows; i++) {
            List<Integer> tup1 = testTup1.get(i);
            List<Integer> tup2 = testTup2.get(i);
            int cols = Math.min(tup1.size(), tup2.size());
            List<Integer> innerRes = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                innerRes.add(tup1.get(j) * tup2.get(j));
            }
            res.add(innerRes);
        }
        return res;
    }
}
