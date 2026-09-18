import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class URLValidator {
    private static final String URL_REGEX = "((http|https)://)(www\\.)?" +
            "[a-zA-Z0-9@:%._\\+~#?&//=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%._\\+~#?&//=]*)";
    private static final Pattern PATTERN = Pattern.compile(URL_REGEX);

    public static boolean isValidURL(String str) {
        if (str == null) {
            return false;
        }
        Matcher matcher = PATTERN.matcher(str);
        return matcher.find();
    }
}
