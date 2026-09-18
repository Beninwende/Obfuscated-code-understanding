import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Converter {
    public static <K, V, W> List<Map<K, Map<V, W>>> convertListDictionary(List<K> l1, List<V> l2, List<W> l3) {
        List<Map<K, Map<V, W>>> result = new ArrayList<>();
        int size = Math.min(l1.size(), Math.min(l2.size(), l3.size()));
        for (int i = 0; i < size; i++) {
            K x = l1.get(i);
            V y = l2.get(i);
            W z = l3.get(i);
            Map<V, W> inner = new HashMap<>();
            inner.put(y, z);
            Map<K, Map<V, W>> outer = new HashMap<>();
            outer.put(x, inner);
            result.add(outer);
        }
        return result;
    }
}
