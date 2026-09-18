import java.util.List;

public class Utils {
    public static <T> List<List<T>> removeColumn(List<List<T>> list1, int n) {
        for (List<T> row : list1) {
            row.remove(n);
        }
        return list1;
    }
}
