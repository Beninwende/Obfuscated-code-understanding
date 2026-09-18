public class RemoveSplChar {
    public static String removeSplchar(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("[\\W_]+", "");
    }
}
