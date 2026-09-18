import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class TupleConverter {
    public static Map<Object, Object> tupleToDict(List<Object> testTup) {
        Map<Object, Object> res = new HashMap<>();
        for (int i = 0; i < testTup.size(); i += 2) {
            res.put(testTup.get(i), testTup.get(i + 1));
        }
        return res;
    }
}
