public class MaxOccurringChar {
    public static char getMaxOccurringChar(String str) {
        int ASCII_SIZE = 256;
        int[] ctr = new int[ASCII_SIZE];
        int max = -1;
        char ch = '\0';
        for (int i = 0; i < str.length(); i++) {
            ctr[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (max < ctr[str.charAt(i)]) {
                max = ctr[str.charAt(i)];
                ch = str.charAt(i);
            }
        }
        return ch;
    }
}
