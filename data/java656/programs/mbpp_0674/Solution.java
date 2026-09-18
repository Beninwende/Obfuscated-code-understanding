import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
    public static String removeDuplicate(String input) {
        String[] words = input.split("\\s+");
        Set<String> set = new LinkedHashSet<>();
        for (String word : words) {
            set.add(word);
        }
        return String.join(" ", set);
    }
}
