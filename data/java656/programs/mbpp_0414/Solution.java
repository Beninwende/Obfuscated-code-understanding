import java.util.List;

public class OverlapChecker {
    public static int overlapping(List<?> list1, List<?> list2) {
        int c = list1.size();
        int d = list2.size();
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
