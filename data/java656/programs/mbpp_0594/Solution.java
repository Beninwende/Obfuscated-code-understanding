import java.util.List;

public class DiffEvenOdd {
    public static int diffEvenOdd(List<Integer> list1) {
        int firstEven = -1;
        for (int el : list1) {
            if (el % 2 == 0) {
                firstEven = el;
                break;
            }
        }
        int firstOdd = -1;
        for (int el : list1) {
            if (el % 2 != 0) {
                firstOdd = el;
                break;
            }
        }
        return firstEven - firstOdd;
    }
}
