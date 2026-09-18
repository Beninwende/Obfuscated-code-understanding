import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static List<String> split(String word) {
        List<String> chars = new ArrayList<>();
        for (char c : word.toCharArray()) {
            chars.add(String.valueOf(c));
        }
        return chars;
    }
}
