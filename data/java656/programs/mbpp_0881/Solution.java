import java.util.List;

public class Solution {
    public static int sumEvenOdd(List<Integer> list1) {
        int firstEven = -1;
        int firstOdd = -1;
        for (int el : list1) {
            if (firstEven == -1 && el % 2 == 0) {
                firstEven = el;
            }
            if (firstOdd == -1 && el % 2 != 0) {
                firstOdd = el;
            }
            if (firstEven != -1 && firstOdd != -1) {
                break;
            }
        }
        return firstEven + firstOdd;
    }
}
