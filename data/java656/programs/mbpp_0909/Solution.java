public class PreviousPalindrome {
    public static int previousPalindrome(int num) {
        for (int x = num - 1; x > 0; x--) {
            String s = Integer.toString(x);
            if (s.equals(new StringBuilder(s).reverse().toString())) {
                return x;
            }
        }
        return 0;
    }
}
