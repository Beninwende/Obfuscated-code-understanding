import java.util.List;

public class SubstringFinder {
    public static boolean findSubstring(List<String> str1, String subStr) {
        for (String s : str1) {
            if (s.contains(subStr)) {
                return true;
            }
        }
        return false;
    }
}
