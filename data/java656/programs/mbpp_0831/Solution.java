public class PairCounter {
    public static int countPairs(int[] arr) {
        int cnt = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
