public class CheckK {
    public static <T> boolean checkK(T[] testTup, T K) {
        for (T ele : testTup) {
            if (ele.equals(K)) {
                return true;
            }
        }
        return false;
    }
}
