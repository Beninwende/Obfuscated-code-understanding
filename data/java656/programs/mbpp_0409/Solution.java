import java.util.List;

public class Main {
    public static int minProductTuple(List<int[]> list1) {
        int resultMin = Integer.MAX_VALUE;
        for (int[] pair : list1) {
            int prod = Math.abs(pair[0] * pair[1]);
            if (prod < resultMin) {
                resultMin = prod;
            }
        }
        return resultMin;
    }
}
