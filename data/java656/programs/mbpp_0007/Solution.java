import java.util.regex.*;
import java.util.List;
import java.util.ArrayList;

public class RegexUtils {
    public static List<String> findCharLong(String text) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\w{4,}\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }
}
