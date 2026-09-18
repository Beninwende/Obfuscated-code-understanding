public class StringUtil {
    public static String removeChar(String s, char c) {
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch != c) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
