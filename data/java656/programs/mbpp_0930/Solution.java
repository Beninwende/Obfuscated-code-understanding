import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {
    public static String textMatch(String text) {
        Pattern pattern = Pattern.compile("ab*?");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return "Found a match!";
        } else {
            return "Not matched!";
        }
    }
}
