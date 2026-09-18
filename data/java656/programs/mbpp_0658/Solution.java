import java.util.List;
import java.util.Collections;

public class MaxOccurrences {
    public static <T> T maxOccurrences(List<T> list) {
        int maxVal = 0;
        T result = list.get(0);
        for (T item : list) {
            int occu = Collections.frequency(list, item);
            if (occu > maxVal) {
                maxVal = occu;
                result = item;
            }
        }
        return result;
    }
}
