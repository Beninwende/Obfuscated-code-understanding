public class Solution {
    public static int odd_Equivalent(String s, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
