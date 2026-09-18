import java.util.*;

public class MostOccurrences {
    public static String mostOccurrences(List<String> testList) {
        Map<String, Integer> temp = new HashMap<>();
        for (String sub : testList) {
            for (String word : sub.split("\\s+")) {
                temp.put(word, temp.getOrDefault(word, 0) + 1);
            }
        }
        return Collections.max(temp.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
