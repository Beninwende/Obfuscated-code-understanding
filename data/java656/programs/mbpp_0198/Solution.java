public class EllipseUtils {
    public static double largestTriangle(double a, double b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        return (3 * Math.sqrt(3) * Math.pow(a, 2)) / (4 * b);
    }
}
