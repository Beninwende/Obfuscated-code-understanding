import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class Solution {
    public static <K, V> Map<V, Integer> getUnique(List<SimpleEntry<K, V>> testList) {
        Map<V, Set<K>> temp = new HashMap<>();
        for (SimpleEntry<K, V> entry : testList) {
            V value = entry.getValue();
            K key = entry.getKey();
            temp.computeIfAbsent(value, k -> new HashSet<>()).add(key);
        }
        Map<V, Integer> result = new HashMap<>();
        for (Map.Entry<V, Set<K>> e : temp.entrySet()) {
            result.put(e.getKey(), e.getValue().size());
        }
        return result;
    }
}
