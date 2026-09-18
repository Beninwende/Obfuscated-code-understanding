import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FrequencyCounter {
    public static Map<Integer, Integer> frequencyLists(List<List<Integer>> list1) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (List<Integer> sublist : list1) {
            for (Integer num : sublist) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
        }
        return freqMap;
    }
}
