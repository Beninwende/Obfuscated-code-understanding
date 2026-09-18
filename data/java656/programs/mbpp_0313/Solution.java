import java.util.List;

public class PosNos {
    public static Integer posNos(List<Integer> list1) {
        for (Integer num : list1) {
            if (num >= 0) {
                return num;
            }
        }
        return null;
    }
}
