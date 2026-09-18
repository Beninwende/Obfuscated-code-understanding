import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<List<Integer>> addKElement(List<List<Integer>> testList, int K) {
        List<List<Integer>> res = new ArrayList<>();
        for (List<Integer> sub : testList) {
            List<Integer> newSub = new ArrayList<>();
            for (Integer j : sub) {
                newSub.add(j + K);
            }
            res.add(newSub);
        }
        return res;
    }
}
