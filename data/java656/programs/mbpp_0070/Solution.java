import java.util.List;

public class TupleUtils {
    public static int findEqualTuple(List<List<?>> input, int k) {
        int flag = 1;
        for (List<?> tuple : input) {
            if (tuple.size() != k) {
                flag = 0;
                break;
            }
        }
        return flag;
    }

    public static String getEqual(List<List<?>> input, int k) {
        if (findEqualTuple(input, k) == 1) {
            return "All tuples have same length";
        } else {
            return "All tuples do not have same length";
        }
    }
}
