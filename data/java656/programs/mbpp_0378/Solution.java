import java.util.List;
import java.util.ArrayList;

public class ListUtils {
    public static <T> List<T> moveFirst(List<T> testList) {
        if (testList == null || testList.isEmpty()) {
            return testList;
        }
        List<T> result = new ArrayList<>(testList.size());
        result.add(testList.get(testList.size() - 1));
        result.addAll(testList.subList(0, testList.size() - 1));
        return result;
    }
}
