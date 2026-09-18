import java.util.List;
import java.util.ArrayList;

public class Concatenator {
    public static List<String> concatenateElements(List<String> testTup) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < testTup.size() - 1; i++) {
            res.add(testTup.get(i) + testTup.get(i + 1));
        }
        return res;
    }
}
