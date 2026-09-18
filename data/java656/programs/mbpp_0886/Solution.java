import java.util.List;

public class SumNum {
    public static double sumNum(List<Double> numbers) {
        double total = 0.0;
        for (Double x : numbers) {
            total += x;
        }
        return total / numbers.size();
    }
}
