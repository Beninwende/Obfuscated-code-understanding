public class ParityChecker {
    public static boolean checkOddParity(int x) {
        int parity = 0;
        while (x != 0) {
            x &= (x - 1);
            parity++;
        }
        return parity % 2 == 1;
    }
}
