import java.util.Map;

public class DictionaryUtils {
    public static <K, V> boolean checkValue(Map<K, V> map, V n) {
        for (V value : map.values()) {
            if (n == null ? value != null : !n.equals(value)) {
                return false;
            }
        }
        return true;
    }
}
