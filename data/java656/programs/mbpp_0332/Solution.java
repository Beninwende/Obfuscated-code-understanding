import java.util.Map;
import java.util.HashMap;

public class FrequencyCounter {
    public static Map<Character, Integer> charFrequency(String str1) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            if (freqMap.containsKey(c)) {
                freqMap.put(c, freqMap.get(c) + 1);
            } else {
                freqMap.put(c, 1);
            }
        }
        return freqMap;
    }
}
