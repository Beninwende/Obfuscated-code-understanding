import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexMatcher {
    public static String match(String text) {
        Pattern pattern = Pattern.compile("[A-Z]+[a-z]+$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
