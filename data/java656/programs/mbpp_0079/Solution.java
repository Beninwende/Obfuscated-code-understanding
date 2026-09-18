public class WordLenChecker {
    public static boolean wordLen(String s) {
        String[] words = s.split(" ");
        for (String word : words) {
            if (word.length() % 2 != 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
