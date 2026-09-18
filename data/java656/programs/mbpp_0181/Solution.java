public class CommonPrefix {
    public static String commonPrefixUtil(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int n1 = str1.length();
        int n2 = str2.length();
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            result.append(str1.charAt(i));
            i++;
            j++;
        }
        return result.toString();
    }

    public static String commonPrefix(String[] arr, int n) {
        if (n == 0) {
            return "";
        }
        String prefix = arr[0];
        for (int i = 1; i < n; i++) {
            prefix = commonPrefixUtil(prefix, arr[i]);
        }
        return prefix;
    }
}
