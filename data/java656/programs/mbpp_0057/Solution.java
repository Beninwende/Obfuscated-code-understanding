import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static long findMaxNum(int[] arr, int n) {
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = arr[i];
        }
        Arrays.sort(array, Collections.reverseOrder());
        long num = array[0];
        for (int i = 1; i < n; i++) {
            num = num * 10 + array[i];
        }
        return num;
    }
}
