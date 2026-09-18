public class CharacterCounter {
    public static int countCharac(String str1) {
        int total = 0;
        for (char c : str1.toCharArray()) {
            total++;
        }
        return total;
    }
}
