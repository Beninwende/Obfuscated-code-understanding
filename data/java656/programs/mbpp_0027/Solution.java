import java.util.List;
import java.util.ArrayList;

public class Main {
    public static List<String> remove(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(s.replaceAll("\\d", ""));
        }
        return result;
    }
}
