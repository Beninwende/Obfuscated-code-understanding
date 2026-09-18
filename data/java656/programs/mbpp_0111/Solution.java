import java.util.*;

public class CommonElementsFinder {
    public static <T> List<T> commonInNestedLists(List<List<T>> nestedList) {
        if (nestedList == null || nestedList.isEmpty()) {
            return new ArrayList<>();
        }
        Iterator<List<T>> iterator = nestedList.iterator();
        Set<T> resultSet = new HashSet<>(iterator.next());
        while (iterator.hasNext()) {
            resultSet.retainAll(iterator.next());
        }
        return new ArrayList<>(resultSet);
    }
}
