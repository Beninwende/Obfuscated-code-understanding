import java.util.List;
import java.util.ArrayList;

public class RangeExtractor {
    public static List<int[]> extractMissing(List<int[]> testList, int strtVal, int stopVal) {
        List<int[]> res = new ArrayList<>();
        for (int[] sub : testList) {
            if (sub[0] > strtVal) {
                res.add(new int[]{strtVal, sub[0]});
                strtVal = sub[1];
            }
            if (strtVal < stopVal) {
                res.add(new int[]{strtVal, stopVal});
            }
        }
        return res;
    }
}
