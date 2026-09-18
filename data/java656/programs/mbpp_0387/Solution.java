public class EvenOrOddHex {
    public static String evenOrOdd(String N) {
        char last = N.charAt(N.length() - 1);
        if (last == '0' || last == '2' || last == '4' || last == '6' || last == '8'
         || last == 'A' || last == 'C' || last == 'E') {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
