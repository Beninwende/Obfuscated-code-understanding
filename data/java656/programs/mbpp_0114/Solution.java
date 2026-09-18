import java.util.*;

public class Solution {
    public static String assignFreq(List<List<Integer>> testList) {
        Map<List<Integer>, Integer> freq = new LinkedHashMap<>();
        for (List<Integer> tup : testList) {
            freq.put(tup, freq.getOrDefault(tup, 0) + 1);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (Map.Entry<List<Integer>, Integer> entry : freq.entrySet()) {
            List<Integer> newTup = new ArrayList<>(entry.getKey());
            newTup.add(entry.getValue());
            res.add(newTup);
        }
        return res.toString();
    }
}
