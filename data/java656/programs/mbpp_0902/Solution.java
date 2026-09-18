import java.util.Map;
import java.util.HashMap;

public class DictUtils {
    public static <K> Map<K, Integer> addDict(Map<K, Integer> d1, Map<K, Integer> d2) {
        Map<K, Integer> result = new HashMap<>(d1);
        for (Map.Entry<K, Integer> entry : d2.entrySet()) {
            result.put(entry.getKey(), result.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }
        return result;
    }
}
