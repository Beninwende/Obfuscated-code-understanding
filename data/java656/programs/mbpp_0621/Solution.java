import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<String> incrementNumerics(List<String> testList, int K) {
        List<String> res = new ArrayList<>();
        for (String ele : testList) {
            if (ele.matches("\\d+")) {
                res.add(String.valueOf(Integer.parseInt(ele) + K));
            } else {
                res.add(ele);
            }
        }
        return res;
    }
}
