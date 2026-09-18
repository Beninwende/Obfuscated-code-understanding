import java.util.List;
import java.util.ArrayList;

public class TrimTuples {
    public static <T> String trimTuple(List<List<T>> testList, int K) {
        List<List<T>> res = new ArrayList<>();
        for (List<T> ele : testList) {
            int N = ele.size();
            res.add(new ArrayList<>(ele.subList(K, N - K)));
        }
        return res.toString();
    }
}
