import java.util.Set;
import java.util.HashSet;

public class FirstRepeatedWord {
    public static String firstRepeatedWord(String str1) {
        Set<String> temp = new HashSet<>();
        for (String word : str1.split("\\s+")) {
            if (temp.contains(word)) {
                return word;
            } else {
                temp.add(word);
            }
        }
        return "None";
    }
}
