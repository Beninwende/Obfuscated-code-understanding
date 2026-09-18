import java.util.List;

public class MaxLengthFinder {
    public static int findMaxLength(List<? extends List<?>> lst) {
        int maxLength = 0;
        for (List<?> sublist : lst) {
            if (sublist.size() > maxLength) {
                maxLength = sublist.size();
            }
        }
        return maxLength;
    }
}
