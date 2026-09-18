import java.util.Map;
import java.util.HashMap;

public class DictionaryUtils {
    public static <K, V extends Comparable<V>> Map<K, V> dictFilter(Map<K, V> map, V n) {
        Map<K, V> result = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().compareTo(n) >= 0) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
}
