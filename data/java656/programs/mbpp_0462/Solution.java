import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static <T> List<List<T>> combinationsList(List<T> list1) {
        if (list1.isEmpty()) {
            List<List<T>> base = new ArrayList<>();
            base.add(new ArrayList<>());
            return base;
        }
        T first = list1.get(0);
        List<T> rest = list1.subList(1, list1.size());
        List<List<T>> result = new ArrayList<>();
        for (List<T> el : combinationsList(rest)) {
            result.add(new ArrayList<>(el));
            List<T> withFirst = new ArrayList<>(el);
            withFirst.add(first);
            result.add(withFirst);
        }
        return result;
    }
}
