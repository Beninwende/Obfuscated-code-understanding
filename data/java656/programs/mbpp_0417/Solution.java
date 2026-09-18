import java.util.*;

public class Solution {
    public static <T> List<List<T>> groupTuples(List<List<T>> input) {
        Map<T, List<T>> out = new LinkedHashMap<>();
        for (List<T> elem : input) {
            T key = elem.get(0);
            if (!out.containsKey(key)) {
                out.put(key, new ArrayList<>(elem));
            } else {
                out.get(key).addAll(elem.subList(1, elem.size()));
            }
        }
        return new ArrayList<>(out.values());
    }
}
