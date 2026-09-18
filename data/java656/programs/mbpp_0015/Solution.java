import java.util.regex.*;
import java.util.*;

public class StringSplitter {
    public static List<String> splitLowerString(String text) {
        Pattern pattern = Pattern.compile("[a-z][^a-z]*");
        Matcher matcher = pattern.matcher(text);
        List<String> parts = new ArrayList<>();
        while (matcher.find()) {
            parts.add(matcher.group());
        }
        return parts;
    }
}
