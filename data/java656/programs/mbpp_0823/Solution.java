import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringChecker {
    public static String checkSubstring(String string, String sample) {
        if (string.contains(sample)) {
            Pattern pattern = Pattern.compile("\\A" + sample);
            Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
                return "string starts with the given substring";
            } else {
                return "string doesnt start with the given substring";
            }
        } else {
            return "entered string isnt a substring";
        }
    }
}
