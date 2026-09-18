import java.util.Set;
import java.util.HashSet;

public class AmicableNumbers {
    public static int amicableNumbersSum(int limit) {
        if (limit < 1) {
            throw new IllegalArgumentException("Input must be bigger than 0!");
        }
        Set<Integer> amicables = new HashSet<>();
        for (int num = 2; num <= limit; num++) {
            if (amicables.contains(num)) {
                continue;
            }
            int sumFact = sumOfDivisors(num);
            int sumFact2 = sumOfDivisors(sumFact);
            if (num == sumFact2 && num != sumFact) {
                amicables.add(num);
                amicables.add(sumFact2);
            }
        }
        int total = 0;
        for (int n : amicables) {
            total += n;
        }
        return total;
    }

    private static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
