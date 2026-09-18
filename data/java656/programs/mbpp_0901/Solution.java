import java.util.ArrayList;
import java.util.List;

public class SmallestMultiple {
    public static long smallestMultiple(int n) {
        if (n <= 2) {
            return n;
        }
        long i = n * 2L;
        List<Integer> factors = new ArrayList<>();
        for (int number = n; number > 1; number--) {
            if (number * 2 > n) {
                factors.add(number);
            }
        }
        while (true) {
            for (int idx = 0; idx < factors.size(); idx++) {
                int a = factors.get(idx);
                if (i % a != 0) {
                    i += n;
                    break;
                }
                if (idx == factors.size() - 1) {
                    return i;
                }
            }
        }
    }
}
