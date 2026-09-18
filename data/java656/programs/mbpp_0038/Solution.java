import java.util.List;

public class Solution {
    public static double divEvenOdd(List<Integer> list1) {
        int firstEven = -1;
        int firstOdd = -1;
        for (int el : list1) {
            if (el % 2 == 0) {
                firstEven = el;
                break;
            }
        }
        for (int el : list1) {
            if (el % 2 != 0) {
                firstOdd = el;
                break;
            }
        }
        return (double) firstEven / firstOdd;
    }
}
