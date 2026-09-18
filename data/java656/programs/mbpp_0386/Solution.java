public class Solution {
    public static int swapCount(String s) {
        int countLeft = 0;
        int countRight = 0;
        int swap = 0;
        int imbalance = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[') {
                countLeft++;
                if (imbalance > 0) {
                    swap += imbalance;
                    imbalance--;
                }
            } else if (c == ']') {
                countRight++;
                imbalance = countRight - countLeft;
            }
        }
        return swap;
    }
}
