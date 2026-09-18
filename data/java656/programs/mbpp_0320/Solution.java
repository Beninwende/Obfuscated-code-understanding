public class SumDifference {
    public static long sumDifference(int n) {
        long sumOfSquares = 0;
        long squareOfSum = 0;
        for (int num = 1; num <= n; num++) {
            sumOfSquares += (long) num * num;
            squareOfSum += num;
        }
        squareOfSum = squareOfSum * squareOfSum;
        return squareOfSum - sumOfSquares;
    }
}
