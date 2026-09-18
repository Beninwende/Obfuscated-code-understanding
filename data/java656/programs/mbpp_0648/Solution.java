import java.util.List;
import java.util.ArrayList;

public class ExchangeElements {
    public static <T> List<T> exchangeElements(List<T> list) {
        List<T> result = new ArrayList<>(list);
        for (int i = 0; i + 1 < result.size(); i += 2) {
            T temp = result.get(i);
            result.set(i, result.get(i + 1));
            result.set(i + 1, temp);
        }
        return result;
    }
}
