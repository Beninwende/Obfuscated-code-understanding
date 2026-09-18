import java.util.List;
import java.util.ArrayList;

public class RemoveWords {
    public static List<String> removeWords(List<String> list1, List<String> removeWords) {
        for (String word : new ArrayList<>(list1)) {
            if (removeWords.contains(word)) {
                list1.remove(word);
            }
        }
        return list1;
    }
}
