public class AverageOdd {
    public static int averageOdd(int n) {
        if (n % 2 == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int sm = 0;
        int count = 0;
        while (n >= 1) {
            count++;
            sm += n;
            n -= 2;
        }
        return sm / count;
    }
}
