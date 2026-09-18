import java.util.regex.*;

public class TextMatcher {
    public static String textMatchTwoThree(String text) {
        Pattern pattern = Pattern.compile("ab{2,3}");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return "Found a match!";
        } else {
            return "Not matched!";
        }
    }
}
