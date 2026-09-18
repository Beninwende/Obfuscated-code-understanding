public class HeapSort {
    public static int[] heapSort(int[] arr) {
        heapify(arr);
        int end = arr.length - 1;
        while (end > 0) {
            int temp = arr[end];
            arr[end] = arr[0];
            arr[0] = temp;
            shiftDown(arr, 0, end - 1);
            end--;
        }
        return arr;
    }

    private static void heapify(int[] arr) {
        int start = arr.length / 2;
        while (start >= 0) {
            shiftDown(arr, start, arr.length - 1);
            start--;
        }
    }

    private static void shiftDown(int[] arr, int start, int end) {
        int root = start;
        while (root * 2 + 1 <= end) {
            int child = root * 2 + 1;
            if (child + 1 <= end && arr[child] < arr[child + 1]) {
                child++;
            }
            if (child <= end && arr[root] < arr[child]) {
                int temp = arr[root];
                arr[root] = arr[child];
                arr[child] = temp;
                root = child;
            } else {
                return;
            }
        }
    }
}
