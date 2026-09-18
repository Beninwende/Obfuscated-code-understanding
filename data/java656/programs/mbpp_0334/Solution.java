public class TriangleValidator {
    public static boolean checkValidity(double a, double b, double c) {
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            return false;
        } else {
            return true;
        }
    }
}
