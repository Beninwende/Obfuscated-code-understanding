import java.util.List;
import java.util.ArrayList;

public class ListUtils {
    public static <T> List<T> removeKthElement(List<T> list1, int k) {
        List<T> result = new ArrayList<>(list1);
        if (k >= 1 && k <= result.size()) {
            result.remove(k - 1);
        }
        return result;
    }
}
