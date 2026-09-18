import java.util.*;

public class TupleSorter {
    private static int countDigs(List<?> tup) {
        int sum = 0;
        for (Object ele : tup) {
            sum += ele.toString().length();
        }
        return sum;
    }

    public static String sortList(List<List<?>> testList) {
        testList.sort(Comparator.comparingInt(TupleSorter::countDigs));
        return testList.toString();
    }
}
