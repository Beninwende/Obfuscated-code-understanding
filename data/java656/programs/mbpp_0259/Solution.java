import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<List<Integer>> maximizeElements(List<List<Integer>> testTup1, List<List<Integer>> testTup2) {
        List<List<Integer>> res = new ArrayList<>();
        int outerSize = Math.min(testTup1.size(), testTup2.size());
        for (int i = 0; i < outerSize; i++) {
            List<Integer> tup1 = testTup1.get(i);
            List<Integer> tup2 = testTup2.get(i);
            List<Integer> inner = new ArrayList<>();
            int innerSize = Math.min(tup1.size(), tup2.size());
            for (int j = 0; j < innerSize; j++) {
                inner.add(Math.max(tup1.get(j), tup2.get(j)));
            }
            res.add(inner);
        }
        return res;
    }
}
