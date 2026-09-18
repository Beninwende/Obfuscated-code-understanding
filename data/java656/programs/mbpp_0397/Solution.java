public class MedianFinder {
    public static int medianNumbers(int a, int b, int c) {
        int median;
        if (a > b) {
            if (a < c) {
                median = a;
            } else if (b > c) {
                median = b;
            } else {
                median = c;
            }
        } else {
            if (a > c) {
                median = a;
            } else if (b < c) {
                median = b;
            } else {
                median = c;
            }
        }
        return median;
    }
}
