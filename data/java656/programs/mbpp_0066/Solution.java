import java.util.List;

public class PosCounter {
    public static int posCount(List<Integer> list) {
        int posCount = 0;
        for (int num : list) {
            if (num >= 0) {
                posCount++;
            }
        }
        return posCount;
    }
}
