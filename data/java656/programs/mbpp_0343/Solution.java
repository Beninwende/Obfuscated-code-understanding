public class StringUtils {
    public static int[] digLet(String s) {
        int l = 0;
        int d = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                d++;
            } else if (Character.isLetter(c)) {
                l++;
            }
        }
        return new int[]{l, d};
    }
}
