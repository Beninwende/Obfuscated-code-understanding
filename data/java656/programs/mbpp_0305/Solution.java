import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordMatcher {
    private static final Pattern PATTERN = Pattern.compile("(P\\w+)\\W(P\\w+)");

    public static String[] startWithP(List<String> words) {
        for (String w : words) {
            Matcher m = PATTERN.matcher(w);
            if (m.lookingAt()) {
                return new String[] { m.group(1), m.group(2) };
            }
        }
        return null;
    }
}
