import java.util.*;

public class SecondSmallestFinder {
    public static Integer secondSmallest(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            return null;
        }
        if (numbers.size() == 2 && numbers.get(0).equals(numbers.get(1))) {
            return null;
        }
        Set<Integer> dupItems = new HashSet<>();
        List<Integer> uniqItems = new ArrayList<>();
        for (Integer x : numbers) {
            if (!dupItems.contains(x)) {
                uniqItems.add(x);
                dupItems.add(x);
            }
        }
        Collections.sort(uniqItems);
        return uniqItems.size() >= 2 ? uniqItems.get(1) : null;
    }
}
