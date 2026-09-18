import java.util.List;
import java.util.ArrayList;

public class AdjacentCoordinates {
    public static List<List<Integer>> getCoordinates(int[] testTup) {
        List<List<Integer>> res = new ArrayList<>();
        generate(testTup, 0, new ArrayList<>(), res);
        return res;
    }

    private static void generate(int[] ele, int idx, List<Integer> sub, List<List<Integer>> res) {
        if (idx == ele.length) {
            res.add(new ArrayList<>(sub));
        } else {
            for (int j = ele[idx] - 1; j <= ele[idx] + 1; j++) {
                sub.add(j);
                generate(ele, idx + 1, sub, res);
                sub.remove(sub.size() - 1);
            }
        }
    }
}
