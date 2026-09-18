import java.util.List;
import java.util.ArrayList;

public class Interleaver {
    public static <T> List<T> interleaveLists(List<T> list1, List<T> list2, List<T> list3) {
        int size = list1.size();
        List<T> result = new ArrayList<>(size * 3);
        for (int i = 0; i < size; i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
            result.add(list3.get(i));
        }
        return result;
    }
}
