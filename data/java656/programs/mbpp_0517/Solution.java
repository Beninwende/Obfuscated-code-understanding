public class LargestPos {
    public static int largestPos(int[] list1) {
        int max = list1[0];
        for (int x : list1) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}
