import java.util.List;
import java.util.ArrayList;

public class DuplicateRemover {
    public static List<String> removeDuplicList(List<String> l) {
        List<String> temp = new ArrayList<>();
        for (String x : l) {
            if (!temp.contains(x)) {
                temp.add(x);
            }
        }
        return temp;
    }
}
