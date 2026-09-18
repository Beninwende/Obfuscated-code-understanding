import java.util.regex.*;
import java.util.*;

public class SplitList {
    public static List<String> splitList(String text) {
        List<String> parts = new ArrayList<>();
        Matcher matcher = Pattern.compile("[A-Z][^A-Z]*").matcher(text);
        while (matcher.find()) {
            parts.add(matcher.group());
        }
        return parts;
    }
}
