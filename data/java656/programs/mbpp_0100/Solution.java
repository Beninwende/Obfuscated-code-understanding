public class NextPalindrome {
    public static long nextSmallestPalindrome(long num) {
        for (long i = num + 1; i < Long.MAX_VALUE; i++) {
            String s = Long.toString(i);
            if (s.equals(new StringBuilder(s).reverse().toString())) {
                return i;
            }
        }
        return -1;
    }
}
