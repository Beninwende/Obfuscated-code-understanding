import java.util.ArrayList;
import java.util.List;

public class TupleJoiner {
    public static <T> List<List<T>> joinTuples(List<List<T>> testList) {
        List<List<T>> res = new ArrayList<>();
        for (List<T> sub : testList) {
            if (!res.isEmpty() && res.get(res.size() - 1).get(0).equals(sub.get(0))) {
                res.get(res.size() - 1).addAll(sub.subList(1, sub.size()));
            } else {
                res.add(new ArrayList<>(sub));
            }
        }
        return res;
    }
}
