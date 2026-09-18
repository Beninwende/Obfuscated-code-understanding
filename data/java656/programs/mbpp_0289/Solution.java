public class OddDaysCalculator {
    public static int oddDays(int N) {
        int hund1 = N / 100;
        int hund4 = N / 400;
        int leap = N / 4;
        int ordd = N - leap;
        if (hund1 != 0) {
            ordd += hund1;
            leap -= hund1;
        }
        if (hund4 != 0) {
            ordd -= hund4;
            leap += hund4;
        }
        int days = ordd + leap * 2;
        return days % 7;
    }
}
