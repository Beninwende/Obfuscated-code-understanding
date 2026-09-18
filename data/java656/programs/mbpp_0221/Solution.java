import java.util.List;

public class FirstEvenFinder {
    public static int firstEven(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 == 0) {
                return num;
            }
        }
        return -1;
    }
}
