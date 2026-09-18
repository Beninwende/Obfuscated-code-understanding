import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSpaces {
    public static String replaceSpaces(String text) {
        Pattern pattern = Pattern.compile("[ _]");
        Matcher matcher = pattern.matcher(text);
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            if (" ".equals(matcher.group())) {
                matcher.appendReplacement(buffer, "_");
            } else {
                matcher.appendReplacement(buffer, " ");
            }
        }
        matcher.appendTail(buffer);
        return buffer.toString();
    }
}
