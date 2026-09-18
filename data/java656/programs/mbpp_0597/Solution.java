public class KthElementFinder {
    public static int findKth(int[] arr1, int[] arr2, int m, int n, int k) {
        int[] merged = new int[m + n];
        int i = 0, j = 0, d = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                merged[d++] = arr1[i++];
            } else {
                merged[d++] = arr2[j++];
            }
        }
        while (i < m) {
            merged[d++] = arr1[i++];
        }
        while (j < n) {
            merged[d++] = arr2[j++];
        }
        return merged[k - 1];
    }
}
