import java.util.List;

public class NegCounter {
    public static int negCount(List<Integer> list) {
        int negCount = 0;
        for (int num : list) {
            if (num <= 0) {
                negCount++;
            }
        }
        return negCount;
    }
}
