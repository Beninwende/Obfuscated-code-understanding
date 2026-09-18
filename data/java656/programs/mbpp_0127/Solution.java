public class Main {
    public static int multiplyInt(int x, int y) {
        if (y < 0) {
            return -multiplyInt(x, -y);
        } else if (y == 0) {
            return 0;
        } else if (y == 1) {
            return x;
        } else {
            return x + multiplyInt(x, y - 1);
        }
    }
}
