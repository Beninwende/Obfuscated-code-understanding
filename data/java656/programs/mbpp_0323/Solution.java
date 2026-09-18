public class Solution {
    public static int[] rightRotate(int[] arr, int outOfPlace, int cur) {
        int temp = arr[cur];
        for (int i = cur; i > outOfPlace; i--) {
            arr[i] = arr[i - 1];
        }
        arr[outOfPlace] = temp;
        return arr;
    }

    public static int[] reArrange(int[] arr) {
        int n = arr.length;
        int outOfPlace = -1;
        for (int index = 0; index < n; index++) {
            if (outOfPlace >= 0) {
                if ((arr[index] >= 0 && arr[outOfPlace] < 0) ||
                    (arr[index] < 0 && arr[outOfPlace] >= 0)) {
                    arr = rightRotate(arr, outOfPlace, index);
                    if (index - outOfPlace > 2) {
                        outOfPlace += 2;
                    } else {
                        outOfPlace = -1;
                    }
                }
            }
            if (outOfPlace == -1) {
                if ((arr[index] >= 0 && index % 2 == 0) ||
                    (arr[index] < 0 && index % 2 == 1)) {
                    outOfPlace = index;
                }
            }
        }
        return arr;
    }
}
