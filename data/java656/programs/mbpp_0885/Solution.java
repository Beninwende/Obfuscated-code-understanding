import java.util.*;

public class Isomorphic {
    public static boolean isIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, List<Integer>> dict1 = new HashMap<>();
        Map<Character, List<Integer>> dict2 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            dict1.computeIfAbsent(c, k -> new ArrayList<>()).add(i);
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            dict2.computeIfAbsent(c, k -> new ArrayList<>()).add(i);
        }
        List<List<Integer>> values1 = new ArrayList<>(dict1.values());
        List<List<Integer>> values2 = new ArrayList<>(dict2.values());
        Comparator<List<Integer>> lexComparator = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> a, List<Integer> b) {
                int n = Math.min(a.size(), b.size());
                for (int i = 0; i < n; i++) {
                    int cmp = Integer.compare(a.get(i), b.get(i));
                    if (cmp != 0) {
                        return cmp;
                    }
                }
                return Integer.compare(a.size(), b.size());
            }
        };
        Collections.sort(values1, lexComparator);
        Collections.sort(values2, lexComparator);
        return values1.equals(values2);
    }
}
