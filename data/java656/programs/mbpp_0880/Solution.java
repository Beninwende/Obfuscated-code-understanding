public class QuadraticSolver {
    public static String checkSolution(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return "2 solutions";
        } else if (discriminant == 0) {
            return "1 solution";
        } else {
            return "No solutions";
        }
    }
}
