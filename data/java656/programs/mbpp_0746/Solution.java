public class SectorAreaCalculator {
    public static Double sectorArea(double r, double a) {
        double pi = 22.0 / 7.0;
        if (a >= 360) {
            return null;
        }
        return pi * r * r * (a / 360.0);
    }
}
