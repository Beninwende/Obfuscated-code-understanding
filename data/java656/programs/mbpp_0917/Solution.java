import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TextUtils {
    public static String textUppercaseLowercase(String text) {
        Pattern pattern = Pattern.compile("[A-Z]+[a-z]+$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return "Found a match!";
        } else {
            return "Not matched!";
        }
    }
}
