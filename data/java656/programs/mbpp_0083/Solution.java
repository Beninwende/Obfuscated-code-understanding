public class Solution {
    public static char getChar(String strr) {
        int sum = 0;
        for (int i = 0; i < strr.length(); i++) {
            sum += strr.charAt(i) - 'a' + 1;
        }
        int rem = sum % 26;
        if (rem == 0) {
            return 'z';
        } else {
            return (char) ('a' + rem - 1);
        }
    }
}
