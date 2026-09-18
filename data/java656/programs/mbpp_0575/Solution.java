public class SequenceCounter {
    public static int countNo(int A, int N, int L, int R) {
        int count = 0;
        int result = L;
        for (int i = L; i <= R; i++) {
            if (i % A != 0) {
                count++;
            }
            result = i;
            if (count == N) {
                break;
            }
        }
        return result;
    }
}
