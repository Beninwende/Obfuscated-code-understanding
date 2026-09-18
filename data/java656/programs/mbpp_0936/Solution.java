import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.AbstractMap;

public class Main {
    public static <K, V> List<AbstractMap.SimpleEntry<K, V>> reArrangeTuples(
            List<AbstractMap.SimpleEntry<K, V>> testList, List<K> ordList) {
        Map<K, V> temp = new HashMap<>();
        for (AbstractMap.SimpleEntry<K, V> entry : testList) {
            temp.put(entry.getKey(), entry.getValue());
        }
        List<AbstractMap.SimpleEntry<K, V>> res = new ArrayList<>();
        for (K key : ordList) {
            if (temp.containsKey(key)) {
                res.add(new AbstractMap.SimpleEntry<>(key, temp.get(key)));
            }
        }
        return res;
    }
}
