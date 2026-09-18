import java.util.List;

public class SublistChecker {
    public static <T> boolean isSublist(List<T> l, List<T> s) {
        if (s.isEmpty()) {
            return true;
        } else if (s.equals(l)) {
            return true;
        } else if (s.size() > l.size()) {
            return false;
        } else {
            for (int i = 0; i <= l.size() - s.size(); i++) {
                if (l.get(i).equals(s.get(0))) {
                    int n = 1;
                    while (n < s.size() && l.get(i + n).equals(s.get(n))) {
                        n++;
                    }
                    if (n == s.size()) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
