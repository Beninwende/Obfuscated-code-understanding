public class Solution {
    public static String reverseVowels(String str1) {
        StringBuilder vowels = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if ("aeiouAEIOU".indexOf(c) >= 0) {
                vowels.append(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if ("aeiouAEIOU".indexOf(c) >= 0) {
                result.append(vowels.charAt(vowels.length() - 1));
                vowels.deleteCharAt(vowels.length() - 1);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
