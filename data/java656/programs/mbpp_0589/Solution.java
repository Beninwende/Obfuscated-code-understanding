import java.util.List;
import java.util.ArrayList;

public class PerfectSquares {
    public static List<Integer> perfectSquares(int a, int b) {
        List<Integer> list = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            int j = 1;
            while (j * j <= i) {
                if (j * j == i) {
                    list.add(i);
                }
                j++;
            }
        }
        return list;
    }
}
