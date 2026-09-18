public class StringUtils {
    public static String oddValuesString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
