import java.util.Set;
import java.util.HashSet;

public class DuplicateChecker {
    public static boolean testDuplicate(int[] arraynums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : arraynums) {
            numsSet.add(num);
        }
        return arraynums.length != numsSet.size();
    }
}
