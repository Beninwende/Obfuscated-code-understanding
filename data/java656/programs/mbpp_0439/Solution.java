import java.util.List;

public class Converter {
    public static int multipleToSingle(List<Integer> L) {
        StringBuilder sb = new StringBuilder();
        for (int num : L) {
            sb.append(num);
        }
        return Integer.parseInt(sb.toString());
    }
}
