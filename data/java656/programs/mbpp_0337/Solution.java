import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TextMatchWord {
    public static String textMatchWord(String text) {
        Pattern pattern = Pattern.compile("\\w+\\S*$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return "Found a match!";
        } else {
            return "Not matched!";
        }
    }
}
