import java.util.List;

public class FirstOddFinder {
    public static int firstOdd(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                return num;
            }
        }
        return -1;
    }
}
