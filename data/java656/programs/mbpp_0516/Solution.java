import java.util.List;
import java.util.ArrayList;

public class RadixSort {
    public static int[] radixSort(int[] nums) {
        final int RADIX = 10;
        int placement = 1;
        int maxDigit = nums[0];
        for (int num : nums) {
            if (num > maxDigit) {
                maxDigit = num;
            }
        }
        while (placement < maxDigit) {
            @SuppressWarnings("unchecked")
            List<Integer>[] buckets = new ArrayList[RADIX];
            for (int i = 0; i < RADIX; i++) {
                buckets[i] = new ArrayList<>();
            }
            for (int i : nums) {
                int tmp = (i / placement) % RADIX;
                buckets[tmp].add(i);
            }
            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (int value : buckets[b]) {
                    nums[a++] = value;
                }
            }
            placement *= RADIX;
        }
        return nums;
    }
}
