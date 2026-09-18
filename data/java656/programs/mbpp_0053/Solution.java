public class StringUtils {
    public static String checkEquality(String str) {
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return "Equal";
        } else {
            return "Not Equal";
        }
    }
}
