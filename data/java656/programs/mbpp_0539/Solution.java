import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Double> basesNumCorrespondingNum(List<Double> basesNum, List<Double> index) {
        List<Double> result = new ArrayList<>();
        int size = Math.min(basesNum.size(), index.size());
        for (int i = 0; i < size; i++) {
            result.add(Math.pow(basesNum.get(i), index.get(i)));
        }
        return result;
    }
}
