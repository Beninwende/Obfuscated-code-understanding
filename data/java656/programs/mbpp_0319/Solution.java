import java.util.regex.*;
import java.util.*;

public class StringUtil {
    public static List<String> findLongWord(String text) {
        List<String> words = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b\\w{5}\\b").matcher(text);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }
}
