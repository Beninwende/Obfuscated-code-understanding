import java.util.List;
import java.util.ArrayList;

public class Extractor {
    public static <T> List<T> extract(List<List<T>> lst) {
        List<T> result = new ArrayList<>();
        for (List<T> item : lst) {
            result.add(item.get(0));
        }
        return result;
    }
}
