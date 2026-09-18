public class TriangleCounter {
    public static int noOfTriangle(int N, int K) {
        if (N < K) {
            return -1;
        } else {
            int triUp = (N - K + 1) * (N - K + 2) / 2;
            int triDown = (N - 2 * K + 1) * (N - 2 * K + 2) / 2;
            return triUp + triDown;
        }
    }
}
