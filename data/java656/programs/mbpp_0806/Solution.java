public class Solution {
    public static int maxRunUppercase(String testStr) {
        int cnt = 0;
        int res = 0;
        for (int idx = 0; idx < testStr.length(); idx++) {
            if (Character.isUpperCase(testStr.charAt(idx))) {
                cnt++;
            } else {
                res = cnt;
                cnt = 0;
            }
        }
        if (Character.isUpperCase(testStr.charAt(testStr.length() - 1))) {
            res = cnt;
        }
        return res;
    }
}
