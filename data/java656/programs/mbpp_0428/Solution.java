public class ShellSort {
    public static int[] shellSort(int[] arr) {
        int n = arr.length;
        int gap = n / 2;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int current = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > current) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = current;
            }
            gap /= 2;
        }
        return arr;
    }
}
