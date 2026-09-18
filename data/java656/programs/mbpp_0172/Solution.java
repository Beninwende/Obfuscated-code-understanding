public class Main {
    public static int countOccurance(String s) {
        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            if (s.charAt(i) == 's' && s.charAt(i + 1) == 't' && s.charAt(i + 2) == 'd') {
                count++;
            }
        }
        return count;
    }
}
