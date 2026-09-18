public class StringChecker {
    public static boolean checkString(String s) {
        boolean hasLetter = false;
        boolean hasDigit = false;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        return hasLetter && hasDigit;
    }
}
