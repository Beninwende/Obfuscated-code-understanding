public class CombSort {
    public static int[] combSort(int[] nums) {
        double shrinkFact = 1.3;
        int gap = nums.length;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            gap = (int)(gap / shrinkFact);
            swapped = false;
            int i = 0;
            while (gap + i < nums.length) {
                if (nums[i] > nums[i + gap]) {
                    int temp = nums[i];
                    nums[i] = nums[i + gap];
                    nums[i + gap] = temp;
                    swapped = true;
                }
                i++;
            }
        }
        return nums;
    }
}
