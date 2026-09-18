import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexChecker {
    private static final Pattern PATTERN = Pattern.compile("^[a-z]$|^([a-z]).*\\1$");

    public static String checkChar(String input) {
        Matcher matcher = PATTERN.matcher(input);
        if (matcher.matches()) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }
}
