public class Solution {
    public static String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        String[] parts = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {
            sb.append(parts[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
