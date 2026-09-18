public class Triangle {
    public static boolean checkScalene(int x, int y, int z) {
        if (x != y && y != z && z != x) {
            return true;
        } else {
            return false;
        }
    }
}
