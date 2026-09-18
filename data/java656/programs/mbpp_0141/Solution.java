public class PancakeSort {
    public static int[] pancakeSort(int[] nums) {
        int n = nums.length;
        for (int currSize = n; currSize > 1; currSize--) {
            int maxIndex = 0;
            for (int i = 1; i < currSize; i++) {
                if (nums[i] > nums[maxIndex]) {
                    maxIndex = i;
                }
            }
            flip(nums, 0, maxIndex);
            flip(nums, 0, currSize - 1);
        }
        return nums;
    }

    private static void flip(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
