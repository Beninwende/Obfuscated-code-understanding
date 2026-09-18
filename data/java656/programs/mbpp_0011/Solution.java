public class Solution {
    public static String removeOcc(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                s = s.substring(0, i) + s.substring(i + 1);
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ch) {
                s = s.substring(0, i) + s.substring(i + 1);
                break;
            }
        }
        return s;
    }
}
