import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Integer> moveZero(List<Integer> numList) {
        int zeroCount = 0;
        for (int num : numList) {
            if (num == 0) {
                zeroCount++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int num : numList) {
            if (num != 0) {
                result.add(num);
            }
        }
        for (int i = 0; i < zeroCount; i++) {
            result.add(0);
        }
        return result;
    }
}
