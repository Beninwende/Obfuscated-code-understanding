public class Main {
    public static String check(String string) {
        if (string.matches("[01]+")) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
