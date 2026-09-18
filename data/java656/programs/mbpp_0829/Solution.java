import java.util.*;

public class SecondFrequentFinder {
    public static String secondFrequent(List<String> input) {
        Map<String, Integer> freq = new HashMap<>();
        for (String s : input) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }
        List<Integer> counts = new ArrayList<>(freq.values());
        Collections.sort(counts, Collections.reverseOrder());
        if (counts.size() < 2) {
            return null;
        }
        int secondLargest = counts.get(1);
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == secondLargest) {
                return entry.getKey();
            }
        }
        return null;
    }
}
