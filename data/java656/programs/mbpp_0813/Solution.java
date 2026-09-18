public class StringUtils {
    public static int stringLength(String str1) {
        int count = 0;
        for (char c : str1.toCharArray()) {
            count++;
        }
        return count;
    }
}
