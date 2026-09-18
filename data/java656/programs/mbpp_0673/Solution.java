import java.util.List;

public class Converter {
    public static int convert(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i);
        }
        return Integer.parseInt(sb.toString());
    }
}
