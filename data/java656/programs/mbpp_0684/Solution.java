public class Main {
    public static int countChar(String str, char x) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x) {
                count++;
            }
        }
        int n = 10;
        int repetitions = n / str.length();
        count = count * repetitions;
        int l = n % str.length();
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == x) {
                count++;
            }
        }
        return count;
    }
}
