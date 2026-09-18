public class Solution {
    public static char makeFlip(char ch) {
        return ch == '0' ? '1' : '0';
    }

    public static int getFlipWithStartingCharacter(String str, char expected) {
        int flipCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != expected) {
                flipCount++;
            }
            expected = makeFlip(expected);
        }
        return flipCount;
    }

    public static int minFlipToMakeStringAlternate(String str) {
        return Math.min(
            getFlipWithStartingCharacter(str, '0'),
            getFlipWithStartingCharacter(str, '1')
        );
    }
}
