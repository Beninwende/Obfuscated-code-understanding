import java.util.List;
import java.util.regex.Pattern;

public class RegexUtils {
    public static String checkLiterals(String text, List<String> patterns) {
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
