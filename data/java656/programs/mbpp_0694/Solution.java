import java.util.*;

public class Solution {
    public static <T extends Comparable<? super T>> List<T> extractUnique(Map<?, List<T>> testDict) {
        Set<T> set = new HashSet<>();
        for (List<T> values : testDict.values()) {
            set.addAll(values);
        }
        List<T> res = new ArrayList<>(set);
        Collections.sort(res);
        return res;
    }
}
