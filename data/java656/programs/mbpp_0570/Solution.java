import java.util.List;
import java.util.ArrayList;

public class RemoveWordsUtil {
    public static List<String> removeWords(List<String> list1, List<String> charlist) {
        List<String> newList = new ArrayList<>();
        for (String line : list1) {
            String[] words = line.split("\\s+");
            List<String> keptWords = new ArrayList<>();
            for (String word : words) {
                boolean containsPhrase = false;
                for (String phrase : charlist) {
                    if (word.contains(phrase)) {
                        containsPhrase = true;
                        break;
                    }
                }
                if (!containsPhrase) {
                    keptWords.add(word);
                }
            }
            newList.add(String.join(" ", keptWords));
        }
        return newList;
    }
}
