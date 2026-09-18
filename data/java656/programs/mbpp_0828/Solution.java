public class Counter {
    public static int[] countAlphaDigSpl(String string) {
        int alphabets = 0, digits = 0, special = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isLetter(c)) {
                alphabets++;
            } else if (Character.isDigit(c)) {
                digits++;
            } else {
                special++;
            }
        }
        return new int[] { alphabets, digits, special };
    }
}
