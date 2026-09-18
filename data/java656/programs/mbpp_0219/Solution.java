import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExtractMinMax {
    public static List<Integer> extractMinMax(List<Integer> testList, int K) {
        List<Integer> temp = new ArrayList<>(testList);
        Collections.sort(temp);
        List<Integer> res = new ArrayList<>();
        int n = temp.size();
        for (int i = 0; i < n; i++) {
            if (i < K || i >= n - K) {
                res.add(temp.get(i));
            }
        }
        return res;
    }
}
