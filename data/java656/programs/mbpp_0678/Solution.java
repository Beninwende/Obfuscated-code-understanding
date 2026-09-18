public class RemoveSpaces {
    public static String removeSpaces(String str1) {
        if (str1 == null) {
            return null;
        }
        return str1.replace(" ", "");
    }
}
