import java.util.List;
import java.util.ArrayList;

public class TupleConverter {
    public static List<int[]> tupleIntStr(List<String[]> tupleStr) {
        List<int[]> result = new ArrayList<>();
        for (String[] x : tupleStr) {
            result.add(new int[] { Integer.parseInt(x[0]), Integer.parseInt(x[1]) });
        }
        return result;
    }
}
