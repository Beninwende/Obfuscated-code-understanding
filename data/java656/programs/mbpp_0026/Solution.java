import java.util.List;

public class Solution {
    public static boolean checkKElements(List<List<Integer>> testList, int K) {
        boolean res = true;
        for (List<Integer> tup : testList) {
            for (int ele : tup) {
                if (ele != K) {
                    res = false;
                }
            }
        }
        return res;
    }
}
