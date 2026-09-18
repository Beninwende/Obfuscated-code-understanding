import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexMatcher {
    public static String textMatch(String text) {
        Pattern pattern = Pattern.compile("a.*?b$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return "Found a match!";
        } else {
            return "Not matched!";
        }
    }
}
