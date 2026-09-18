public class NumberCounter {
    public static int numberCtr(String str) {
        int numberCtr = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                numberCtr++;
            }
        }
        return numberCtr;
    }
}
