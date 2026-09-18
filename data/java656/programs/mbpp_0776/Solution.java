public class Solution {
    public static int countVowels(String testStr) {
        int res = 0;
        String vowels = "aeiou";
        int n = testStr.length();
        for (int i = 1; i < n - 1; i++) {
            char c = testStr.charAt(i);
            if (vowels.indexOf(c) == -1) {
                char prev = testStr.charAt(i - 1);
                char next = testStr.charAt(i + 1);
                if (vowels.indexOf(prev) != -1 || vowels.indexOf(next) != -1) {
                    res++;
                }
            }
        }
        if (n > 1) {
            if (vowels.indexOf(testStr.charAt(0)) == -1 && vowels.indexOf(testStr.charAt(1)) != -1) {
                res++;
            }
            if (vowels.indexOf(testStr.charAt(n - 1)) == -1 && vowels.indexOf(testStr.charAt(n - 2)) != -1) {
                res++;
            }
        }
        return res;
    }
}
