import java.util.List;
import java.util.ArrayList;

public class StringUtils {
    public static List<String> reverseStringList(List<String> stringList) {
        List<String> result = new ArrayList<>();
        for (String s : stringList) {
            result.add(new StringBuilder(s).reverse().toString());
        }
        return result;
    }
}
