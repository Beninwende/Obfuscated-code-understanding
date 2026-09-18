import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortedDictUtil {
    public static <K, V extends Comparable<? super V>> Map<K, List<V>> sortedDict(Map<K, List<V>> dict1) {
        Map<K, List<V>> sortedDict = new HashMap<>();
        for (Map.Entry<K, List<V>> entry : dict1.entrySet()) {
            List<V> list = new ArrayList<>(entry.getValue());
            Collections.sort(list);
            sortedDict.put(entry.getKey(), list);
        }
        return sortedDict;
    }
}
