public class StringUtil {
    public static String capitalizeFirstLastLetters(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder result = new StringBuilder();
        String[] words = str.toLowerCase().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() == 1) {
                result.append(Character.toUpperCase(word.charAt(0)));
            } else {
                char first = Character.toUpperCase(word.charAt(0));
                String middle = word.substring(1, word.length() - 1);
                char last = Character.toUpperCase(word.charAt(word.length() - 1));
                result.append(first).append(middle).append(last);
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
