public class TriangleValidator {
    public static boolean validityTriangle(int a, int b, int c) {
        int total = a + b + c;
        if (total == 180) {
            return true;
        } else {
            return false;
        }
    }
}
