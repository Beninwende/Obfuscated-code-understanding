public class ParityChecker {
    public static boolean checkEvenParity(int x) {
        int parity = 0;
        while (x != 0) {
            x = x & (x - 1);
            parity++;
        }
        return parity % 2 == 0;
    }
}
