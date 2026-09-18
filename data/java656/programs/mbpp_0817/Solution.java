import java.util.List;
import java.util.stream.Collectors;

public class Divisible {
    public static List<Integer> divOfNums(List<Integer> nums, int m, int n) {
        return nums.stream()
                   .filter(x -> x % m == 0 || x % n == 0)
                   .collect(Collectors.toList());
    }
}
