import java.util.List;

public class SumUtils {
    public static int sumColumn(List<List<Integer>> list1, int C) {
        int result = 0;
        for (List<Integer> row : list1) {
            result += row.get(C);
        }
        return result;
    }
}
