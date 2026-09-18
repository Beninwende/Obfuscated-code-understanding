public class DogAgeCalculator {
    public static double dogAge(double hAge) {
        if (hAge < 0) {
            System.exit(1);
        }
        double dAge;
        if (hAge <= 2) {
            dAge = hAge * 10.5;
        } else {
            dAge = 21 + (hAge - 2) * 4;
        }
        return dAge;
    }
}
