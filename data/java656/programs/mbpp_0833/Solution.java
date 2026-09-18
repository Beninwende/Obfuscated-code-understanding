import java.util.*;

public class Solution {
    public static <K> List<K> getKey(Map<K, ?> dict) {
        List<K> list = new ArrayList<>();
        for (K key : dict.keySet()) {
            list.add(key);
        }
        return list;
    }
}
