import java.util.List;
import java.util.ArrayList;

public class Utils {
    public static <T> List<T> removeElements(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        for (T x : list1) {
            if (!list2.contains(x)) {
                result.add(x);
            }
        }
        return result;
    }
}
