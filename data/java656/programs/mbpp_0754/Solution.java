import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class CommonIndexExtractor {
    public static <T> List<T> extractIndexList(List<T> l1, List<T> l2, List<T> l3) {
        List<T> result = new ArrayList<>();
        int size = Math.min(l1.size(), Math.min(l2.size(), l3.size()));
        for (int i = 0; i < size; i++) {
            T m = l1.get(i);
            T n = l2.get(i);
            T o = l3.get(i);
            if (Objects.equals(m, n) && Objects.equals(n, o)) {
                result.add(m);
            }
        }
        return result;
    }
}
