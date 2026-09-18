public class Solution {
    public int lengthOfLastWord(String a) {
        int l = 0;
        String x = a.trim();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ') {
                l = 0;
            } else {
                l++;
            }
        }
        return l;
    }
}
