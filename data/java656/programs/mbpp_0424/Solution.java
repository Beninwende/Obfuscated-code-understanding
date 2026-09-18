import java.util.List;
import java.util.ArrayList;

public class StringUtils {
    public static List<Character> extractRear(List<String> testList) {
        List<Character> res = new ArrayList<>();
        for (String s : testList) {
            res.add(s.charAt(s.length() - 1));
        }
        return res;
    }
}
