public class VowelCounter {
    public static int CheckVow(String string, String vowels) {
        int count = 0;
        for (char c : string.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
