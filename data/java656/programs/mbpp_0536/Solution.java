import java.util.List;
import java.util.ArrayList;

public class Utils {
    public static <T> List<T> nthItems(List<T> list, int n) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i += n) {
            result.add(list.get(i));
        }
        return result;
    }
}
