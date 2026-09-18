import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static class Pair<F, S> {
        public final F first;
        public final S second;
        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }
    }

    public static List<Pair<Integer, Integer>> maxSimilarIndices(List<Pair<Integer, Integer>> list1, List<Pair<Integer, Integer>> list2) {
        List<Pair<Integer, Integer>> res = new ArrayList<>();
        int size = Math.min(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            Pair<Integer, Integer> x = list1.get(i);
            Pair<Integer, Integer> y = list2.get(i);
            res.add(new Pair<>(Math.max(x.first, y.first), Math.max(x.second, y.second)));
        }
        return res;
    }
}
