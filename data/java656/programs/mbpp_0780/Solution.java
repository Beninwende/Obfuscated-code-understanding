import java.util.ArrayList;
import java.util.List;

public class CombinationUtils {
    public static List<int[]> findCombinations(List<int[]> testList) {
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < testList.size(); i++) {
            for (int j = i + 1; j < testList.size(); j++) {
                int[] a = testList.get(i);
                int[] b = testList.get(j);
                res.add(new int[]{a[0] + b[0], a[1] + b[1]});
            }
        }
        return res;
    }
}
