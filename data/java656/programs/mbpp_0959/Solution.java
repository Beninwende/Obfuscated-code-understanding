import java.util.List;

public class AverageCalculator {
    public static double average(List<Double> lst) {
        double sum = 0;
        for (double num : lst) {
            sum += num;
        }
        return sum / lst.size();
    }
}
