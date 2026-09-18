import java.util.regex.Pattern;

public class TextMatcher {
    public static String textMatch(String text) {
        String pattern = "^[a-z]+_[a-z]+$";
        if (Pattern.matches(pattern, text)) {
            return "Found a match!";
        } else {
            return "Not matched!";
        }
    }
}
