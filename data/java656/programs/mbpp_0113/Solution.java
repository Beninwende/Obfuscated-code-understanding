public class IntegerChecker {
    public static Boolean checkInteger(String text) {
        text = text.trim();
        if (text.length() < 1) {
            return null;
        }
        int start = 0;
        char first = text.charAt(0);
        if (first == '+' || first == '-') {
            if (text.length() == 1) {
                return false;
            }
            start = 1;
        }
        for (int i = start; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
