import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class RangeFilter {
    public static List<List<Integer>> removeListRange(List<List<Integer>> list1, int leftRange, int rightRange) {
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> sublist : list1) {
            if (!sublist.isEmpty()) {
                int min = Collections.min(sublist);
                int max = Collections.max(sublist);
                if (min >= leftRange && max <= rightRange) {
                    result.add(sublist);
                }
            }
        }
        return result;
    }
}
