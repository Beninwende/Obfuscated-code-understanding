public class ConcatChecker {
    public static boolean checkConcat(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        if (n % m != 0) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != str2.charAt(i % m)) {
                return false;
            }
        }
        return true;
    }
}
