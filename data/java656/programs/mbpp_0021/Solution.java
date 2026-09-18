import java.util.List;
import java.util.ArrayList;

public class Multiples {
    public static List<Integer> multiplesOfNum(int m, int n) {
        List<Integer> multiples = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            multiples.add(i * n);
        }
        return multiples;
    }
}
