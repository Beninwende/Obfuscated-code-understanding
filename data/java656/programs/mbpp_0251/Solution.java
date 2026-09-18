import java.util.List;
import java.util.ArrayList;

public class ListUtils {
    public static <T> List<T> insertElement(List<T> list, T element) {
        List<T> result = new ArrayList<>();
        for (T elt : list) {
            result.add(element);
            result.add(elt);
        }
        return result;
    }
}
