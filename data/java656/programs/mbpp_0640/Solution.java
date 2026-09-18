import java.util.List;

public class Utils {
    public static String removeParenthesis(List<String> items) {
        for (String item : items) {
            return item.replaceAll(" ?\\([^)]+\\)", "");
        }
        return null;
    }
}
