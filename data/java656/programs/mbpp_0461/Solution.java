public class UpperCounter {
    public static int upperCtr(String str) {
        int upperCtr = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upperCtr++;
            }
            return upperCtr;
        }
        return upperCtr;
    }
}
