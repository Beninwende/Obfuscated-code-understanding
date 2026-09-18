import java.util.*;

public class UniqueChecker {
    public static <T> boolean allUnique(List<T> testList) {
        if (testList.size() > new HashSet<>(testList).size()) {
            return false;
        }
        return true;
    }
}
