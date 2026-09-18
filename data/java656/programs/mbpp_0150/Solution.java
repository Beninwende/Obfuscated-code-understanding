public class SequenceUtils {
    public static boolean doesContainB(int a, int b, int c) {
        if (a == b) {
            return true;
        }
        if ((long)(b - a) * c > 0 && (b - a) % c == 0) {
            return true;
        }
        return false;
    }
}
