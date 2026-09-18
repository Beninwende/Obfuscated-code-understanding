import java.util.ArrayList;
import java.util.List;

public class CounterUtil {
    public static List<String> countVariable(int a, int b, int c, int d) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            result.add("p");
        }
        for (int i = 0; i < b; i++) {
            result.add("q");
        }
        for (int i = 0; i < c; i++) {
            result.add("r");
        }
        for (int i = 0; i < d; i++) {
            result.add("s");
        }
        return result;
    }
}
