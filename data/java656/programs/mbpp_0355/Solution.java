public class CountRectangles {
    public static int countRectangles(int radius) {
        int rectangles = 0;
        int diameter = 2 * radius;
        int diameterSquare = diameter * diameter;
        for (int a = 1; a < 2 * radius; a++) {
            for (int b = 1; b < 2 * radius; b++) {
                int diagonalLengthSquare = a * a + b * b;
                if (diagonalLengthSquare <= diameterSquare) {
                    rectangles++;
                }
            }
        }
        return rectangles;
    }
}
