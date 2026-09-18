import java.util.List;

public class TupleConverter {
    public static double tupleToFloat(List<?> testTup) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testTup.size(); i++) {
            sb.append(testTup.get(i));
            if (i < testTup.size() - 1) {
                sb.append('.');
            }
        }
        return Double.parseDouble(sb.toString());
    }
}
