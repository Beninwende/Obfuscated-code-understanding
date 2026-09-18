public class ArcLengthCalculator {
    public static Double arcLength(double d, double a) {
        double pi = 22.0 / 7.0;
        if (a >= 360) {
            return null;
        }
        double arcLength = (pi * d) * (a / 360.0);
        return arcLength;
    }
}
