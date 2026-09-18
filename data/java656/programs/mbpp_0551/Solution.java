import java.util.List;
import java.util.ArrayList;

public class Extractor {
    public static <T> List<T> extractColumn(List<List<T>> list1, int n) {
        List<T> result = new ArrayList<>();
        for (List<T> row : list1) {
            result.add(row.remove(n));
        }
        return result;
    }
}
