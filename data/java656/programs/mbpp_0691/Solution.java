import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class Main {
    public static <K, V extends Comparable<? super V>> Map<V, List<K>> groupElement(List<SimpleEntry<K, V>> testList) {
        Map<V, List<K>> res = new LinkedHashMap<>();
        List<SimpleEntry<K, V>> sortedList = new ArrayList<>(testList);
        sortedList.sort(Comparator.comparing(SimpleEntry::getValue));
        for (SimpleEntry<K, V> entry : sortedList) {
            res.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        return res;
    }
}
