import java.util.regex.*;
import java.util.*;

public class AdverbFinder {
    public static List<String> findAdverbs(String text) {
        List<String> adverbs = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\w+ly");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            adverbs.add(String.format("%d-%d: %s", matcher.start(), matcher.end(), matcher.group()));
        }
        return adverbs;
    }
}
