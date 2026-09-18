import java.util.Objects;

public class TupleUtils {
    public static <T> int countX(T[] tup, T x) {
        int count = 0;
        for (T ele : tup) {
            if (Objects.equals(ele, x)) {
                count++;
            }
        }
        return count;
    }
}
