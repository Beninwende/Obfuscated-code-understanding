import java.util.List;

public class BooleanCounter {
    public static int count(List<Boolean> lst) {
        int sum = 0;
        for (Boolean b : lst) {
            if (b) {
                sum++;
            }
        }
        return sum;
    }
}
