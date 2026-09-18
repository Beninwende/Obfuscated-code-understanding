public class Main {
    public static String removeOdd(String str1) {
        StringBuilder str2 = new StringBuilder();
        for (int i = 1; i <= str1.length(); i++) {
            if (i % 2 == 0) {
                str2.append(str1.charAt(i - 1));
            }
        }
        return str2.toString();
    }
}
