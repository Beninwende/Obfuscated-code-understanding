import java.util.HashMap;
import java.util.Map;

public class MaxChar {
    public static char maxChar(String str1) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : str1.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        char maxChar = '\0';
        int maxCount = -1;
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        return maxChar;
    }
}
