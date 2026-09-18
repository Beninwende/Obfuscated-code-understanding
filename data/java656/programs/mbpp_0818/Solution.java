public class LowerCounter {
    public static int lowerCtr(String str) {
        int lowerCtr = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                lowerCtr++;
            }
        }
        return lowerCtr;
    }
}
