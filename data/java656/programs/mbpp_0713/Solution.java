public class Main {
    public static boolean checkValid(boolean[] testTup) {
        for (boolean ele : testTup) {
            if (!ele) {
                return false;
            }
        }
        return true;
    }
}
