import java.util.List;

public class MathUtils {
    public static double multiplyNum(List<Double> numbers) {
        double total = 1;
        for (double x : numbers) {
            total *= x;
        }
        return total / numbers.size();
    }
}
