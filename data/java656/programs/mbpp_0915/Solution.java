import java.util.*;
import java.util.stream.*;

public class Rearranger {
    public static List<Integer> rearrangeNumbs(List<Integer> arrayNums) {
        return arrayNums.stream()
                        .sorted(Comparator.comparingDouble(i -> i == 0 ? 0.0 : -1.0 / i))
                        .collect(Collectors.toList());
    }
}
