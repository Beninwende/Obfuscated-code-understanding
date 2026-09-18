import java.util.regex.*;

public class TextMatcher {
    public static String textStartAEndB(String text) {
        Pattern pattern = Pattern.compile("a.*?b$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return "Found a match!";
        } else {
            return "Not matched!";
        }
    }
}
