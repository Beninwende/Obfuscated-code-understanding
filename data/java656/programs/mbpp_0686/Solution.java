import java.util.*;

public class FrequencyCounter {
    public static <T> String freqElement(List<T> testList) {
        Map<T, Integer> res = new HashMap<>();
        for (T ele : testList) {
            res.put(ele, res.getOrDefault(ele, 0) + 1);
        }
        return res.toString();
    }
}
