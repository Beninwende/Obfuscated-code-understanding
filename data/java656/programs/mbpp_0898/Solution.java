import java.util.ArrayList;
import java.util.List;

public class Extractor {
    public static List<Integer> extractElements(List<Integer> numbers, int n) {
        List<Integer> result = new ArrayList<>();
        if (numbers == null || numbers.isEmpty() || n <= 0) {
            return result;
        }
        int count = 1;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).equals(numbers.get(i - 1))) {
                count++;
            } else {
                if (count == n) {
                    result.add(numbers.get(i - 1));
                }
                count = 1;
            }
        }
        if (count == n) {
            result.add(numbers.get(numbers.size() - 1));
        }
        return result;
    }
}
