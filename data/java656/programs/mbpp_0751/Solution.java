public class MinHeapChecker {
    public static boolean checkMinHeap(int[] arr, int i) {
        if (2 * i + 2 > arr.length) {
            return true;
        }
        boolean leftChild = arr[i] <= arr[2 * i + 1] && checkMinHeap(arr, 2 * i + 1);
        boolean rightChild = 2 * i + 2 == arr.length || (arr[i] <= arr[2 * i + 2] && checkMinHeap(arr, 2 * i + 2));
        return leftChild && rightChild;
    }
}
