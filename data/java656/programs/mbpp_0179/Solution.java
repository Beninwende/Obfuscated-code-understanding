import java.util.List;
import java.util.ArrayList;

public class KeithNumberChecker {
    public static boolean isNumKeith(int x) {
        List<Integer> terms = new ArrayList<>();
        String s = Integer.toString(x);
        int n = s.length();
        for (char c : s.toCharArray()) {
            terms.add(Character.getNumericValue(c));
        }
        int nextTerm = 0;
        int i = n;
        while (nextTerm < x) {
            nextTerm = 0;
            for (int j = i - n; j < i; j++) {
                nextTerm += terms.get(j);
            }
            terms.add(nextTerm);
            i++;
        }
        return nextTerm == x;
    }
}
