import java.util.Collection;
import java.util.List;

public class TupleChecker {
    public static <T> boolean checkTuples(List<T> testTuple, Collection<T> K) {
        for (T ele : testTuple) {
            if (!K.contains(ele)) {
                return false;
            }
        }
        return true;
    }
}
