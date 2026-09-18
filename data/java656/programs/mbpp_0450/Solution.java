import java.util.List;
import java.util.ArrayList;

public class StringExtractor {
    public static List<String> extractString(List<String> strings, int length) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (s.length() == length) {
                result.add(s);
            }
        }
        return result;
    }
}
