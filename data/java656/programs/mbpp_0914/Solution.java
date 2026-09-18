public class AlternatingStringChecker {
    public static boolean isTwoAlter(String s) {
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) != s.charAt(i + 2)) {
                return false;
            }
        }
        if (s.charAt(0) == s.charAt(1)) {
            return false;
        }
        return true;
    }
}
