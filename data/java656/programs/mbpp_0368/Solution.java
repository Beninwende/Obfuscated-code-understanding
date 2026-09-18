import java.util.List;
import java.util.ArrayList;

public class TupleRepeater {
    public static <T> List<List<T>> repeatTuples(List<T> testTup, int N) {
        List<List<T>> res = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            res.add(testTup);
        }
        return res;
    }
}
