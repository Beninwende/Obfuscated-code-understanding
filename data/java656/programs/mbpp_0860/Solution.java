public class Main {
    public static String checkAlphanumeric(String str) {
        if (str.matches(".*[A-Za-z0-9]$")) {
            return "Accept";
        } else {
            return "Discard";
        }
    }
}
