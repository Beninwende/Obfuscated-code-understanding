import java.util.regex.*;

public class TextMatcher {
    public static String textMatchWordzMiddle(String text) {
        Pattern pattern = Pattern.compile("\\Bz\\B");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return "Found a match!";
        } else {
            return "Not matched!";
        }
    }
}
