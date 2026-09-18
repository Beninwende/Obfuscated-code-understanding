import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FrequencyCounter {
    public static <T> Map<T, Integer> freqCount(List<T> list1) {
        Map<T, Integer> freqCount = new HashMap<>();
        for (T item : list1) {
            freqCount.put(item, freqCount.getOrDefault(item, 0) + 1);
        }
        return freqCount;
    }
}
