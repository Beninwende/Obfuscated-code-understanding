import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TextMatcher {
    public static String textMatchZeroOne(String text) {
        Pattern pattern = Pattern.compile("ab?");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return "Found a match!";
        } else {
            return "Not matched!";
        }
    }
}
