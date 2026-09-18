public class CubeSum {
    public static int cubeSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int even = 2 * i;
            sum += even * even * even;
        }
        return sum;
    }
}
