public class RomanConverter {
    public static String intToRoman(int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] syb = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        int i = 0;
        while (num > 0) {
            while (num >= val[i]) {
                roman.append(syb[i]);
                num -= val[i];
            }
            i++;
        }
        return roman.toString();
    }
}
