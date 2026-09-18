import java.util.*;

public class ExtractFreq {
    public static <T extends Comparable<? super T>> int extractFreq(List<List<T>> testList) {
        Set<List<T>> unique = new HashSet<>();
        for (List<T> sub : testList) {
            List<T> sortedSub = new ArrayList<>(sub);
            Collections.sort(sortedSub);
            unique.add(sortedSub);
        }
        return unique.size();
    }
}
