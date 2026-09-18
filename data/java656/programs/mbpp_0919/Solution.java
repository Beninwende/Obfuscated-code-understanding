import java.util.List;

public class Utils {
    public static int multiplyList(List<Integer> items) {
        int tot = 1;
        for (int x : items) {
            tot *= x;
        }
        return tot;
    }
}
