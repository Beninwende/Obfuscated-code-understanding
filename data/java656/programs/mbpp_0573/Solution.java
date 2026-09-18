import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class UniqueProduct {
    public static long uniqueProduct(List<Integer> listData) {
        Set<Integer> temp = new HashSet<>(listData);
        long product = 1;
        for (int num : temp) {
            product *= num;
        }
        return product;
    }
}
