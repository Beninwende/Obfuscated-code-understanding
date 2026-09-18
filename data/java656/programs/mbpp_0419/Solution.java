import java.util.List;

public class Main {
    public static long roundAndSum(List<Double> list1) {
        int length = list1.size();
        long total = 0;
        for (double num : list1) {
            total += Math.round(num);
        }
        return total * length;
    }
}
