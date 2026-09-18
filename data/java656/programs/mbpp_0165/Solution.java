public class CharacterPositionCounter {
    public static int countCharPosition(String str1) {
        int countChars = 0;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (i == c - 'A' || i == c - 'a') {
                countChars++;
            }
        }
        return countChars;
    }
}
