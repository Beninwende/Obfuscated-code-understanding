public class TripletSum {
    public static boolean findTripletArray(int[] A, int arrSize, int sum) {
        for (int i = 0; i < arrSize - 2; i++) {
            for (int j = i + 1; j < arrSize - 1; j++) {
                for (int k = j + 1; k < arrSize; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
