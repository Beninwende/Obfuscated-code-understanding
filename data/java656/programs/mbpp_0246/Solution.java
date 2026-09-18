public class Babylonian {
    public static double babylonianSquareRoot(double number) {
        if (number == 0) {
            return 0;
        }
        double g = number / 2.0;
        double g2 = g + 1;
        while (g != g2) {
            double n = number / g;
            g2 = g;
            g = (g + n) / 2.0;
        }
        return g;
    }
}
