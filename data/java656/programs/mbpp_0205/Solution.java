import java.util.List;
import java.util.ArrayList;

public class Inversion {
    public static List<Integer> inversionElements(List<Integer> testTup) {
        List<Integer> res = new ArrayList<>();
        for (Integer x : testTup) {
            res.add(~x);
        }
        return res;
    }
}
