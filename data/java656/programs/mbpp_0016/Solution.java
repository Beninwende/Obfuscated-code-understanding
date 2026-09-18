import java.util.regex.Pattern;

public class TextUtils {
    public static String textLowercaseUnderscore(String text) {
        Pattern pattern = Pattern.compile("^[a-z]+_[a-z]+$");
        if (pattern.matcher(text).matches()) {
            return "Found a match!";
        } else {
            return "Not matched!";
        }
    }
}
