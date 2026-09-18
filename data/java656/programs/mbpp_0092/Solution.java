public class UndulatingChecker {
    public static boolean isUndulating(String n) {
        if (n.length() <= 2) {
            return false;
        }
        for (int i = 2; i < n.length(); i++) {
            if (n.charAt(i - 2) != n.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
