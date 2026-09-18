public class WordChecker {
    public static boolean isWordPresent(String sentence, String word) {
        String[] words = sentence.split(" ");
        for (String w : words) {
            if (w.equals(word)) {
                return true;
            }
        }
        return false;
    }
}
