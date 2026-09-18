public class Solution {
    public static String firstRepeatedChar(String str1) {
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            String substr = str1.substring(0, i + 1);
            int count = 0;
            for (int j = 0; j < substr.length(); j++) {
                if (substr.charAt(j) == c) {
                    count++;
                }
            }
            if (count > 1) {
                return String.valueOf(c);
            }
        }
        return "None";
    }
}
