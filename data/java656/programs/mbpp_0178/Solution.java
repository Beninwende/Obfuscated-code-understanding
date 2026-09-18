import java.util.List;
import java.util.regex.Pattern;

public class StringSearcher {
    public static String stringLiterals(List<String> patterns, String text) {
        for (String pattern : patterns) {
            if (Pattern.compile(pattern).matcher(text).find()) {
                return "Matched!";
            } else {
                return "Not Matched!";
            }
        }
        return "Not Matched!";
    }
}
