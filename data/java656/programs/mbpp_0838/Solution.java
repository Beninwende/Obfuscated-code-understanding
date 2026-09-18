public class Solution {
    public static int minSwaps(String s1, String s2) {
        int c0 = 0;
        int c1 = 0;
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if (a == '0' && b == '1') {
                c0++;
            } else if (a == '1' && b == '0') {
                c1++;
            }
        }
        int result = c0 / 2 + c1 / 2;
        if (c0 % 2 == 0 && c1 % 2 == 0) {
            return result;
        } else if ((c0 + c1) % 2 == 0) {
            return result + 2;
        } else {
            return -1;
        }
    }
}
