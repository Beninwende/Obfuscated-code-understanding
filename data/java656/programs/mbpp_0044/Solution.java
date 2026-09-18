import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TextMatcher {
    public static String textMatchString(String text) {
        Pattern patterns = Pattern.compile("^\\w+");
        Matcher matcher = patterns.matcher(text);
        if (matcher.find()) {
            return "Found a match!";
        } else {
            return "Not matched!";
        }
    }
}
