public class SumElements {
    public static int sumElements(int[] testTup) {
        int res = 0;
        for (int num : testTup) {
            res += num;
        }
        return res;
    }
}
