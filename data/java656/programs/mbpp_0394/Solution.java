import java.util.HashSet;
import java.util.Set;

public class DistinctChecker {
    public static <T> boolean checkDistinct(T[] testArr) {
        Set<T> temp = new HashSet<>();
        for (T ele : testArr) {
            if (!temp.add(ele)) {
                return false;
            }
        }
        return true;
    }
}
