public class FrequencyFinder {
    public static int frequency(int[] a, int x) {
        int count = 0;
        for (int i : a) {
            if (i == x) {
                count++;
            }
        }
        return count;
    }
}
