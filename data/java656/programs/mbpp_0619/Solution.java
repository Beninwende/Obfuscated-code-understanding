public class Solution {
    public static String moveNum(String testStr) {
        StringBuilder res = new StringBuilder();
        StringBuilder dig = new StringBuilder();
        for (char c : testStr.toCharArray()) {
            if (Character.isDigit(c)) {
                dig.append(c);
            } else {
                res.append(c);
            }
        }
        res.append(dig);
        return res.toString();
    }
}
