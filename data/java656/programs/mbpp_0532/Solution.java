import java.util.Arrays;

public class PermutationChecker {
    public static boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] a = str1.toCharArray();
        Arrays.sort(a);
        char[] b = str2.toCharArray();
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
