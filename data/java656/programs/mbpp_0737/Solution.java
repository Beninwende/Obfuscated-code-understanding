import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CheckString {
    private static final Pattern regex = Pattern.compile("^[aeiouAEIOU][A-Za-z0-9_]*");

    public static String checkStr(String string) {
        Matcher matcher = regex.matcher(string);
        if (matcher.find()) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }
}
