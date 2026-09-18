import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextMatch {
    public static String textMatch(String text) {
        String pattern = "ab*?";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if (m.find()) {
            return "Found a match!";
        } else {
            return "Not matched!";
        }
    }
}
