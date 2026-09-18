import java.util.*;

public class PatternChecker {
    public static boolean isSamePatterns(String[] colors, String[] patterns) {
        if (colors.length != patterns.length) {
            return false;
        }
        Map<String, List<String>> sdict = new HashMap<>();
        Set<String> pset = new HashSet<>();
        Set<String> sset = new HashSet<>();
        for (int i = 0; i < patterns.length; i++) {
            pset.add(patterns[i]);
            sset.add(colors[i]);
            sdict.computeIfAbsent(patterns[i], k -> new ArrayList<>()).add(colors[i]);
        }
        if (pset.size() != sset.size()) {
            return false;
        }
        for (List<String> values : sdict.values()) {
            for (int i = 0; i < values.size() - 1; i++) {
                if (!values.get(i).equals(values.get(i + 1))) {
                    return false;
                }
            }
        }
        return true;
    }
}
