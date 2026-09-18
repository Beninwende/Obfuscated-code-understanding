public class CountingSort {
    public static int[] countingSort(int[] myList) {
        int maxValue = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > maxValue) {
                maxValue = myList[i];
            }
        }
        int[] buckets = new int[maxValue + 1];
        for (int num : myList) {
            buckets[num]++;
        }
        int index = 0;
        for (int j = 0; j <= maxValue; j++) {
            for (int count = 0; count < buckets[j]; count++) {
                myList[index++] = j;
            }
        }
        return myList;
    }
}
