import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartNumberFinder {
    private static final int MAX = 3000;

    public static int smartNumber(int n) {
        int[] primes = new int[MAX];
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i < MAX; i++) {
            if (primes[i] == 0) {
                primes[i] = 1;
                for (int j = i * 2; j < MAX; j += i) {
                    primes[j]--;
                    if (primes[j] + 3 == 0) {
                        result.add(j);
                    }
                }
            }
        }
        Collections.sort(result);
        return result.get(n - 1);
    }
}
