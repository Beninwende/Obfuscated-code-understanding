import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static String replaceMaxSpecialchar(String text, int n) {
        Pattern pattern = Pattern.compile("[ ,\\.]");
        Matcher matcher = pattern.matcher(text);
        StringBuffer result = new StringBuffer();
        int count = 0;
        while (matcher.find() && count < n) {
            matcher.appendReplacement(result, ":");
            count++;
        }
        matcher.appendTail(result);
        return result.toString();
    }
}
