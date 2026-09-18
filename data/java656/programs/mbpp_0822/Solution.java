public class PasswordValidator {
    public static boolean passValidity(String p) {
        if (p.length() < 6 || p.length() > 12) {
            return false;
        }
        if (!p.matches(".*[a-z].*")) {
            return false;
        }
        if (!p.matches(".*[0-9].*")) {
            return false;
        }
        if (!p.matches(".*[A-Z].*")) {
            return false;
        }
        if (!p.matches(".*[$#@].*")) {
            return false;
        }
        if (p.matches(".*\\s.*")) {
            return false;
        }
        return true;
    }
}
