import java.util.regex.*;
import java.util.*;

public class Extractor {
    public static List<String> extractValues(String text) {
        List<String> values = new ArrayList<>();
        Pattern pattern = Pattern.compile("\"(.*?)\"");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            values.add(matcher.group(1));
        }
        return values;
    }
}
