public class MergeSort {
    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        return c;
    }

    public static int[] mergeSort(int[] x) {
        if (x == null || x.length <= 1) {
            return x;
        }
        int middle = x.length / 2;
        int[] left = new int[middle];
        System.arraycopy(x, 0, left, 0, middle);
        int[] right = new int[x.length - middle];
        System.arraycopy(x, middle, right, 0, x.length - middle);
        return merge(mergeSort(left), mergeSort(right));
    }
}
