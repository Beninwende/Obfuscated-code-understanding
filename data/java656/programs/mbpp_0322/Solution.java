import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static List<Integer> positionMin(List<Integer> list1) {
        int minVal = Collections.min(list1);
        List<Integer> minResult = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == minVal) {
                minResult.add(i);
            }
        }
        return minResult;
    }
}
