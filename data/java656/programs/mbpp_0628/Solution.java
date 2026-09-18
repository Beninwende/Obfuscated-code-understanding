public class Solution {
    public static String replaceSpaces(String s) {
        final int MAX = 1000;
        s = s.trim();
        int i = s.length();
        int spaceCount = 0;
        for (int k = 0; k < i; k++) {
            if (s.charAt(k) == ' ') {
                spaceCount++;
            }
        }
        int newLength = i + spaceCount * 2;
        if (newLength > MAX) {
            return "-1";
        }
        char[] chars = new char[newLength];
        for (int k = 0; k < i; k++) {
            chars[k] = s.charAt(k);
        }
        for (int f = i; f < newLength; f++) {
            chars[f] = '0';
        }
        int index = newLength - 1;
        for (int j = i - 1; j > 0; j--) {
            if (chars[j] == ' ') {
                chars[index] = '0';
                chars[index - 1] = '2';
                chars[index - 2] = '%';
                index -= 3;
            } else {
                chars[index] = chars[j];
                index--;
            }
        }
        return new String(chars);
    }
}
