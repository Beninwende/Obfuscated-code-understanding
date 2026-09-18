import java.util.List;

public class Solution {
    public static String countReversePairs(List<String> testList) {
        int res = 0;
        for (int i = 0; i < testList.size(); i++) {
            String original = testList.get(i);
            String reversed = new StringBuilder(original).reverse().toString();
            for (int j = i; j < testList.size(); j++) {
                if (testList.get(j).equals(reversed)) {
                    res++;
                }
            }
        }
        return Integer.toString(res);
    }
}
