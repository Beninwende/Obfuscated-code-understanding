public class PrimeDivisorSum {
    public static int sum(int N) {
        int[] sumOfPrimeDivisors = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            if (sumOfPrimeDivisors[i] == 0) {
                for (int j = i; j <= N; j += i) {
                    sumOfPrimeDivisors[j] += i;
                }
            }
        }
        return sumOfPrimeDivisors[N];
    }
}
