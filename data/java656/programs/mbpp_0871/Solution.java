public class Rotations {
    public static boolean areRotations(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        String temp = string1 + string1;
        return temp.contains(string2);
    }
}
