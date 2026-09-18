import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplitter {
    public static List<String> splitUpperString(String text) {
        List<String> result = new ArrayList<>();
        Matcher matcher = Pattern.compile("[A-Z][^A-Z]*").matcher(text);
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }
}
