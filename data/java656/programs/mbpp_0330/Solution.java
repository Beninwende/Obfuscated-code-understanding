import java.util.regex.*;
import java.util.*;

public class WordFinder {
    public static List<String> findChar(String text) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\w{3,5}\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }
}
