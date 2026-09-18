public class Main {
    public static long findMinSum(long num) {
        long sum = 0;
        long i = 2;
        while (i * i <= num) {
            while (num % i == 0) {
                sum += i;
                num /= i;
            }
            i++;
        }
        sum += num;
        return sum;
    }
}
