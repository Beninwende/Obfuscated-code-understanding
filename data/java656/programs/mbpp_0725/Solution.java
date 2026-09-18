import java.util.regex.*;
import java.util.*;

public class ExtractQuotation {
    public static List<String> extractQuotation(String text) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("\"(.*?)\"");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            result.add(matcher.group(1));
        }
        return result;
    }
}
