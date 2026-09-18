import java.util.List;
import java.util.ArrayList;

public class ListUtils {
    public static List<Integer> sumList(List<Integer> lst1, List<Integer> lst2) {
        List<Integer> resList = new ArrayList<>();
        for (int i = 0; i < lst1.size(); i++) {
            resList.add(lst1.get(i) + lst2.get(i));
        }
        return resList;
    }
}
