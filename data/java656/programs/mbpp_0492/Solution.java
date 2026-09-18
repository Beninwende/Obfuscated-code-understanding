public class BinarySearch {
    public static boolean binarySearch(int[] itemList, int item) {
        int first = 0;
        int last = itemList.length - 1;
        boolean found = false;
        while (first <= last && !found) {
            int mid = (first + last) / 2;
            if (itemList[mid] == item) {
                found = true;
            } else {
                if (item < itemList[mid]) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }
        }
        return found;
    }
}
