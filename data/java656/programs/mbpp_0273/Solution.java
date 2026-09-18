import java.util.List;
import java.util.ArrayList;

public class TupleUtils {
    public static List<Integer> subtractElements(List<Integer> list1, List<Integer> list2) {
        int size = Math.min(list1.size(), list2.size());
        List<Integer> result = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            result.add(list1.get(i) - list2.get(i));
        }
        return result;
    }
}
